package ie.tudublin;

import processing.core.PApplet;

public class Room
{
    UI ui;
    private float wall;


    public Room(UI ui)
    {
        this.ui = ui;
    }

    public void render()
    {
        ui.line(400, 800, 400, 0);//split screen


        //Bed Frame

        ui.strokeWeight(2);
        ui.stroke(139,69,19);
        ui.fill(160,82,45);
        //first leg
        ui.rect(450, 740, 20, 60);
        //ui.line(450, 800, 450, 700);
        //ui.line(470, 800, 470, 720);
        
        //body
        ui.rect(450, 740, 350, 20);
        //ui.line(450, 700, 800, 700);
        //ui.line(450, 720, 800, 720);
        
        //last leg
        ui.rect(780, 760, 20, 60);
        //ui.line(780, 720, 780, 800);
        
        ui.noStroke();
        ui.fill(255);
        //Mattress
        ui.rect(460, 700, 340, 40);//x y width height
        //ui.line(460, 700, 460, 660);
        //ui.line(460, 660, 800, 660);
        
        //Pillow
        ui.ellipse(770, 690, 50, 20);
    }
}