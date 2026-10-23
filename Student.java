public class Student {

    //Seven attribute of Student
    private String name;
    private String iD;
    private int age;
    private String course;
    private String email;
    private double cGPA;
    private int yearsOfStudy;

    //Constructor
    public Student() {
        name = "Unknown";
        iD = "Unknown";
        age = 0;
        course = "Unknown";
        email = "Unknown";
        cGPA = 0.0;
        yearsOfStudy = 0;
    }

    //Paracentesis constructor
    public Student(String name,String iD, int age, String course, String email, double cGPA, int yearsOfStudy) {
        this.name = name;
        this.iD = iD;
        this.age = age;
        this.course = course;
        this.email = email;
        this.cGPA = cGPA;
        this.yearsOfStudy = yearsOfStudy;
    }

    //All the getter for all attributes
    public String getName() {
        return name;}
    public String getiD() {
        return iD;}
    public int getAge() {
        return age;}
    public String getCourse() {
        return course;}
    public String getEmail() {
        return email;}
    public double getcGPA() {
        return cGPA;}
    public int getYearsOfStudy() {
        return yearsOfStudy;}

    // All the setter for all attributes
    public void setName(String name) {
        this.name = name;}
    public void setID(String iD) {
        this.iD = iD;}
    public void setAge(int age) {
        this.age = age;}
    public void setCourse(String course) {
        this.course = course;}
    public void setEmail(String email) {
        this.email = email;}
    public void setCGPA(double cGPA) {
        this.cGPA = cGPA;}
    public void setYearsOfStudy(int yearsOfStudy) {
        this.yearsOfStudy = yearsOfStudy;}
}