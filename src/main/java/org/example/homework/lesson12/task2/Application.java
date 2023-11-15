package org.example.homework.lesson12.task2;

/*
В классе Application создать массив чисел int numbers = new int[]{3, 7, 9, 21, 14, 15}
Проитерироваться по массиву и сделать следующее: поделить число 100 на (numbers[i] - 9)
Если в процессе работы программы возможна ошибка - отловить ее (именно ее тип)
 и вывести в консоль:
'При обработке элемента №(здесь должен быть номер элемента) возникла ошибка: ' + exception.getMessage()
После выведения текста в консоль, программа должна продолжить работу.

 */
public class Application {
    public static void main(String[] args) {
        int[] numbers = new int[]{3, 9, 45, 23, 78, 49, 90};
        for (int i = 0; i < numbers.length; i++) {
            try {
                int result = divide(100, numbers[i] - 9);
                System.out.println(result);
            } catch (DivideByZeroException exception) {  // здесь необязательно было создавать свою новый тип ошибки. Этот код бросает AriphmeticalException, его и можно обработать
                System.out.printf("While processing element №%d occurred an error: %s%n", i, exception.getMessage());
            }
        }
    }

    private static int divide(int a, int b) throws DivideByZeroException {
        if (b == 0) {
            throw new DivideByZeroException();
        }
        return a / b;
    }
}
