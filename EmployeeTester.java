public class EmployeeTester {
    public static void main(String[] args) {
        System.out.printf("Testing Employees");

        Employee employee1 = new Employee("Jack", "Adams", 1000.0);
        Employee employee2 = new Employee("Jack", "John", 2000.0);

        System.out.printf("\nEmployee's First Name: %s", employee1.getFirstName());
        System.out.printf("\nEmployee's Last Name: %s", employee1.getLastName());
        System.out.printf("\nEmployee's Salary: %s", employee1.getMonthlySalary());

        System.out.printf("\nEmployee's First Name: %s", employee2.getFirstName());
        System.out.printf("\nEmployee's Last Name: %s", employee2.getLastName());
        System.out.printf("\nEmployee's Salary: %s", employee2.getMonthlySalary());



        employee1.setMonthlySalary(employee1.getMonthlySalary() * 1.1);
        employee2.setMonthlySalary(employee2.getMonthlySalary() * 1.1);

        System.out.printf("\nEmployee 1's Salary after raise: %s", employee1.getMonthlySalary());
        System.out.printf("\nEmployee 2's Salary after raise: %s", employee2.getMonthlySalary());
    }
}
