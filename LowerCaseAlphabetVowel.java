class LowerCaseAlphabetVowel {
	public static void main(String[] args) {
		char ch='b';
			if (ch>='a'&&ch<='z') {
			System.out.println(ch+" is a LowerCase Alphabet");
				switch(ch){
					case 'a': {
					System.out.println(ch+" is a LowerCase vowel");
					break; }
					case 'e': {
					System.out.println(ch+" is a LowerCase vowel");
					break; }
					case 'i': {
					System.out.println(ch+" is a LowerCase vowel");
					break; }
					case 'o': {
					System.out.println(ch+" is a LowerCase vowel");
					break; }
					case 'u': {
					System.out.println(ch+" is a LowerCase vowel");
					break; }
				default :{
				System.out.println(ch+" is a consonent");
				break;}
				}
			}
			else {
			System.out.println(ch+" is not a LowerCase Alphabet");
			}
	}
}