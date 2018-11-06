package eulerProblem;

public class P3 {
//	private static long query = 21L;
//	private static long query = 13195L;
//	private static long query = 6008514L; 

	private static long query = 6008514521L;
//	private static long query = 600851475143L;
	private static long halfQuery = query / 2L;

	public static void main(String[] args) {

		System.out.println("result:");
		long start = System.currentTimeMillis();

		long largestFactorPrime = 1;

		int size = 0;		
		for (long i = 1L; i < halfQuery; i++) {
			if (query % i == 0L) {
				if (isPrime(i)) { 
					largestFactorPrime = i;
				}
			}		
		}

		System.out.println(largestFactorPrime);
System.out.println("ms: " + (System.currentTimeMillis() - start));
		
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

}

