public class Printer {

    private int sheets; int toner;

    public Printer(int sheets, int toner){
        this.sheets = sheets;
        this.toner = toner;
    }

    public int countPaper(){
        return this.sheets;
    }

    public void paperReduces(int copies, int pages){
        this.sheets -= (copies * pages);
    }

    public void refillPaper(){
        this.sheets = 100;
    }

    public int countToner(){
        return this.toner;
    }

    public void reduceToner(){
        this.toner -= 1;
    }

}
