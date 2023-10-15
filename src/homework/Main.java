package homework;

/*
Дано натуральное число n. Выведите все числа от 1 до n.
Иными словами, метод должен принимать натуральное число и выводить числа от 1 до это числа.
Например, для параметра 6 -> выведет 1 2 3 4 5 6
 */
public class Main {
    public static void main(String[] args) {
        numbers(6);
    }

    public static void numbers(int number) {
        if (number > 0 | number == 6) {
            numbers(number - 1);
            System.out.println(number);
        } else {
            System.out.println(6 + "->");
        }
    }
}