public class Person {
    public static final String MALE = "мужской";

    private String name;
    private int age;
    private String sex;
    private String country;
    private String city;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public Person(String name, int age, String sex, String country, String city) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.country = country;
        this.city = city;


    }

    @Override
    public String toString() {
        return "Person " +
                "name: " + name +
                " age: " + age +
                " sex: " + sex +
                " country: " + country +
                " city: " + city + "\n";
    }

}


