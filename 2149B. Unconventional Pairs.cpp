
#include <iostream>
#include <vector>
#include <algorithm>
#include <set>

using namespace std;

int main(){
    int t;
    cin >> t;
    while (t -- > 0){
        int n;
        cin >> n;
        vector<int> array(n);
        for(int i = 0; i < n; i ++){
            cin >> array[i];
        }
        sort(array.begin(), array.end());
        int pointer1 = n - 1;
        int pointer2 = n - 2;
        int maxx = -1;
        while (pointer2 >= 0){
            maxx = max(array[pointer1] - array[pointer2], maxx);
            pointer2 -= 2;
            pointer1 -= 2;
        }
        cout << maxx << endl;
    
    }
    
    return 0;
}

