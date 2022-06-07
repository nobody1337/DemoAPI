package Demo.Optional;

import java.util.Optional;

public class Testx {
	private String hallo;
	public static void main(String[] args) {
		Testx t = new Testx();
		if (t.getHallo().equals("hallo")) 
		{
			System.out.println(t.getHallo());
		}
		else {
			System.out.println("Keine NullPointerEx");
		}
	}
	public String getHallo() {
		return hallo;
	}
	
//	public Optional<String> getHallo() {
//		return Optional.ofNullable(hallo);
//	}
	public void setHallo(String hallo) {
		this.hallo = hallo;
	}
	
}
