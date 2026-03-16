package example;

public class Vehicle {
    protected String brand = "Toyota";
    public void horn(){
        System.out.println("Tuu Tuu");
    }
}

class ElectricCar extends Vehicle{
    private int batteryCapacity = 100;
    public void displayInfo(){
        System.out.println("Battery Capacity : "+batteryCapacity + "%");
        System.out.println("Brand : "+brand);
    }
}
