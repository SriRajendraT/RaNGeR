class MaxOfThree {
	public static void main(String[] args) {
	int a=-2,b=-20,c=-200;
		if(a>b){
			if(a>c){
			System.out.println(a+" is Max");
			}
			else {
			System.out.println(c+" is Max");
			}
		}
		else {
			if(b>c) {
			System.out.println(b+" is Max");
			}
			else {
			System.out.println(c+" is Max");
			}
		}
	}
}