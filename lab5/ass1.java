package lab5;

class Student {
    int rollNo;
    String course;

    public void Register(String course){
        this.course=course;
        System.out.println("Student with roll number " + rollNo + " is registered for the course: " + course);
    }
}

class kiitian extends Student{
    public void hostelRequest(){
        System.out.println("hostel request for roll number " + rollNo);
    }
}

public class ass1 {
    public static void main (String args[]) {
        kiitian kiit = new kiitian();
        kiit.rollNo=2205885;
        kiit.Register("CSE");
        kiit.hostelRequest();   
    } 
}
