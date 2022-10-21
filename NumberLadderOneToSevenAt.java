/*
	1
	2 @
	3 4 @
	5 6 7 @

*/
class NumberLadderOneToSevenAt {
	public static void main(String[] args) {
		int a=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				if(i==2&&j==2||i==3&&j==3||i==4&&j==4) {
					System.out.print(" @ ");
				}
				else {
					System.out.print(" "+a+++" ");
				}
			}
	System.out.println();
		}
	}
}