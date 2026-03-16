package example;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setScore(89);
        System.out.println("Student score : "+s1.getScore());
        Car c1 = new Car();
        c1.setSpeed(100);
        System.out.println("Car speed : "+c1.getSpeed());
        ElectricCar myTesla = new ElectricCar();
        myTesla.horn();
        myTesla.displayInfo();
        Dog d1 = new Dog("Aung Net");
        d1.eat();
        d1.bark();
        System.out.println(d1.getName());
    }
}
