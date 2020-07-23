package com.epam.StartA;
import java.util.stream.Stream;
import java.util.*;
import java.util.function.Predicate;

public class Task10_3
{
	
	public static List<String> checkStr(List<String> al, Predicate<String> p){
		List<String> res = new ArrayList<String>();
		for(String i:al) {
			if(p.test(i)) {
				res.add(i);
			}
		}
		return res;
	}
    public static void main( String[] args )
    {	
    	//checking whether the scanned strings satisfy the condition-
    	//starting with "a" and
    	//have length of exact 3
    	//using stream operations and functional interface
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter five strings");
    	List<String> al=new ArrayList<String>();
    	for(int i =0;i<5;i++) {
    		al.add(sc.nextLine());
    	}
    	sc.close();
    	Stream<String> stream2 = al.stream();
    	System.out.println("The result using predicate functional interface - ");
    	List<String> res=checkStr(al,(String i)->(i.startsWith("a") && i.length()==3));
    	System.out.println(res);
    	System.out.println("The result using  stream operations -");
    	stream2.filter(s->s.startsWith("a")).filter(s->s.length()==3).forEach(s->System.out.println(s));
    	
    }
}
