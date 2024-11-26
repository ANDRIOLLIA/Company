public abstract class Employee {
    public int salary;
    public String dateStartWork;
    public String name;

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", dateStartWork='" + dateStartWork + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
