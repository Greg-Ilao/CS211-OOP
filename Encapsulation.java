class Student {
    private String name;     
    private int age;

    
    public String getName() {
        return name;
    }

    
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

   
    public void setAge(int age) {
        if (age > 0) {        // validation
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Alice");  // using setter
        s.setAge(20);        // using setter

        System.out.println(s.getName()); // using getter
        System.out.println(s.getAge());
    }
}
