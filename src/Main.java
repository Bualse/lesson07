public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        //task5();
        //task6();
        //task7();
        //task8();

    }

    public static void task1() {
        System.out.println("Задача 1");

        int[] weights = {1, 2, 3};

        double[] apple = {1.57, 7.654, 9.986};

        int[] lamps = {50, 34, 77, 88};
    }

    public static void task2() {
        System.out.println("Задача 2");

        int[] weights = {1, 2, 3};
        System.out.print(weights[0] + ", ");
        System.out.print(weights[1] + ", ");
        System.out.println(weights[2]);

        double[] apple = {1.57, 7.654, 9.986};
        System.out.print(apple[0] + ", ");
        System.out.print(apple[1] + ", ");
        System.out.println(apple[2]);

        int[] lamps = {50, 34, 77, 88};
        System.out.print(lamps[0] + ", ");
        System.out.print(lamps[1] + ", ");
        System.out.print(lamps[2] + ", ");
        System.out.println(lamps[3]);
    }

    public static void task3() {
        System.out.println("Задача 3");

        int[] weights = {1, 2, 3};
        System.out.print(weights[2] + ", ");
        System.out.print(weights[1] + ", ");
        System.out.println(weights[0]);

        double[] apple = {1.57, 7.654, 9.986};
        System.out.print(apple[2] + ", ");
        System.out.print(apple[1] + ", ");
        System.out.println(apple[0]);

        int[] lamps = {50, 34, 77, 88};
        System.out.print(lamps[3] + ", ");
        System.out.print(lamps[2] + ", ");
        System.out.print(lamps[1] + ", ");
        System.out.println(lamps[0]);
    }

    public static void task4() {
        System.out.println("Задача 4");

        int[] weights = {1, 2, 3};
        for (int i = 0; i < weights.length; i++) {
            if (i % 2 == 0) {
                System.out.print(weights[i] + 1 + " ");
            }
            System.out.print(weights[1] + " ");
        }
    }
}
