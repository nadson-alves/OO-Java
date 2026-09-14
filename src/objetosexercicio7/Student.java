package objetosexercicio7;

public class Student {

    private String name;
    private double grade1;
    private double grade2;
    private double grade3;
    private double grade4;

    public Student(String name, double grade1, double grade2, double grade3, double grade4) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
    }

    public String getName() {
        return name;
    }

    public double getGrade1() {
        return grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public double getGrade3() {
        return grade3;
    }

    public double getGrade4() {
        return grade4;
    }
}