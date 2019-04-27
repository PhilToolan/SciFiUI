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
    String[] planets = {"Bray", "Jumanji", "Chatsky", "Qatar" };


    
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
        ui.fill(128, 0, 0);//colour of console
        ui.rect(0, 0, 400, ui.height);//Life size console
        ui.fill(255,215,0);
        ui.stroke(255);
        ui.rect(x, y, width, height);//button
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.fill(255);
        ui.text(text, x + width * 0.5f, y + height * 0.5f);
        //need to make sure this only increments by one everytime
        if(ui.mousePressed)
        {
            if(ui.mouseX > x && ui.mouseX < x + width && ui.mouseY > y && ui.mouseY < y + height)
            {
                ui.delay(200);//delays the button so that it cannot increment by more than one
            }
        } 
    }


    public void update()
    {
        
    }
}