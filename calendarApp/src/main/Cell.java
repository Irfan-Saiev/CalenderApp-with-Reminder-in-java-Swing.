/**
 *
 * @author Irfan Saiev
 */

package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JLabel;

// Represents a cell in the calendar
public class Cell extends JButton {

    private Date date; // Date associated with the cell
    private boolean title; // Indicates if the cell is a title cell
    private boolean isToDay; // Indicates if the cell represents today's date

    // Constructor
    public Cell() {
        setContentAreaFilled(false); // Make the button transparent
        setBorder(null); // Remove border
        setHorizontalAlignment(JLabel.CENTER); // Center align text
    }

    // Set the cell as a title cell
    public void asTitle() {
        title = true;
    }

    // Check if the cell is a title cell
    public boolean isTitle() {
        return title;
    }

    // Set the date associated with the cell
    public void setDate(Date date) {
        this.date = date;
    }

    // Set the foreground color based on whether the cell belongs to the current month or not
    public void currentMonth(boolean act) {
        if (act) {
            setForeground(new Color(68, 68, 68)); // Active month color
        } else {
            setForeground(new Color(169, 169, 169)); // Inactive month color
        }
    }

    // Set the cell as representing today's date
    public void setAsToDay() {
        isToDay = true;
        setForeground(Color.WHITE); // Set foreground color to white
    }

    // Custom painting of the cell
    @Override
    protected void paintComponent(Graphics grphcs) {
        if (title) {
            // Draw a line at the bottom of the cell if it's a title cell
            grphcs.setColor(new Color(213, 213, 213));
            grphcs.drawLine(0, getHeight() - 1, getWidth(), getHeight() - 1);
        }
        if (isToDay) {
            // Draw a rounded rectangle to highlight today's date
            Graphics2D g2 = (Graphics2D) grphcs;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setColor(new Color(97, 49, 237)); // Today's highlight color
            int x = getWidth() / 2 - 17;
            int y = getHeight() / 2 - 17;
            g2.fillRoundRect(x, y, 35, 35, 100, 100);
        }
        super.paintComponent(grphcs); // Call superclass's paintComponent method
    }
}
