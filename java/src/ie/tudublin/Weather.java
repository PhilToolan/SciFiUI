package ie.tudublin;

import processing.core.PApplet;

public class Weather 
{
    UI ui;
    /*
    private float a = ui.random(0, 100);
    private float b = ui.random(20, 40);
    private float c = ui.random(50, 85);
    */
    float[] rainFall = {20, 40, 80, 60};
    private float width;
    private float cx;
    private float cy;

    public Weather(UI ui, float cx, float cy, float width)
    {
        this.ui = ui;
        this.cx = cx;
        this.cy = cy;
        this.width = width;
    }

    void drawPieChart()
    {
        ui.strokeWeight(1);
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
            ui.text("Last 4 Days of Rainfall on Planet", cx - 10, cy + 50);
            runningSum = next;
        }

    }
}