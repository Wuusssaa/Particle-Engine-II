/*
 * Coder: Vanessa Haynes
 * Project: Project 2 - Particle Engine with Inheritance
 * Date: Sep. 2024
 * Description: "Fish Tank" particle engine that uses inheritance to create multiple elements as well as utilizing multiple keyboard and mouse functions.
 */

package com.particle_engine_II;
import processing.core.*;

public class Main extends PApplet {

    OceanController ocean;

//sets up processing
    public static void main(String[] args) {
        PApplet.main("com.particle_engine_II.Main");
    }

//sets up the size of the window 
    public void settings() {
        size (600,400);
        ocean = new OceanController(this);
    }

//draws everything on the screen
    public void draw() {
        ocean.draw();
    }

//mouse functions 1 and 2. Clicking in specific mouse locations speed up or slow down either the fish or the bubbles
    public void mouseClicked() {
        ocean.mouseClicked();
    }

//mouse functions 3 and 4. Dragging the mouse will move the red fish food, to try to feed the fish. This is also what enables the collision. 
//Dragging also changes the color of the background between different shades of dark blue
    public void mouseDragged() {
        ocean.mouseDragged();
    }

//2 keyboard functions. Pressing spacebar flips the direction of the fish from where they currently are. Also flips the direction they face.
//Pressing the letter 'b' adds more bubbles!!! Can never have enough bubbles
    public void keyPressed() {
        ocean.keyPressed();
    }
}