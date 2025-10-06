import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        One one = new One();

        System.out.println("Задание 1.1 Дробная часть");
        System.out.println("Введите вещественное число: ");
        double x = scanner.nextDouble();
        String formatted = String.format("%.2f", one.fraction(x));
        System.out.println("Дробная часть = " + formatted);

        System.out.println("Задание 1.3");
        System.out.println("Введите символ: ");
        char chars = scanner.next().charAt(0);
        System.out.println("Преобразованный символ: " + one.charToNum(chars));

        System.out.println("Задание 1.5");
        System.out.println("Введите целое число: ");
        int num1 = scanner.nextInt();
        System.out.println(one.is2Digits(num1));

        System.out.println("Задание 1.7 Диапазон");
        System.out.println("Введите левую границу: ");
        int a = scanner.nextInt();
        System.out.println("Введите правую границу: ");
        int b = scanner.nextInt();
        System.out.println("Введите число для проверки: ");
        int num = scanner.nextInt();
        System.out.println("В диапазоне: " + one.isInRange(a, b, num));

        System.out.println("Задание 1.9 Равенство");
        System.out.println("Введите первое число: ");
        int n1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int n2 = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int n3 = scanner.nextInt();
        System.out.println("Все равны: " + one.isEqual(n1, n2, n3));

        System.out.println("Задание 2.1. Модуль числа");
        System.out.println("Введите целое число: ");
        int num2 = scanner.nextInt();
        System.out.println("Модуль числа: " + one.abs(num2));

        System.out.println("Задание 2.3. Тридцать пять");
        System.out.println("Введите целое число: ");
        int num3 = scanner.nextInt();
        System.out.println("Результат: " + one.is35(num3));

        System.out.println("Задание 2.5. Тройной максимум");
        System.out.println("Введите первое число: ");
        int k = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int l = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int m = scanner.nextInt();
        System.out.println("Максимальное: " + one.max3(k, l, m));

        System.out.println("Задание 2.7. Двойная сумма");
        System.out.println("Введите первое число: ");
        int z = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int y = scanner.nextInt();
        System.out.println("Результат: " + one.sum2(z, y));

        System.out.println("Задание 2.9. День недели");
        System.out.println("Введите номер дня (1-7): ");
        int dayNum = scanner.nextInt();
        System.out.println("Результат: " + one.day(dayNum));

        System.out.println("Задание 3.1: Числа подряд");
        System.out.println("Введите число: ");
        int num5 = scanner.nextInt();
        System.out.println("Результат: " + one.listNums(num5));

        System.out.println("Задание 3.3: Четные числа");
        System.out.println("Введите число: ");
        int num4 = scanner.nextInt();
        System.out.println("Результат: " + one.chet(num4));

        System.out.println("Задание 3.5: Длина числа");
        System.out.println("Введите число: ");
        long num6 = scanner.nextLong();
        System.out.println("Длина числа: " + one.numLen(num6));

        System.out.println("Задание 3.7: Квадрат");
        System.out.println("Введите размер: ");
        int size7 = scanner.nextInt();
        one.square(size7);

        System.out.println("Задание 3.9: Правый треугольник");
        System.out.println("Введите высоту: ");
        int tr = scanner.nextInt(); // высота треугольника
        one.rightTriangle(tr); // рисуем треугольник

        System.out.println("Введите элементы массива через пробел:");
        String input = scanner.nextLine(); // Читаем строку с числами массива
        String[] parts = input.split(" "); // разбиваем строку на массив строк
        int[] arr = new int[parts.length]; // Создаем массив для чисел
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]); // преобр строки в числа
        }

        System.out.println("Массив: " + Arrays.toString(arr));

        System.out.println("4.1: Поиск первого вхождения - введите число:");
        int x1 = scanner.nextInt();
        System.out.println("Результат: " + one.findFirst(arr, x1));

        System.out.println("4.3: Максимальный по модулю:");
        System.out.println("Результат: " + one.maxAbs(arr));

        System.out.println("4.5: Вставка массива - введите элементы для вставки через пробел:");
        scanner.nextLine();
        String insertInput = scanner.nextLine(); // Читаем строку с числами для вставки
        String[] insertParts = insertInput.split(" "); // Разбиваем строку на массив
        // преобразуем строки в целые числа
        int[] ins = new int[insertParts.length]; // создаём новый массив
        for (int i = 0; i < insertParts.length; i++) {
            ins[i] = Integer.parseInt(insertParts[i]); // кажда строка из массива преобр в число
            //и сохраняется в ins
        }
        System.out.println("Введите позицию для вставки:");
        int pos = scanner.nextInt();
        System.out.println("Результат: " + Arrays.toString(one.add(arr, ins, pos)));

        System.out.println("4.7: Реверс массива:");
        System.out.println("Результат: " + Arrays.toString(one.reverseBack(arr)));

        System.out.println("4.9: Все вхождения - введите число:");
        int x9 = scanner.nextInt();
        System.out.println("Результат: " + Arrays.toString(one.findAll(arr, x9)));
        scanner.close();
    }
}
