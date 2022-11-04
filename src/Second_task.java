public class Second_task {
    public static void main(String[] args) {
        //Задание 1
        /*
        Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить, чтобы собрать сумму в 12 миллионов
        рублей при условии, что процент банка от накоплений не меняется, а всегда равен 7%. Выведите в консоль результат
        программы с указанием суммы накоплений по каждому месяцу.
        */
            System.out.println("Задача 1");
            int amount = 15000;
            int total = 0;
            int i = 0;
            while (total <= 12_000_000) {
                total = total + (total * 7/100);
                total= total+amount;
                i++;
                System.out.println("Месяц "+ i +", сумма накоплений равна " + total +" рублей.");
            }
            //Задание 2
            /*
            Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд, а только каждый шестой.
            Должны быть видны накопления за 6, 12, 18, 24 и далее месяцы.
            */
            System.out.println("Задача 2");
            int amount2 = 15000;
            int total2 = 0;
            int x = 1;
            for (;total2 <= 12_000_000;x++) {
                total2 = total2 + (total2 * 7/100);
                total2= total2+amount2;
                if (x % 6 ==0 ){
                    System.out.println("Месяц "+ x +", сумма накоплений равна " + total +" рублей.");
                }
            }
        //Задание 3
            /*
            Напишите программу, которая будет выводить Василию сумму его накоплений за следующие
            каждые полгода в течение 9 лет.
            */
        System.out.println("Задача 3");
        int amount3 = 15000;
        int total3 = 0;
        int z = 1;
        for (;z <= 108; z++) {
            total3 = total3 + (total3 * 7/100);
            total3= total3+amount3;
            if (z % 6 ==0 ){
                System.out.println("Месяц "+ z +", сумма накоплений равна " + total3 +" рублей.");
            }
        }
        /*Задание 4
        В вашей компании пятница является днем отчетным.
        Нам нужно написать программу, которая считает дни месяца по датам, определяет, какой день пятница, и выводит
        сообщение с напоминанием, что нужно подготовить еженедельный отчет.
        Условия задачи:
        Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
        Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
        "Сегодня пятница, ...-е число. Необходимо подготовить отчет."
        В нашем месяце 31 день. В результате у вас должно вывестись от 4 до 5 сообщений с напоминаниями по разным датам.
        */
        System.out.println("Задача 4");
        int firstFridayOfTheMonth = 6;
        int daysInTheWeek = 7;
        for (i = 1; i <=31; i++){
            if (i % daysInTheWeek == firstFridayOfTheMonth ) {
                System.out.println("Сегодня пятница, "+ i + "-е число. Необходимо подготовить отчет.");
            }
        }
        }
    }