import java.util.*;
import java.util.stream.*;
public class StreamDay_6 {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		IntStream.rangeClosed(1, n).forEach(e->System.out.println("*".repeat(e)));
		System.out.println();
		IntStream.rangeClosed(1, n).forEach(e->System.out.println("*".repeat(n-e+1)));//6-2+1
		System.out.println();
		
		IntStream.rangeClosed(1, n)
		.forEach(e->System.out.println(" ".repeat(n-e)+"* ".repeat(e)));  //1 6  4" "+"* "2
		
		sc.close();
	}
}
