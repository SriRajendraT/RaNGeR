/*
	    *
	   **
	  @**
	 ****
	*****
*/
class STarFiveCrossFiveRightAt {
	public static void main(String[] args) {
		int space=5,star=0;
		for(int i=1;i<=5;i++) {
			space--;
			star++;
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				if(i==3&&k==1) {
					System.out.print("@");
				}
				else {
					System.out.print("*");
				}
			}
	System.out.println();
		}
	}
}