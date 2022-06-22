package druhypolrok.tyzden23;

public class Mitsubishi extends Car{

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return this.getClass().getName();
    }

    @Override
    public String accelerate() {
        return this.getClass().getName();
    }

    @Override
    public String brake() {
        return this.getClass().getName();
    }
}
