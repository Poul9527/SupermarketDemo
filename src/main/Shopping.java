package main;

import Help.ScannerHelper;
import entity.Market;
import entity.Product;
import service.MarketService;
import service.impl.MarketServiceImpl;

import java.util.List;

/**
 * @author skpeng
 * @description 超市购物系统
 * 超市中有10种商品，分别为：
 * （1）自行车（2）汽车（3）游艇（4）薯片（5）苹果（6）鲈鱼（7）大米（8）短袖（9）裙子（10）鞋子
 * 实现以下功能：
 * （1）在结算前，用户可以无限制的添加需要购买的商品及购买数量到购物车
 * （2）结算时，根据购物车中选中的商品及对应的数量计算总共需支付的金额，并显示出购物清单
 * （3）输入某个字段，可以显示当前超市中的所有商品及对应的价格
 * @Date 2022/04/03
 */
public class Shopping {


    private static MarketService service = new MarketServiceImpl();

/*    public Shopping(List<Product> products) {
        this.products = products;
    }*/


    public static void main(String[] args) {
        System.out.println("欢迎光临超市购物系统！");
        List<Product> products = new Market().getMarket();
        int x = 0;
        while (x != -1) {
            x = service.init();
            switch (x) {
                case 1:
                    x = service.showProduct(products);
                    break;
                case 2:
                    x = service.addShoppingCar(products);
                    break;
                case 3:
                    x = service.viewShoppingCar(products);
                    break;
                case 4:
                    x = service.buyProduct(products);
                    break;
                default:
                    x = -1;
                    break;
            }
        }
        System.out.println("欢迎下次光临！");
    }


}
