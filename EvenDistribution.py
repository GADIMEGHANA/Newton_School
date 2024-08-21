def gcd(a, b):
    while b:
        a, b = b, a % b
    return a

T = int(input())
for _ in range(T):
    N, M = map(int, input().split())
    max_contestants = gcd(N, M)
    print(max_contestants)