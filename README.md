# rate limit sample

4rps
```shell
❯ echo "GET http://localhost:8080/" | vegeta attack -rate=4 -duration=10s | tee results.bin | vegeta report
Requests      [total, rate, throughput]         40, 4.10, 4.10
Duration      [total, attack, wait]             9.751s, 9.75s, 1.506ms
Latencies     [min, mean, 50, 90, 95, 99, max]  1.162ms, 1.753ms, 1.586ms, 2.022ms, 2.541ms, 5.472ms, 5.472ms
Bytes In      [total, mean]                     80, 2.00
Bytes Out     [total, mean]                     0, 0.00
Success       [ratio]                           100.00%
Status Codes  [code:count]                      200:40
Error Set:
```

5rps
```shell
❯ echo "GET http://localhost:8080/" | vegeta attack -rate=5 -duration=10s | tee results.bin | vegeta report
Requests      [total, rate, throughput]         50, 5.10, 5.10
Duration      [total, attack, wait]             9.802s, 9.8s, 1.731ms
Latencies     [min, mean, 50, 90, 95, 99, max]  1.097ms, 1.784ms, 1.695ms, 2.093ms, 2.6ms, 5.358ms, 5.358ms
Bytes In      [total, mean]                     100, 2.00
Bytes Out     [total, mean]                     0, 0.00
Success       [ratio]                           100.00%
Status Codes  [code:count]                      200:50
```

6rps
```shell
❯ echo "GET http://localhost:8080/" | vegeta attack -rate=6 -duration=10s | tee results.bin | vegeta report
Requests      [total, rate, throughput]         60, 6.10, 5.59
Duration      [total, attack, wait]             9.835s, 9.833s, 1.736ms
Latencies     [min, mean, 50, 90, 95, 99, max]  1.218ms, 11.492ms, 1.903ms, 41.917ms, 73.38ms, 74.97ms, 75.031ms
Bytes In      [total, mean]                     615, 10.25
Bytes Out     [total, mean]                     0, 0.00
Success       [ratio]                           91.67%
Status Codes  [code:count]                      200:55  500:5
Error Set:
500
```

