package ErrorCheck;
public class Tux extends Thread {
	static String sName = "vandeleur";

	public static void main(String argv[]) {
		Tux t = new Tux();
		t.piggy(sName);
		System.out.println(sName);
	}

	public void piggy(String sName) {
		sName = sName + " wiggy";
		start();
	}

	public void run() {
		for (int i = 0; i < 4; i++) {
			sName = sName + " " + i;
		}
	}
	
}