public class Main {

    public static void main(String[] args) {

        Human human = new Human();
        Student student = new Student();
        Teacher techer = new Teacher();
        human.greating();
        techer.greating();
        student.greating();

        human.howOldYou();
        student.howOldYou();
        techer.howOldYou();

    }
}
