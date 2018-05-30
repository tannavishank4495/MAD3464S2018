/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author macstudent
 */
public class ArithemeticTest {
    public static void main (String args[]){
        Arithmetic operation1 = new Arithmetic();
        
        System.out.println(operation1.number1);
        operation1.addition();
        operation1.addition(20,34);
        float result = operation1.addition(12.34f, 34.23f);
        System.out.println("result :" + result);
    }
    
}
