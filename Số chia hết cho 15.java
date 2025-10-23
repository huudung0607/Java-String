#include <iostream>
#include <algorithm>
#include <vector>
#include <set>
#include <map>
#include <cmath>
#include <numeric>
#include <climits>
#include <iomanip>
#include <string>
#include <sstream>
using namespace std;
const int mod = 1e9 + 7;
bool checksum(string s)
{
	long long sum = 0;
	for (int i = 0; i < s.size(); i++)
	{
		sum += s[i] - '0';
	}
	if (sum % 3 == 0)
	{
		return true;
	}
	return false;
}
bool check5(string s)
{
	if ((s[s.size() - 1] - '0') % 5 == 0)
	{
		return true;
	}
	return false;
}
int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	string s;
	cin >> s;
	if (checksum(s) && check5(s))
	{
		cout << "YES";
	}
	else
	{
		cout << "NO";
	}
}
