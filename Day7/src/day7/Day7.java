/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day7;

/**
 *
 * @author macstudent
 */
public class Day7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str1 = "Test string";
        String str2 = new String("Java");
        
        System.out.println(str1);
        System.out.println(str2);
        
        String str3 = str1 + str2;
        System.out.println(str3);
        
        str3 = str2.concat(str1);
        System.out.println(str3);
        
        str3 = str2;
        System.out.println(str3);
        System.out.println(str2);
        
        //if (str2.equals(str3)){
        if (str2.equalsIgnoreCase(str3)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
        
        str2 = "test 5";
        str3 = "test 8";
        System.out.println("string 2 :" + str2);
        System.out.println("string 3 :" + str3);
        
        int cmp = str3.compareTo(str2);
        System.out.println("cmp :" + cmp);
        
        System.out.println("String 2 : " + str2.toUpperCase());
        
        System.out.println("length of str2 : " + str2.length());
        
        int a1[] = new int[3];
        
        int len = a1.length;
        
        
        str2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0; i<str2.length(); i+=2){
            System.out.print(str2.charAt(i));
        }
        str2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=0; i<str2.length(); i++){
            System.out.print((char)(str2.charAt(i)+1)+" ");
        }
        
        str2 ="Hello there!";
        System.out.println(str2.replace('l','m'));
        
        str2 = "Hello Java";
        System.out.println(str2.endsWith(str3));
        
        str3 =str2.substring(4);
        str3 =str2.substring(0,5);
        
        System.out.println("string 3 :" + str3);
        System.out.println("string 2 :" + str2);
        
        int p =str2.indexOf('l');
        System.out.print(" p : " + p);
        int q =str2.indexOf('b');
        System.out.print(" q : " + q);
        
        str2 = "Hallo Java";
        p = str2.indexOf('a',4);
        
        p = str2.lastIndexOf("Java");
        
        p = str2.lastIndexOf('a');
        System.out.println("p:" + p);
        
        str2 = "This is a test string";
        int wordCount =1;
        for(int i=str2.length()-1; i>=0; i--){
            System.out.print(str2.charAt(i));
            
            if (Character.isWhitespace(str2.charAt(i)))
               wordCount++;
        }
        System.out.println("\n Word count :" + wordCount);
        
        StringBuffer str4 = new StringBuffer("It feels like winter in summer");
       
        System.out.println("String 4 : " +str4);
                
        str4.append("TEST");
        System.out.println("str4 :" +str4);
        
        str4.setCharAt(3, '@');
        System.out.println("str4 :" + str4);
        
        str4.insert(10, "@#$");
        System.out.println("str4 :" + str4);
        
        str4.reverse();
        System.out.println("str4 :" +str4);
        
        
        
        
    }
    
}
