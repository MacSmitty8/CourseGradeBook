import java.util.Scanner;
public class MainMenu {
    public static void main(String[] args) {
        Course cu = new Course();
        Scanner sc = new Scanner(System.in);
        int option = 0;
        while (option != 5) {
            System.out.println("Menu:");
            System.out.println("1) Add a student");
            System.out.println("2) List all Students");
            System.out.println("3) Find Student by name");
            System.out.println("4) Find all students above grade");
            System.out.println("5) Quit");
            if (!sc.hasNextInt()) {
                System.out.println("Error, this not a number between 1-5, please try again.");
                return;
            }
            option = sc.nextInt();
                //This will give the user a menu to pick an option. The user has to pick between 1-5 to do tasks or quit.
                if (option == 1) {
                    System.out.println("Enter Student Name.");
                    if (!sc.hasNextLine()) {
                        System.out.println("This is not a students name.");
                        return;
                    }
                    sc.nextLine();
                    //This will take in the students name, and record it.
                    String listofStudents = sc.nextLine();
                    //This will capture the students name into a string.
                    System.out.println("Enter Student ID.");
                    if (!sc.hasNextInt()) {
                        System.out.println("Error. This is not a ID Number");
                        return;
                    }// Makes sure that the input is a number and not a letter.

                        int studentID = sc.nextInt();
                        //Takes in the integer of a student ID and adds that to the string student name and ID
                        System.out.println("Enter Student Grade.");
                        if (!sc.hasNextInt()) {
                            System.out.println("Error. This is not a Grade Number.");
                            return;
                        }
                        int studentGrade = sc.nextInt();
                        System.out.println(listofStudents);
                        Student pr = new Student(listofStudents, studentID, studentGrade);
                        cu.Add(pr);
                        System.out.println("Okay! " + pr + " Is added to the course!");
                    }
                    if (option == 2) {
                        cu.numberedList();
                        //This will output all students entered in the list.
                    }
                    if (option == 3) {
                        System.out.println("Enter Student name.");
                        sc.nextLine();
                        String identifyer = sc.nextLine();
                        cu.findStudentByName(identifyer);
                        //With this choice, inputting a students name will result their name, id, and grade being outputted. As long as the user adds them to the list.
                    }
                    if (option == 4) {
                        System.out.println("Enter a Grade");
                        if (!sc.hasNextInt()) {
                            System.out.println("Error. This is not a Grade Number.");
                            return;
                        } //Makes sure that the input only takes a number.
                        int grade = sc.nextInt();
                        cu.findAllStudentAboveGrade(grade);
                        //When selecting this option, a user will be able to input an a grade and find the students in the list that are above the inputted grade.
                    }
                    if (option == 5){
                        System.out.println("Thanks for using this program. Goodbye!");
                    }
                    //This option ends the program.
                    if (option > 5 || option < 1){
                        System.out.println("Please input only numbers 1-5 to access functions of the menu.");
                        //This option select will tell users that they need to pick an option between 1-5 to use the menu.
                    }

                }
            }
        }





