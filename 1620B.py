t = int(input())

for _ in range(t):
    w, h = map(int, input().split())
    bottom = list(map(int, input().split()))
    top = list(map(int, input().split()))
    left = list(map(int, input().split()))
    right = list(map(int, input().split()))
    bottom_area = (bottom[-1] - bottom[1]) * h
    top_area = (top[-1] - top[1]) * h
    left_area = (left[-1] - left[1]) * w
    right_area = (right[-1] - right[1]) * w
    print(max(bottom_area, top_area, left_area, right_area))
