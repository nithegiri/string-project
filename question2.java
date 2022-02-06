package org.string;

public class question2 { 
	
     public static void main(String[] args) {
    	 
    	String s1="Greens Technology";         // last index of
 		String s2="Selenium Automation Tool";  //index of
 		String s3="velmurugan";               //index of
 		String s4=" j a v a p r o g r a m ";  //last index of,empty space
 		String s5="9095484678";             //index of 8
 		
 		int last =s1.lastIndexOf('c');
 		System.out.println(last);
 		
 		int index=s2.indexOf('m');
 		System.out.println(index);
	
 		int in=s3.indexOf('g');
 		System.out.println(in);
              
 	    int la=s4.lastIndexOf('o');  
 	    System.out.println(la);
 	    
 	    String space=s4.trim();
 	    System.out.println(space);
 	    
 	    int ind=s5.indexOf("8");
 	    System.out.println(ind);
 	    
 	    
        
 	    
     }
}
