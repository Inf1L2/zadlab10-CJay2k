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
 * @author Adrian Hrycaj
 */
public class WprowadzZKonsoli {
    int i;
    char c;
    long l;
    Scanner scanner = new Scanner(System.in);
    
    public WprowadzZKonsoli() {

    }
    
    
    public void wprowadzInt(){
        System.out.print("Wprowadź liczbę całkowitą: ");
        try {
            this.i=scanner.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Podano błędny typ danych");
        }
    }
    
    public void wprowadzChar(){
        System.out.print("Wprowadź liczbę znak: ");
        try {
            this.c=scanner.next().charAt(0);
        }
        catch (InputMismatchException e) {
            System.out.println("Podano błędny typ danych");
        }
    }

    public void wprowadzLong(){
        System.out.print("Wprowadź liczbę ułamkową: ");
        try {
        this.l=scanner.next().charAt(0);
        }
        catch (InputMismatchException e) {
        System.out.println("Podano błędny typ danych");
        }
    }
}