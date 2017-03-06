package eulerProblem;

public class P1 {

	private int sum;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P1 prog1 = new P1();
		
		for (int i = 1; i < 1000; i++)
			if (i % 3 == 0 || i % 5 == 0)
				prog1.sum += i;
		
		System.out.printf("%d", prog1.sum);

	}

}
