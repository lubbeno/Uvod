package druhypolrok.tyzden15;

public class TestovaciaTrieda {
    private int neco;
    private long dlhe;
    private String meno;
    public TestovaciaTrieda(){

    }
    public TestovaciaTrieda(int neco, long dlhe, String meno1 ){
        if(neco>0){
            this.neco=neco;
        }
        else{
            this.neco=0;
        }

        this.dlhe=dlhe;
        meno=meno1;
    }
    //takto nema vyzerat setter
    public int setNeco(){
        neco = 8;
        return neco;
    }
    public long getDlhe(){return dlhe;}

    public String getMeno(){return meno;}

    public int getNeco(){return neco;}





    @Override
    public String toString() {
        return "TestovaciaTrieda{" +
                "neco=" + neco +
                ", dlhe=" + dlhe +
                ", meno='" + meno + '\'' +
                '}';
    }
}
