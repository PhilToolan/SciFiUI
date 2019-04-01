package ie.tudublin;

import processing.core.PApplet;

public class Button
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private String text;
    private int i = 5;//starts on 5 to ensure that button turns on first time

    
    
    public Button(UI ui, float x, float y, float width, float height, String text)
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
                    i += 1;
                    System.out.println(i);
                    ui.delay(200);
                }
            } 

            if((i % 2) == 0)
            {
                System.out.println(i);
                ui.fill(255);
                ui.rect(x + 100 , y + 300, width + 50, height - 20);
                ui.textAlign(PApplet.CENTER, PApplet.CENTER);
                ui.fill(0);
                ui.text("Rect", (x + 100) + (width + 50) * 0.5f, (y + 300) + (height - 20) * 0.5f);
            }

    }
    
}