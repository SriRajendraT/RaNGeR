/*
	  1
	1 2 1
    1	2 3 2 1
*/
class PyramidOneTwoThree {
	public static void main(String[] args) {
		int space=3,star=0;
		for(int i=1;i<=3;i++) {
				space--;star++;
			int n=1;
				for(int j=1;j<=space;j++) {
					System.out.print(" ");
				}
				for(int j=1;j<=star;j++) {
					System.out.print(n++);
				}
  				for (int j=i-1;j>=1;j--){
  					System.out.print(j);
				}
	System.out.println();
		}
	}
}