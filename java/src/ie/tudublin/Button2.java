package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

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
    private float[] starsx = new float [10];
	private float[] starsy = new float [10];
    //PImage stars;

    
    public Button2(UI ui, float x, float y, float width, float height, String text)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.text = text;
        //stars = ui.loadImage("images/stars.png");
    }

    public void render() 
    {   
        ui.strokeWeight(1);
        ui.fill(128, 0, 0);//colour of console
        ui.rect(0, 0, 400, ui.height);//Life size console
        ui.fill(255,215,0);
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

        ui.fill(255,215,0);
        ui.noStroke();
        ui.rect(x - 150 , y + 100, width + 150, height);//Planet box

        int i = 0;
        while ( i < 10)
        {
            starsx[i] = ui.random(ui.width - ((ui.width - 400) / 4), (ui.width - ((ui.width - 400) / 4) + 200));
            starsy[i] = ui.random(ui.height / 2, (ui.height / 2) + 100);
            i++;
        }
        i = 0;
        while (i < 10)
        {
            ui.fill(255);
            ui.stroke(255);
            ui.ellipse(starsx[i], starsy[i], 1, 1);
            i++;
        }
        ui.noStroke();

        // i = 0;
        // while ( i < 25)
        // {
        //     ui.fill(255);
        //     ui.ellipse(starsx[i], starsy[i], 1, 1);
        //     if(starsx[i] > (ui.width - ((ui.width - 400) / 4) + 200) || starsx[i] >  (ui.height / 2) + 100)
        //     {
        //         starsx[i] = ui.random(ui.width - ((ui.width - 400) / 4), (ui.width - ((ui.width - 400) / 4) + 100));
        //         starsy[i] = ui.random(ui.height / 2, (ui.height / 2) + 50);
        //     }
        //     starsx[i] += 0.005f;
        //     starsy[i] += 0.005f;
        //     i += 1;
        // }
        // i = 0;
        // while(i < 25)
        // {
        //     // if(starsx[i] > (ui.width - ((ui.width - 400) / 4)) || starsx[i] >  (ui.height / 2))
        //     // {
        //     //     starsx[i] = ui.random(ui.width - ((ui.width - 400) / 4), (ui.width - ((ui.width - 400) / 4) + 100));
        //     //     starsy[i] = ui.random(ui.height / 2, (ui.height / 2) + 50);
        //     // }
        //     // starsx[i] += 0.005f;
        //     // starsy[i] += 0.005f;
        //     // i += 1;
        // }
        

        //Planet diagram
        if(location == 0)
        {
            ui.fill(19, 77, 164);
            ui.ellipse(ui.width / 20, ui.height - 100, 100, 100);
            // ui.fill(0);
            // ui.image(stars, ui.width - ((ui.width - 400) / 4),ui.height / 2);
            ui.fill(19, 77, 164);
            ui.ellipse(ui.width - ((ui.width - 400) / 4) + 100,(ui.height / 2) + 50, 50, 50);
        } else 
        if(location == 1)
        {
            ui.fill(44, 158, 74);
            ui.ellipse(ui.width / 20, ui.height - 100, 100, 100);
            // ui.fill(0);
            // ui.image(stars, ui.width - ((ui.width - 400) / 4), ui.height / 2);
            ui.fill(44, 158, 74);
            ui.ellipse(ui.width - ((ui.width - 400) / 4) + 100,(ui.height / 2) + 50, 50, 50);
        } else
        if(location == 2)
        {
            ui.fill(215, 169, 78);
            ui.ellipse(ui.width / 20, ui.height - 100, 100, 100);
            // ui.fill(0);
            // ui.image(stars,  ui.width - ((ui.width - 400) / 4),ui.height / 2);
            ui.fill(215, 169, 78);
            ui.ellipse(ui.width - ((ui.width - 400) / 4) + 100,(ui.height / 2) + 50, 50, 50);
        } else
        if(location == 3)
        {
            ui.fill(242, 66, 54);
            ui.ellipse(ui.width / 20, ui.height - 100, 100, 100);
            // ui.fill(0);
            // ui.image(stars, ui.width - ((ui.width - 400) / 4), ui.height / 2);
            ui.fill(242, 66, 54);
            ui.ellipse(ui.width - ((ui.width - 400) / 4) + 100,(ui.height / 2) + 50, 50, 50);
        }


        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.fill(255);
        ui.text(planets[location], (x - 150) + (width + 150) * 0.5f, (y + 100) + (height) * 0.5f);//Listing planet name in planet box
        //System.out.println(planets[location]);
        //System.out.println(location);
    }


    public void update()
    {
        
        int i = 0;
        while (i < 10)
        {
            if(starsx[i] <= (ui.width - ((ui.width - 400) / 4) + 200) || starsy[i] >= ((ui.height / 2) + 100))
            {
                starsx[i] = ui.random(ui.width - ((ui.width - 400) / 4), (ui.width - ((ui.width - 400) / 4) + 200));
                starsy[i] = ui.random(ui.height / 2, (ui.height / 2) + 100);
            }
            starsx[i] += 0.005f;
            starsy[i] += 0.005f;
            i++;
        }
    }
}