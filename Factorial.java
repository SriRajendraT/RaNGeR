class Factorial 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int fact;
		int res=fact(15);//long value
		System.out.println(res);
	}
	public static int fact(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
		}
	}