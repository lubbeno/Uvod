package prvypolrok.tyzden47;

public class NavratoveTypy {


    public static void main(String[] args) {

      String lubos01=  vratiString("Lubos");
        vratiString("dalsie Meno");
        vratiString("sukup");
        System.out.println(vratiInt("AB"));

        System.out.println(lubos01);
        System.out.println(vratiString("dalsie Meno"));
        ////////////////////////////////////
        // nefunguje lebo metoda nic nevracia
     //int lubos02 =  vratiNic("Lubos");
        vratiNic("dalsie Meno");
        vratiNic("sukup");



    }





    static void vratiNic(String x){

    }

    static String vratiString(String x){
        String uprava = x +"01";
        return  uprava;
    }
    static int vratiInt(String x){
        String uprava = x +"niecoPridame";
        System.out.println(uprava);
        int dlzkaSlova = uprava.length();
        return  dlzkaSlova;

    }

}
