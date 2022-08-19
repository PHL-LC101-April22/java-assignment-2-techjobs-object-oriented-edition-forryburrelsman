package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job3.getEmployer() instanceof Employer);
        assertTrue(job3.getLocation() instanceof Location);
        assertTrue(job3.getPositionType() instanceof PositionType);
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(job3.getName() instanceof String);
        assertEquals(job3.getEmployer().getValue(), "ACME");
        assertEquals(job3.getLocation().getValue(), "Desert");
        assertEquals(job3.getPositionType().getValue(), "Quality control");
        assertEquals(job3.getCoreCompetency().getValue(), "Persistence");
        assertEquals(job3.getName(), "Product tester");
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine(){
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality " +
                "control"), new CoreCompetency("Persistence"));
        assertEquals(job4.toString().charAt(0), '\n');
        assertEquals(job4.toString().charAt(job4.toString().length()-1), '\n');
    }
}
