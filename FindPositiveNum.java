/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sunwaylab;
import java.util.*;
public class FindPositiveNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        
    int i =0;
    do{
        System.out.println("Enter a number");
        int num = sc.nextInt();
        if(num>0)
            System.out.println("It is positive number");
        else if(num==0)
            System.out.println("It is zero");
        else
            System.out.println("It is negetive number");
        i++;
    }while(i<5);

    }
}
