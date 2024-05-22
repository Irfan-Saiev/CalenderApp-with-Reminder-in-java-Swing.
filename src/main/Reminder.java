/**
 *
 * @author Irfan Saiev
 */

package main;

// Class representing a reminder
public class Reminder {
    // Instance variables
    private String title; // Title of the reminder
    private String description; // Description of the reminder
    private String date; // Date of the reminder

    // Constructor to initialize a reminder with title, description, and date
    public Reminder(String title, String description, String date) {
        this.title = title; // Set the title
        this.description = description; // Set the description
        this.date = date; // Set the date
    }

    // Setter method to set the title of the reminder
    public void setTitle(String title) {
        this.title = title; // Set the title
    }

    // Setter method to set the description of the reminder
    public void setDescription(String description) {
        this.description = description; // Set the description
    }

    // Setter method to set the date of the reminder
    public void setDate(String date) {
        this.date = date; // Set the date
    }

    // Getter method to get the title of the reminder
    public String getTitle() {
        return title; // Return the title
    }

    // Getter method to get the description of the reminder
    public String getDescription() {
        return description; // Return the description
    }

    // Getter method to get the date of the reminder
    public String getDate() {
        return date; // Return the date
    }

    // Override toString method to represent the reminder as a string
    @Override
    public String toString() {
        // Concatenate the title, description, and date and return as a string
        return title + description + date;
    }
}
