import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Initializes student objects:
        Student s1 = new Student(4.0, 45, "John", "Doe");
        Student s2 = new Student(3.95, 35, "Bob", "Doe");
        Student s3 = new Student(4.0, 41, "Mike", "Smith");
        Student s4 = new Student(4.0, 33, "Tom", "Smith");
        Student s5 = new Student(3.98, 62, "Sam", "Brown");
        Student s6 = new Student(3.92, 100, "Stacy", "Miller");
        Student s7 = new Student(3.89, 37, "Jake", "Davis");
        Student s8 = new Student(4.0, 90, "Abby", "Smith");
        Student s9 = new Student(3.79, 75, "Tyler", "Tailor");
        Student s10 = new Student(3.96, 100, "Daby", "Waby");

        //Sets values in the roster:
        Student[] roster = new Student[10];
        roster[0] = s1;
        roster[1] = s2;
        roster[2] = s3;
        roster[3] = s4;
        roster[4] = s5;
        roster[5] = s6;
        roster[6] = s7;
        roster[7] = s8;
        roster[8] = s9;
        roster[9] = s10;

        //Creates a new array to test GPA sort:
        Student[] gpaRoster = new Student[10];
        for (int i = 0; i < roster.length; i++) {
            gpaRoster[i] = roster[i];
        }

        //Sorts and prints GPA roster array:
        gpaRoster = sortGPA(gpaRoster);
        printRoster(gpaRoster);

        //Creates a new array to test name sort:
        Student[] nameRoster = new Student[10];
        for (int i = 0; i < roster.length; i++) {
            nameRoster[i] = roster[i];
        }

        //Sorts and prints name roster array:
        nameRoster = sortName(nameRoster);
        printRoster(nameRoster);
    }

    //Prints a roster:
    public static void printRoster(Student[] roster) {
        for (Student s : roster) {
            s.toString();
            System.out.println("-----------------------");
        }
    }

    //Sorts the roster by GPA (selection sort);
    public static Student[] sortGPA(Student[] roster) {
        for (int i = 0; i < roster.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < roster.length; j++) {
                if (roster[j].getGpa() > roster[index].getGpa()) {
                    index = j;
                }
                if (roster[j].getGpa() == roster[index].getGpa()) {
                    if (roster[j].getCreditHrs() > roster[index].getCreditHrs()) {
                        index = j;
                    }
                }
            }
            Student min = roster[index];
            roster[index] = roster[i];
            roster[i] = min;
        }

        return roster;
    }

    //Sorts the roster lexicographically ascending by name (selection sort):
    //str1.compareTo(str2) < 0 = str1 is before str2
    //str1.compareTo(str2) = 0 = str1 is str2
    //str1.compareTo(str2) > 0 = str1 is after str2
    public static Student[] sortName(Student[] roster) {
        for (int i = 0; i < roster.length; i++) {
            int index = i;
            for (int j = i + 1; j < roster.length; j++) {
                if (roster[j].getName().compareTo(roster[index].getName()) < 0) {
                    index = j;
                }
            }
            Student min = roster[index];
            roster[index] = roster[i];
            roster[i] = min;
        }

        return roster;
    }
}
