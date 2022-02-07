import java.util.Arrays;

public class MilitaryOffice {


    public static void main(String[] args) {

        Person maria = new Person("Мария", 27, "женский", "Россия", "Москва");
        Person nikita = new Person("Никита", 27, "мужской", "Беларусь", "Витебск");
        Person dmitriy = new Person("Дмитрий", 34, "мужской", "Беларусь", "Минск");
        Person alexandr = new Person("Александр", 26, "мужской", "Беларусь", "Минск");
        Person olga = new Person("Ольга", 25, "женский", "Беларусь", "Минск");
        Person denis = new Person("Денис", 25, "мужской", "Беларусь", "Гродно");


        Person[] citizens = new Person[]{maria, nikita, dmitriy, alexandr, olga, denis};

        PersonRegistry registry = new PersonRegistry(citizens);
        //Task a

        System.out.println(Arrays.toString(registry.findByAge(18, 27, "мужской")));
        //Task б

        System.out.println(Arrays.toString(registry.findByAddress("Беларусь", "Минск")));

        //Task в
        System.out.println(Arrays.toString(registry.findByAge(25, 27, "мужской")));

        //Task г
        System.out.println(Arrays.toString(registry.findByName("Александр")));
    }
}



