package hw5;


public class Test {



    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivanov Ivan", "Engineer",
                "ivanov@ya.ru", "89234523698", 40000, 30);
        persArray[1] = new Person("Sidorov Oleg", "Developer",
                "sidorov@ya.ru", "89233216587", 60000, 41);
        persArray[2] = new Person("Semenov Semen", "Developer",
                "semenov@ya.ru", "89233265871", 60000, 42);
        persArray[3] = new Person("Petrov Petr", "QA Engineer",
                "petrov@ya.ru", "89237531592", 50000, 44);
        persArray[4] = new Person("Smirnova Anna", "Product manager",
                "smirnova@ya.ru", "89234568523", 45000, 32);

        for (Person person : persArray) {
            if (person.getAge() > 40){
                person.print();
            }


        }

    }
}
