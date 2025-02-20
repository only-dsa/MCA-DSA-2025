// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNWAAAAAAAAB0M3lPSNdqbbSKwLYZYKKAg?e=S9ZWhy

public class MCA {

    String name = "";
    static int classRollNo = 0;
    int studentRollNo = 0;
    MCA(String n) {
        name = n;
        this.classRollNo++;
        this.studentRollNo = classRollNo;
    }

    int getTotalStudents() {
        return classRollNo;
    }

    public static void main(String[] args) {
        MCA student1 = new MCA("Atul");
        System.out.println(MCA.classRollNo);
        MCA student2 = new MCA("Atul");
        System.out.println(MCA.classRollNo);
        System.out.println(student1.studentRollNo+"  "+student1.name);
        System.out.println(student2.studentRollNo+"  "+student2.name);
    }
    
}
