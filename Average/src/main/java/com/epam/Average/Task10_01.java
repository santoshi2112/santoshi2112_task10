package com.epam.Average;
import java.util.*;
import java.util.stream.Stream;

//finding average of given numbers using method references of functional interface
@FunctionalInterface
interface getAvg{
	double check(Stream<Integer> arr);
}

class getAvgValue{
	public static double avg(Stream<Integer> n) {
		return n.mapToInt(i->i).average().getAsDouble();
	}
}
public class Task10_01
{
	public Task10_01() {
		
	}
	public double Average(getAvg p,Stream<Integer> n) {
		return p.check(n);
	}
	
    public static void main( String[] args )
    {
    	Task10_01 t=new Task10_01();
    	Scanner sc=new Scanner(System.in);
    	System.out.print("enter no of elements");
    	int num=sc.nextInt();
    	System.out.println("enter elements");
    	ArrayList<Integer> al=new ArrayList<Integer>();
    	for(int i=0;i<num;i++) {
    		al.add(sc.nextInt());
    	}
    	sc.close();
    	Stream<Integer> arr=al.stream();
    	double res=t.Average(getAvgValue :: avg, arr);
    	System.out.printf("The average of given numbers is %.2f",res);
    }
}
