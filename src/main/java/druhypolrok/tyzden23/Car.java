package druhypolrok.tyzden23;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name){
        this.cylinders =cylinders;
        this.name = name;
        engine = true;
        wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String startEngine(){
        return "Car is starting " + this.getClass().getName();
    }

    public String accelerate(){
        return "Car accelerating " + this.getClass().getName();
    }

    public String brake(){
        return "Car is braking " + this.getClass().getName();
    }

}
