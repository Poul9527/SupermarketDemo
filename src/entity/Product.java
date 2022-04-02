package entity;

/**
 * 商品entity类
 */
public class Product extends Market {

    /*    int id;
        String name;
        int price;
        int number;*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Product() {
    }

    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Product(int id, String name, int price, int number) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public void show() {
        System.out.println("序号：" + id + "，商品:" + name + "，价格：" + price + "；");
    }

    public int getBill() {
        return number * price;
    }

    public void getAccount() {
        if (number > 0) {
            System.out.println("商品：" + name + "，数量：" + number + "，单价：" + price);
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", number=" + number +
                '}';
    }
}
