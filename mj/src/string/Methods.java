//charAt
package string;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Learn Java";
	    String s2 = "Programming";
	    
	    System.out.println(s1.charAt(0));  
	    System.out.println(s1.charAt(6));  
	    System.out.println(s2.charAt(5));
	    
	
	
//concat
	    String x="Hello";
	    System.out.println(x.concat("Java"));
	    
	    
	    
	    
//boolean equals
	    String str1="Hello Dear";
	    String str2="Hello Dear";
	    String str3=new String("Hello Dear!");
	    if(str1.equals(str2))
	    {
	    	System.out.println("str1 and str2refer to identical strings");
	    }
	    else
	    {
	    	System.out.println("str1 and str2 refer to non identical strings");
	    }
	    if(str1==str2)
	    {
	    	System.out.println("str1 and str2 refer to same string");
	    }
	    else
	    {
	    	System.out.println("str1 and str2 refer to different strings");
	    }
	    if(str1.equals(str3))
	    {
	    	System.out.println("str1 and str3 refer to identical strings");
	    }
	    else
	    {
	    	System.out.println("str1 and str3 refer to non identical strings");
	    }
	    if(str1==str3)
	    {
	    	System.out.println("str1 and str3 refer to same string");
	    }
	    else
	    {
	    	System.out.println("str1 and str3 refer to different strings");
	    }

	    
	    

//boolean equalsIgnoreCase
         String y="Exit";
         System.out.println(y.equalsIgnoreCase("EXIT"));
         System.out.println(y.equalsIgnoreCase("tixe"));

	
	

//length
         String z="01234567";
         System.out.println(z.length());
         
         
         
//replace
         String w="oxoxoxox";
         System.out.println(w.replace('x', 'X'));
         
         
         
//lower case
         String t="A New Moon";
         System.out.println(t.toLowerCase());
         
         
         
//upper case
         String a="A New Moon";
         System.out.println(a.toUpperCase());
         
         
         
//trim
         String h="hi";
         System.out.println(h+"x");
         System.out.println(h.trim()+"x");
         
         
         
//boolean endsWith
         String r="Foobar";
         System.out.println(r.endsWith("bar"));
         
         
         
//boolean startsWith
         String s="Foobar";
         System.out.println(s.startsWith("Foo"));
         
         
         
//substring
         String e="0123456789";
         System.out.println(e.substring(5));
         System.out.println(e.subSequence(5, 8));
         
         
         
//indexOf
         String i="Sun is shining brightly";
         System.out.println("indexOf(i)=" +i.indexOf('i'));
         
         
         
//lastIndexOf
         String g="Sun is shining brightly";
         System.out.println("lastIndexOf(g)=" +g.lastIndexOf('g'));
         
         
         
//equals
         String t1="Sachin";
         String t2="Sachin";
         String t3=new String("Sachin");
         String t4="Saurav";
         System.out.println(t1.equals(t2));
         System.out.println(t1.equals(t3));
         System.out.println(t1.equals(t4));
         System.out.println(t1==t2);
         System.out.println(t1==t3);
         
         
         
//compareTo
         String m ="Sachin";
         String n="Sachin";
         String o="Ratan";
         System.out.println(m.compareTo(n));
         System.out.println(m.compareTo(o));
         System.out.println(o.compareTo(m));
	}
}