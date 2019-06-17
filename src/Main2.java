public class Main2 {
    public static void main(String[] args) {
        Human someHuman = new Student();
        whoAmI(someHuman);
        howOldIam(someHuman);


        someHuman = new Teacher();
        whoAmI(someHuman);
        howOldIam(someHuman);
    }

    public static void whoAmI(Human human) {
        human.greating();
    }

    public static void howOldIam(Human human) {
        human.howOldYou();
    }
}
