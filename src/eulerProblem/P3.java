package eulerProblem;

public class P3 {
//	private static long query = 21L;
	private static long query = 13195L;
//	private static long query = 600851475143L;
	private static long halfQuery = query / 2L;

	public static void main(String[] args) {

		System.out.println("result:");
		long start = System.currentTimeMillis();

		long [] factors = new long[10000];

		int size = 0;
		long factor = query;		
		for (long i = 1L; i < factor; i++) {
			factor = getFactor(i);
			if (factor != 0L) {
				factors[size++] = i;
			}		
		}

System.out.println("ms: " + (System.currentTimeMillis() - start));
		long largestFactorPrime = 1;
		for (int i = 0; i < size; i++) {
			if (isPrime(factors[i])) { 
				if (factors[i] > largestFactorPrime)
					largestFactorPrime = factors[i];
			}
		}

		System.out.println(largestFactorPrime);
		
	}
	
	private static boolean isPrime(long x) {

		boolean isPrime = true;
		if (x == 1L) {
			isPrime = true;
		} else if (x == 2L) {
			isPrime = false;
		} else {
			for (long i = 2L; i < x; i++) {
				if (x % i == 0) {
					isPrime = false;
					break;
				}
			};
					
		}

		return isPrime;
	}

	private static long getFactor(long x) {
		System.out.println("factor candidate:" + x);
		if (x == 1L)
			return query;
		
		for (long i = halfQuery; i >= 2L; i--) {
			if (i * x == query) {
				System.out.println("factor:" + x + " times: " + i);
				return i;
			}
		}
		return 0L;
	}
}

