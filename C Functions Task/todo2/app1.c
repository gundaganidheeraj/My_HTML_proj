#include <stdio.h>
//called function
void formula(int a,int b){
    int result=(a*a)+(b*b)+2*(a+b);
    print("%d",result);
}

int main()
{
    int a=10;
    int b=20;
    //function caller
    formula(a,b);
    return 0;
}
