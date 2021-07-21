/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loop1;
import java.util.Scanner;
/**
 *
 * @author TUSHAR
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int choice;
        System.out.println("Pick one : 1. Hi\t2. Hey\t3.Hello\t");
        Scanner s= new Scanner(System.in);
        choice = s.nextInt();
        switch(choice)
        {
            case 1 : System.out.println("You said Hi");
            break;
            case 2 : System.out.println("You said Hey");
            break;
            case 3 : System.out.println("You said Hello");
            break;
            default : System.out.println("Invalid choice");
        }
        // TODO code application logic here
    }
    
}
