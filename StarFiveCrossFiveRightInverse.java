/*
	*****
	 ****
	  ***
	   **
	    *
*/
class StarFiveCrossFiveRightInverse {
	public static void main(String[] args) {
		int space=0,star=6;
			for(int i=1;i<=5;i++) {
				space++;
				star--;
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