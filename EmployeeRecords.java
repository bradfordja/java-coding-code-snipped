public class EmployeeRecords {

    public static class EmployeeClass {
        private final String name;
        private final int employeeNumber;

        public String getName() {
            return name;
        }

        public int getEmployeeNumber() {
            return employeeNumber;
        }

        public EmployeeClass(String name, int employeeNumber) {
            this.name = name;
            this.employeeNumber = employeeNumber;
        }

        @Override
        public String toString() {
            return "EmployeeClass [name=" + name + ", employeeNumber=" + employeeNumber + "]";
        }
    }

    public record InnerEmployeeRecords(String name, int employeeNumber) {}
    
    public static void main(String[] args) {
        EmployeeClass employee = new EmployeeClass("Jerry", 12345);
        System.out.println(employee.toString());

        InnerEmployeeRecords innerEmployee = new InnerEmployeeRecords("Julio", 612126);
        System.out.println(innerEmployee.toString());
    }
}
