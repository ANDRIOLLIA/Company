public class Director extends  Employee{
    protected static int salaryEmployee = 25_000;

    @Override
    public String toString() {
        return "Director{" +
                "salary=" + salary +
                ", dateStartWork='" + dateStartWork + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}