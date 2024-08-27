import java.util.*;
import java.util.stream.IntStream;
public class StreamDay_5 {
   public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		int n=sc.nextInt();
		IntStream.rangeClosed(1, n).forEach(e->System.out.println("*".repeat(n)));
		
		System.out.println();
		IntStream.rangeClosed(1, n)
		.forEach(e->System.out.println(String.valueOf(e).repeat(n)));
		
		System.out.println();
		IntStream.rangeClosed(1, n)
		.forEach(e->System.out.println(String.valueOf((char)(64+e)).repeat(n)));
	}
}
}
