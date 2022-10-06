class EvenOrOdd {
	public static void main(String[] args) {
		int a=105;
		int b=106;
		if ((a>100&&a<110)&&(b>100&&b<110)){
		String a1=(a%2==0)? a+" is even" : a+" is odd" ;
		System.out.println(a1);
		String b1=(b%2==0)? b+" is even" : b+" is odd" ;
		System.out.println(b1);
		}
		else {
		System.out.println("Check your Input");
		}
	}
}