package eulerProblem;

public class P3 {

	private static long min = 2L;
	private static long prime = 600851475143L;

	public static void main(String[] args) {

		long factor = nextSmallerFactor();
		while (factor > 1L) {
			if (primeNumber(factor)) {
				System.out.println("solution: ");
				System.out.println(factor);
				break;
			} else {
				factor = nextSmallerFactor();
			}
		}
		

	}

	private static boolean primeNumber(long candidate) {
		long i;

		if (candidate % 2L == 0L) {
			return false;
		} else if (candidate != 3L && candidate % 3L == 0L) {
			return false;
		} else if (candidate != 5L && candidate % 5L == 0L) {
			return false;
		}

		long half = candidate / 2L;
		for (i = 7L; i < half; i++) {
			if (i % 2L == 0L) {
				continue; 
			} else if (i % 3L == 0L) {
				continue;
			} else if (i % 5L == 0L) {
				continue;
			} else if (candidate % i == 0L) {
				return false;
			}
		}

		return i == half;

	}

	private static long nextSmallerFactor() {
		long i;
		for (i = min; prime % i != 0 ;i++) {}
		min = i + 1L;
		return prime / i;
	}
}
