t = int(input())
for _ in range(t):
    k = int(input())
    my_list = []
    x = 0
    y = 0
    sum = 0
    while (k - sum > 0):
        left = 0
        right = 501
        temp_n = 0
        while left <= right:
            mid = left + (right - left) // 2
            if mid * (mid - 1) // 2 > k - sum:
                right = mid - 1
            else :
                temp_n = mid
                left = mid + 1
        sum += (temp_n * (temp_n - 1) // 2)
        my_list.append(temp_n)
    #print(my_list)
    sum_n = 0
    for n in my_list:
        sum_n += n
    print(sum_n)
    for n in my_list:
        for i in range(1, n + 1):
            print(f"{x} {y}")
            y += 1
        x = y + 1
        y = y + 1
