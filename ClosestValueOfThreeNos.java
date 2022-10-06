class ClosestValueOfThreeNos {
	public static void main(String[] args) {
	int key=8,a=6,b=1,c=3;
	int f=Math.abs(key-a);
	int g=Math.abs(key-b);
	int h=Math.abs(key-c);
		if(f==g) {
			if(h==f) {
			System.out.println("Both "+a+" and "+c+" are close to "+key);
			}
			else {
			System.out.println("Both "+b+" and "+c+" are close to "+key);
			}
		}
		else {
			if (h==g) {
			System.out.println("Both "+b+" and "+c+" are close to "+key);
			}
			else {
			System.out.println("Both "+a+" and "+c+" are close to "+key);
			}
		}
		if (f<g) {
			if (f<h) {
			System.out.println(a+" is close to "+key);
			}
			else {
			System.out.println(c+" is close to "+key);
			}
		}
		else {
			if(g<h) {
			System.out.println(b+" is close to "+key);
			}
			else {
			System.out.println(c+" is close to "+key);
			}
		}
	}
}