#include<iostream>
using namespace std;

     void swap(int &a, int &b)
    {
         b = a + b;
         a = b - a;
         b = b - a;
    }
int main()
{
    int a, b;
    cin >> a >> b;
    cout<<"Before swapping a= "<<a<<" and"<<" b="<<b<<endl;
    swap(a, b);
     cout<<"After swapping a= "<<a<<" and"<<" b="<<b;
   
}