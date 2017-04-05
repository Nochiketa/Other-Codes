/*INSERTION SORT PROCESS
77 33 44 11 88 22 66 55
77 33 44 11 88 22 66 55
33 77 44 11 88 22 66 55
11 33 44 77 88 22 66 55
11 22 33 44 77 88 66 55
11 22 33 44 66 77 88 55
11 22 33 44 55 66 77 88
*/

#include<iostream>
using namespace std;
int main()
{
    int i,j,loc,n[100],min,k,temp;
    cout<<"Enter the number of elements ";
    cin>>k;
    cout<<"Enter "<<k<<" elements"<<endl;
    for(int i=0;i<k;i++)
    {
        cin>>n[i];
    }
    for(int i=1;i<=k-1;i++)
    {
       temp=n[i];
       j=i-1;
       while((temp<n[j])&&(j>=0))
       {
           n[j+1]=n[j];     //moves element forward
           j=j-1;
       }
       n[j+1]=temp;         //insert element in proper place
    }
    cout<<"The sorted elements are: "<<endl;
    for(int i=0;i<k;i++)
    {
        cout<<n[i]<<" ";
    }
    return 0;
}

