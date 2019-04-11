/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sunwaylab;

import java.util.Scanner;


public class CircleArea {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius");
        int r = sc.nextInt();
        double area = 2*Math.PI*r;
        System.out.println("The area of circle is "+area);
        
        SimpleIntrest si = new SimpleIntrest();
        System.out.println(si.calculateSI());
        
    }
}

class SimpleIntrest{
    public float calculateSI(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Principal");
        int p = s.nextInt();
        System.out.println("Enter the time");
        int t = s.nextInt();
        System.out.println("Enter the rate");
        float r = s.nextFloat();
        float si=(p*t*r)/100;
        return si;
    }
    
}
class CalculatePercentage{
    public void Calc(){
        int total = 500;
        
        int s1 = 60;
        int s2 = 60;
        int s3 = 70;
        int s4 = 65;
        int s5 = 61;
        
        double percent = (s1+s2+s3+s4+s5)/total;
        System.out.println(percent);

    }
}

