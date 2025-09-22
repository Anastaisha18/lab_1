public class One {
    // Задание 1.1: Дробная часть
    public double fraction(double x) {
        double integerPart = (int) x;
        return x - integerPart;
    }

    // Задание 1.3: Букву в число
    public int charToNum(char x) {
        if (x >= '0' && x <= '9') {
            return x - '0';
        } else {
            return -1;
        }
    }

    // Задание 1.5: Двузначное
    public int is2Digits(int x) {
        if ((x >= 10 && x <= 99) || (x <= -10 && x >= -99)) {
            return x;
        } else {
            return -1;
        }
    }

    // Задание 1.7: Диапазон
    public boolean isInRange(int a, int b, int num) {
        int min = Math.min(a, b); // находит меньшую границу
        int max = Math.max(a, b); //  находит большую границу
        return num >= min && num <= max;
    }

    // Задание 1.9: Равенство
    public boolean isEqual(int a, int b, int c) {
        return a == b && b == c;
    }

    // Задание 2.1: Модуль числа
    public int abs(int x) {
        if (x < 0) {
            return -x; // возвращает с против-ым знаком
        }
        return x;
    }

    // Задание 2.3: Тридцать пять
    public boolean is35(int x) {
        boolean by3 = (x % 3 == 0);
        boolean by5 = (x % 5 == 0);
        return (by3 || by5) && !(by3 && by5);
    }

    // Задание 2.5: Тройной максимум
    public int max3(int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }

    // Задание 2.7: Двойная сумма
    public int sum2(int x, int y) {
        int sum = x + y;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }

    // Задание 2.9: День недели
    public String day(int x) {
        return switch (x) {
            case 1 -> "понедельник";
            case 2 -> "вторник";
            case 3 -> "среда";
            case 4 -> "четверг";
            case 5 -> "пятница";
            case 6 -> "суббота";
            case 7 -> "воскресенье";
            default -> "это не день недели";
        };
    }
    // Задание 3.1: Числа подряд
    public String listNums(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i++) {  // 1 переменная, 2 условие, 3 шаг
            result.append(i);
            if (i < x) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    // Задание 3.3: Четные числа (без if)
    public String chet(int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i += 2) {
            result.append(i);
            if (i + 2 <= x) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    // Задание 3.5: Длина числа
    public int numLen(long x) {
        if (x == 0) return 1;

        int count = 0;
        long num = Math.abs(x);
        while (num > 0) {
            num /= 10; // Убираем последнюю цифру
            count++;
        }
        return count;
    }

    // Задание 3.7: Квадрат
    public void square(int x) {
        for (int i = 0; i < x; i++) {  // Цикл по строкам
            for (int j = 0; j < x; j++) {  // Цикл по столбцам
                System.out.print('*');
            }
            System.out.println();  // Переход на новую строку
        }
    }

    // Задание 3.9: Правый треугольник
    public void rightTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < x - i; j++) {
                System.out.print(' '); // (x-i) пробелов
            }
            for (int j = 0; j < i; j++) {
                System.out.print('*'); // i звёзд
            }
            System.out.println();
        }
    }
    // Задание 4.1: Поиск первого вхождения
    public int findFirst(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    // Задание 4.3: Максимальный по модулю
    public int maxAbs(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(max)) {
                max = arr[i];
            }
        }
        return max;
    }

    // Задание 4.5: Вставка массива в массив
    public int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];
        System.arraycopy(arr, 0, result, 0, pos);
        System.arraycopy(ins, 0, result, pos, ins.length);
        System.arraycopy(arr, pos, result, pos + ins.length, arr.length - pos);
        return result;
    }

    // Задание 4.7: Возвратный реверс
    public int[] reverseBack(int[] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    // Задание 4.9: Все вхождения числа
    public int[] findAll(int[] arr, int x) {
        int count = 0;
        for (int num : arr) {
            if (num == x) count++;
        }

        int[] result = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[index++] = i;
            }
        }
        return result;
    }
}