package entity;

import java.util.LinkedList;
import java.util.List;

/**
 * 超市类
 * TODO 应该要有更多属性的，而且商品写死了，应该要从配置文件中读取的，懒；如果有数据库，应该要有增删改查商品功能
 */
public class Market {

    int id;
    String name;
    int price;
    int number;

    public List<Product> getMarket() {
        List<Product> list = new LinkedList<Product>();
//        （1）自行车（2）汽车（3）游艇（4）薯片（5）苹果（6）鲈鱼（7）大米（8）短袖（9）裙子（10）鞋子
        list.add(new Product(1, "自行车", 1000));
        list.add(new Product(2, "汽车", 10000));
        list.add(new Product(3, "游艇", 100000));
        list.add(new Product(4, "薯片", 10));
        list.add(new Product(5, "苹果", 5));
        list.add(new Product(6, "鲈鱼", 50));
        list.add(new Product(7, "大米", 20));
        list.add(new Product(8, "短袖", 100));
        list.add(new Product(9, "裙子", 200));
        list.add(new Product(10, "鞋子", 500));
        return list;
    }

}
