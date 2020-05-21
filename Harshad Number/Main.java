#include<iostream>
using namespace std;
int main()
{
  int num,temp,sum=0;
  cin>>num;
  temp = num;
  while(temp)
  {
    sum += temp %10;
    temp = temp /10;
   }
   int res = num%sum;
  if(res==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
  return 0;
}