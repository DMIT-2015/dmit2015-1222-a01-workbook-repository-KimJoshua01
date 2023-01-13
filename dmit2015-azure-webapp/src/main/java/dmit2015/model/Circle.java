package dmit2015.model;

public class Circle {

    private double radius;

    public double getRadius() {
        return radius;
    }

   /* public void setRadius(double radius) throws Exception {
        if (radius <= 0 ){
            throw new Exception("Radius must be non-zero number");
        }
        this.radius = radius;
    }*/

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("Radius must be non-zero number");
        }
        this.radius = radius;
    }
    public Circle(){
       // radius = 1;
        setRadius(1);
    }
    public Circle(double radius){
        setRadius((radius));
    }

    public double Area()
    {
        return Math.PI * radius * radius;
    }

    public double Perimeter()
    {
        return 2 * Math.PI * radius;
    }
}
