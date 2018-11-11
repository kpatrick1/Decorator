package us.kpatrick.test;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
import us.kpatrick.BasicCharacter;
import us.kpatrick.Character;
import us.kpatrick.Sword;

public class BasicCharacterTest {
    Character b;

    @Before
    public void setUp() throws Exception {
        b = new BasicCharacter("bob");
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getName() {
        assertTrue(b.getName() == "bob");
        assertFalse(b.getName() == "kevin");
        assertFalse(b.getName() == "Bob");
    }

    @Test
    public void getHealth() {
        assertTrue(b.getHealth() == 0);
        assertFalse(b.getHealth() == 6);
    }
}
