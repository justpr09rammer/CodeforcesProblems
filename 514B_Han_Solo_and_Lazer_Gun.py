# my_map = {} for a map or dictionary
# my_set = set() for a set
# my_list = [] for a list

n, x0, y0 = map(int, input().split())
slope_and_count = {}
x_axis = 0
y_axis = 0
y_axis_count = 0
for i in range(n):
    xi, yi = map(int, input().split())
    xi_normalized = (xi - x0)
    yi_normalized = (yi - y0)
    if xi_normalized == 0:
        x_axis = 1
    if yi_normalized == 0:
        y_axis = 1
    if (xi_normalized != 0) and (yi_normalized != 0):
        slope_i = (yi_normalized / xi_normalized)
        if slope_i not in slope_and_count:
            slope_and_count[slope_i] = 1
        else:
            slope_and_count[slope_i] += 1
print(len(slope_and_count) + x_axis + y_axis)
