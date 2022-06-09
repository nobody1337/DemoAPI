package Demo.Optional;

import java.util.Optional;

public class DemoOptional {
	private String hallo;
	public static void main(String[] args) {
		DemoOptional t = new DemoOptional();
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
