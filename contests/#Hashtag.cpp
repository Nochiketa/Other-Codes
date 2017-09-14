#include<iostream>
#include<stdio.h>
#include<string.h>
using namespace std;
int main()
{
    char s[100];
    gets(s);
    for(int i=0;i<strlen(s);i++)
    {
        if(s[i]==' ')
        {
            continue;
        }
        if(s[i]>='a' || s[i]<='z' || s[i]>='A' || s[i]<='Z')
        {
            cout<<s[i];
        }
    }
}

--------------------------------------------------------------------------------------------------

Problem:
Giving Hashtag in Social Network is very popular now a day. But Poltu is very new in Social Network. So, he doesn’t know the rules of giving Hashtag. One of the primary rules of Hashtag is that it must be written in a single word and it can’t have any spaces. As Poltu wants to post some Hashtags which are not working in Facebook, can you help Poltu to fix the problems in his Hashtag?

For this problem, you will take a String as input. The first character of a string will always be ‘#’. The string may contain spaces, your task is to remove all the spaces in the string and print the string as a single word. If there is no space in the string, print the string same as the input.

Input

There is only one testcase in this problem. Length of string is <=100.

Output

Print the input string as a single word.

Samples

Input	Output
#Zico is Awesome	#ZicoisAwesome
#Shakkhor is Incredible	#ShakkhorisIncredible

