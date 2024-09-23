/*
 * Coder: Vanessa Haynes
 * Project: Project 2 - Particle Engine with Inheritance
 * Date: Sep. 2024
 * Description: Particle engine with basic physics and some interactivity
 */

package com.particle_engine_II;

import processing.core.*;

public class Fish extends OceanStuff{
    float sizeX, sizeY; //size of fish length and height
    boolean swimright;


    Fish(PApplet main_, float x_, float y_, float sizeX_, float sizeY_, int color_) {
        super(main_, x_, y_, 0, color_);
        sizeX = sizeX_;
        sizeY = sizeY_;
    }

//draws out the fish
    void draw() {
        if (swimright) {
            main.fill (color);
        main.rect (x, y, sizeX, sizeY);
        main.ellipse (x, y+sizeY/2-1, sizeX, sizeY);
        move();
        } else {
            main.fill (color);
        main.rect (x, y, sizeX, sizeY);
        main.ellipse (x+sizeX, y+sizeY/2-1, sizeX, sizeY);
        move();
        }
        
    }

    void move() {
        super.move();
     //keeps the fish from leaving the screen- boounces them
    if((x+sizeX) >= main.width){
        xdirection = -1;
        swimright = false;
    } else if (x <= 0) {
        xdirection = 1;
        swimright = true;
    }
    }

//changes the direction of the fish
    void flip() {
        xdirection *= -1;
    }
}