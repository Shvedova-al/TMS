public class User {
    private String name;
    private String surname;
    private int age;
    private String sex;

    public User(String name, String surname, int age, String sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        System.out.println(name + " " + surname);

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
            System.out.println("Измененный возраст:" + age);
        } else {
            System.out.println("Измененный возраст: недопустимое значение.");
        }
    }


    @Override
    public String toString() {
        return "User " + '\n' +
                "имя: " + name + '\n' +
                "фамилия: " + surname + '\n' +
                "пол: " + sex + '\n' +
                "установленный возраст: " + getAge();

    }
}