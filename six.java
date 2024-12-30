/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB12;

/**
 *
 * @author HP
 */
import java.util.*;
public class six {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter any string:");
        String s1=in.nextLine();
        String s2=in.nextLine();
        
        String s3=s1.concat(s2);
        
        System.out.println(s3);
    }
}
