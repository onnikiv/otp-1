package educationsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import education.educations.Batchelors;
import education.educations.Doctors;
import education.educations.Masters;

public class MainTest {

    @BeforeEach
    public void printTestInfo() {
        System.out.println("Starting a new test: ");
    }

    @Test
    public void BatchelorsTest() {
        assertEquals(3, new Batchelors().getEducationDuration());
    }

    @Test
    public void MastersTest() {
        assertEquals(5, new Masters().getEducationDuration());
    }

    @Test
    public void DoctorsTest() {
        assertEquals(7, new Doctors().getEducationDuration());
    }
}
