/*
	   *
	  ***
       *****
	*******
*/
class StarSpacePyramid {
	public static void main(String[] args) {
		int space=4,star=0;
		for(int i=1;i<=4;i++) {
			space--;
			if(i<=1) {
				star++;
			}
			else {
				star+=2;
			}
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