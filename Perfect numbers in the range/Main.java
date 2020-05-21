#include<iostream>
using namespace std;
int main()
{
  int a,b,i,num,sum;
  cin>>a>>b;
  for(i=a;i<b;i++)
  {
    num=1;
    while(num<=(i/2))
    {
      if(i%num==0)
        sum=sum+num;
      num++;
    }
    if(sum==i)
      cout<<i<<" ";
    sum=0;
  }
  return 0;
}
  