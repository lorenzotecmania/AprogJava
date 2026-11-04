import java.util.Scanner;

public class W6ExB {

    static Scanner sc = new Scanner(System.in);

//    B - Ranking chart
//    Write a program to display, in the form of bar graph, the number of students in a class that scored "Approved" and "Failed" on a set of subjects.
//    The program should start by asking the number of students in the class and the number of subjects and, for each subject will ask
//    the name of the subject and the number of students with approval.
//
//    Implement a module to print information about a subject.
//
//    The output should look like this:
//
//    Subject: Portuguese
//    - Approved: ******
//    - Failed: ****
//    Subject: Math
//    - Approved: *******
//    - Failed: ***

    static final char MARK_SYMBOL = '*';

    public static void printSubjectInfo(String subjectName,int numberOfStudents,int numberOfStudentsApproved){
        StringBuilder approvedSb = new StringBuilder();
        StringBuilder failedSb = new StringBuilder();
        int numberOfStudentsFailed = numberOfStudents - numberOfStudentsApproved;

        for (int i = numberOfStudentsApproved; i > 0; i--) approvedSb.append(MARK_SYMBOL);
        for (int i = numberOfStudentsFailed; i > 0; i--) failedSb.append(MARK_SYMBOL);

        System.out.printf("Subject: %s%n- Approved: %s%n- Failed: %s%n", subjectName,approvedSb,failedSb);
    }

    public static void main(String[] args){

        int numberOfStudents = sc.nextInt();
        int numberOfSubjects = sc.nextInt();
        for (int outputCount = 0; outputCount < numberOfSubjects; outputCount++){
            String subjectName = sc.next();
            int numberOfStudentsApproved = sc.nextInt();
            printSubjectInfo(subjectName,numberOfStudents,numberOfStudentsApproved);

        }



    }
}
