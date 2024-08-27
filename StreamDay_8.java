import java.util.*;
//import java.util.function.Function;
import java.util.stream.*;
public class StreamDay_8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//listen == silent anagram
//		String s1=sc.next();
//		String s2=sc.next();
//		boolean ans=s1.length()==s2.length()&&s1.chars().boxed()
//				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//				.equals(s2.chars().boxed()
//						.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
//		System.out.println(ans);
//		
		String str=sc.nextLine();//hi hello
		String result=Arrays.stream(str.split(" "))
				.map(w->new StringBuilder(w).reverse().toString())
				.collect(Collectors.joining(" "));
		System.out.println(result);
				
		sc.close();
}
}
