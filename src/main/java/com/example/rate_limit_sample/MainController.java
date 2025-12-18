package com.example.rate_limit_sample;

import com.google.common.util.concurrent.RateLimiter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@RestController
public class MainController {

  private final Logger logger = LoggerFactory.getLogger(MainController.class);

  /**
   * 一度に処理する件数
   */
  private final static int PERMITS = 1;

  /**
   * 同時に処理できる件数
   */
  private final static double PERMITS_PER_SECONDS = 5d;


  private final RateLimiter rateLimiter;

  public MainController() {
    this.rateLimiter = RateLimiter.create(PERMITS_PER_SECONDS);;
  }

  @GetMapping("/")
  public ResponseEntity<String> search() {
    final var acuired = rateLimiter.tryAcquire(1, Duration.ofMillis(100L)); // timeout 100ms
    if (!acuired) {
      logger.error("Rate Limit");
      throw new ErrorResponseException(INTERNAL_SERVER_ERROR);
    }
    return ResponseEntity.ok("OK");
  }
}
