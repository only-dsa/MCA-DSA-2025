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
