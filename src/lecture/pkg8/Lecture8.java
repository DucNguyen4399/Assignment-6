
package lecture.pkg8;

public class Lecture8 {
    int ID;
    String name;
    public Lecture8(int ID,String name){
        this.ID = ID;
        this.name = name;
    }
    void displayinformation() {
        System.out.println("ID:" + ID+",Name:"+name);
    }
    public static void main(String[] args) {
     Lecture8 student1 = new Student(1,"Nam");
     Lecture8 student2 = new Student(2,"Lam");  
     student1.displayinformation();
     student2.displayinformation();
    }
}   
    
