package com.epam.StartA;
import java.util.stream.Stream;
import java.util.*;


interface Checker{
	void check(Stream<String> s);
}

public class Task10_3
{
	
    public static void main( String[] args )
    {	
    	//checking whether the scanned strings satisfy the condition-
    	//starting with "a" and
    	//have length of exact 3
    	//using stream operations and lambdas
    	
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter five strings");
    	List<String> al=new ArrayList<String>();
    	for(int i =0;i<5;i++) {
    		al.add(sc.nextLine());
    	}
    	sc.close();
    	Stream<String> stream2 = al.stream();
 
    	System.out.println("The result is -");
    	Checker ch=i->stream2.filter(s->s.startsWith("a")).filter(s->s.length()==3).forEach(s->System.out.println(s));
    	ch.check(stream2);
    }
}
