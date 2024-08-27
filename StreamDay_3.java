import java.util.*;
import java.util.stream.*;
public class StreamDay_3 {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();//2023
	//range(1,10)==>1 to 9
	//rangeClosed(1,10)==>1 to 10     2 x 1= 2
	//multiplication table
	IntStream.rangeClosed(1,10).map(i->n*i).forEach(e->System.out.println(n+" X "+e/n+" = "+e));
	// find factorial
	int fact=n==0?1:IntStream.rangeClosed(1, n).reduce(1,(a,b)->a*b);
	System.out.println(fact);
//	boolean ans=(n%4==0&&n%100!=0)||n%400==0;	
	//all leap year or not
	boolean ans=Stream.of(2016,20,n).allMatch(y->(y%4==0&&y%100!=0)||(y%400==0));
	System.out.println(ans);
	sc.close();
	
	}
}
