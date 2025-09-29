

#include <iostream>
#include <vector>
#include <algorithm>
#include <set>

using namespace std;

int main(){
    int t;
    cin >> t;
    while (t > 0){
        int n;
        cin >> n;
        vector<int> array(n);
        int negativeOneCount = 0, positiveOneCount = 0, zeroCount = 0;
        
        for(int i = 0; i < n; i ++){
            cin >> array[i];
            if (array[i] == -1) {
                negativeOneCount ++;
            }
            else if (array[i] == 0) {
                zeroCount ++;
            }
            else {
                positiveOneCount ++;
            }
        }
        cout << zeroCount + 2 * (negativeOneCount % 2) << endl;
        
        
        t --;
    }
    
    return 0;
}
 
