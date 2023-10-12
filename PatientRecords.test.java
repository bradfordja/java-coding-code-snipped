import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PatientRecordsTest {

    @Test
    public void testPatientsWithCoronaAndUnder25() {
        Patient p1 = new Patient("p1", 20, "Corona", 18000);
        Patient p2 = new Patient("p2", 26, "Corona", 23000);
        Patient p3 = new Patient("p3", 29, "Cold", 6000);
        Patient p4 = new Patient("p4", 23, "Fue", 800);
        Patient p5 = new Patient("p5", 14, "Corona", 12000);

        List<Patient> patients = Arrays.asList(p1,p2,p3,p4,p5);
        List<Patient> result = patients.stream().filter(p -> p.getDisease().equals("Corona") && p.getAge() < 25).collect(Collectors.toList());
        
        assertEquals(2, result.size());
        assertEquals("p1", result.get(0).getName());
        assertEquals("p5", result.get(1).getName());
    }

    @Test
    public void testAverageBillForCoronaPatients() {
        Patient p1 = new Patient("p1", 20, "Corona", 18000);
        Patient p2 = new Patient("p2", 26, "Corona", 23000);
        Patient p3 = new Patient("p3", 29, "Cold", 6000);
        Patient p4 = new Patient("p4", 23, "Fue", 800);
        Patient p5 = new Patient("p5", 14, "Corona", 12000);

        List<Patient> patients = Arrays.asList(p1,p2,p3,p4,p5);
        Double averageBillPaid = patients.stream().filter(p -> p.getDisease().equals("Corona")).collect(Collectors.averagingDouble(Patient::getAmount));
        
        assertEquals((18000 + 23000 + 12000) / 3.0, averageBillPaid);
    }
    
    // ... Additional test cases as necessary ...
}
