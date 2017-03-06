package eulerProblem;

public class P2 {

	private int sum;
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P2 prog2 = new P2();
		
		int i = 2;
		int j = 1;
		int temp = 0;
		
		while (i < 4000000) {
			
			if (i % 2 == 0)
				prog2.sum += i;
			
			temp = i;
			i = i + j;
			j = temp;

		}
		
		System.out.printf("%d", prog2.sum);

	}

}
