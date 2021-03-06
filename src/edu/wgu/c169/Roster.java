package edu.wgu.c169;

import java.util.ArrayList;

public class Roster {

    private static ArrayList<Student> roster;

    static {
        roster = new ArrayList<>();
        roster.add(new Student(1,"John","Smith","John1989@gmail.com",20,new Integer[]{88,79,59}));
        roster.add(new Student(2,"Suzan","Erickson","Erickson_1990@gmailcom",19,new Integer[]{91,72,85}));
        roster.add(new Student(3,"Jack","Napoli","The_lawyer99yahoo.com",19,new Integer[]{85,84,87}));
        roster.add(new Student(4,"Erin","Black","Erin.black@comcast.net",22,new Integer[]{91,98,82}));
        roster.add(new Student(5,"Alvaro","Escobar","alvaroescobaronline@gmail.com",45,new Integer[]{99,98,100}));

    }

    public static void remove(String studentID){
        //If the student ID doesn’t exist, the method should print an error message indicating that it is not found.
        boolean removed = false;
        for (Student currentStudent : Roster.roster) {
            //find a match
            if (currentStudent.getStudentID().equals(Integer.parseInt(studentID))) {
                if (Roster.roster.remove(currentStudent)) removed = true;
                else removed = false;
                break;
            }
        }
        if (removed) {
            System.out.println("Record removed for student with student ID " + studentID + ".");
        }
        else {
            System.out.println("No record was found for a student with student ID " + studentID + ".");
        }
    }

    public static void print_all(){
        //The print_all() method should loop through all the students in the student array list and call the print() method for each student.
        for (Student currentStudent : Roster.roster) {
            System.out.println(currentStudent.print());
        }
    }

    public static void print_average_grade(String studentID) {
        boolean found = false;
        for (Student currentStudent : Roster.roster) {
            //find a match
            if (currentStudent.getStudentID().equals(Integer.parseInt(studentID))) {
                //find the average grade
                double total = 0;
                for (Integer grade : currentStudent.getGrades()) {
                    total+=grade;
                }
                double avg = total/currentStudent.getGrades().length;
                //print the average grade
                System.out.print(currentStudent.getFirst_name()+"\t"+currentStudent.getLast_name()+"\t=\t");
                System.out.printf("%.1f",avg);
                System.out.println();
                found = true;

            }
        }
        if (!found) {
            System.out.println("No record was found for a student with student ID " + studentID + ".");
        }
    }

    public static void print_invalid_emails(){
        //A valid e-mail should include an at sign (“@”) and period (“.”) and doesn’t include a space.
        boolean found = false; // Keep track of if an invalid email address is found
        System.out.println("Invaild email addresses in the student roster:");
        for (Student currentStudent : Roster.roster){
            String currentEmail = currentStudent.getEmail();
            if (!currentEmail.contains("@") || !currentEmail.contains(".") || currentEmail.contains(" ")){
                found = true;
                System.out.printf("Student ID: %-5s Email: %-28s", currentStudent.getStudentID()
                        , currentEmail);
                System.out.println();
            }
        }
        if (!found) {// Print a message if no invalid email addresses are found{
            System.out.println("No invalid email addresses found.");
        }
    }

    public static void main (String[] args){
        print_all();
        print_invalid_emails();
        System.out.println("Average Grades for students in the roster:");
        //loop through the ArrayList and for each element:
        for (Student currentStudent : Roster.roster){
            print_average_grade(currentStudent.getStudentID().toString());
        }
        remove("3");
        //expected: this should print a message saying such a student with this ID was not found.
        remove("3");


    }
}
