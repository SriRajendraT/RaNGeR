/*
	        1
	      2 3 4
	    5 6 7 8 9
	10 11 12 13 14 15 16
*/
class NumberPyramidOneToSixteenStraight {
	public static void main(String[] args) {
		int space=4,star=-1,n=1;
		for(int i=1;i<=4;i++) {
			space--;star+=2;
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print(" "+n+++" ");
			}
	System.out.println();
		}
	}
}