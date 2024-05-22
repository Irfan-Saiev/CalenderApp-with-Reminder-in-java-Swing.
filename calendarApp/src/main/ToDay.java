/**
 *
 * @author Irfan Saiev
 */

package main;

// Class representing today's date
public class ToDay {

    // Attributes to store the day, month, and year
    private int day;
    private int month;
    private int year;

    // Constructor with parameters to initialize the attributes
    public ToDay(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Default constructor
    public ToDay() {
    }

    // Getter and setter methods for the day attribute
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    // Getter and setter methods for the month attribute
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    // Getter and setter methods for the year attribute
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Method to check if a given date is today's date
    public boolean isToDay(ToDay date) {
        return day == date.getDay() && month == date.getMonth() && year == date.getYear();
    }
}
