/*
 * Coder: Vanessa Haynes
 * Project: Project 2 - Particle Engine with Inheritance
 * Date: Sep. 2024
 * Description: Particle engine with basic physics and some interactivity
 */

package com.particle_engine_II;

import processing.core.*;

public class Bubble {
    PApplet main; //provides all the functionality of processing 

    float x, y; //location of the bubble
    float yVel = 3; //how fast the bubble moves
    float y_direction = 1; //which direction the bubble goes, 1 is down -- adding & -1 is up -- subtracting
    float radius; //size of bubble
    int bubbleColor; //color of the bubble

    Bubble(float x_, float y_, float radius_, PApplet main_, int c) {
        x = x_;
        y = y_;
        radius = radius_;
        bubbleColor = c;

        main = main_;
    }

//draws out the bubble - will have no fill and only coloring the outline
    void draw() {
        main.stroke(bubbleColor);
        main.ellipse(x, y, radius, radius); //need to connect to main class to use processing's ellipse function
        move();
    }

//making the bubbles move
    void move() {
        y += yVel*y_direction; //moves the bubble

        //keeps the bubble from leaving the screen- boounces them
        if(y >= main.height){
            y_direction = -1;
        } else if (y <= 0) {
            y_direction = 1;
        }
    }

//speeds up bubble
    void faster() {
        yVel++;
    }

//slows down bubble
    void slower() {
        yVel--;
    }
}