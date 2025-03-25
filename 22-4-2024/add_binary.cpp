#include <bits/stdc++.h>
using namespace std;

int main()
{

    string a = "11";
    string b = "1";
    int n1 = a.length();
    int n2 = b.length();
    int num1 = stoi(a);
    int num2 = stoi(b);
    // cout << num1 << " " << num2;

    int decimal_n1 = 0;
    int decimal_n2 = 0;
    int base_1 = 1;
    int base_2 = 1;

    while (num1 != 0)
    {
        decimal_n1 += num1 % 10 * base_1;
        num1 = num1 / 10;
        base_1 = base_1 * 2;
    }
    while (num2 != 0)
    {
        decimal_n2 += num2 % 10 * base_2;
        num2 = num2 / 10;
        base_2 = base_2 * 2;
    }

    // cout << decimal_n1 << " " << decimal_n2 << endl;
    int num3 = decimal_n1 + decimal_n2;
    int n4;
    string bin = "";
    // string bin2;
    while (num3 != 0)
    {
        n4 = num3 % 2;
        bin += to_string(n4);
        // cout << bin2 << "";
        // bin = strcat(bin, bin2);
        num3 = num3 / 2;
    }
    // string bin5;
    reverse(bin.begin(), bin.end());
    cout << bin << endl;

    return 0;
}