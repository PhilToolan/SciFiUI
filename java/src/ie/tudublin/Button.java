package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class Button
{
    UI ui;
    private float x;
    private float y;
    private float x1;
    private float y1;
    private float width;
    private float height;
    private String text;
    private float speed = 1;
    private int i = 5;//starts on 5 to ensure that button turns on first time
    private float maxH;
    private float minH;
    
    
    public Button(UI ui, float x, float y, float width, float height, String text)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.text = text;  
        x1 = ui.width - ((ui.width - 400) / 4);
        y1 = ui.height / 2;
        maxH = (ui.height / 2) + ((height + 51) * 2);
        minH = (ui.height / 2) - (height + 51);
    }

    public void render() 
    {   
        ui.strokeWeight(1);
        //ui.fill(128, 111, 111);
        //ui.rect(0, 0, 400, 800);
        ui.fill(255,215,0);
        ui.stroke(255);
        ui.rect(x, y, width, height);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.fill(255);
        ui.text(text, x + width * 0.5f, y + height * 0.5f);
        ui.fill(255);
        ui.noStroke();
        ui.rect(x1, y1, width + 100, height + 51);//Blinds
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

        //insturctions for orbit and weather
        ui.fill(255,215,0);
        ui.noStroke();
        ui.rect(x, y + 200, width + 150, height);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.fill(255);
        ui.text("Press right for Orbit, left for Weather", x + (width + 150) * 0.5f, (y + 200) + height * 0.5f);

    }

    public void update()
    {
        if((i % 2) == 0)
        {
            y1 += speed;
        }

        if((i % 2) != 0)
        {
            y1 -= speed;
        }

        if(y1 == maxH)
        {
            y1 += speed;
        }

        if(y1 == minH)
        {
            y1 -= speed;
        }
    }
}