
public class Main {
	public static void main(String[] args) {
		Cipher c=new Cipher(3);
		String crypted=c.encrypt("hello world");
		System.out.println(crypted);
		String decrypted=c.decrypt(crypted);
		System.out.println(decrypted);
	}
}
