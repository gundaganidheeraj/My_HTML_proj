#include <stdio.h>
//called function
void Biggest(int a,int b){
    int result=a>b?a:b;
    printf("%d",result);
}

int main()
{
    int a=10;
    int b=20;
    //function caller
    Biggest(a,b);
    return 0;
}
