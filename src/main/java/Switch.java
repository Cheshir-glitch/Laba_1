import java.time.LocalDate;

public class Switch {

    public static void translateDayOfWeekOld(String dayOfWeek) {
        switch (dayOfWeek) {
            case "MONDAY":
                System.out.println("Понедельник");
                break;
            case "TUESDAY":
                System.out.println("Вторник");
                break;
            case "WEDNESDAY":
                System.out.println("Среда");
                break;
            case "THURSDAY":
                System.out.println("Четверг");
                break;
            case "FRIDAY":
                System.out.println("Пятница");
                break;
            case "SATURDAY":
                System.out.println("Суббота");
                break;
            case "SUNDAY":
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Day of week not found, try again with today day of week");
                String displayName = LocalDate.now().getDayOfWeek().name();
                translateDayOfWeekOld(displayName);
        }
    }
}
