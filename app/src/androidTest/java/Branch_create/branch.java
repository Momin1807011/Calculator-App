package Branch_create;

public class branch {

    String name;
    int price;
    int thirdTry;
    String id;
    public branch(String name, int price, int thirdTry,String id) {
        this.name = name;
        this.price = price;
        this.thirdTry=thirdTry;
        this.id=id;
    }

    public int getThirdTry() {
        return thirdTry;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setThirdTry(int thirdTry) {
        this.thirdTry = thirdTry;
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
