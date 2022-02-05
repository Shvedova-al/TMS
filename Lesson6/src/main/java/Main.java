public class Main {
    public static void main(String[] args) {
        User user = new User("Петя", "Иванов", 27, "мужской");
        System.out.println(user.getName() + " " + user.getSurname());
        System.out.println(user);
        user.setAge(28);

    }
}
