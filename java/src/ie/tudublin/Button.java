package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class Button
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private String text;
    private int i = 5;//starts on 5 to ensure that button turns on first time
    PImage stars;
    
    
    public Button(UI ui, float x, float y, float width, float height, String text)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.text = text;
        stars = ui.loadImage("images/stars.png");
    }

    public void render() 
    {   
        ui.strokeWeight(1);
        ui.fill(128, 111, 111);
        ui.rect(0, 0, 400, 800);
        ui.fill(0);
        ui.stroke(255);
        ui.rect(x, y, width, height);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.fill(255);
        ui.text(text, x + width * 0.5f, y + height * 0.5f);
        //need to make sure this only increments by one everytime
        if(ui.mousePressed)
        {
            if(ui.mouseX > x && ui.mouseX < x + width && ui.mouseY > y && ui.mouseY < y + height)
            {
                i += 1;
                //System.out.println(i);
                ui.delay(200);//delays the button so that it cannot increment by more than one
            }
        } 

        if((i % 2) == 0)
        {
            //System.out.println(i);
            ui.fill(255);
            ui.rect(x + 450, y + 400, width + 99, height + 49);
            ui.textAlign(PApplet.CENTER, PApplet.CENTER);
            ui.fill(0);
            ui.image(stars, x+450, y+400);
        }

        ui.fill(0);
        ui.stroke(255);
        ui.rect(x, y + 200, width + 150, height);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.fill(255);
        ui.text("Press right for Orbit, left for Weather", x + (width + 150) * 0.5f, (y + 200) + height * 0.5f);

    }
}