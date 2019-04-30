# SciFi UI Project

Name: Philip Toolan

Student Number: C17433026

This is the youtube video:
https://youtu.be/nSGlqEqQKaU


# Description of the assignment

My assingment is the ui of a full spaceship including all these rooms (Cockpit, bedroom, engine room and lab). It consists of each room 
being displayed simultaneously aswell as a life size version of the console command panel that is on the bedroom wall.  In the cockpit 
you can travel from planet to planet using a warp drive, the bedroom houses a window and white board, the engine room reacts to the use 
of the warp drive and the in the lab you can operate a laser. 

# Instructions

The UI consists of buttons which can be pressed. You can also click and drag your mouse on the white board to draw lines. All the other 
instructions for use, are on the UI itself like pressing RIGHT for an orbit of the planet.

# How it works

All the drawing is done relative to each other segment as to allow equal size for each room. All rooms have their own seperate class 
apart from the engine room which is in the cockpit class. The buttons all work by using nested if statements, the first checking if the 
mouse is pressed and the second checking if the mouse is within the button. Within these nested if statements is a variable, this 
variable is itterated by one everytime the button is pressed. The actual function of the button is seperate, this allows the funtion to 
keep happening after the button is only pressed once. Before this the function was only occuring while the button was pressed. The 
function is further controlled by checking the variable mod 2, so when the variable is even it will work and when it is odd it will be 
shut off.

### Cockpit Class

The cockpit class controls many aspects of the UI. The stars are generated within this class, the coordinates of the stars are stored in 
arrays. These coordinates are intialised by using random(low, high) within a while loop so every star gets random coordinates within the 
cockpit section. The cockpit section stars are four sets of stars as to allow the warp drive affect as they all move in different 
directions making it seem like you are travelling through space. When the stars reach the edge of the section they are re-generagted. 
When the warp drive is pressed it also speeds up the lines in the engine room, these lines are re-generated to a fixed point like the 
stars are when they go off screen. The engine orb also starts to change colour to symbolise the engine working harder, this is done by 
setting the fill of the orb as multiple variables and incrementing through them at different rates so the colours are constantly 
changing. Additional stars are generated in the window of the room as to show more movement, these are done in the same way as the other 
stars. The spaceship diagram within the cockpit ui also starts to display jets coming out the back showing the user that the engines are 
at full power. This done with two triangles, the first increments fully to red then changes to a shade of orange, the second starts to 
increment to a shade of red when the first has reached the orange colour. This affect is also done in reverse when the warp drive is 
turned off.

### Room Class

This class handles all the drawing aspects of the bedroom, like the walls and bed. It also houses the white board functionality. The
white board works in a similar way that the buttons work. Instead of incrementing a variable and then having a seperate function, the
drawing is done within the nested if statements. The xs and ys of the lines are folowing the mouse, this allows you to draw on the white 
board.

### Lab Class

This class handles all the drawing aspects of the lab room and the functionality of the laser. The laser is controlled by the red 
button. When the button is pressed the line is drawn and the stroke increases to look like a laser, when x2 of the line of the laser 
reaches the "element", the element starts to "evaporate" by the incrementing the fill to the same colour as the background. When the 
fill reaches that point it stops to change and a second line is draw to make it seem like the the "element" has been completely 
destroyed.

### Button Class

This class holds the funtionality of the button that controls the blinds. The blinds move by incrementing and decrementing the y values 
to a desired point.

### Button2 Class

This class holds the arrays of the names of the planets. It also controls the planets button. When the button is pressed it increments a 
variable "location", this variable is used to travel through the array and display the appropiate names and planets. 

### Orbit Class

This class holds the functionality for the orbiting ellipse that travels around the planet diagrams. The orbit is controlled using the 
following code:

```Java
	angle += 0.01;//determines the speed of the orbit
        x1 += ((radius + 10) * (Math.cos(angle)));//to change the point around the circle of the planet
        y1 += ((radius + 10) * (Math.sin(angle)));
```

That code is held in the update function, and this code is held in the reset function:

```Java
	x1 = x;//resets x1 and y1 so that the line does not grow bigger than the desired orbit
        y1 = y;
```
The equation allows the centre of the ellipse to travel around a circle that is slighlty bigger than the size of the planet diagram. 

# What I am most proud of in the assignment

I am most proud of all the warp drive functionalities. This part was probably the hardest to achieve and took the most amount of time to 
find a solution to but I believe it came out better than I was expecting and so it is the part I am most proud of.
