/*
	1 2 3 4 5 6 7
	 8 9 10 11 12
	   13 14 15
		16
*/
class NumberPyramidOneToSixteenInverse {
	public static void main(String[] args) {
		int star=9,space=-1,num=1;
		for(int i=1;i<=4;i++) {
			space++;
			star-=2;
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print(num++);
			}
	System.out.println();
		}
	}
}