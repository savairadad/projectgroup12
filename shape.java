package project1;

public interface shape {
    public void calculateArea();
    public void calculatePerimeter();
}
class Circle implements shape{
int radius;
Circle(int radius){
    this.radius=radius;
}

    @Override
    public void calculateArea() {
        System.out.println("the area of a circle"+radius);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("perimeter of a circle"+(2*Math.PI*radius));
    }
}
class Square implements shape{
int length;
Square(int length){
    this.length=length;
}
    @Override
    public void calculateArea() {
        System.out.println("the area of a square"+(length*2));

    }

    @Override
    public void calculatePerimeter() {
        System.out.println("the perimeter of a square"+(length*4));
    }
}
class Main{
    public static void main(String[] args) {
shape[] arr={new Circle(3),new Square(7)};
for(shape obj:arr){
    obj.calculateArea();
    obj.calculatePerimeter();
}
    }}
