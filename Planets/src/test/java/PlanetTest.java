import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetTest {

    private Planet marsPlanet;

    @Before
    public void before(){
        marsPlanet = new Planet( "Mars", 908973);

    }

    @Test
    public void hasName(){
        assertEquals("Mars", marsPlanet.getName());
    }

    @Test
    public void hasSize(){
        assertEquals(908973, marsPlanet.getSize());
    }

    @Test
    public void doesExplode(){
        assertEquals("Boom! Mars has exploded", marsPlanet.doesExplode());
    }

}
