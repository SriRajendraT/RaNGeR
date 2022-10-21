/*
	      1
	    1 2 3
	  1 2 3 4 5
	1 2 3 4 5 6 7

*/
class NumberPyramidOneToSeven {
	public static void main(String[] args) {
		int space=5,star=-1;
		for(int i=1;i<=4;i++) {
			space--;star+=2;
			int n=1;
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print(n++);
			}
	System.out.println();
		}
	}
}