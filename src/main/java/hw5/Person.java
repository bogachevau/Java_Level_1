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


}


