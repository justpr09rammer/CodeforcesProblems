t = int(input())   
while t > 0:
    m, a, b, c = map(int, input().split())
    x = min(m, a)
    y = min(m, b)
    availableSeatsFirst = m - x
    availableSeatsSecond = m - y
    z = min(availableSeatsFirst + availableSeatsSecond, c)
    print(x + y + z)
    t -= 1
