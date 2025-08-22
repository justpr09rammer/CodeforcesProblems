t = int(input())
while t > 0:
    n = int(input())
    array = []
        
    for k in range(1, 1000):
        if 1 + 10 **(k) > n:
            break
        if (n % (1 + 10 **(k))) == 0:
            array.append(n // (1 + 10 **(k)))
  
    if len(array) > 0:
        print(len(array))
        print(" ".join(map(str, sorted(array))))
    else:
        print(0) 
    
    
    t -= 1
