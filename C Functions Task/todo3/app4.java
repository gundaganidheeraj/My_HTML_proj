public class Main
{
	public static void main(String[] args) {
	    int r=7;
	   	System.out.print("Area of circele of radius "+r+" is :");
	   	//function caller
	   	Area(r);
	}
	//called function
	public static void Area(int r){
	   double pi=3.14;
	   double result=pi*(r*r);
	    System.out.println(result);
	}
}
