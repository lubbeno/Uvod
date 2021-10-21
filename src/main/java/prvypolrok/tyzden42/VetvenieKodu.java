package prvypolrok.tyzden42;

public class VetvenieKodu {

    public static void main(String[] args) {

        dlzkaMena("Lubos Sukup");
    }

    public static void dlzkaMena(String meno){

        if(meno.length() > 10){
            System.out.println("moje meno je vacsie ako 15 znakov");
        }else {
            System.out.println("moje meno je mensie ako 15 znakov");
        }

    }

}
