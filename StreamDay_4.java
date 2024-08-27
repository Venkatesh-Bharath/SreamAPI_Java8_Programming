import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class StreamDay_4 {
   public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   // prime or not
   boolean isPrime=n>1 && IntStream.rangeClosed(2,(int)Math.sqrt(n)).noneMatch(i->n%i==0);
   System.out.println(isPrime);
   //up-to n prime numbers
   IntStream.rangeClosed(2, n)
   .filter(e->IntStream.rangeClosed(2,(int)Math.sqrt(e)).noneMatch(i->e%i==0))
   .forEach(e->System.out.print(e+" "));
   System.out.println();
   //reverse given number   123 out 321
   int rev=Stream.iterate(n, e->e!=0, e->e/10)//123,12,1
		   .reduce(0, (a,b)->a*10+b%10);//0+3 a=3;30+2 a=32;320+1 a=321
   System.out.println(rev);
   
   
   //palindrome   121 ->121
   boolean isPali=n==Stream.iterate(n, e->e!=0, e->e/10)
		   .reduce(0, (a,b)->a*10+b%10);
   System.out.println(isPali);
   sc.close();
}
}
