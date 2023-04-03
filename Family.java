public class Family extends Person {

    public Family(String personName, String personSurname, Integer personAge, String personSex){
        super(personName, personSurname, personAge, personSex);
    }

    static Person person1 = new Person("Иван", "Лебедев", 57, "мужской");
    static Person person2 = new Person("Тарас", "Лебедев", 32, "мужской");
    static Person person3 = new Person("Антон", "Лебедев", 18, "мужской");
    static Person person4 = new Person("Аня", "Мальская", 30, "женский");
    static Person person5 = new Person("Нина", "Тольская", 60, "мужской");

    public static void getFamily(Person Person) {
        if (Person.hashCode() == person1.hashCode()){
            System.out.println("Жена: " + person5);
            System.out.println("Ребёнок: " + person2);
        }
        if (Person.hashCode() == person5.hashCode()){
            System.out.println("Супруг: " + person1);
            System.out.println("Ребёнок: " + person2);
        }
        if (Person.hashCode() == person2.hashCode()){
            System.out.println("Жена: " + person4);
            System.out.println("Ребёнок: " + person3);
        }
        if (Person.hashCode() == person4.hashCode()){
            System.out.println("Жена: " + person2);
            System.out.println("Ребёнок: " + person3);
        }
        if (Person.hashCode() == person3.hashCode()){
            System.out.println("Не женат, нет детей");
        }
    }
}
