import java.time.LocalDate;

public class Switch {

    public static void translateDayOfWeek(String dayOfWeek) {
        switch (dayOfWeek) {
            case "MONDAY" -> System.out.println("Понедельник");
            case "TUESDAY" -> System.out.println("Вторник");
            case "WEDNESDAY" -> System.out.println("Среда");
            case "THURSDAY" -> System.out.println("Четверг");
            case "FRIDAY" -> System.out.println("Пятница");
            case "SATURDAY" -> System.out.println("Суббота");
            case "SUNDAY" -> System.out.println("Воскресенье");
            default -> {
                System.out.println("Day of week not found, try again with today day of week");
                String displayName = LocalDate.now().getDayOfWeek().name();
                translateDayOfWeek(displayName);
            }
        }
    }
}
