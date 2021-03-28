package hw5;

public class Person {
    private String fullName;
    private String post;
    private String email;
    private String phone;
    private int payday;
    private int age;

    public Person(String fullName, String post, String email, String phone, int payday, int age) {
        this.fullName = fullName;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.payday = payday;
        this.age = age;
    }

    public void print(){
        System.out.println(fullName + ", " + post + ", " +
                email + ", " + phone + ", " + payday + ", " + age);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPayday() {
        return payday;
    }

    public void setPayday(int payday) {
        this.payday = payday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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


