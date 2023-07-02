package encapsulation;

public class Student {
private int rollNumber;
 private String name;
private boolean isAttendedd;

public Student(int rollNumber) {
	this.rollNumber=rollNumber;
}

public void setStudentAttendence(boolean flag) {
	if (isAttendedd) {
		isAttendedd=flag;
	}
	isAttendedd=flag;
	System.out.println("teacher asssigned attendence to student");
	
}
public boolean getstudentAttendence() {
	
	System.out.println("teacher accesed student attendence ");
	return isAttendedd;
}

}
