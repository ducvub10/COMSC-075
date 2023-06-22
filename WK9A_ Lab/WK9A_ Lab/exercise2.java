

import java.util.*;
public class Circle2D {
    private double x;
    private double y;
    private double radius;
    
    
    public Circle2D(){
        x = 0;
        y = 0;
        radius = 1;
    }
    
    public Circle2D(double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        double area = (radius*radius)*Math.PI;
        return area;
    }
    public double getPerimeter(){
        double per = Math.PI * 2 *radius;
        return per;
    }
    public boolean pointIns(double x1, double y1){
        double dist;
        dist = Math.sqrt((x1-x)*(x1-x)+(y1-y)*(y1-y));
        return (dist < radius);
    }
    
    public boolean containCircle (Circle2D circle){
        double dist;
        dist = Math.sqrt((circle.getX()-this.getX())* (circle.getX()-this.getX())+ (circle.getY()-this.getY())*(circle.getY()-this.getY()));
        return (dist+circle.radius <= this.radius);
    }
    
    public boolean overlapCircle (Circle2D circle){
        double dist;
        dist = Math.sqrt((circle.getX()-this.getX())* (circle.getX()-this.getX())+ (circle.getY()-this.getY())*(circle.getY()-this.getY()));
        return (dist+circle.radius > this.radius)&& !(dist+this.radius <= circle.radius);
    }
    
}