/*
 * Coder: Vanessa Haynes
 * Project: Project 2 - Particle Engine with Inheritance
 * Date: Sep. 2024
 * Description: Controller class that controls the animations of the particles 
 */

package com.particle_engine_II;
import processing.core.*;

public class OceanController {
    PApplet main;
    float r; 
    float g; 
    float b; 
    int background; 

    OceanStuff stuff; //testing the super class

    OceanController(PApplet main_) {
        main  = main_;
        r = main.random(50); 
        g = main.random(50);
        b = main.random(50, 255);
        background = main.color(r, g, b);
        stuff = new OceanStuff(main_, main.width/2f, main.height/2f, 20f, main.color(255));
    }

    public void draw() {
        main.background(background);
        stuff.display();
    }

}
