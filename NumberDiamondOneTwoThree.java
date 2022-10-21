/*
	   1
	 1 2 1
   1 2 3 2 1
	 1 2 1
	   1
*/
class NumberDiamondOneTwoThree {
	public static void main(String[] args) {
		int num=1,space=0,star=4;
			for(int i=1;i<=5;i++){
				if(i<=3){
						for(int c=2;c>=i;c--){
							System.out.print(" ");
						}
						for(int c=1;c<=i;c++){
							System.out.print(c);
						}
						for(int c=i-1;c>=1;c--){
							System.out.print(c);
						}
				}
				else{
					space++;
					star-=2;
						for(int c=1;c<=space;c++){
							System.out.print(" ");
						}
						for(int c=1;c<=star;c++){
							System.out.print(num++);
						}
				}
				if(i==4||i==5){
					for(int j=4;j<=4;j++){
						System.out.print("1");
					}
				}
		System.out.println();
		}
	}
}