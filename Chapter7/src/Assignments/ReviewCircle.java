package Assignments;
 
public class ReviewCircle {

	    private static final double PI = 3.14; //make PI a double being 3.14
	    private double radius; //initializes radius as double
		public String getRadius; //initializes getRadius as a string
		public String Circlecircum; //initializes CircleCircum as a string
		
		
 
	    public ReviewCircle() { 
	        radius = 1; //set radius to 1
	    }
 
	    public ReviewCircle(double r) {
	        radius = r; //make radius equal r
	    }
 
	    public void setRadius(double newRadius) {
	        radius = newRadius;
	    }
 
	
 
	    public double area() {
	        double circleArea; //initializes circleArea to a double
	        
	        circleArea = PI * radius * radius; //solves for area of circle
	        return(circleArea); //displays area of the circle
	    }
 
	    public double getRadius(){
	    return(radius);	
	    }
	    
	    public double circumference() {
	    	
	    	double circumference;
	    	circumference = 2 * PI * radius; //solves for circumfrance
	    	return(circumference); //displays circumfrance 
	    }
	    
	    public static void displayareaformula() { //sets displayareaformula to output the formula of a circle
	    	
	    	System.out.println("The formula for the area of a circle is: a = Pi * r * r" ); //prints formula for area of circle
	    }
	    
	    public boolean equals(Object c) {
	    ReviewCircle testObj = (ReviewCircle)c;
	    //if else statement to determine whether testObj radius is equal or not
	    if (testObj.getRadius() == radius) {
	    	return(true);
	    }
	    else 
	    {
	    	return(false);
	    	}
	    }
	    
	    public String toString() {
	    	String circleString;
	    	circleString = "Circle has radius " + radius;
	    	return(circleString);
	    	
	    }
	    }
