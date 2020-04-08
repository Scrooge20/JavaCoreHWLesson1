public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.

        //Задание 2. Создать переменные всех пройденных типов данных и инициализировать их значения.
        byte v_byte = 127;
        short v_short = 32767;
        int v_int = 2000000000;
        long v_long = 200000L;
        float v_float = 123.123f;
        double v_double = 222.333;
        char v_char = '?';
        boolean v_boolean = true;

        /*
        Задание 3.
        Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        где a, b, c, d –аргументы этого метода, имеющие тип float.
        */
        System.out.println("Сумма чисел = " + sumQuiz3(11.11f, 22.22f, 33.33f, 44.44f));

        /*
        Задание 4.
        Написать метод, принимающий на вход два целых числа и
        проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно),
        если да – вернуть true, в противном случае – false.
         */
        System.out.println("Return : " + checkange(2,5));

        /*
        Задание 5.
        Написать метод, которому в качестве параметра передается целое число,
        метод должен напечатать в консоль, положительное ли число передали или отрицательное.
        Замечание: ноль считаем положительным числом.
        */
        checkPositive(-4);

        /*
        Задание 6.
        Написать метод, которому в качестве параметра передается целое число.
        Метод должен вернуть true, если число отрицательное.
        */
        System.out.println("Возвращаемое значение : " + checkPositive2(5));

        /*
        Задание 7.
        Написать метод, которому в качестве параметра передается строка, обозначающая имя.
        Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
        */
        name("Andy");

        /*
        Задание 8.
        Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
        Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
         */

        for (int year_n = 1896; year_n < 1920; year_n = year_n + 2) {
            fourYear(year_n);
        }

    }

    //Задание 3. Реализация
    private static float sumQuiz3(float a, float b, float c, float d) {
        float sum = a * (b + (c / d));
        return sum;
    }

    //Задание 4. Реализация
    public static boolean checkange (int a, int b){
        boolean c;
        int sum = a + b;
        if (sum<=20 & sum>=10){
            c = true;
        }else {
            c = false;
        }
        return c;
    }

    //Задание 5. Реализация
    public static void checkPositive (int a){
        if (a>=0){
            System.out.println("Положительное число : " + a);
        }else {
            System.out.println("Отрицательное число : " + a);
        }
    }

    //Задание 6. Реализация
    public static boolean checkPositive2 (int a){
        boolean c;
        if (a>=0){
            c = true;
            System.out.println("Положительное число = " + a);
        }else {
            c = false;
            System.out.println("Отрицательное число = " + a);
        }
        return c;
    }


    //Задание 7. Реализация
    public static void name(String a){
        System.out.println("Hello Mr. " + a);
    }

    //Задание 8. Реализация. Высокосный год
    public static void fourYear (int a){

        if (a % 100 != 0 && a % 4 == 0) {
            System.out.println("Год :  " + a + " высокосный");
        }else if ((a % 100 == 0) && (a % 400 == 0)){
            System.out.println("Год :  " + a + " высокосный");
        }else if (a % 100 == 0) {
            System.out.println("Год :  " + a + " столетие");
        }else {
            System.out.println("Год :  " + a + " обычный год ");
        }
    }
}
