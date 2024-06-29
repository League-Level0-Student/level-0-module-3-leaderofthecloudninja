
void setup() {
 
  // set the size of your sketch
  size(500,500);
}

void draw() {
  
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
 fill(200,0,0);
 ellipse(200,200,500,500); 
  fill(0,0,0);
 ellipse(200,200,400,400);
  fill(200,0,0);
 ellipse(200,200,300,300); 
  fill(0,0,0);
 ellipse(200,200,200,200);
  fill(200,0,0);
 ellipse(200,200,100,100); 
  //Use an if statement and remainder to alternate the color of your rings.
  
  
}
