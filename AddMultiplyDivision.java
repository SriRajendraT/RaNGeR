class AddMultiplyDivision {
	public static void main(String[] args) {
	System.out.println("Please Enter the values ");
		add(1,2);multiply(2,4);division(8,6);
	System.out.println("Results");	
	}
		public static void add(int a,int b){
			System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
		}
		public static void multiply(int a,int b) {
			System.out.println("Multipication of "+a+" and "+b+" is "+(a*b));
		}
		public static void division(int a,int b) {
			System.out.println("Division of "+a+" and "+b+" is "+(a/b));
		}
}