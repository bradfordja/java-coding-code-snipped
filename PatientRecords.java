import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Collections;

public class PatientRecords {

    
    public static void main(String[] args) {
        
        Patient p1 = new Patient("p1", 20, "Corona", 18000);
        Patient p2 = new Patient("p2", 26, "Corona", 23000);
        Patient p3 = new Patient("p3", 29, "Cold", 6000);
        Patient p4 = new Patient("p4", 23, "Fue", 800);
        Patient p5 = new Patient("p5", 14, "Corona", 12000);

        java.util.List<Patient> patients = Arrays.asList(p1,p2,p3,p4,p5);

        // patients.stream().filter(p -> p.getDisease().equals("Corona")).forEach(System.out::println);
        patients.stream().filter(p -> p.getDisease().equals("Corona") && p.getAge() < 25).forEach(System.out::println);
        Double averageBillPaid = patients.stream().filter(p -> p.getDisease().equals("Corona")).collect(Collectors.averagingDouble(Patient::getAmount));

        System.out.println("Average bill paid: $" + averageBillPaid);


    }
}
