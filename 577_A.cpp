#include <iostream>
#include <cmath>
using namespace std;

int main(){
	
	/*
	 * 
	 *we are given two integers A and B, and we need to find such x, y, and z that one of them is good, two of them is nearly good and x + y = z
	 lets say my z is good so it is divisble by A and b
	 z = A * B * k
	 x = A * m
	 y = A * n
	 z = x + y
	 A * B * k = A * (m + n)
	 B * k = m + n 
	 except B = 1, then 1 * 1 = 1 + 1 * 0 k == 0, meaning that z = 0 which is not eh case since x, y, z >= 0
	 
	*/
	int t;
	cin >> t;
	while (t --){
		long long A, B;
		cin >> A >> B;
		if (B == 1){
			cout << "NO" << endl;
			continue;
		}
		else{
			cout << "YES" << endl;
			long long k = 1;
			while (k < 10){
				long long x, y, z;
				long long m = 1;
				long long n = B * k - m;
				while (n > 0){
					z = A * B * k;
					x = A * m;
					y = A * n;
					if (x != y && y != z){
						cout << x << " " << y << " " << z << endl;
						k = 11;
						break;
					}
					m ++;
					n --;
				}
				k ++;
			}
		}
	}
	return 0;
}
