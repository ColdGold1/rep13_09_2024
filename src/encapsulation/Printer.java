package encapsulation;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex){

        if (tonerLevel < -1 || tonerLevel > 100){
            this.tonerLevel = -1;
        } else{
            this.tonerLevel = tonerLevel;
        }

        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount){

        if (tonerAmount > 0 && tonerAmount <= 100){
            if (tonerAmount + tonerLevel > 100){
                return -1;
            } else{
                tonerLevel += tonerAmount;
                return tonerLevel;
            }
        } else {
            return -1;
        }
    }

    public int printPages(int pages){

        int pagesToPrint = pages;

        if (duplex){
            pagesToPrint = pagesToPrint / 2 + pagesToPrint % 2;
            pagesPrinted += pagesToPrint;
            return pagesToPrint;
        } else{
            return pages;
        }
    }

    public int getPagesPrinted() {

        return pagesPrinted;
    }
}
