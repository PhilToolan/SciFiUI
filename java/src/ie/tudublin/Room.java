package ie.tudublin;

//import processing.core.PApplet;

public class Room
{
    UI ui;
    private float width;
    private float height;
    private float[] x = new float [30];
    private float[] y = new float [30];
    private int i = 0;//Used to make sure stars are created once only
    private int j = 0;


    public Room(UI ui, float width, float height)
    {
        this.ui = ui;
        this.width = width;
        this.height = height;
    }

    public void render()
    {
        //ui.line(400, 0, 400, 800);//split screen
        //wall
        ui.noStroke();
        ui.fill(128, 0, 0);
        ui.rect(400 + ((width - 400) / 2), height, ui.width, ui.height);

        //window
        ui.fill(0);
        ui.rect( ui.width - ((ui.width - 400) / 4), ui.height / 2, 200, 100);
        ui.fill(255);
        ui.stroke(1);
        //Stars for window
        while(j < 30)
        {
            x[j] = ui.random(ui.width - ((ui.width - 400) / 4), ui.width - ((ui.width - 400) / 4) + 197);
            y[j] = ui.random(ui.height / 2, ui.height / 2 + 97);
            System.out.println(x[j]);
            System.out.println(y[j]);
            j += 1;
        }
        j = 0;
        while(j < 30)
        {
            ui.ellipse(x[j], y[j], 3, 3);
            j += 1;
        }
        ui.noStroke();

        //white board
        ui.rect(400 + ((width - 400) / 2) + 10, (height) + (height / 2) - 50, 200, 100); 
        ui.fill(0);
        ui.text("White Board", 400 + ((width - 400) / 2) + 100, (height) + (height / 2) - 40);
        ui.stroke(0);
        ui.line(400 + ((width - 400) / 2) + 65, (height) + (height / 2) - 30, 400 + ((width - 400) / 2) + 130, (height) + (height / 2) - 30);
        if(ui.mousePressed)
        {
            if(ui.mouseX > 400 + ((width - 400) / 2) + 10 && ui.mouseX < 400 + ((width - 400) / 2) + 10 + 200 && ui.mouseY > (height) + (height / 2) - 50 && ui.mouseY < (height) + (height / 2) - 50 + 100)
            {
                ui.stroke(0);
                ui.line(ui.mouseX, ui.mouseY, ui.pmouseX, ui.pmouseY);
            }
        }

        //Bed Frame

        ui.strokeWeight(3);
        ui.stroke(139,69,19);
        ui.fill(160,82,45);
        //first leg
        ui.rect((width) - 350, (height * 2) - 60 , 20, 60);
        //ui.line(450, 800, 450, 700);
        //ui.line(470, 800, 470, 720);
        
        //body
        ui.rect((width) - 350, (height * 2) - 60, 350, 20);
        //ui.line(450, 700, 800, 700);
        //ui.line(450, 720, 800, 720);
        
        //last leg
        ui.rect((width) - 20, (height * 2) - 60, 20, 60);
        //ui.line(780, 720, 780, 800);
        
        ui.noStroke();
        ui.fill(255);
        //Mattress
        ui.rect((width) - 340,(height * 2) - 100, 340, 40);
        //ui.line(460, 700, 460, 660);
        //ui.line(460, 660, 800, 660);
                
        //Pillow
        ui.ellipse(width - 25, (height * 2) - 110, 50, 20);

        //Duvet
        ui.fill(204, 0, 0);
        ui.rect((width) - 340,(height * 2) - 100, 285, 40);

        //Miniture console representation
        ui.fill(128, 0, 0);
        ui.stroke(1);
        ui.rect(width - 40, height + (height / 2), 20, 40);
        //Buttons on the console
        ui.noStroke();
        ui.fill(252,175,22);
        ui.rect(width - 35, height + (height / 2) + 5, 5, 6);
        ui.rect(width - 28, height + (height / 2) + 5, 5, 6);
        ui.rect(width - 35, height + (height / 2) + 19, 12, 6);
        ui.rect(width - 35, height + (height / 2) + 30, 12, 6);
    }
}