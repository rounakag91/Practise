package ErrorCheck;

public class MyFor {
	public static void main(String argv[]) {
		int i;
		int j;
		for (i = 1; i < 3; i++)
			for (j = 1; j < 3; j++) {
				if (j == 2)
					continue;
				System.out.println("Value for i=" + i + " Value for j=" + j);
			}
	}}