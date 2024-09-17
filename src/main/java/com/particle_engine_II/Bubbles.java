/*
 * Coder: Vanessa Haynes
 * Project: Project 2 - Particle Engine with Inheritance
 * Date: Sep. 2024
 * Description: Particle engine with basic physics and some interactivity
 */

package com.particle_engine_II;

import java.util.ArrayList;
import processing.core.*;

public class Bubbles {
    PApplet main; //provides all the functionality of processing 
    ArrayList<Bubble> bubbles; //all the bubbles being drawn

    Bubble bubble; //a bubble that will be drawn to the screen
    int bubbleCount = 252; //# of bubbles

//random colors for background
    float r;
    float g;
    float b;
    int background;

//random colors for bubbles
    float bubbleR;
    float bubbleG;
    float bubbleB;
    int bubblesColor;

    Bubbles(PApplet main_) {
        main = main_;
        bubbles = new ArrayList<>();
        
        //random dark blues for the background
        r = main.random(50); 
        g = main.random(50);
        b = main.random(50, 255);
        background = main.color(r, g, b);

        //random light blues for the bubbles
        bubbleR = main.random(144, 173); 
        bubbleG = main.random(213, 216);
        bubbleB = main.random(230, 255);
        bubblesColor = main.color(bubbleR, bubbleG, bubbleB);

        init(); //initialize the bubbles
    }

//adds all the bubbles to the array. All attributes are random with light blue color.
    void init() {
        for(int i=0; i<bubbleCount; i++) {
            bubble = new Bubble(main.random(main.width), main.random(main.height), main.random(25), main, bubblesColor);
            bubbles.add(bubble);
        }
    }

//draws the background and bubbles with no fill and only outlines
    void draw() {
        main.background(background); //resets the background every frame
        main.noFill(); //takes away the filled color of shapes
        for(int i = 0; i<bubbles.size(); i++){
            bubbles.get(i).draw(); 
        }
    }

//clicking the mouse in specific location alters speed of the bubbles. Bottom side = faster. Top side = slower.
    void mousePressed() {
        if (main.mouseX > main.height/2) {
            for(int i = 0; i<bubbles.size(); i++){
                bubbles.get(i).faster(); 
            }
        } else {
            for(int i = 0; i<bubbles.size(); i++){
                bubbles.get(i).slower(); 
            }
        }
    }

//dragging the mouse will reset the background color to a different shade of dark blue. 
// (Also plays with the speeds of the particles depending on where it's dragged)
    void mouseDragged() {
        r = main.random(50); 
        g = main.random(50);
        b = main.random(50, 255);
        background = main.color(r, g, b);
    }
}