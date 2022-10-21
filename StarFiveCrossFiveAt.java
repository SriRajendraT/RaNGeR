/*
	*
	*@
	***
	****
	*****
*/
class StarFiveCrossFiveAt {
	public static void main(String[] args) {
		int star=0;
		for(int i=1;i<=5;i++) {
			star++;
			for(int j=1;j<=star;j++) {
				if(i==2&&j==2) {
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