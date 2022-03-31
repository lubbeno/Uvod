package druhypolrok.tyzden12;

public class Pes {
  private   String rasa;
  private   String meno;
  private   int vek;
  private   String pohlavie;

    public Pes() {}

    public Pes(String rasa, String meno, int vek, String pohlavie) {
        this.rasa = rasa;
        this.meno = meno;
        this.vek = vek;
        this.pohlavie = pohlavie;
    }

    public void hraSa(){
        System.out.println( meno + " sa hra !!!!");
    }

    public String getRasa(){
        return this.rasa;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        if( vek >= 0) {
            this.vek = vek;
        }
        else {
            System.out.println( " chyba zaporne cislo ");
        }



    }


    @Override
    public String toString() {
        return "Pes{" +
                "rasa='" + rasa + '\'' +
                ", meno='" + meno + '\'' +
                ", vek=" + vek +
                ", pohlavie='" + pohlavie + '\'' +
                '}';
    }

    public void hraSaSFenou(Pes pes){

        if(pes.pohlavie.equals("fena")){
            System.out.println( meno + " sa hra s " + pes.meno);
        }else {
            System.out.println(meno + " pokusal " + pes.meno);
        }
    }

    public String getMeno() {
        return meno;
    }

    public String getPohlavie() {
        return pohlavie;
    }


}
