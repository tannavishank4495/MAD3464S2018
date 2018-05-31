/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import java.util.Scanner;

/**
 *
 * @author macstudent
 */
public class Person {
    String name;
    String address;
    String phoneNo;
    int age;
    String gender;
    Scanner in = new Scanner(System.in);
    
    void setName(){
        
        System.out.println("Enter name:");
        name = in.nextLine();
        
    }
    String getName(){
        return name;
        
        
    }
    
    void setAddress() {
        System.out.println("Enter address :");
        address = in.nextLine();
        
     
        
    }
    String getAddress() {
        return address;
        
    }
    void setGender() {
        System.out.println("Enter gender :");
        gender = in.nextLine();
        
        
       
    }
    String getGender() {
        return gender;
        
    }
    void setAge() {
        System.out.println("Enter age:");
        //age = in.nextLine();
        age = Integer.parseInt(in.nextLine());
    }
    int getAge() {
        return age;
        
    }
    void setPhoneNo(){
        System.out.println("Enter PhoneNo:");
        phoneNo = in.nextLine();
        
    }
    String getPhoneNo() {
        return phoneNo;
        
    }
    
    @Override
    public String toString(){
        String data ="Name: " + name + "\n" +
                "Address :" +address + "\n" +
                "phoneNo :" + phoneNo + "\n" +
                "Gender :"  + gender + "\n" +
                "Age: " + age + "\n";
                return data;
                
    }
    
    void setData(){
        setName();
        setAddress();
        setPhoneNo();
        setAge();
        setGender();
        
    }
}
