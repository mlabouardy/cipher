
public class Cipher {
	private int offset;
	private char specialChars[]={' ',',',';','/','\n','\t','\r'};
	
	public Cipher(int offset){
		this.offset=offset;
	}
	
	public String encrypt(String text){
		String crypted="";
		for(int i=0;i<text.length();i++){
			char c=text.charAt(i);
			if(!isSpecialChar(c))
				crypted+=(char)(c-offset);
			else
				crypted+=c;
		}
		return crypted;
	}
	
	public String decrypt(String text){
		String decrypted="";
		for(int i=0;i<text.length();i++){
			char c=text.charAt(i);
			if(!isSpecialChar(c))
				decrypted+=(char)(c+offset);
			else
				decrypted+=c;
		}
		return decrypted;
	}
	
	public boolean isSpecialChar(char c){
		for(char tmp:specialChars)
			if(tmp==c)return true;
		return false;
	}
}
