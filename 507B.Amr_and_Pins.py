import math
r, x, y, x1, y1 = map(int, input().split())
d = math.sqrt((x1 - x) ** 2 + (y1 - y) ** 2)
print(math.ceil(d / (2 * r)))
