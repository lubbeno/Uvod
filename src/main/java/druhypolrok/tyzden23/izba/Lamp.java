package druhypolrok.tyzden23.izba;

public class Lamp {

 private boolean battery;
 private String style;
 private int globeRating;
 private boolean isOn;

    public Lamp(boolean battery,String style,int globeRating) {
        this.battery = battery;
        this.style = style;
        this.globeRating = globeRating;
    }

    void turnSwitch(){

        if (isOn){
            isOn = false;
            System.out.println("Lampa je vypnuta");
        }else{
            isOn = true;
            System.out.println("Lampa je zapnuta");
        }
    }
    public boolean isBattery(){
        return battery;
    }
    public String getStyle(){
        return style;
    }
    public int getGlobeRating(){
        return globeRating;
    }

}
