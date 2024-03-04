package 객체지향기본;

public class ObjectEx {
    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student();
        Student std3 = new Student("올라잇","내마음속");
//        std1.studentName ="박상";
//        std1.address = "경기도 안산";
//        std2.studentName ="장성엽";
//        std2.address = "더메이커짐";
        std1.setStudentName("박상원");
        std1.setAddress("경기도 안산");
        std2.setStudentName("장성엽");
        std2.setAddress("더메이커짐");
        std1.stdInfo();
        std2.stdInfo();
        std3.stdInfo();
    }
}

// 아무 접근제한자가 안써있으면 default
class Student{

    //인스턴스 필드
    private int studentID;
    private String studentName;
    private int grade;
    private String address;

    Student(){

    }

    Student(String name, String address){
        this.studentName = name;
        this.address = address;
    }
    //인스턴스 메소드
    public void stdInfo(){
        System.out.println(studentName+","+address);
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
