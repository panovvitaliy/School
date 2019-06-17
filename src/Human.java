public class Human {
    String name = "Dima";
    int age = 25;


    public void howOldYou() {
        System.out.println(age);
    }

    public void greating() {
        System.out.println("Hi! I am human.");
    }

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
        this.age = age;
    }
}
