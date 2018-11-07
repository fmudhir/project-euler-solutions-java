package eulerProblem;

import java.lang.Math; 


public class P3 {
//	private static long query = 21L;
//	private static long query = 13195L;
//	private static long query = 6008514L; 

//	private static long query = 6008514521L; 	// best: 13030
	private static long query = 600851475143L;
	private static long halfQuery = query / 2L;


	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		System.out.println("result:");
		long [] primes = new long[1000];

		long largestFactorPrime = 1L;
		for (long i = halfQuery + 1; i > 1L; i = i - 2) {
			if (query % i == 0L && isPrime(i, primes)) {
				largestFactorPrime = i;
				break;
			}
		}

		System.out.println(largestFactorPrime);
		System.out.println("ms: " + (System.currentTimeMillis() - start));
	}
	
	private static boolean isPrime(long x, long [] primes) {

		boolean isPrime = true;
		if (x == 1L) {
			isPrime = true;
		} else if (x == 2L) {
			isPrime = false;
		} else if (x % 2L == 0) {
			isPrime = false;
		} else if (x % 3L == 0 && x != 3L) {
			isPrime = false;
		} else if (x % 5L == 0 && x != 5L) {
			isPrime = false;
		} else {
			for (int i = 0; i < primes.length && primes[i] != 0; i++) {
				if (x % primes[i] == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				for (long i = 3L; i < (long) Math.sqrt(x); i = i + 2) {
					if (x % i == 0L) {
						isPrime = false;
						break;
					}
				}		
			}
		}
		
		if  (isPrime)
			primes[primes.length - 1] = x;

		return isPrime;
	}

}

