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
    for(int i=0;i<k;i++)
    {
        for(int j=i;j<k;j++)
        {
            if(n[i]>n[j])
            {
                temp=n[i];
                n[i]=n[j];
                n[j]=temp;
            }
        }
    }
    cout<<"The sorted elements are: "<<endl;
    for(int i=0;i<k;i++)
    {
        cout<<n[i]<<" ";
    }
}
