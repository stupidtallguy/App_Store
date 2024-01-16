public class Person {
    private String Name;
    private int age ;
    private String email;
    public Person(String Name, int Age ,String Email ){
        this.age = Age;
        this.Name = Name;
        this.email = Email;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return Name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        Name = name;
    }

}
