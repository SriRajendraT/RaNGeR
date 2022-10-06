class FourMax {
	public static void main(String[] args) {
		int a=20,b=30,c=40,d=50;
		int max;
		if(a>b && a>c && a>d) {
		max=a;
		}
		else if(b>c && b>d) {
		max=b;
		}
		else if(c>d) {
		max=c;
		}
		else {
		max=d;
		}
		System.out.println(max);
	}
}