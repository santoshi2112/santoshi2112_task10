package com.epam.palindrome;

import java.util.*;
import java.util.stream.Stream;


@FunctionalInterface
interface isPalindrome{
	void checkPalindrome(List<String> s);
	
}

class Palindrome{
	public static void checkPalindrome(List<String> s) {
		
		Stream<String> res=s.stream();
		res.filter(i->i.equals(new StringBuilder(i).reverse().toString())).forEach(i->System.out.println(i));;
	}
}
public class Task10_02
{
	//checking how many strings
	//for given list are palindromes
	//using java8 streams and lambda functions
	public Task10_02(){
		
	}
	public void Checker(isPalindrome p,List<String> l) {
		p.checkPalindrome(l);
	}
    public static void main( String[] args )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 5 strings to check if they are palindromes");
        List<String> al=new ArrayList<String>();
        for(int i=0;i<5;i++) {
        	al.add(sc.nextLine());
        }
        sc.close();
        Task10_02 t=new Task10_02();
        System.out.println("Palindromes are:");
        t.Checker(Palindrome::checkPalindrome,al);
        
    }
}
