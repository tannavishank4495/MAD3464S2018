/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day6;

/**
 *
 * @author macstudent
 */
public class Day6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 10;
        int n2 = 5;
        int numbers[] = {10,20,30};
        
        try{
           int result = n1 /n2;
           
           //result += numbers[6];
           System.out.println("result: " + result);
        }catch(ArithmeticException e){
            //e.printStackTrace();
            System.err.print("Cannot didvide by zero");
            
        }catch(ArrayIndexOutOfBoundsException e){
            //e.printStackTrace();
            System.err.println("array element not available");
           
        }catch(Exception e){
            //e.printStackTrace();
            System.err.print("Something went wrong");
        }finally{
            System.out.println("This is a finally block");
        }
        
        Addition add1 = new Addition();
        add1.display();
        add1.multiplication();
    }
    
}
