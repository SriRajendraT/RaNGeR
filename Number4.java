class Number4 {
	public static void main(String[] args) {
		int n=5;
		n=2*n;
		for (int row=0;row<=n;row++){
			for (int col=0;col<=n;col++){
				int s=Math.min(Math.min(row,col), Math.min(n-row,n-col));
				System.out.print(s+" ");
			}
		System.out.println();
		}
	}
}