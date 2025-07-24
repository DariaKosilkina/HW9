public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");//task1
        int[] payments = {10000, 20000, 15000, 30000, 25000};
        int totalSum = 0;
        for (int expense : payments) {
            totalSum += expense;
        }
        System.out.println("Сумма трат за месяц составила " + totalSum + " рублей");
        System.out.println("Задача 2");    //task2
        int[] weeklyPayments = {50000, 15000, 7000, 20000, 12000};
        int minPayments = weeklyPayments[0];
        int maxPayments = weeklyPayments[0];
        for (int expense : weeklyPayments) {
            if (expense < minPayments) {
                minPayments = expense;
            }
            if (expense > maxPayments) {
                maxPayments = expense;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPayments + " рублей.");
        System.out.println("Максимальная сумма трат за неделю составила " + maxPayments + " рублей.");
        System.out.println("Задача 3"); //task3
        int[] monthlyPayments = {1000, 20000, 1500, 30000, 2500};
        int totalSum1 = 0;
        for (int expense : monthlyPayments) {
            totalSum1 += expense;
        }
        double average = (double) totalSum1 / monthlyPayments.length;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей");
        System.out.println("Задача 4");//task4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I' };
        int left = 0;
        int right = reverseFullName.length - 1;
        while (left < right) {
            char temp = reverseFullName[left];
            reverseFullName[left] = reverseFullName[right];
            reverseFullName[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(reverseFullName));
    }
}