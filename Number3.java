class Number3 {
	public static void main(String[] args) {
		int n=5;
		for (int row=1;row<=2*n-1;row++){
			int totalColInRow= (row>n)?2*n-row:row;
			for (int space=0;space<=n-totalColInRow;space++){
				System.out.print("  ");
			}
			for (int col=totalColInRow;col>=1;col--){
				System.out.print(col+" ");
			}
			for (int col=2;col<=totalColInRow;col++){
				System.out.print(col+" ");
			}
		System.out.println();
		}
	}
}