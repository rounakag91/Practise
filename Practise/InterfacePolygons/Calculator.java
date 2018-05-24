package InterfacePolygons;

public class Calculator implements AdvancedArithmetic {

	@Override
	public int divisorSum(int n) {
		// TODO Auto-generated method stub
		if(n == 1)
			return 1;
		else if(n==0)
			return 0;
		else {
		int sum = 1+n;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (i == n / i) {
					sum += i;
				} else
					sum += i + n / i;
			}
		}

		return sum;
		}
		
	}

}
