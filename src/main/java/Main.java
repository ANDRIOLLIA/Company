public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.salary = 200_000;

        Deputy deputy = new Deputy();
        deputy.salary = 150_000;

        Programmer programmer = new Programmer();
        programmer.salary = 160_000;
        System.out.println(
                        "Директор" + director +
                        "\nЗаместитель" + deputy +
                        "\nПрограммист" + programmer);
    }
}