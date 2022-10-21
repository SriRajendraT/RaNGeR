class SeriesOfPrimeNumberFiveToHundered {
	public static void main(String[] args) {
		for(int num=5;num<=100;num++) {
			int count=0;
			for(int i=2;i<=(num/2);i++) {
				if (num%2==0) {
					count++;
				}
				if(count!=0) {
					System.out.println(num+" is not a prime number");
				}
				else {
					System.out.println(num+" is a prime number");

				}
			}
		}
	}
}