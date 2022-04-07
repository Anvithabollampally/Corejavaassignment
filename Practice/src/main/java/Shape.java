abstract class Shape{

    public void method1()
    {
        System.out.println("its a shape class");
    }

    public abstract int area();
}

class Rectangle extends Shape
{
    int l;
    int b;


    public Rectangle(int l, int b) {
        super();
        this.l = l;
        this.b = b;

    }

    @Override
    public int area() {
        return l*b;
    }
}

class Circle extends Shape
{
    int rad;

    public Circle(int rad) {
        super();
        this.rad = rad;
    }

    @Override
    public int area() {
        return 3*rad*rad;
    }
}



