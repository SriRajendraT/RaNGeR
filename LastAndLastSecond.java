class LastAndLastSecond {
	public static void main(String[] args) {
	int i=5436,i1=i/10,i2=i1/10;
		if(i%10==5) {
		System.out.println(i+" Last Digit is"+i%10);
		System.out.println(i%10);
		System.out.println("i is even");
		}
		else {
		System.out.println(i+" Last Digit is not 5");
		System.out.println(i%10);
		System.out.println("i is odd");
		}
		if(i1%10==2) {
		System.out.println(i+" Last second Digit is 2");
		System.out.println(i1%10);
		}
		else {
		System.out.println(i+" Last Second Digit not is 2");
		System.out.println(i1%10);
		}
		if(i2%10==8) {
		System.out.println(i+" Last Second Digit is 8");
		System.out.println(i2%10);	
		}
		else {
		System.out.println(i+" Last Second Digit not is 8");
		System.out.println(i2%10);
		}
	}
}