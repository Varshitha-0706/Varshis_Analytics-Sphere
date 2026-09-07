package varshi;

import java.time.LocalTime;

public class TimebasedGreeting {

    public static void main(String[] args) {
        LocalTime l = LocalTime.now(); // localTime type
        /*
         * LocalTime.now(): This gets the current system time.
         * currentTime.getHour(): Extracts the hour from the current time
         */
        /*
         * This is because you're fetching the time once when the program is executed,
         * and it doesn't continuously update as time passes.
         * The values for hour, minute, and second are only fetched at that single
         * moment when LocalTime.now()
         * is called, and they will not update while the program is running
         * unless you explicitly add code to refresh the time periodically..
         * 
         * 
         * /* To have the program display updated seconds at runtime,
         * you would need to add a loop that repeatedly fetches the current time at
         * short intervals
         * (such as every second)and updates the displayed values accordingly..
         */
        int hour = l.getHour();
        System.out.println("Hour:" + hour);
        int minute = l.getMinute();
        System.out.println("Minute:" + minute);
        int s = l.getSecond();
        System.out.println("Seconds:" + s);
        if (hour >= 5 && hour < 12) {
            System.out.println("Good Morning");
        } else if (hour >= 12 && hour < 17) {
            System.out.println("Good Afternoon");
        } else if (hour >= 17 && hour < 21) {
            System.out.println("Good Evening");
        } else {
            System.out.println("Good Night!");
        }

        // Sleep for 1 second (1000 milliseconds) to update the time..
        try {
            Thread.sleep(100000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*
     * Infinite loop: The program runs inside an infinite while(true)
     * loop to continually fetch and display the current time.
     */
    /*
     * Thread.sleep(1000): This pauses the program for 1 second before the next
     * iteration.
     * The value is in milliseconds, so 1000 milliseconds equals 1 second
     */
}
