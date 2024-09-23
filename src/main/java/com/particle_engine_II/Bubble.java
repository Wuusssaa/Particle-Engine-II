/*
 * Coder: Vanessa Haynes
 * Project: Project 2 - Particle Engine with Inheritance
 * Date: Sep. 2024
 * Description: Particle engine with basic physics and some interactivity
 */

package com.particle_engine_II;

import processing.core.*;

public class Bubble extends OceanStuff{

    Bubble(PApplet main_, float x_, float y_, float size_, int color_) {
        super(main_, x_, y_, size_, color_);
    }

//draws out the bubble - will have no fill and only coloring the outline
    void draw() {
        main.stroke(color);
        main.ellipse(x, y, size, size); //need to connect to main class to use processing's ellipse function
    }
}