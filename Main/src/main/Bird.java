/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author zakiyya_khan
 */

class Bird extends Animal {
    private int colour;

    public Bird(int IDtag, String species, int colour) {
        super(IDtag, species);
        this.colour = colour;
    }

    public int getColour() {
        return colour;
    }

    public void setColour(int colour) {
        this.colour = colour;
    }

    @Override
    public void input() {
        super.input();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter feather colour (1=grey, 2=white, 3=black): ");
        colour = scanner.nextInt();
    }

    @Override
    public void output() {
        super.output();
        System.out.println("Feather Colour: " + colour);
    }
}




