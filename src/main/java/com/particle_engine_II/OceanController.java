/*
 * Coder: Vanessa Haynes
 * Project: Project 2 - Particle Engine with Inheritance
 * Date: Sep. 2024
 * Description: Controller class that controls the animations of the particles 
 */

package com.particle_engine_II;
import java.util.ArrayList;
import processing.core.*;

public class OceanController {
    PApplet main;
    float r; 
    float g; 
    float b; 
    int background; 
    ArrayList<Fish> fishies; //all the fish being drawn
    ArrayList<Bubble> bubbles; //all the bubbles being drawn
    Fish fish; //fish that will be drawn to the screen
    Bubble bubble; //a bubble that will be drawn to the screen
    int bubbleCount = 252; //# of bubbles

    OceanStuff stuff; //testing the super class
    int fishCount = 12;

    OceanController(PApplet main_) {
        main  = main_;
        r = main.random(50); 
        g = main.random(50);
        b = main.random(50, 255);
        background = main.color(r, g, b);
        stuff = new OceanStuff(main_, main.width/2f, main.height/2f, 20f, main.color(255));
        fishies = new ArrayList<>();
    }

    public void draw() {
        main.background(background);
        stuff.display();
    }

    void init() {
        for(int i=0; i<fishCount; i++) {
            fish = new Fish(main.random(main.width), main.random(main.height), main.random(15,30), main.random(5,15), main.color(main.random(255), main.random(255), main.random(255)), main);
            fishies.add(fish);
        }
    }

}
