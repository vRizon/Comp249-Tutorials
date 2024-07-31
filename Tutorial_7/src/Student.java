public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private String grade;

    public Student(String firstName, String lastName, String id, String grade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.grade = grade;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public String getGrade() {
        return grade;
    }

    public void printStudent(){
        System.out.println("Name: " + this.firstName + " " + this.lastName + " ID: " + this.id + " Grade: " +this.grade);
    }
}
