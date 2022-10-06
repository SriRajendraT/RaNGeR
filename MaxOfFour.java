class MaxOfFour {
	public static void main(String[] args) {
		int a=20,b=30,c=40,d=50;
		if(a>b) {
			else if(a>c) {
				if(a>d) {
				System.out.println(a+" is Max");}
				else {
				System.out.println(d+" is Max");}
			}
			else {
				if (c>d) {
				System.out.println(c+" is Max");}
				else {
				System.out.println(d+" is Max");}
			}
		}
		else {
			if(b>c) {
				if (b>d) {
				System.out.println(b+" is Max");}
				else {
				System.out.println(d+" is Max");}
			}
			else {
				if (c>d) {
				System.out.println(c+" is Max");}
				else {
				System.out.println(d+" is Max");}
			}
		}
	}
}