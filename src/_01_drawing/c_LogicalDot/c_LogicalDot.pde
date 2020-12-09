
void setup() {
  
// 1. Set the size of the sketch. Make it 600 pixels square. 
 size(500,500);

}

void draw() {
  ellipse(400,500,400,500);
// 2. Draw an ellipse
// Run the program to make sure it works before moving on.


// 3. Change the color of the ellipse when the mouse is pressed.
//    Use the following code, but put your colors where indicated
//    Remember to use the   fill()  command to set colors.

if (mousePressed) {
 fill(#FF00A2);
   //  put one color here 
  
} else {
  fill(#00FFDF);
   // put a different color here
  
}

  textSize(50);
  text ("First Time",100,200);
  
  
}
