/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl10;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Adrian Hrycaj
 */
public class z4 {
    int losowa1, losowa2;
    double wynik;

    public z4() {
    }
    
    
    public void losuj(){
        this.losowa1 = ThreadLocalRandom.current().nextInt(-10, 10 + 1);
        this.losowa2 = ThreadLocalRandom.current().nextInt(-10, 10 + 1);
    }
    
    public void dziel(){
        for(int i = 0; i<3; i++){
            try {
                losuj();
                this.wynik = this.losowa1 / this.losowa2;
                System.out.println("Liczba 1. " + this.losowa1);
                System.out.println("Liczba 2. " + this.losowa2);
                System.out.println("Wynik: " + this.wynik);
                break;
            }
            catch (ArithmeticException e) {
                System.out.println("Liczba 1. " + this.losowa1);
                System.out.println("Liczba 2. " + this.losowa2);
                System.out.println("Nie można podzielić przez 0 " + e);
            }
        }
    }
}
