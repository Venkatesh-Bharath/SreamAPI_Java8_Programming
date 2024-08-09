import java.util.*;
import java.util.stream.*;
public class StreamDay_1 {
	public static void main(String[] args) {	
	   List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	   List<Integer> oddNumber= numbers.stream().filter(n -> n % 2 != 0).collect( Collectors.toList() ); 
	   System.out.println(oddNumber);
	  //Requires Java 16 or later, as toList() is a new method introduced in this version.
	   List<Integer> oddNumber1= numbers.stream().filter(n -> n % 2 != 0).toList();
	   System.out.println(oddNumber1);
	   
       int a=10;
       int b=30;
       int c=27;
       //maximum of two given numbers 
       int m1=IntStream.of(a,b).max().getAsInt();
       System.out.println(m1);
       //minimum of two given numbers 
       int m2=IntStream.of(a,b).min().getAsInt();
       System.out.println(m2);
       //maximum of three given numbers 
       int m3=IntStream.of(a,b,c).max().getAsInt();
       System.out.println(m3);
	}

}
