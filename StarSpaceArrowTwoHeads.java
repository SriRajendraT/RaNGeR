/*
	  *   *
	 *******
	*********
	 *******
	  *   *
*/
class StarSpaceArrowTwoHeads {
	public static void main(String[] args) {
		int space=3,star=0;
		for(int i=1;i<=5;i++) {
			if(i<=3) {
				star++;
				space--;
			}
			else {
				star--;
				space++;
			}
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
				if(i==2||i==3||i==4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
	System.out.println();
		}
	}
}