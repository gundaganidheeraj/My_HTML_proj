#include <stdio.h>
//called function
void Average(int a,int b,int c){
    float result=(a+b+c)/3;
    printf("%f",result);
}

int main()
{
    int a=10;
    int b=20;
    int c=30;
    //function caller
    Average(a,b,c);
    return 0;
}
