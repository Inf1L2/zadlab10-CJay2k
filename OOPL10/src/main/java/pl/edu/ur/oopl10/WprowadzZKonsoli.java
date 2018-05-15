/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author student
 */
public class WprowadzZKonsoli {
    int i;
    char c;
    Scanner scanner = new Scanner(System.in);
    
    public WprowadzZKonsoli() {

    }
    
    public void wprowadzInt(){
        System.out.print("Wprowadź liczbę całkowitą: ");;
        try {
            this.i=scanner.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Podano błędny typ danych");
        }
    }
    
    public void wprowadzChar(){
        System.out.print("Wprowadź liczbę całkowitą: ");;
        try {
            this.c=scanner.nexc
        }
        catch (InputMismatchException e) {
            System.out.println("Podano błędny typ danych");
        }
    }
}