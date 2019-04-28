package ie.tudublin;

import processing.core.PApplet;

public class Lab
{
    UI ui;
    private float width;
    private float height;
    private int i;
    private float weight;
    private float x1;
    private float elementfill;
    private float x;


    public Lab(UI ui, float width, float height)
    {
        this.ui = ui;
        this.width = width;
        this.height = height;
        elementfill = 0;
        x = width + 25;
        x1 = x;
    }

    public void render()
    {
        ui.fill(224, 224, 224);
        ui.rect(400 + (width / 2), 0, ui.width, height);//outline of lab section

        //Table
        ui.fill(0);
        ui.rect(width, height - (height / 3), ui.width, 50);
        //Laser
        ui.rect(width + 10, height - (height / 3) - 10, 30, 10);//base
        ui.rect(width + 20, height - (height / 3) - 10 - (height / 5), 10, (height / 5));//Stem
        ui.ellipse(width + 25, height - (height / 3) - 10 - (height / 5), 40, 20);//Head
        ui.rect(width + 25, height - (height / 3) - 10 - (height / 5) - 10, 20, 20);//Head

        //button for laser
        ui.fill(238,210,2);
        ui.rect(400 + (width / 2) + 40,  height - (height / 3) - 30, 40, 40);
        ui.fill(255, 0, 0);
        ui.ellipse(400 + (width / 2) + 60,  height - (height / 3) - 10, 20, 20);

        if(ui.mousePressed)
        {
            if(ui.mouseX > 400 + (width / 2) + 40 && ui.mouseX < 400 + (width / 2) + 80 && ui.mouseY > height - (height / 3) - 30&& ui.mouseY <height - (height / 3))
            {
                i += 1;
                ui.delay(200);//delays the button so that it cannot increment by more than one
                
            }
        } 

    }

    public void update()
    {
        if((i % 2) == 0)
        {
            ui.stroke(0);
            ui.strokeWeight(weight);
            ui.line(width + 25, height - (height / 3) - 10 - (height / 5), x, height - (height / 3) - 10 - (height / 5));
            
            x = width + 30;
            
            weight -= 1;
            if (weight < 0)
            {
                weight += 1;
            }

            ui.noStroke();
            ui.fill(elementfill);
            ui.ellipse(ui.width - 100, height - (height / 3) - 10 - (height / 5), 50, 50);//element 
            x1 = x;
        }

        if((i % 2) != 0)
        {
            ui.stroke(0);
            ui.strokeWeight(weight);
            ui.line(width + 25, height - (height / 3) - 10 - (height / 5), x, height - (height / 3) - 10 - (height / 5));
            
            
            ui.noStroke();
            ui.fill(elementfill);
            ui.ellipse(ui.width - 100, height - (height / 3) - 10 - (height / 5), 50, 50);//element 

            x += 30;
            if (x > (ui.width - 90))
            {
                x -= 30;
                elementfill += 1;
                if (elementfill > 224)
                {
                    elementfill -=1;
                    ui.stroke(0);
                    ui.line(width + 25, height - (height / 3) - 10 - (height / 5), x1, height - (height / 3) - 10 - (height / 5));
                    x1 += 60;
                    if(x1 > ui.width)
                    {
                        x1 -= 60;
                    }
                }
            }
            weight += 1;
            if (weight > 8)
            {
                weight -= 1;
            }

        }
    }
}