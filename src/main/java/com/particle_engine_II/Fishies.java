/*
 * Coder: Vanessa Haynes
 * Project: Project 2 - Particle Engine with Inheritance
 * Date: Sep. 2024
 * Description: Particle engine with basic physics and some interactivity
 */

package com.particle_engine_II;

import java.util.ArrayList;
import processing.core.*;

public class Fishies {
    PApplet main; //main class that gives processing funtionality
    ArrayList<Fish> fishies; //all the fish being drawn

    Fish fish; //fish that will be drawn to the screen
    int fishCount = 252; //# of fish

    Fishies(PApplet main_) {
        main = main_;
        fishies = new ArrayList<>();
        init(); //initializing the fish
    }

//adds all the fish to the array. All attributes are random. 
    void init() {
        for(int i=0; i<fishCount; i++) {
            fish = new Fish(main.random(main.width), main.random(main.height), main.random(15,30), main.random(5,15), main.color(main.random(255), main.random(255), main.random(255)), main);
            fishies.add(fish);
        }
    }

//draws the fishies with no outlines
    void draw() {
        main.noStroke(); //takes away the outlines
        for(int i = 0; i<fishies.size(); i++){
            fishies.get(i).draw(); 
        }
    }

//clicking the mouse in specific location alters speed of the fish. Right side = faster. Left side = slower.
    void mousePressed() {
        if (main.mouseX > main.width/2) {
            for(int i = 0; i<fishies.size(); i++){
                fishies.get(i).faster(); 
            }
        } else {
            for(int i = 0; i<fishies.size(); i++){
                fishies.get(i).slower(); 
            }
        }
    }

//pressing spacebar flips the direction the fish are swimming in
    void keyPressed() {
        for(int i = 0; i<fishies.size(); i++){
            fishies.get(i).flip(); 
        }
    }
}