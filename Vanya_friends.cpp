#include <iostream>
using namespace std;

int a[n];
int n, h;
cin >> n >> h;
int main()
{
    for (size_t i = 0; i < n; i++)
    {
        cin >> a[i];
    }
    int count = 0;
    for (size_t i = 0; i < n; i++)
    {
        if (a[i] > h)
        {
            count = count + 2;
        }
        else
        {
            count++;
        }
    }
    return count;
}