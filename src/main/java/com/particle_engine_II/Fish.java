/*
 * Coder: Vanessa Haynes
 * Project: Project 2 - Particle Engine with Inheritance
 * Date: Sep. 2024
 * Description: Particle engine with basic physics and some interactivity
 */

package com.particle_engine_II;

import processing.core.*;

public class Fish {
    float x, y; //location
    float sizeX; //size of fish length
    float sizeY; //size of fish height
    int color; //color of fish
    float xVel = 3; //how fast the fish move
    float x_direction = 1; //which direction the fish goes, 1 is right -- adding & -1 is left -- subtracting

    PApplet main; //main class that gives processing functionality

    Fish(float x_, float y_, float sizeX_, float sizeY_, int color_, PApplet main_) {
        x = x_;
        y = y_;
        sizeX = sizeX_;
        sizeY = sizeY_;
        color = color_;

        main = main_;
    }

//draws out the fish
    void draw() {
        main.fill (color);
        main.rect (x, y, sizeX, sizeY);
        move();
    }

//making the fish move
    void move() {

        x += xVel*x_direction; //moves the fish

        //keeps the fish from leaving the screen- boounces them
        if((x+sizeX) >= main.width){
            x_direction = -1;
        } else if (x <= 0) {
            x_direction = 1;
        }
    }

//changes the direction of the fish
    void flip() {
        x_direction *= -1;
    }

//speeds up fish
    void faster() {
        xVel++;
    }

//slows down fish
    void slower() {
        xVel--;
    }
}