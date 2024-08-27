import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class StreamDay_7 {
     public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        String str=sc.next();//bssb   //0,1
       // String ans=new StringBuilder(str).reverse().toString();
        
        //reverse string
        String ans=IntStream.range(0,str.length())
        		.map(i->str.length()-1-i)
        		.mapToObj(i->String.valueOf(str.charAt(i))).collect(Collectors.joining());
        System.out.println(ans);
        
        //palindrome
        
        boolean ans1=IntStream.range(0, str.length()/2)
        		.allMatch(i->str.charAt(i)==str.charAt(str.length()-1-i));
        System.out.println(ans1);
		sc.close();
		
		//abc123
        int sum=str.chars().filter(e->Character.isDigit(e))
        		.map(e->Character.getNumericValue(e)).sum();
        System.out.println(sum);
	}
}
