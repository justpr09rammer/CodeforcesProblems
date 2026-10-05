t = int(input())
for _ in range(t):
    x, y, k = map(int, input().split())
    if x >= k and y >= k:
        print(0, 0, x, 0)
        print(0, 0, 0, y)
    else:
        minn = min(x, y)
        print(0, 0, minn, minn)
        print(minn, 0, 0, minn)
