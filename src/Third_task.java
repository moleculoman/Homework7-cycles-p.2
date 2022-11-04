public class Third_task {
    public static void main(String[] args) {
        //Задание 1
        /*
        * Комета, которая пролетает рядом с Землей каждый 79-й год, начиная с нулевого.
        * Нам нужно узнать, в каких годах комета пролетала рядом с Землей за последние 200 лет и когда
        *  мы увидим ее в следующий раз.
        */
        System.out.println("Задача 1. График астероидов");
        int actualYear = 2022;
        int previousPeriod = actualYear-200;
        int futurePeriod = actualYear+100;
        for (int i = previousPeriod;i <=futurePeriod; i++){
            if (i % 79 == 0) {
                System.out.println(i + " год, когда комета пролетает рядом с Землей");
            }
        }
        //Задание 2
        //Таблица умножения на 2
        System.out.println("Задача 2. Таблица умножения на 2");
        int i =2;
        for (int x = 1; x <=10; x++){
            {
                System.out.println(i + "*" + x + "=" + (i*x));
            }
        }
    }
}
