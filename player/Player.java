package player;

public class Player {

    String name, email, address;
    int age;
    long contact;

    public void setDetails(String name, String email, String address, int age, long contact) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.age = age;
        this.contact = contact;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public void getDetails() {
        System.out.println("name is: " + this.name);
        System.out.println("email is: " + this.email);
        System.out.println("address is: " + this.address);
        System.out.println("age is: " + this.age);
        System.out.println("contact is: " + this.contact);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public long getContact() {
        return contact;
    }
}
