public class EmployeeManagement {

    Employee[] employees = new Employee[10];
    int count = 0;

    // Add Employee
    void addEmployee(Employee emp) {

        if(count < employees.length) {
            employees[count++] = emp;
            System.out.println("Employee Added");
        }
    }

    // Search Employee
    Employee searchEmployee(int id) {

        for(int i = 0; i < count; i++) {

            if(employees[i].employeeId == id)
                return employees[i];
        }

        return null;
    }

    // Traverse
    void displayEmployees() {

        for(int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete Employee
    void deleteEmployee(int id) {

        int index = -1;

        for(int i = 0; i < count; i++) {

            if(employees[i].employeeId == id) {
                index = i;
                break;
            }
        }

        if(index == -1) {
            System.out.println("Employee Not Found");
            return;
        }

        for(int i = index; i < count - 1; i++) {
            employees[i] = employees[i + 1];
        }

        employees[count - 1] = null;
        count--;

        System.out.println("Employee Deleted");
    }

    public static void main(String[] args) {

        EmployeeManagement em = new EmployeeManagement();

        em.addEmployee(
                new Employee(101,"Amit","Manager",60000));

        em.addEmployee(
                new Employee(102,"Sneha","Developer",50000));

        em.addEmployee(
                new Employee(103,"Rohit","Tester",40000));

        System.out.println("\nEmployees:");
        em.displayEmployees();

        System.out.println("\nSearch Result:");
        System.out.println(em.searchEmployee(102));

        em.deleteEmployee(102);

        System.out.println("\nAfter Deletion:");
        em.displayEmployees();
    }
}