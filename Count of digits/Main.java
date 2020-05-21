#include<iostream>
using namespace std;
int main()
{
  int i=0,n;
  cin>>n;
  do{
    n=n/10;
    i++;
  }
  while(n>0);
    cout<<i;
}