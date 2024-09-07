
package lecture.pkg8;

public class Student extends Lecture8 {

    public Student(int ID, String name) {
        super(ID, name);
    }
    public static void main(String[] args) {
     Lecture8 student1 = new Student(1,"Nam");
     Lecture8 student2 = new Student(2,"Lam");  
     student1.displayinformation();
     student2.displayinformation();
    }

}


    