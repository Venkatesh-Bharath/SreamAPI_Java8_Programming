import java.util.*;
public class StreamDay_9 {
    public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 String str=sc.next();//trendingtechnology
    		 Character first=str.chars().mapToObj(c->(char)c)
				 .collect(LinkedHashMap<Character,Integer>::new,(map,c)->map.put(c,map.getOrDefault(c,0)+1),Map::putAll)
				 .entrySet()
				 .stream()
				 .filter(e->e.getValue()==1)
				 .map(Map.Entry::getKey)
				 .findFirst().orElse(null);
		 System.out.println(first);
      
		 Character second=str.chars().mapToObj(c->(char)c)
				 .collect(LinkedHashMap<Character,Integer>::new,(map,c)->map.put(c,map.getOrDefault(c,0)+1),Map::putAll)
				 .entrySet()
				 .stream()
				 .filter(e->e.getValue()==1)
				 .map(Map.Entry::getKey).skip(2)
				 .findFirst().orElse(null);
		 System.out.println(second);
		 sc.close();
		 //str.chars() -> [116, 114, 101, 110, 100, 105, 110, 103, 116, 101, 99, 104, 110, 111, 108, 111, 103, 121]
		 //.mapToObj(c->(char)c)->[t, r, e, n, d, i, n, g, t, e, c, h, n, o, l, o, g, y]
		 //..collect(LinkedHashMap<Character,Integer>::new,(map,c)->map.put(c,map.getOrDefault(c,0)+1),Map::putAll)
		 //{t=2, r=1, e=2, n=3, d=1, i=1, g=2, c=1, h=1, o=2, l=1, y=1}
		 //.entrySet().stream() ->[t=2, r=1, e=2, n=3, d=1, i=1, g=2, c=1, h=1, o=2, l=1, y=1]
		 //.filter(e->e.getValue()==1)->[r=1, d=1, i=1, c=1, h=1, l=1, y=1]
		 //.map(Map.Entry::getKey) ->[r, d, i, c, h, l, y]
		 //.findFirst()->Optional[r]
		 
	}
}
