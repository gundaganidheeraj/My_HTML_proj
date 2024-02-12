public class Main
{
	public static void main(String[] args) {
	   	System.out.print("Result:");
		//function caller
	   	Average(10,20,30);
	}
	//called function
	public static void Average(int a,int b,int c){
	    float result=(a+b+c)/3;
	    System.out.println(result);
	}
}
