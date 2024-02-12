#include <stdio.h>
//called function
void Area(int radius){
    float pi=3.14,result;
    result=pi*radius*radius;
    printf("%f",result);
}

int main()
{
    int r=7;
    //function caller
    Area(r);
    return 0;
}
