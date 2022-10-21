/*
	*******
	 *****
	  ***
	   *

*/
class StarSpacePyramidInverse {
	public static void main(String[] args) {
		int space=-1,star=9;
		for(int i=1;i<=4;i++) {
			space++;
			star-=2;
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
	System.out.println();
		}
	}
}