package Variables;

public class CharacterType {
	int c = 'A';
	char charint = 65;
	char unicode ='\u0041';
	char unicode2 = 0x41;
	char charBinary = 0b0100001;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharacterType obj = new CharacterType();
		System.out.println(obj.c);
		System.out.println(obj.charint);
		System.out.println(obj.unicode);
		System.out.println(obj.unicode2);
		System.out.println(obj.charBinary);
	}

}
 