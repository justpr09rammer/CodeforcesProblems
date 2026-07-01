#include <iostream>
#include <cmath>
#include <vector>
#include <climits>
using namespace std;

long long gcd(long long a, long long b) {
    if (a == 0) {
        return b;
    }
    else if (b == 0) {
        return a;
    }
    if (a > b) {
        return gcd(a % b, b);
    }
    else {
        return gcd(a, b % a);
    }
}
int main() {

    int t;
    cin >> t;

    while (t--) {
        long long n;   
        cin >> n;

        long long a = 1, b = n-1;

        if (n % 2 == 0) {
            a = n / 2;
            b = n / 2;
        }
        else {
            long long result = LLONG_MAX;   
            long long c = 1;
            long long d = 1;
            
            for (long long i = 2; i <= sqrt(n); i++) {
                if (n % i == 0){
                    long long gcd_v = gcd(i, n - i);
                    long long lcm_v = (i * (n - i)) / gcd_v;  
                    if (lcm_v < result) {
                        result = lcm_v;
                        a = i;
                        b = n - i;
                    }
                    c = n / i;
                    d = n - c;
                    long long gcd_x = gcd(c,d);
                    long long lcm_x = (c*d) / gcd_x;  
                    if (lcm_x < result){
                        result = lcm_x;
                        a = c;
                        b = d;
                    }
                }
            }
        }
        cout << a << " " << b << endl;
    }

    return 0;
}
