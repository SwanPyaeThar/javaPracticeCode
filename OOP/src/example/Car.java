package example;

public class Car {
    private double speed;
    public void setSpeed(double speed) {
        if (speed >= 0 && speed <= 200) {
            this.speed = speed;
        }else {
            System.out.println("Invalid speed");
        }
    }
    public double getSpeed() {
        return speed;
    }
}
