package lesson11;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.IntStream;

public class Lambda {
	private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

	public static void main(String[] args) {
		IntStream stream = IntStream.range(1, 10000);
		stream.forEach(i -> System.out.println(i)); //stream.forEach(① ② System.out.println(③));

	}

	private static String currentTime() {
		return FORMATTER.format(LocalDateTime.now());
	}
}
