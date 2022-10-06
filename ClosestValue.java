class ClosestValue {
	public static void main(String[] args) {
	int key=-5,a=8,b=3;
	int f=Math.abs(key-a);
	int s=Math.abs(key-b);
		if (f==s) {
		System.out.println("both "+a+" and "+b+" are Close to "+key);
		}
			if(f<s) {
			System.out.println(a+" is Close to "+key);
			}
			else {
			System.out.println(b+" is Close to "+key);
			}
	}

}