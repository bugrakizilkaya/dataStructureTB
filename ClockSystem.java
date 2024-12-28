import java.util.Scanner;

public class AhmetHasanCelikClockSystem {
    private final AhmetHasanCelikCircularList twelveHourClock = new AhmetHasanCelikCircularList();
    private final AhmetHasanCelikCircularList twentyFourHourClock = new AhmetHasanCelikCircularList();
    private AhmetHasanCelikNode current;
    private int alarm = -1;

    public AhmetHasanCelikClockSystem() {
        twelveHourClock.initialize(12);
        twentyFourHourClock.initialize(24);
    }

    // Select the clock type
    public void selectClock(int type) {
        current = (type == 12) ? twelveHourClock.getHead() : twentyFourHourClock.getHead();
    }

    // Shift the clock by one hour
    public void shiftHour() {
        System.out.println("Shifting the time one hour ahead");
        current = current.next;
    }

    // Set an alarm
    public void setAlarm(int alarmHour) {
        alarm = alarmHour;
        System.out.println("The Alarm is set for the hour of " + alarmHour);
    }

    // Start clock traversal
    public void startClock() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("the hour is " + current.hour);

            if (current.hour == alarm) {
                System.out.println("Alarm is ringing please text Stop alarm to continue forward.");
                alarm = -1; // Reset alarm
                while (!scanner.nextLine().equalsIgnoreCase("Stop alarm")) {
                    System.out.println("Alarm is ringing..");
                }
            }

            try {
                Thread.sleep(1000); // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            current = current.next;

            System.out.println("Please text Stop to close the clock or press Enter to go forward");
            if (scanner.nextLine().equalsIgnoreCase("Stop")) {
                System.out.println("Clock is stopped.");
                break;
            }
        }
    }
}
