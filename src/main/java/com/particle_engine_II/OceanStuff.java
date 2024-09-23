/*
 * Coder: Vanessa Haynes
 * Project: Project 2 - Particle Engine with Inheritance
 * Date: Sep. 2024
 * Description: Superclass for all particle types in particle engine
 */

package com.particle_engine_II;
import processing.core.*;

public class OceanStuff {
    PApplet main; //processing functionality
    float x, y; //location
    float size; //size of the particles
    int color; //color of the particles
    float xvel, yvel; //velocity of the particles
    float xdirection, ydirection; //the direction of the particles
    boolean collide; //if the particles have collided

//initiallizes everything
    OceanStuff(PApplet main_, float x_, float y_, float size_, int color_) {
        main = main_;
        x = x_;
        y = y_;
        size = size_;
        color = color_;
    }

//displays all of the particles
    void display() {
        main.fill(color);
        main.ellipse(x, y, size, size);
        move();
    }

//making stuff move
void move() {

    x += xvel*xdirection; //moves the fish
    y += yvel*ydirection; //moves the bubble

    if(y >= main.height || y <= 0){
        ydirection *= -1;
    }

    if(x >= main.width || x <= 0){
        xdirection *= -1;
    }
}

void faster() {
    yvel++;
    xvel++;
}

//slows down bubble
void slower() {
    yvel--;
    xvel--;
}

//test if one object has hit another object in a radius -- test later
    boolean collides(OceanStuff object) {
        float distance = PApplet.dist(x, y, object.getX(), object.getY());
        return (distance < (size/2 + object.getSize()/2));
    }

//relocate some place random on the screen with random velocity
    void spawn() {
        x = main.random(main.width);
        y = main.random(main.height);

        xvel = main.random(-10, 10);
        yvel = main.random(-10, 10);
    }

    float getX() {return x;}
    float getY() {return y;}
    float getSize() {return size;}
}
