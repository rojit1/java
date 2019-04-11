/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sunwaylab;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class AsciValue {
    public static void main(String[] args) {
           
        char val;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char value");
        val = sc.next().charAt(0);
        int ans = (int) val;
        System.out.println(ans);
        
        
    }
 
}
