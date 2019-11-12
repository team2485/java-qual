package JavaQual;

import java.util.ArrayList;

public class Qual {

    private static void a(int x) {
        if (x % 2 == 1) {
            System.out.println("a");
        } else {
            System.out.println("b");
        }
    }

    private static void b() {
        String monkey = "horseradish";
        String fish = "moses oscar";
        String elephant = monkey;
        monkey = "heffalump";
        System.out.println(monkey + 5 + "fish" + 7 + 2.5 + elephant + "elephant");
    }

    private static void c(double c, String m) {
        if (c > 0 && m.equals("thing")) {
            System.out.println("ole");
        } else if (c > 15) {
            System.out.println("apples");
        } else if (c > -1 || c < -15) {
            System.out.println("hedwig");
        } else if (c == -10) {
            System.out.println("this is a sentence");
        }

        String s = "th";

        if (s + "ing" == "thing") {
            System.out.println("custard");
        }
    }

    private static int d() {
        int number = 0;
        int time = 6;


        while (time < 12) {
            number += 5;
            time = time + 1;
        }

        for(time = 6; time < 12; time++) {
            number = number + 5;
        }

        return number;
    }

    private static void e() {
        int var1 = 1;
        int var2 = 1;
        int temp;
        while (var2 < 20) {
            temp = var2;
            var2 += var1;
            var1 = temp;

            System.out.println(var2);
        }
    }

    private static void f() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(i + ", " + j);
                if (i == 0 && j == 0) {
                    break;
                }
            }
        }
    }

    // Pay attention.
    private static void g() {
        String[] apples = {"flowers", "mouse", "octopus", "cheesecake", "snake"};

        for(int i = apples.length; i > 0; i--) {
            System.out.println(apples[i]);
        }
    }

    private static void h() {
        int[] numbers = new int [5];
        numbers[0] = 4;
        for(int i = 1; i < numbers.length; i++) {
            numbers[i] = (int)(numbers[i-1] * 1.5);
            System.out.println(numbers[i]);
        }
    }

    private static void i(boolean a) {
        System.out.println(a ? "mouse" : "super mouse");
    }

    private static void j(int jester) {
        while (jester > 0) {
            System.out.println(jester);
            jester /= 2;
        }
    }

    private static void k() {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            if(i % 3 == 0) {
                arr.add(i);
            }
        }
        System.out.println(arr.size());
    }

    private static int recursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * recursion(n-1));
        }
    }
}
