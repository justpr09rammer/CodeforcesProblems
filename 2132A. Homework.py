t = int(input())
while t > 0:
    n = int(input())
    a = list(input())
    m = int(input())
    b = input()
    c = input()
    counter = 0
    for ch in c:
        if ch == 'V':
            a.insert(0, b[counter])
        else : a.append(b[counter])
        counter += 1
    print("".join(a))    
    t -= 1
