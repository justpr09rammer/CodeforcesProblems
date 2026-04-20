#include <iostream>
#include <cmath>
using namespace std;


int main(){
	int n, x;
	cin >> n >> x;
	int count = 0;
	for (int i = 1; i <= sqrt(x); i ++){
		if (x % i == 0){
			int a = i;
			int b = x / a;
			if (a > n){
				break;;
			}
			if (b > n){
				continue;
			}
			else{
				count += 2;
				if (a == b){
					count --;
				}
			}
		}
	}
	cout << count;

	
	return 0;
}
