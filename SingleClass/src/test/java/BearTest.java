import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {
    private Bear skinnyBear;
    private Bear heavyBear;

    @Before
    public void before(){
        skinnyBear = new Bear( "Paddington", 23, 650.0, 'M');
        heavyBear = new Bear( "Yogi", 23, 750.0, 'F');
    }

    @Test
    public void hasName(){
        assertEquals("Paddington", skinnyBear.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(23, skinnyBear.getAge());
    }

    @Test
    public void hasWeight() {
        assertEquals(650.0, skinnyBear.getWeight(),0.01);
    }

    @Test
    public void isBearAsleepWhenSkinny() {
        assertEquals(false, skinnyBear.isAsleep());
    }

    @Test
    public void isBearAsleepWhenHeavy() {
        assertEquals(true, heavyBear.isAsleep());
    }

    @Test
    public void isBearMale() {
        assertEquals('M', skinnyBear.getGender());
    }

    @Test
    public void isBearFemale() {
        assertEquals('F', heavyBear.getGender());
    }

}

