/*
	1
	0 1
	1 0 1
	0 1 0 1
*/
class NumberLadderOneAndZero {
	public static void main(String[] args) {
		int num=0;
		for(int i=1;i<=4;i++) {
			num++;
			for(int j=1;j<=num;j++) {
				if ((i+j)%2==0) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
	System.out.println();
		}
	}
}