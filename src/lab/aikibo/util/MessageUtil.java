package lab.aikibo.util;

public class MessageUtil {
	
	private String teks;
	
	public MessageUtil(String teks) {
		this.teks = teks;
	}
	
	public String printMessage() {
		System.out.println(teks);
		return teks;
	}
	
	public String salutationMessage() {
		return "Hi!" + teks;
	}

}
