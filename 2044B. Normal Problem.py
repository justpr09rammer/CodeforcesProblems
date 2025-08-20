t = int(input())   
while t > 0:
    s = input()
    s2 = ""
    for i in range(len(s) - 1,-1,-1):
        if s[i] == 'p':
            s2 += 'q'
        elif s[i] == 'q':
            s2 += 'p'
        else :
            s2 += s[i]
    print(s2)
    t -= 1
