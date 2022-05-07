package Branch_create;

public class branch {

    String name;
    int price;
    int age;
    public branch(String name, int price,int age) {
        this.name = name;
        this.price = price;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
