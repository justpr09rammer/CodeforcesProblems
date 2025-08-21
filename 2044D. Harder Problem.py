t = int(input())
while t > 0:
    n = int(input())
    a = list(map(int, input().split()))  
    
    b = [0] * n 
    mySet = set(range(1, n + 1))  
    
    for i in range(n):
        if a[i] in mySet:
            b[i] = a[i]  
            mySet.remove(a[i]) 
    
    for i in range(n):
        if b[i] == 0:  
            b[i] = mySet.pop()
    
    print(" ".join(map(str, b)))
    t -= 1
