import java.util.Scanner;

public class AhmetHasanCelikMain {
    public static void main(String[] args) {
        AhmetHasanCelikClockSystem clockSystem = new AhmetHasanCelikClockSystem();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please choose which clock to use twelve or twenty-four: ");
        int clockChoice = scanner.nextInt();
        clockSystem.selectClock(clockChoice);


        System.out.println("Would you like to shift the clock for daylight saving? Please text yes or no ");
        if (scanner.next().equalsIgnoreCase("yes")) {
            clockSystem.shiftHour();
        }


        System.out.println("Would you like to set an alarm? Please text yes or no");
        if (scanner.next().equalsIgnoreCase("yes")) {
            System.out.println("Please enter it.");
            int alarmHour = scanner.nextInt();
            clockSystem.setAlarm(alarmHour);
        }


        System.out.println("Running the clock..");
        clockSystem.startClock();
    }
}
