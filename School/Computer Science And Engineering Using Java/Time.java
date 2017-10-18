package Time;
/**
 *
 * @author keith_000
 */
public class Time {
    public static void main (String[] args) {
        int hour, minute, second, timeinsec, percentage;
        hour = 18;
        minute = 49;
        second = 20;
        timeinsec = hour*3600 + minute*60 + second;
        percentage = (hour*100) / 24;
        System.out.print("Number of Minutes since Midnight:");
        System.out.println(hour*60 + minute);
        System.out.print("Percentage of the Hour that has Passed:");
        System.out.println(minute*100/60);
        System.out.print("Number of Seconds since Midnight:");
        System.out.println(timeinsec);
        System.out.print("Seconds Remaining in the Day:");
        System.out.println(86400 - timeinsec);
        System.out.print("Percentage of the Day Remaining:");
        System.out.println(percentage);
    }
}
