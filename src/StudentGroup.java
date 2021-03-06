import java.util.Date;
import java.lang.String;
/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		return this.students;
	}

	@Override
	public void setStudents(Student[] students) {
		this.students=students;
	}

	@Override
	public Student getStudent(int index) {
		return this.students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		this.students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		int a=this.students.length;
		for(int i=a;i>0;i--)
			this.students[i]=this.students[i-1];
		this.students[0]=student;
		this.students[a+1]=null;
	}

	@Override
	public void addLast(Student student) {
		int i=this.students.length;
		this.students[i]=student;
		this.students[i+1]=null;
	}

	@Override
	public void add(Student student, int index) {
		int i=this.students.length;
		for(int j=i;j>index;j--)
			this.students[j]=this.students[j-1];
		this.students[index]=student;
		this.students[i+1]=null;
	}

	@Override
	public void remove(int index) {
		this.students[index]=null;
	}

	@Override
	public void remove(Student student) {
		
	}

	@Override
	public void removeFromIndex(int index) {
		this.students[index]=null;
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		this.students[index]=null;
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		return null;
	}
}
