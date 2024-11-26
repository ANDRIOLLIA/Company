public class Deputy extends  Employee{
    public static void main(String[] args) {
        Director.salaryEmployee = 30_000;
    }

    @Override
    public String toString() {
        return "Deputy{" +
                "salary=" + salary +
                ", dateStartWork='" + dateStartWork + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
