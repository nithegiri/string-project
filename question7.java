package org.string;

public class question7 {
	
	public static void main(String[] args) {
		
		String s1="welcome to the java class";        //7.1
		String s2="welcome to the sql class";
		String st=s1.replace("welcome to the java class", "welcome to the sql class");
		System.out.println(st);
		
		String s3="Greens Adayar";                     //7.2
		String s4="Greens in omr";
		String st2=s3.replace("Greens Adayar","Greens in omr");
		System.out.println(st2);
		
		String s5="welcome to the java class";         //7.3
		String s6="#";
		String st3=s5.replaceAll(" ","#");
		System.out.println(st3);
		
		
		String s7="Nishakerala24@gmail.com";            //7.4
		String st4=s7.replaceAll("gmail","yahoo");
		System.out.println(st4);
		
		
		
	}

}
