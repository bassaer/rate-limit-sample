# rate limit sample

4rps
```shell
❯ echo "GET http://localhost:8080/" | vegeta attack -rate=4 -duration=10s | tee result.bin | vegeta report
Requests      [total, rate, throughput]         40, 4.10, 4.10
Duration      [total, attack, wait]             9.753s, 9.75s, 2.372ms
Latencies     [min, mean, 50, 90, 95, 99, max]  1.539ms, 4.867ms, 2.462ms, 2.895ms, 5.337ms, 96.765ms, 96.765ms
Bytes In      [total, mean]                     80, 2.00
Bytes Out     [total, mean]                     0, 0.00
Success       [ratio]                           100.00%
Status Codes  [code:count]                      200:40
Error Set:
```

5rps
```shell
❯ echo "GET http://localhost:8080/" | vegeta attack -rate=5 -duration=10s | tee result.bin | vegeta report
Requests      [total, rate, throughput]         50, 5.10, 5.10
Duration      [total, attack, wait]             9.802s, 9.8s, 2.4ms
Latencies     [min, mean, 50, 90, 95, 99, max]  1.616ms, 2.388ms, 2.324ms, 2.813ms, 2.937ms, 4.368ms, 4.368ms
Bytes In      [total, mean]                     100, 2.00
Bytes Out     [total, mean]                     0, 0.00
Success       [ratio]                           100.00%
Status Codes  [code:count]                      200:50
Error Set:
```

6rps
```shell
❯ echo "GET http://localhost:8080/" | vegeta attack -rate=6 -duration=10s | tee result.bin | vegeta report
Requests      [total, rate, throughput]         60, 6.10, 5.59
Duration      [total, attack, wait]             9.835s, 9.833s, 1.679ms
Latencies     [min, mean, 50, 90, 95, 99, max]  1.506ms, 12.878ms, 2.281ms, 51.638ms, 74.337ms, 76.041ms, 76.127ms
Bytes In      [total, mean]                     615, 10.25
Bytes Out     [total, mean]                     0, 0.00
Success       [ratio]                           91.67%
Status Codes  [code:count]                      200:55  500:5
Error Set:
500
```

