package homework;

/* N1.
Дано натуральное число n. Выведите все числа от 1 до n.
Иными словами, метод должен принимать натуральное число и выводить числа от 1 до это числа.
Например, для параметра 6 -> выведет 1 2 3 4 5 6
   N2.
Дано слово, состоящее только из строчных латинских букв. Проверьте, является ли это слово палиндромом.
Выведите yes, если является и no - если не является.
P.S. Палиндром - это слово, которое одинаково читается слева направо, например: око, потоп.
 */
public class Main {
    public static void main(String[] args) {
        numbers(6);
        System.out.println("===================");
        numbers2(6);

        System.out.println("-------------2 Task-------------");

        System.out.println(palindrom("pip"));  // yes
        System.out.println(palindrom("epope"));  // yes
        System.out.println(palindrom("erope")); // no
        System.out.println(palindrom("e"));  // yes
        System.out.println(palindrom("dd")); // yes
        System.out.println(palindrom("dr"));  // no

    }

    // мое решение
    public static void numbers(int number) {
        if (number > 0 | number == 6) {
            numbers(number - 1);
            System.out.println(number);
        } else {
            System.out.println(6 + "->");
        }
    }

    // решение в классе
    public static void numbers2(int number) {
        // базовый случай
        if (number == 1) {
            System.out.println(1);
        } else {
            numbers2(number - 1);
            System.out.println(number);
        }
    }

    // Task 2
    public static String palindrom(String word) {
        if (word.isEmpty() || word.length() == 1) {   // базовый случай
            return "yes";
        }
        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            return palindrom(word.substring(1, word.length() - 1)); // если совпали КАЙНИЕ СИМВОЛЫ СЛОВА
        } else {
            // крайние символы не совпали
            return "no";
        }
    }

}