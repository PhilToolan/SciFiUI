package ie.tudublin;

import processing.core.PApplet;

public class Cockpit
{
    UI ui;
    private float width;
    private float height;


    public Cockpit(UI ui, float width, float height)
    {
        this.ui = ui;
        this.width = width;
        this.height = height;
    }

    public void render()
    {
        ui.fill(0);
        ui.rect(0, 0, width, height);
        
    }

}