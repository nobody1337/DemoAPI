package Demo.Optional;

import java.util.Optional;


public class Optionales {
	private String hallo;
	public static void main(String[] args) {
		I t = new Testx();
		System.out.println(t.getHallo());
	}
//	public String getHallo() {
//		return hallo;
//	}
	
	public Optional<String> getHallo() {
		return Optional.ofNullable(hallo);
	}
	public void setHallo(String hallo) {
		this.hallo = hallo;
	}
}
