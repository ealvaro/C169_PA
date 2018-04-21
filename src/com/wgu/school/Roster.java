package com.wgu.school;

import java.util.ArrayList;

public class Roster {

    private static ArrayList<Student> roster;

    static {
        roster = new ArrayList();
        roster.add(new Student(1,"John","Smith","John1989@gmail.com",20,new Integer[]{88,79,59}));
        roster.add(new Student(2,"Suzan","Erickson","JErickson_1990@gmailcom",19,new Integer[]{91,72,85}));
        roster.add(new Student(3,"Jack","Napoli","The_lawyer99yahoo.com",19,new Integer[]{85,84,87}));
        roster.add(new Student(4,"Erin","Black","Erin.black@comcast.net",22,new Integer[]{91,98,82}));
        roster.add(new Student(5,"Alvaro","Escobar","alvaroescobaronline@gmail.com",45,new Integer[]{99,98,100}));

    }

    public static void remove(String studentID){
        //If the student ID doesn’t exist, the method should print an error message indicating that it is not found.

    }

    public static void print_all(){
        //Tabs can be formatted as such: 1 [tab] First Name: John [tab] Last Name: Smith [tab] Age: 20 [tab] Grades: {88, 79, 59}

    }

    public static void print_average_grade(String studentID) {
        boolean found = false;
        for (Student aRoster : Roster.roster) {

            //find a match

            if (aRoster.getStudentID().equals(Integer.parseInt(studentID))) {

                //find the average grade

                //print the average grade
                found = true;

            }

        }

        if (!found) {
            System.out.println("No record was found for a student with student ID " + studentID + ".");
        }

    }

    public static void print_invalid_emails(){
        //A valid e-mail should include an at sign (“@”) and period (“.”) and doesn’t include a space.
    }

    public static void main (String[] args){

        for (int i = 0; i < Roster.roster.size(); i++) {
//            System.out.println(Roster.roster.size());
//            printAverageGrade(Roster.roster.get(i).getstudentID());

        }
    }
}
