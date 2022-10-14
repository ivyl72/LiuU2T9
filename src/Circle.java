public class Circle
{
    private double radius;

    public Circle(double radius)
    {
        this.radius = radius;
    }

    /* Returns the area of the circle with given radius
       Area of a circle = pi * r ^ 2
       Use Math.PI for pi and use the pow method
     */
    public double area() {
        double power = Math.pow(radius, 2);
        double area = (power) * Math.PI;
        return area;
    }

    /* Returns the circumference of the circle with given radius
       Circumference of a circle = pi * 2 * r
       Use Math.PI for pi
     */
    public double circumference()
    { /* implement this method! */
    double circumference = Math.PI * radius*2;
    return circumference;}


    /* Setter method to update the radius of the circle to newRadius
     */
    public void setRadius(double newRadius) { /* implement this method! */
        double radius = newRadius;
    }


    /* Returns a String that includes info about the circle,
       including its radius, area, and circumference on separate lines;
       see example output below (Reminder: the new line escape
       sequence \n allows you to include new lines in Strings!)
       Note that this method should return a string -- it should NOT
       actually do any printing!
     */
    public String getInfo() { /* implement this method! */
        String info = "Radius: " + radius + "\n" + "Area: " + area() + "\n" + "Circumference: " + circumference();
    return info;
    }

}
