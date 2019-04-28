package ie.tudublin;

import processing.core.PApplet;

public class Lab
{
    UI ui;
    private float width;
    private float height;


    public Lab(UI ui, float width, float height)
    {
        this.ui = ui;
        this.width = width;
        this.height = height;
    }

    public void render()
    {
        ui.fill(224, 224, 224);
        ui.rect(400 + (width / 2), 0, ui.width, height);
    }
}