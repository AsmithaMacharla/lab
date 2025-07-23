public class Student {
    String name;
    String rollNo;
    String department;
    String subject;

    Student(String name, String rollNo, String department, String subject) {
        this.name = name;
        this.rollNo = rollNo;
        this.department = department;
        this.subject = subject;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Department: " + department);
        System.out.println("Subject: " + subject);
    }

    public static void main(String[] args) {
        Student s = new Student("Asmitha", "245122748019", "AIML", "Java");
        s.displayDetails();
    }
}

