t = int(input())
def calculate_area(a, h):
    return a * h / 2
for _ in range(t):
    n, d, h = map(int, input().split())
    total_area = 0
    coordinates = list(map(int, input().split()))
    for i in range(n - 1):
        area = 0
        if coordinates[i] + h <= coordinates[i + 1]:
            area = calculate_area(d, h)
        else :
            h_1 = h - coordinates[i + 1] + coordinates[i]
            d_1 = d * h_1 / h
            whole_triangle_area = calculate_area(d, h)
            small_triangle_area = calculate_area(h_1, d_1)
            area = whole_triangle_area - small_triangle_area
        total_area += area
    total_area += calculate_area(d, h)
    print(total_area)
