/**
 *
 */

public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    /**
     * Simple constructor
     * @param firstName first name
     * @param lastName last name
     * @param monthlySalary employee's monthly salary
     */
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        //todo not negative
        this.monthlySalary = monthlySalary;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * set monthly salary
     * @param monthlySalary monthly salary amount
     */
    public void setMonthlySalary(double monthlySalary) {
        if (monthlySalary < 0) {
            monthlySalary = 0;
        }
        this.monthlySalary = monthlySalary;
    }

    /**
     * get first name
     * @return first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * get last name
     * @return last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * get monthly salary
     * @return monthlysalary
     */
    public double getMonthlySalary() {
        return monthlySalary;
    }

}
