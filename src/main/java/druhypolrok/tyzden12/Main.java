package druhypolrok.tyzden12;

public class Main {

    public static void main(String[] args) {

        Pes dunco = new Pes("doberman","dunco",3,"pes");
        Pes alik = new Pes("vlciak","alik",4,"pes");
        Pes fifinka = new Pes("jazvecik","fifinka",3,"fena");

        dunco.hraSa();
        alik.hraSa();
        fifinka.hraSa();
        dunco.hraSaSFenou(alik);
        dunco.hraSaSFenou(fifinka);
        System.out.println(dunco.getRasa());
        System.out.println(fifinka.getRasa());

        dunco.setVek(99);
        fifinka.setVek(60);

    }
}
