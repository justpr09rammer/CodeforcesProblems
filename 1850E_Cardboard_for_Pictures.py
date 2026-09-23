t = int(input())

for _ in range(t):
    n, c = map(int, input().split())
    s = list(map(int, input().split()))

    area_total_inside = 0

    for i in range(n):
        area_total_inside += s[i] * s[i]

    left = 0
    right = 10**9

    while left <= right:
        w = left + (right - left) // 2

        area_total_outside = 0
        for i in range(n):
            area_total_outside += 4 * w * (s[i] + w)
        
        area_total_outside_and_inside = area_total_outside + area_total_inside
        if (area_total_outside_and_inside == c):
            print(w)
            break;
        if (area_total_outside_and_inside > c):
            right = w - 1;
        else: 
            left = w + 1
