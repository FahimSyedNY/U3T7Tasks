public class Employee {
    private String firstName;
    private String lastName;
    public static int nextId = 100;
    private int thisId = nextId;

    public Employee(String first, String last) {
        firstName = first;
        lastName = last;
        nextId++;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getId() {
        return thisId;
    }

    public static int getMostRecentEmployeeID() {
        return nextId - 1;
    }

    public static int getTotalEmployeesCreated() {
        return nextId - 100;
    }

    public String employeeInfo() {
        return  "--------------------------\n" +
                "Employee full name: " + firstName + " " + lastName +
                "\nEmployee ID: " + thisId +
                "\nMost recent ID assigned: " + getMostRecentEmployeeID() +
                "\nTotal employees hired: " + getTotalEmployeesCreated() +
                "\n--------------------------\n";
    }
}
