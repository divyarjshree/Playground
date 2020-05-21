#include<iostream>
using namespace std;
void sum(int, int);

int main(){
   int row, col;
   cin>>row;
   cin>>col;
   sum(row, col);
   return 0;
}
void sum(int r, int c){
   int m1[r][c], m2[r][c], s[r][c];
   for (int i = 0;i<r;i++ ) {
     for (int j = 0;j < c;j++ ) {
       cin>>m1[i][j];
     }
   }

   for (int i = 0;i<r;i++ ) {
     for (int j = 0;j<c;j++ ) {
       cin>>m2[i][j];
     }
   }
   for (int i = 0;i<r;i++ ) { 
     for (int j = 0;j<c;j++ ) {
       s[i][j]=m1[i][j]+m2[i][j];
     }
   }
  for (int i = 0;i<r;i++ ) { 
     for (int j = 0;j<c;j++ ) 
       cout<<s[i][j]<<" ";
       cout<<endl;
      
     
  }
}