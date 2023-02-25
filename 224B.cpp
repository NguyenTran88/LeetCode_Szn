#include <iostream>
using namespace std;

int n, k;
cin >> n >> k;
int a[n];

int main()
{
    for (size_t i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    int count = 0;
    int left = 0;
    int right = 1;

    while (left <= n && right <= n && count < k)
    {
        if (a[right] != a[right - 1])
        {
            if (count == 0)
            {
                left = right - 1;
            }
            count++;
        }
        right++;
    }
    cout << left << ' ' << right;
}