import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Создаем сканер для считывания входных данных
        Scanner scanner = new Scanner(System.in);

        // Вводим данные
        int X = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        // Логика проверки положения точки X
        if (X < A) {
            System.out.println(1); // Участок 1
        } else if (X < B && X > A) {
            System.out.println(2); // Участок 2
        } else if (X < C && X > B) {
            System.out.println(3); // Участок 3
        } else if (X < D && X > C) {
            System.out.println(4); // Участок 4
        } else if (X > D) {
            System.out.println(5); // Участок 5
        } else {
            System.out.println("Введённые числа не соответсвуют условиям задачи, они должны быть различны");
        }

        // Закрываем сканер
        scanner.close();
    }
}
