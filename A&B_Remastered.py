def solve_test_case(N, A, B):
    total_sum = sum(A) + sum(B)
    if total_sum % N != 0:
        return None
    
    target_sum = total_sum // N
    
    A.sort(reverse=True)
    B.sort()
    
    D = []
    E = []
    
    for i in range(N):
        if A[i] + B[i] != target_sum:
            return None
        D.append(A[i])
        E.append(B[i])
    
    return D, E

def main():
    T = int(input())
    for _ in range(T):
        N = int(input())
        A = list(map(int, input().split()))
        B = list(map(int, input().split()))
        
        result = solve_test_case(N, A, B)
        
        if result is None:
            print(-1)
        else:
            D, E = result
            print(*D)
            print(*E)

if __name__ == "__main__":
    main()