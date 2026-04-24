#include <iostream>
#include <cmath>
#include <climits>
#include <vector>
using namespace std;


int main(){
	
	int n, t;
	cin >> n >> t;
	vector<long long> v1(n);
	for (int i = 0; i < n; i ++){
		cin >> v1[i];
	}
	long long left_pointer = 0;
	long long right_pointer = 0;
	long long result = 0;
	long long sum = 0;
	while (left_pointer < n && right_pointer < n){
		while (sum + v1[right_pointer] <= t && right_pointer < n){
			sum += v1[right_pointer];
			right_pointer ++;
		}
		result = max(result, right_pointer - left_pointer);
		sum -= v1[left_pointer];
		left_pointer ++;
	}
	cout << result;
}
