/*
		*
	     ******
	    *******
	     ******
		*
*/
class StarArrowLeft {
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
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			if((i==2)||(i==3)||(i==4)) {
				for(int l=1;l<=4;l++) {
					System.out.print("*");
				}
			}
	System.out.println();
		}
	}
}