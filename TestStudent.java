package collectionDemo;

class Student {

    private String name;
    private int rollNo;
    private float marks;

    // Default Constructor
    public Student() {}

    // Parameterized Constructor
    public Student(String name, int rollNo, float marks) {
        this.name = name;
        this.rollNo = rollNo;
        setMarks(marks);
    }

    public String getName() {
        return name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks! Must be between 0 and 100.");
        } else {
            this.marks = marks;
        }
    }

    public void display() {
        System.out.println("Name  : " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks : " + marks);
    }
}

// 👇 Main runnable class
public class TestStudent {
    public static void main(String[] args) {

        Student s1 = new Student("Leo", 101, 92.5f);
        s1.display();

        System.out.println();

        Student s2 = new Student("John", 102, 120f); // invalid marks
        s2.display();

        System.out.println();

        s2.setMarks(85);
        s2.display();
    }
}
