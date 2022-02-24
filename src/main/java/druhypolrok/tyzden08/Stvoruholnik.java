package druhypolrok.tyzden08;

public class Stvoruholnik {

    double stranaA;
    double stranaB;

    public Stvoruholnik(){}

    public Stvoruholnik(double stranaAa, double stranaBa) {
        if( stranaAa > 0 && stranaBa > 0){
            stranaA = stranaAa;
            stranaB = stranaBa;
        }else {
            stranaA = 0;
            stranaB = 0;
        }


    }

    public double obvod(){
        return 2*(stranaA + stranaB);
    }

    public double obsah(){
        return stranaB*stranaA;
    }

    @Override
    public String toString() {
        return "Stvoruholnik{" +
                "stranaA=" + stranaA +
                ", stranaB=" + stranaB +
                '}';
    }
}
