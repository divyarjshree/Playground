#include<iostream>
using namespace std;
int fib(int n)
{
  int f[n+2];
  int d,i;
  f[0]=0;
  f[1]=1;
  for(i=2;i<=n;i++)
  {
    f[i]=f[i-1]+f[i-2];
  }
  d = f[n-1];
  cout<<d<<"";
}
int main()
{
  int n;
  cin>>n;
  fib(n);
}

  