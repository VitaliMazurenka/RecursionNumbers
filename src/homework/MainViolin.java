package homework;

import java.util.List;

/*
// Задание 3 Varargs
//Создайте класс скрипка. Пусть у скрипки будут поля:
//
//String имя мастера, LocalDate дата производства Создайте в Майне метод, который должен
ринимать произвольное число скрипок и возвращать имя мастера
самой старой скрипки из переданных. То есть метод должен бытия статическим и возвращать String.
 */
public class MainViolin {
    public static void main(String[] args) {

        String master = getMasterOfOldest(
                new Violin("Stradivari", "1660-10-10"),
                new Violin("Orlov", "1938-10-10")
        );
        System.out.println(master);
    }

    public static String getMasterOfOldest(Violin... violins) {
        if (violins.length == 0) return null;
        Violin oldestViolin = violins[0];
        // brute force
        for (Violin violin : violins) {
            if (oldestViolin.getDateOfManufacture()
                    .isAfter(violin.getDateOfManufacture())) {
                oldestViolin = violin;

            }
        }
        return oldestViolin.getMasterName();

    }
}
