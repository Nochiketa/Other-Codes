/*Selection sort procedure
5 4 3 8 7 6 1
1 5 4 3 8 7 6
1 3 5 4 8 7 6
1 3 4 5 8 7 6
1 3 4 5 6 8 7
1 3 4 5 6 7 8
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
    for(int i=0;i<k-1;i++)
    {
        min=n[i];
        loc=i;
        for(int j=i+1;j<k;j++)
        {
            if(min>n[j])
            {
                min=n[j];
                loc=j;
            }
        }
        temp=n[i];
        n[i]=n[loc];
        n[loc]=temp;
    }
    cout<<"The sorted elements are: "<<endl;
    for(int i=0;i<k;i++)
    {
        cout<<n[i]<<" ";
    }
    return 0;
}
