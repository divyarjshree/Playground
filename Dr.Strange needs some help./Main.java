#include<iostream>
#include<math.h>
using namespace std;
int armstrong();
int armstrong()
{
  int n,p,q;
  cin>>n>>p>>q;
  int a = pow(n,p);
  if(a>=q)
  {
    return true;
  }
  else
  {
    return false;
  }
}
int main()
{
  if(armstrong()==1)
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else
  {
    cout<<"Sorry Doctor! You need more bacteria.";
  }
}
    
  