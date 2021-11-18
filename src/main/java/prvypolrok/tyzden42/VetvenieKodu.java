package prvypolrok.tyzden42;

public class VetvenieKodu {

    public static void main(String[] args) {

        dlzkaMena("Lubos Sukup");
        System.out.println("===========len If ==================");
        lenIf(true,"Lubos");
        lenIf(false,"Lubos");
        System.out.println("=========== if else ==================");
        ifElse(true,"Lubos");
        ifElse(false,"Lubos");
    }

    public static void dlzkaMena(String meno){

        if(!(meno.length() > 10)){
            System.out.println("moje meno je mensie ako 15 znakov");
        }else {
            System.out.println("moje meno je vacsie ako 15 znakov");
        }
    }


    public static void lenIf(boolean vieJavu, String meno){
        if(vieJavu){
            meno = meno + " vie Javu";
        }
        meno = meno + " vie matematiku";
        System.out.println(meno);
    }
    public static void ifElse(boolean vieJavu, String meno){
        if(vieJavu){
            meno = meno + " vie Javu";
        }else {
            meno = meno + " vie matematiku";
        }
        System.out.println(meno);
    }

    public static void dniVtyzdni(int cislo){

        if(cislo == 1){
            System.out.println("Pondelok");
        }else if (cislo == 2){
            System.out.println("Utorok");
        }/// a doplnime
    }
}
