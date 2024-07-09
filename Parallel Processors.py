#There are N tasks waiting in line to be executed. The execution time for the ith task is Ai​ seconds. Ram has two processors to execute these N tasks. Both these processors work simultaneously. Each processor executes the assigned tasks one by one.Ram assigns a prefix of these tasks to the first processor and the remaining tasks to the second processor.
# For example, if there are 3 tasks, Ram can do one of the following:

# Assign no task to the first processor. This means, the second processor will execute tasks 1,2 and 3.
# Assign task 1 to the first processor. This means, the second processor will execute tasks 2 and 3.
# Assign tasks 1 and 2 to the first processor. This means, the second processor will execute task 3.
# Assign tasks 1,2 and 3 to the first processor. Thus, second processor would execute no tasks.
def min_execution_time(N, A):
    total_time = sum(A)
    min_time = float('inf')
    
    prefix_sum = 0
    for i in range(N + 1):
        
        time1 = prefix_sum
        time2 = total_time - prefix_sum
        current_time = max(time1, time2)
      
        min_time = min(min_time, current_time)
        if i < N:
            prefix_sum += A[i]
    
    return min_time


N = int(input())
A = list(map(int, input().split()))
result = min_execution_time(N, A)
print(result)