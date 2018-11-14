package Sample4_9;

public class Sample4_9 {
    public static void main(String[] args)
    {
        Car[] cars;
        cars = new Car[2];


    }
}
class  Car {
    protected int num;
    protected double gas;

    public Car() {
        num = 0;
        gas = 0.0;
        System.out.println("生產了車子");
    }
}
class RacingCar extends Car
{
    public RacingCar()
    {
        System.out.println("生產了賽車");
    }
}