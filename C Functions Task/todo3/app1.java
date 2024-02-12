public class Main
{
	public static void main(String[] args) {
	   	System.out.print("Result:");
		//function caller
	   	formula(10,20);
	}
	//called function
	public static void formula(int a,int b){
	    int result=(a*a)+(b*b)+2*(a+b);
	    System.out.println(result);
	}
}
