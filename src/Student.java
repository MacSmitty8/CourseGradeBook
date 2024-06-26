public class Student {
    String name;
    int ID;
    int grade;
    public Student(String studentName, int studentID, int studentGrade){
        name = studentName;
        ID = studentID;
        grade = studentGrade;
        //This strings the variables in the format that when outputted reads "Name,(ID), Grade".
    }
    public String getName(){
        return name;
        //This will return the name inputted in the Course class. Helpful for the listallStudents method.
    }
    public int getGrade(){
        return grade;
        //This class helps in the Course class when retrieving the grade for the findallabovegrade method.
    }


    @Override
    public String toString() {
        return name +" (" + ID + "): " + " " + grade;
    }
}
