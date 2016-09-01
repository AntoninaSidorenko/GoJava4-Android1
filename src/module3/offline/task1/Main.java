package module3.offline.task1;

public class Main {
    public static void main(String[] args) {
        int sum = 0;

        Employee [] array = new Employee[10];
        array[0] = new Employee("a", 12, "sd", "d", 1000);
        array[1] = new Employee("q", 13, "sd", "s", 12300);
        array[2] = new Employee("q", 13, "sd", "s", 345);
        array[4] = new Employee("q", 13, "sd", "s", 43);
        array[3] = new Employee("q", 13, "sd", "s", 23);
        array[5] = new Employee("q", 13, "sd", "s", 3456);
        array[6] = new Employee("a", 12, "sd", "d", 456);
        array[7] = new Employee("q", 13, "sd", "s", 3457);
        array[8] = new Employee("q", 13, "sd", "s", 949);
        array[9] = new Employee("q", 13, "sd", "s", 789);


        for (int i = 0; i < array.length ; i++) {
            sum += array[i].getSalary();

        }
        System.out.println(sum);
    }
}
