package ie.tudublin;

import processing.core.PApplet;

public class Button2
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private String text;
    private int location = 0;
    String[] planets = {"First Planet", "Second Planet", "Third Planet", "Fourth Planet" };

    
    public Button2(UI ui, float x, float y, float width, float height, String text)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.text = text;
    }

    public void render() 
    {   
        ui.strokeWeight(1);
        ui.noFill();
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
                ui.delay(200);//delays the button so that it cannot increment by more than one
                location ++;
               // ui.fill(255);
                //ui.rect(x + 150 , y, width + 100, height);
                //ui.textAlign(PApplet.CENTER, PApplet.CENTER);
               // ui.fill(0);
                //ui.text(planets[location], (x + 150) + (width) * 0.5f, (y) + (height) * 0.5f);
                if(location == 4)
                {
                    location = 0;
                }
            }
        } 

        ui.fill(128, 111, 111);
        ui.stroke(255);
        ui.rect(x - 150 , y + 100, width + 150, height);//Planet box

        //Planet diagram
        if(location == 0)
        {
            ui.fill(19, 77, 164);
            ui.ellipse(ui.width / 8, ui.height - 100, 100, 100);
        } else 
        if(location == 1)
        {
            ui.fill(44, 158, 74);
            ui.ellipse(ui.width / 8, ui.height - 100, 100, 100);
        } else
        if(location == 2)
        {
            ui.fill(215, 169, 78);
            ui.ellipse(ui.width / 8, ui.height - 100, 100, 100);
        } else
        if(location == 3)
        {
            ui.fill(242, 66, 54);
            ui.ellipse(ui.width / 8, ui.height - 100, 100, 100);
        }


        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.fill(255);
        ui.text(planets[location], (x - 150) + (width + 150) * 0.5f, (y + 100) + (height) * 0.5f);//Listing planet name in planet box
        //System.out.println(planets[location]);
        //System.out.println(location);
    }
}