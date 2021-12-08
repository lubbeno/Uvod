package prvypolrok.tyzden47;

public class SwitchDniVtyzdni {


    public static void main(String[] args) {
        System.out.println("danny den v tyzdni je: " + denVtyzdni(2));
        System.out.println("danny den v tyzdni je: " + denVtyzdniSwitch(2));

        denVtyzdniSwitch2(2);
        denVtyzdniSwitch2(1);

    }

    static String denVtyzdni(int x) {

        if (x == 1) {
            return "Pondelok";
        } else if (x == 2) {
            return "Utorok";
        } else if (x == 7) {
            return "nedela";
        } else {
            return "Neplatne cislo";
        }
    }

    static String denVtyzdniSwitch(int x) {

        switch (x) {
            case 1:
                return "Pondelok";
            case 2:
                return "Utorok";
            case 3:
                return "nedela";
            default:
                return "Neplatne cislo";
        }
    }


    static void denVtyzdniSwitch2(int x) {
String denVtyzdni="";
        switch (x) {
            case 1:
            case 4:
                denVtyzdni="spolocky so 4 ";
                break;
            case 2:
                denVtyzdni="Utorok";
            case 3:
                denVtyzdni="nedela";
            default:
                denVtyzdni="Neplatne cislo";
        }
        System.out.println(denVtyzdni);
    }


}
