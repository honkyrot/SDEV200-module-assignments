// 9/5/2025
// hong rot
// sdev200
// MODULE 2, ASSIGNMENT 1

package module_2_assignment_1;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public static void main(String[] args) {
        // create three MyDate objects
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(34355555133101L);

        // display their year, month, and day
        System.out.printf("date1: %d/%d/%d%n", date1.getYear(), date1.getMonth(), date1.getDay());
        System.out.printf("date2: %d/%d/%d%n", date2.getYear(), date2.getMonth(), date2.getDay());
    }

    // default 
    public MyDate() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        this.year = calendar.get(java.util.Calendar.YEAR);
        this.month = calendar.get(java.util.Calendar.MONTH) + 1; // months are 0-based
        this.day = calendar.get(java.util.Calendar.DAY_OF_MONTH);
    }

    // sets the specified elapsed time since epoch
    public MyDate(long elapsed_time) {
        setDate(elapsed_time);
    }

    // constructs with year month and day
    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    // method to set a new date for the object using the elapsed time
    public void setDate(long elapsed_time) {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTimeInMillis(elapsed_time);
        this.year = calendar.get(java.util.Calendar.YEAR);
        this.month = calendar.get(java.util.Calendar.MONTH) + 1; // months are 0-based
        this.day = calendar.get(java.util.Calendar.DAY_OF_MONTH);
    }

    // getterrs
    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}