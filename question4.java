package org.string;

public class question4 {
	
   public static void main(String[] args) {
	   
	  String s1="Java";  String s3="Java";  //equals or not
	  String s2="Java";  String s4="java";
	                 	  
	  boolean equals=s1.equals(s2);
	  System.out.println(equals);
	  
	  boolean equals1=s3.equals(s4);
	  System.out.println(equals1);
	  
	  String s5="Green Technoloy";
	  String s6="GreenTechnoloy.";
	  
	  boolean equals2=s5.equals(s6);
	  System.out.println(equals2);
	  
	  String s7="JAva";    //use equals ignore case
	  String s8="java"; 

	  boolean ignore=s7.equalsIgnoreCase(s8);
	  System.out.println(ignore);
	  
	  String s9="nisha";
	  String s10="nisha";
	  
	  boolean ignore1=s9.equalsIgnoreCase(s10);
	  System.out.println(ignore1);
}
}
