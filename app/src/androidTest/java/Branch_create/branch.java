package Branch_create;

public class branch {

    String name;
    int price;
    int thirdTry;

    public branch(String name, int price,int thirdTry) {
        this.name = name;
        this.price = price;
        this.thirdTry=thirdTry;
    }

    public int getThirdTry() {
        return thirdTry;
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
