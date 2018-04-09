import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    private Printer myPrinter;

    @Before
    public void before(){
        myPrinter= new Printer( 100, 50);
    }

    @Test
    public void hasPaper(){
        assertEquals(100, myPrinter.countPaper());
    }

    @Test
    public void paperReduces(){
        myPrinter.paperReduces(30, 2);
        assertEquals(40, myPrinter.countPaper());
    }

    @Test
    public void refillPaper(){
        myPrinter.refillPaper();
        assertEquals(100, myPrinter.countPaper());
    }

    @Test
    public void reduceToner(){
        myPrinter.reduceToner();
        assertEquals(49, myPrinter.countToner());
    }

//    @Test
//    public void allReduces() {
//        myPrinter.reduceToner(20);
//        myPrinter.paperReduces(10, 2);
//        assertEquals(30, myPrinter.countToner());
//        assertEquals(80, myPrinter.countPaper());
//    }
}

