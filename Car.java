package project1;

public class Car {
    double carPrice;
    String color;
    Car(double carPrice){
    this.carPrice=carPrice;}

double calculateSalePrice(){
    return 0;
    }
}

class Sedan extends Car{
    int length;

    Sedan(double carPrice,int length) {
        super(carPrice);
        this.length=length;
    }

    @Override
    double calculateSalePrice() {
        if(length>20){
            return (carPrice-(carPrice*5/100));
        }else{
            return (carPrice-(carPrice*10/100));
        }
    }
}
class Truck extends Car{
    int weight;
    Truck(double carPrice,int weight) {
        super(carPrice);
        this.weight=weight;
    }
    double calculateSalePrice(){
        if(weight<2000){
            return (carPrice-(carPrice*10/100));
        }else{
            return (carPrice-(carPrice*20/100));


        }
    }
}
class testerLast{
    public static void main(String[] args) {
         Car[] cars={new Sedan(3000,25),new Truck(50000,20000)};
         for (Car obj:cars){
             System.out.println("the actual price"+obj.carPrice+"the discount priceis "+obj.calculateSalePrice());
         }
    }
}
