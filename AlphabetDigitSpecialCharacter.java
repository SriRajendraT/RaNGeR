class AlphabetDigitSpecialCharacter {
	public static void main(String[] args) {
		char ch='a';
			if(ch>='a' && ch<='b') {
				System.out.println(ch+" is LowerCaseAlphabet");
			}
			else if(ch>='A' && ch<='B') {
				System.out.println(ch+" is UpperCaseAlphabet");
			}
			else if(ch>='0' && ch<='9') {
				System.out.println(ch+" is Digit");
			}
			else {
				System.out.println(ch+" is SpecialCharacter");
			}
	}
}