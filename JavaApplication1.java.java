/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author TUSHAR
 */
public class JavaApplication1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int a,y,d,l;
        // TODO code application logic here
        System.out.println("Input the number of minutes: ");
        Scanner s = new Scanner(System.in);
        a=s.nextInt();
        y=a/525600;
        l=a-(y*525600);
        d=l/1440;
        System.out.println(a+" minutes is approximately "+ y +" years "+ d +" days ");
    }
}
    

