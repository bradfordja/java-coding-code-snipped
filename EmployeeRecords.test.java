import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeRecordsTest {

    @Test
    public void testEmployeeClass() {
        EmployeeRecords.EmployeeClass employee = new EmployeeRecords.EmployeeClass("Jerry", 12345);

        assertEquals("Jerry", employee.getName());
        assertEquals(12345, employee.getEmployeeNumber());
        assertEquals("EmployeeClass [name=Jerry, employeeNumber=12345]", employee.toString());
    }

    @Test
    public void testInnerEmployeeRecords() {
        EmployeeRecords.InnerEmployeeRecords innerEmployee = new EmployeeRecords.InnerEmployeeRecords("Julio", 612126);

        assertEquals("Julio", innerEmployee.name());
        assertEquals(612126, innerEmployee.employeeNumber());
        assertEquals("InnerEmployeeRecords[name=Julio, employeeNumber=612126]", innerEmployee.toString());
    }

    // ... Additional test cases as necessary ...
}
