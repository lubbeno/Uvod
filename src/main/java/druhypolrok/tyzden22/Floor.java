package druhypolrok.tyzden22;

public class Floor {
    double length;
    double width;

    public Floor(double dlzka,double sirka){
        if (dlzka<0){
            length=0;
        }else{
            length = dlzka;
        }
        if (sirka<0){
            width=0;
        }else{
            width = sirka;
        }
    }
    public double getArea(){
        double  obsah= length * width;
        return obsah;
    }
}
