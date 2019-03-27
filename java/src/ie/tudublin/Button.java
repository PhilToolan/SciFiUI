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
    private int i = 5;
    float[] rainFall = {23, 42, 5, 79};

    
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
    void drawPieChart()
    {
        float cx = 700;
        float cy = 100;

        float w = width * 0.8f;
        //arc(cx, cy, w, w, 0, TWO_PI, ARC);

        float total = 0;
        for (int i = 0 ; i < rainFall.length ; i ++)
        {
            total += rainFall[i];
        }

        float runningSum = 0;
        for (int i = 0 ; i < rainFall.length ; i ++)
        {
            float next = runningSum + rainFall[i];
            float start = ui.map(runningSum, 0, total, 0, PApplet.TWO_PI);
            float end = ui.map(next, 0, total, 0, PApplet.TWO_PI);
            ui.fill(ui.map(i, 0, rainFall.length, 0, 255), 255, 255);
            ui.arc(cx, cy, w, w, start, end, PApplet.ARC);
            runningSum = next;
        }

    }
}