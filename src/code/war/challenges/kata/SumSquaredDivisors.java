package code.war.challenges.kata;

public class SumSquaredDivisors {
	public static String listSquared(long m, long n) {
		// your code
		if (m < 1) {
			return "[]";
		}
		int count = 0;
		String output = "[";
		for (long i = m; i <= n; i++) {
			count += Math.pow(i, 2);
			for (int j = 1; j <= i / 2; j++) {
				if (i % j == 0) {
					count += Math.pow(j, 2);
				}
			}
			if (Math.sqrt(count) % 2 == 0 || count == 1) {
				output += ", [" + i + ", " + count + "]";
			}
			count = 0;
		}
		if (!output.isEmpty()) {
			output += "]";
			output = output.replaceFirst(", ", "");
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
