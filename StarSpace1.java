class StarSpace1 {
	public static void main(String[] args) {
		int n=5;
		for (int row=1;row<=2*n-1;row++){
			int totalColInRow=(row>n)?2*n-row:row;
			int space= n- totalColInRow;
			for (int s=1;s<=space;s++){
				System.out.print(" ");
			}
			for (int col=1;col<=totalColInRow;col++){
				System.out.print("* ");
			}
		System.out.println();
		}
	}
}