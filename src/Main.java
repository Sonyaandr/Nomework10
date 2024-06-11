public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanivich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        System.out.println("Задание 2");
        System.out.println("Данные Ф.И.О. сотрудника для заполнения отчета - " + fullName.toUpperCase());

        System.out.println("Задание 3");
        String firstName3 = "Иванов";
        String middleName3 = "Семён";
        String lastName3 = "Семёнович";
        String fullName3 = firstName3 + " " + middleName3 + " " + lastName3;
        String fullName3True = fullName3.replace("ё", "е");
        System.out.println("Данные Ф.И.О. сотрудника - " + fullName3True);

    }
}