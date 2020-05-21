#include <iostream>
#include <cmath>
using namespace std;
int main()
{
int n;
cin>>n;
double r=0.5;
for(int i=0;i<n;i++)
{
if(i==0)
{
cout<<r;
continue;
}
else
{
double t=pow(3,i-1);
double x=t+r;
r=x;
cout<<" "<<x;
}
}
}
