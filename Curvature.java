package mrelastic;

public class Curvature {
    
    public class Point
    {
        int price;
        int quantity;
        boolean slope;
    }
    
    private int a;
    private int b;
    private Point position;
    
    public Curvature()
    {
        this(0,0);
    }
    
    public Curvature(int price, int quantity)
    {
        this.position.price = price;
        this.position.quantity = quantity;
    }
    
    public Curvature(Point p1)
    {
        this.position = p1;
    }
    
    public int getPrice() {
        return this.position.price;
    }

    public int getQuantity() {
        return this.position.quantity;
    }

    public void setPrice(int price) {
        this.position.price = price;
    }

    public void setQuantity(int quantity) {
        this.position.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Curvature{" + "Price=" + position.price + ", Quantity=" + position.quantity + '}';
    }
    
    public double elasticity(Point p2)
    {
        return 0.0;
    }
    
}
