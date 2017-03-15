////////////////////////////////////////////////////////////////////////////////

// Title:            Reservations
// Files:            (list of source files)
// Semester:         COP3337 Fall 2015
//
// Author:           1657691
// Lecturer's Name:  Cristy Charters
//
// Implementing Linked list and queue 
//
////////////////////////////////////////////////////////////////////////////////

package finalproject;

/**
 * Used to find an identical Appointment
 * @author Ronny
 */
public class ByAllFieldsComp implements MyComparator{
    @Override
    public int meetCondition(Appointment anApp1,Appointment anApp2){
        return anApp1.compareTo(anApp2);
    }
}
