package druhypolrok.tyzden08;

public class Kruh {
    double polomer;

    public Kruh(){}

    public Kruh( double vstupnyAtribut){
        if(vstupnyAtribut > 0){
            polomer = vstupnyAtribut;
        }else{
            polomer = 0;
        }


    }
    public double obvod(){
        return 2*polomer*Math.PI;
    }
    public double obsah(){
        return Math.PI*polomer*polomer;
    }

    @Override
    public String toString() {
        return "Kruh{" +
                "polomer=" + polomer +
                '}';
    }

}
