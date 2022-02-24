package druhypolrok.tyzden08;

public class Trojuholnik {

    double stranaA;
    double stranaB;
    double stranaC;

    public Trojuholnik(){}

    public Trojuholnik(double stranaA, double stranaB, double stranaC) {
        this.stranaA = stranaA;
        this.stranaB = stranaB;
        this.stranaC = stranaC;
    }

    public double obvod(){
        return stranaA + stranaB + stranaC;
    }

    public double obsah(){
        double s = (stranaA + stranaB + stranaC)/2;
        return Math.sqrt(s*(s - stranaA)*(s - stranaB)*(s - stranaC));
    }
}
