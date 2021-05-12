package com.qa.day5Exercises;

public class Mytry {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		  System.out.println("Hello\nAlexandra Abramov!");
//			 }
	
	public String repeatAllThreetimes(String stng) 
	{
	  int l = stng.length();
	  String newstring = "";
	  for (int i = 0; i < l; i++) 
	  {
	    newstring += stng.substring(i,i+1) + stng.substring(i, i+2);
	  }
	  return newstring;
	}

	public static void main (String[] args)
	    {
		  Mytry m= new Mytry();
	      String str1 =  "The";
	      System.out.println("The given string is: "+str1);
	      System.out.println("The new string is: "+m.repeatAllThreetimes(str1));
		  }
	}
	

