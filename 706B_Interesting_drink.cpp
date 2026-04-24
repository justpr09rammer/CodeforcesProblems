#include <iostream>
#include <vector>
#include <algorithm>
#include <climits>
#include <map>
#include <iostream>

using namespace std;

const int MAX = 100000;

int main() {
    int n;
    cin >> n;
    int arr[MAX + 1] = {0};
    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        arr[x]++;
    }
    for (int i = 1; i <= MAX; i++) {
        arr[i] += arr[i - 1];
    }
    int q;
    cin >> q;
    while (q--) {
        int m;
        cin >> m;
        if (m > MAX) cout << arr[MAX] <<endl;
        else cout << arr[m] << endl;
    }
    return 0;
}
