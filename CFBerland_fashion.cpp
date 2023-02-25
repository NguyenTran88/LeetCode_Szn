#include <iostream>
using namespace std;

int n, t;
int count = 0;

int main()
{
    cin >> n;
    int a[n + 1];

    for (size_t i = 0; i < n; i++)
    {
        cin >> a[i];
        if (a[i] == 0)
        {
            count++;
        }
    }
    if (n == 1 && count == 0)
    { // if n == 1 and ther's no zero
        cout << "YES";
        return 0;
    }
    if (count == 1)
    {
        cout << "YES";
    }
    else
    {
        cout << "NO";
    }
}