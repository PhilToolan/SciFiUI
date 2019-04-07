package ie.tudublin;

import processing.core.PApplet;

public class Room
{
    UI ui;
    private float width;
    private float height;


    public Room(UI ui, float width, float height)
    {
        this.ui = ui;
        this.width = width;
        this.height = height;
    }

    public void render()
    {
        //ui.line(400, 0, 400, 800);//split screen


        //Bed Frame

        ui.strokeWeight(3);
        ui.stroke(139,69,19);
        ui.fill(160,82,45);
        //first leg
        ui.rect((width) - 350, (height * 2) - 60 , 20, 60);
        //ui.line(450, 800, 450, 700);
        //ui.line(470, 800, 470, 720);
        
        //body
        ui.rect((width) - 350, (height * 2) - 60, 350, 20);
        //ui.line(450, 700, 800, 700);
        //ui.line(450, 720, 800, 720);
        
        //last leg
        ui.rect((width) - 20, (height * 2) - 60, 20, 60);
        //ui.line(780, 720, 780, 800);
        
        ui.noStroke();
        ui.fill(255);
        //Mattress
        ui.rect((width) - 340,(height * 2) - 100, 340, 40);
        //ui.line(460, 700, 460, 660);
        //ui.line(460, 660, 800, 660);
                
        //Pillow
        ui.ellipse(width - 25, (height * 2) - 110, 50, 20);

        //Duvet
        ui.fill(204, 0, 0);
        ui.rect((width) - 340,(height * 2) - 100, 285, 40);
    }
}