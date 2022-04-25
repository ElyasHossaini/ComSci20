package Assignments;
 
public class ReviewCircle {

	    private static final double PI = 3.14;
	    private double radius;
		public String getRadius;
		public String Circlecircum;
		
		
 
	    public ReviewCircle() {
	        radius = 1;
	    }
 
	    public ReviewCircle(double r) {
	        radius = r;
	    }
 
	    public void setRadius(double newRadius) {
	        radius = newRadius;
	    }
 
	
 
	    public double area() {
	        double circleArea;
	        
	        circleArea = PI * radius * radius;
	        return(circleArea);
	    }
 
	    public double getRadius(){
	    return(radius);	
	    }
	    
	    public double circumference() {
	    	
	    	double circumference;
	    	circumference = 2 * PI * radius;
	    	return(circumference);
	    }
	    
	    public static void displayareaformula() {
	    	
	    	System.out.println("The formula for the area of a circle is: a = Pi * r * r" );
	    }
	    
	    public boolean equals(Object c) {
	    ReviewCircle testObj = (ReviewCircle)c;
	    
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
