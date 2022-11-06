public class First_task {
    public static void main(String[] args) {
        //Задача 1
        //Накопления при откладывании денег под проценты.
        /*
        С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей при условии,
        что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.*/

        System.out.println("Задача 1");
        int amount = 15000;
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total += total/100;
            total += amount;
            month++;
            System.out.println("Месяц "+ month +", сумма накоплений равна " + total +" рублей.");
        }

        //Задача 2
        /*Выведите в одну строку через пробел числа от 1 до 10, используя цикл while.
        На следующей строке выведите числа в обратном порядке от 10 до 1, используя оператор for.*/

        System.out.println("Задача 2");
        int number = 0;
        while (number < 10) {
            number++;
            System.out.print(number +" ");
        }
        System.out.println("");
        for (int q = 10; q>=1; q--){
            System.out.print(q + " ");
        }
        System.out.println("");

        //Задача 3
        /*В стране Y население равно 12 миллионам человек.За год рождаемость составляет 17 человек на 1000 человек,
        смертность - 8 человек. Рассчитайте, какая численность населения будет через 10 лет, принимая во внимание, что
        показатели рождаемости и смертности постоянны.
        В консоль выведите результат операции на каждый год в формате "Год …, численность населения составляет … "*/
        System.out.println("Задача 3");
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        for (int year = 1; year<=10; year++) {
            population += (population * (fertility-mortality))/1000;
            System.out.println("Год "+ year +", численность населения составляет " + population +" человек.");
        }
    }
}