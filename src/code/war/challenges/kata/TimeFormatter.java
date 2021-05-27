package code.war.challenges.kata;

/*
 * @link https://www.codewars.com/kata/52742f58faf5485cae000b9a
 */
public class TimeFormatter {

	public static String formatDuration(int seconds) {
		// your code goes here
		int secInYear = 31536000;
		int secInDay = 86400;
		int secInHour = 3600;
		int secInMinute = 60;
		String output = "";
		if (seconds < 1) {
			return "now";
		}

		int yearAsSeconds = getDurationAsSeconds(seconds, secInYear);
		int years = yearAsSeconds / secInYear;
		output = buildOutput(years, "year");
		seconds = getRemainingSeconds(seconds, yearAsSeconds);

		int dayAsSeconds = getDurationAsSeconds(seconds, secInDay);
		int days = dayAsSeconds / secInDay;
		output += output.isEmpty() ? buildOutput(days, "day") : days > 0 ? ", " + buildOutput(days, "day") : "";
		seconds = getRemainingSeconds(seconds, dayAsSeconds);

		int hourAsSeconds = getDurationAsSeconds(seconds, secInHour);
		int hours = hourAsSeconds / secInHour;
		output += output.isEmpty() ? buildOutput(hours, "hour") : hours > 0 ? ", " + buildOutput(hours, "hour") : "";
		seconds = getRemainingSeconds(seconds, hourAsSeconds);

		int minuteAsSeconds = getDurationAsSeconds(seconds, secInMinute);
		int minute = minuteAsSeconds / secInMinute;
		output += output.isEmpty() ? buildOutput(minute, "minute")
				: minute > 0 ? ", " + buildOutput(minute, "minute") : "";
		seconds = getRemainingSeconds(seconds, minuteAsSeconds);

		output += output.isEmpty() ? buildOutput(seconds, "second")
				: seconds > 0 ? ", " + buildOutput(seconds, "second") : "";

		int lastIndexOfComma = output.lastIndexOf(',');
		if (lastIndexOfComma >= 0) {
			output = output.substring(0, output.lastIndexOf(',')) + " and" + output.substring(lastIndexOfComma + 1);
		}

		return output;
	}

	private static int getDurationAsSeconds(int seconds, int secInDuration) {
		int remainSeconds = seconds % secInDuration;
		if (remainSeconds == 0) {
			return seconds;
		}
		return Math.abs(seconds - remainSeconds);
	}

	private static int getRemainingSeconds(int seconds, int durationAsSeconds) {
		if (seconds == durationAsSeconds) {
			return 0;
		}
		return Math.abs(seconds - durationAsSeconds);
	}

	private static String buildOutput(int number, String period) {
		String output = "";
		if (number > 0 && number < 2) {
			output = number + " " + period;
		} else if (number > 1) {
			output = number + " " + period + "s";
		}

		return output;
	}

	public static String cleverFormatDuration(int seconds) {
		String res = "";
		int[] units = new int[] { 31536000, 86400, 3600, 60, 1 };
		String[] labels = new String[] { "year", "day", "hour", "minute", "second" };

		if (seconds == 0)
			return "now";

		for (int i = 0; i < 5; i++) {
			if (seconds >= units[i]) {
				int q = seconds / units[i];
				seconds = seconds % units[i];
				res += (res.equals("") ? "" : (seconds == 0 ? " and " : ", ")) + q + " " + labels[i]
						+ (q > 1 ? "s" : "");
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}
