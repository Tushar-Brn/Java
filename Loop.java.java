/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop;
import java.util.Scanner;
/**
 *
 * @author TUSHAR
 */
public class Loop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a;
        System.out.println("Enter your age : ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        if(a>=18)
            System.out.println("You are eligible to vote");
        else
            System.out.println("You are NOT eligible to vote");
    }
    
}
