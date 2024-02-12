public class Main
{
	public static void main(String[] args) {
	   	System.out.print("Result:");
		//function caller
	   	Biggest(10,20);
	}
	//called function
	public static void Biggest(int a,int b){
	    int result=a>b?a:b;
	    System.out.println(result);
	}
}
