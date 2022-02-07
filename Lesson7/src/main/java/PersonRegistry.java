public class PersonRegistry {
    private Person[] citizens;

    public PersonRegistry(Person[] citizens) {
        this.citizens = citizens;
    }

    public Person[] findByAge(int age1, int age2, String sex) {
        Person[] result = new Person[citizens.length];
        for (int i = 0; i < citizens.length; i++) {
            Person person = citizens[i];
            if (person.getAge() >= age1 && person.getAge() <= age2 && person.getSex() == "мужской") {
                result[i] = person;
            }
        }
        return result;
    }

    public Person[] findByAddress(String country, String city) {

        Person[] result = new Person[citizens.length];
        for (int i = 0; i < citizens.length; i++) {
            Person person = citizens[i];
            if (person.getCountry() != null && person.getCountry().equals(country) && (person.getCity() != null && person.getCity().equals(city))) {
                result[i] = person;
            }
        }
        return result;
    }

    public Person[] findByName(String name) {
        Person[] result = new Person[citizens.length];
        for (int i = 0; i < citizens.length; i++) {
            Person person = citizens[i];
            if (person.getName() == name) {
                result[i] = person;
            }
        }
        return result;

    }

}