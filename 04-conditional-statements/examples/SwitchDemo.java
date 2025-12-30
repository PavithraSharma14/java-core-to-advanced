// Program: Print day name based on day number using switch statement
public class SwitchDemo {
    public static void main(String[] args) {

        int day = 3;   // 1 - 7
        String dayName;

        // switch checks matching case
        switch (day) {
            case 1:
                dayName = "Monday";
                break;  // stop after match
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                // runs when none of the cases match
                dayName = "Invalid day";
        }

        System.out.println("Day: " + dayName);
    }
}

