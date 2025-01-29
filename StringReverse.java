//public class StringReverse {// Java Program to Reverse a String
    // Using for loop
    //import java.io.*;
    import java.util.Scanner;
    
    class StringReverse {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string : ");
            String s = sc.next();
           // String s = "Geeks"; 
            String r = "";
            char ch;
    
            for (int i = 0; i < s.length(); i++) {
                  
                  // extracts each character
                ch = s.charAt(i);
               // System.out.println("the Reversed String is :" + ch);
              
                  // adds each character in
                // front of the existing string
                r = ch + r; 
                //System.out.println("the Reversed String is :" + ch);

            }
          
            System.out.println( "The Reversed String is : " + r);
            sc.close();
        }
    }
    
//}
