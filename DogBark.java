class DogBark {
	public static void main(String[] args) {
		int hoursInDay=24;
			if(hoursInDay<=6||hoursInDay>=18) {
				System.out.println("We are safe");
			}
			else if(hoursInDay>=6||hoursInDay<=18) {
				System.out.println("We are trouble");
			}
	}
}