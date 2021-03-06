public class CountingSeries {
	public long countThem(long a, long b, long c, long d, long upperBound) {
		long total = 0;
		if (upperBound >= a) {
			total = (upperBound - a) / b + 1;
		}
		for (long i = c; i <= upperBound; i *= d) {
			if (i < a || (i - a) % b != 0) {
				total++;
			}
			if (d == 1) {
				break;
			}
		}
		return total;
	}
}
