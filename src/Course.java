import java.util.ArrayList;

public class Course {

    private ArrayList<Student> listAllStudents;

    public Course(){
       listAllStudents = new ArrayList<Student>();
        //Adds components student name, id, and grade to an array list.
    }
    public void Add(Student st){
        listAllStudents.add(st);
    }
    //Makes a list that will add and hold a students name, id and grade.
    public void numberedList() {
        boolean look = true;
        for (int i = 0; i < listAllStudents.size(); i++) {
            look = false;
            System.out.println(listAllStudents.get(i));
        }
     if(look){
         System.out.println("There are no students in the list.");
     } //Looks to see if there is any students in the list.
        //This will print students added into the arraylist, if any.
        }
        // use i for loop, I goes to 0 to size. use i.
    public void findStudentByName(String nickname){
        boolean check = true;
        for(int i = 0; i <listAllStudents.size(); i++) {
            if (nickname.equals(listAllStudents.get(i).getName())) {
                check = false;
                System.out.println(listAllStudents.get(i));
            } //This checks to see if there are any students in the list that match with the inputted name.
        }
        if(check){
            System.out.println("There are no students that meets this requirement.");
        } //If there are no matching students, this message will appear on the console.
            }

    public void findAllStudentAboveGrade(int gpa) {
        boolean test = true;
        for(int i = 0; i <listAllStudents.size(); i++){
            if(gpa < listAllStudents.get(i).getGrade()) {
                test = false;
                System.out.println(listAllStudents.get(i));
            }
            if(test){
                System.out.println("There are no students with this grade.");
            }
        }
    }
    }
    //make a method in the course class that takes in a student, and adds it to the array list: ListAllStudents.

