 package entities;

public class Tirangle {
    public double a;
    public double b;
    public double c;
    
    public double area(){
        double p = (a + b + c)/2;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result ; 
    }
    public double area2(){
        double p = (a + b + c)/2;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result + 2;
    }
     public double area23(){
        double p = (a + b + c)/2;
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return result + 2;
    }
}
