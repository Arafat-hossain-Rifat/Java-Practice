package ZpracticeHackerRank;
import java.util.Calendar;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class DayFromDate {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Enter Month:");
            int month = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter Day:");
            int day = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Enter Year:");
            int year = Integer.parseInt(bufferedReader.readLine());

            String res = findDay(month, day, year);

            System.out.println("Day of the week: " + res);
        } catch (NumberFormatException | IOException e) {
            System.out.println("Invalid input format. Please enter valid integers for month, day, and year.");
        } finally {
            bufferedReader.close();
        }
    }

    public static String findDay(int month, int day, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day); // Month is 0-based in Calendar

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

        String[] daysOfWeek = new String[]{"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};

        // Adjust index to account for zero-based indexing in Java
        return daysOfWeek[dayOfWeek - Calendar.SUNDAY];
    }
}
