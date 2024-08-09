import java.util.*;
import java.util.stream.*;

public class StreamDay_2 {
	public static void main(String[] args) {
	 int n=10;

     //1 to n numbers
	 IntStream.range(1, n+1).forEach(e->System.out.print(e+" "));
	 System.err.println();
	 //n to 1 numbers
	 IntStream.range(1, n+1).map(e->n-e+1).forEach(e->System.out.print(e+" "));
	 System.err.println();
	 //1 to 10 squares of numbers
	 IntStream.range(1, n+1).map(e->e*e).forEach(e->System.out.print(e+" "));
	 System.err.println();
	 //1 to 10 even numbers
	 IntStream.rangeClosed(1, n+1).filter(e->e%2==0).forEach(e->System.out.print(e+" "));
	 System.out.println();
	 IntStream.range(1, n+1).filter(e->e%2!=0).forEach(e->System.out.print(e+" "));
}
}


//for(int i=1;i<=n;i++) {
//System.out.print(i+" ");
//}

//List<Integer> list=IntStream.range(1, n+1).boxed().map(e->n-e+1).collect(Collectors.toList());
//System.out.println(list);
