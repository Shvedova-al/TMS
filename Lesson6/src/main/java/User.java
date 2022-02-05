public class User {
    private String name;
    private String surname;
    private int age;
    private String sex;

    public User(String name) {
        this(27);
        this.name = name;

    }

    public User(int age) {
        this.age = age;
    }


    public User(String name, String surname, int age, String sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;


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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
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