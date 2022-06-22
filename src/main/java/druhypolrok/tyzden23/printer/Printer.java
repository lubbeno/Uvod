package druhypolrok.tyzden23.printer;

import java.util.Objects;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tl, boolean dp){
        this.tonerLevel = tl > -1 && tl <=100 ?  tl : -1;
        this.duplex = dp;
    }

    public int addToner(int tonerAmount){
        if( tonerAmount > 0 && tonerAmount <= 100){
            return tonerLevel+tonerAmount > 100 ? -1 : (tonerLevel += tonerAmount);
        }
        return -1;
    }
    public int printPages(int pages){
        int pagesToPrint=pages;


        if(duplex){
            pagesToPrint = pages / 2 + pages%2;
            pagesPrinted = pagesPrinted + pagesToPrint;
        }else{
            pagesPrinted = pagesPrinted + pages;
        }
        return pagesToPrint;
    }
    public int getPagesPrinted(){
        return pagesPrinted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Printer printer = (Printer) o;
        return tonerLevel == printer.tonerLevel && pagesPrinted == printer.pagesPrinted && duplex == printer.duplex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tonerLevel, pagesPrinted, duplex);
    }
}

