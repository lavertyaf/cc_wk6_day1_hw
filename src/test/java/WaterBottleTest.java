import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    private WaterBottle myWaterBottle;

    @Before
    public void before(){
        myWaterBottle = new WaterBottle( 100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, myWaterBottle.getVolume());
    }

    @Test
    public void volumeGoesDown(){
        myWaterBottle.decreaseVolume();
        assertEquals(90, myWaterBottle.getVolume());
    }

    @Test
    public void volumeGoesDownTwice(){
        myWaterBottle.decreaseVolume();
        myWaterBottle.decreaseVolume();
        assertEquals(80, myWaterBottle.getVolume());
    }

    @Test
    public void bottleIsEmpty(){
        myWaterBottle.emptyBottle();
        assertEquals(0, myWaterBottle.getVolume());
    }

    @Test
    public void bottleIsRefilled(){
        myWaterBottle.refillBottle();
        assertEquals(100, myWaterBottle.getVolume());
    }

}
