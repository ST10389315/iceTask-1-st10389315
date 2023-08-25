/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author zakiyya_khan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bird brd = new Bird(0, "", 0);
        Reptile rept = new Reptile(0, "", 0.0);

        brd.input();
        rept.input();

        System.out.println("\nBird Information:");
        brd.output();

        System.out.println("\nReptile Information:");
        rept.output();
    }
}

