package service.impl;

import Help.ScannerHelper;
import entity.Product;
import service.MarketService;

import java.util.List;

public class MarketServiceImpl implements MarketService {
    public ScannerHelper sh = ScannerHelper.sh;

    @Override
    public int init() {
        System.out.println("输入1：显示商品价格；输入2：添加商品；输入3：查看购物车；输入4：结算；输入其它退出");

        int x = sh.getScanner(false);
        return x;
    }

    @Override
    public int showProduct(List<Product> products) {
        for (Product product : products) {
            product.show();
        }
        System.out.println("\nenjoy shopping！");
        return 0;
    }

    @Override
    public int addShoppingCar(List<Product> products) {
        System.out.println("添加你需要的商品:\n（1）自行车（2）汽车（3）游艇（4）薯片（5）苹果（6）鲈鱼（7）大米（8）短袖（9）裙子（10）鞋子\n输入其它继续逛超市");

        int x = sh.getScanner(false);
        if (x == -1) {
            return 0;
        }
        while (x != -1) {
            if (x == 0) {
                // 递归出口
                return 0;
            }
            if (Math.max(products.get(0).getId(), x) == Math.min(x, products.get(products.size() - 1).getId())) {
                System.out.println("请输入购买数量（输入0选择其它商品）：");
                int y = sh.getScanner(true);
                if (y >= 0) {
                    // 因为商品已经排序，添加商品提示的商品顺序又与排序的一致，所以根据下标拿的，这样不太好
                    Product pro = products.get(x - 1);
                    pro.setNumber(pro.getNumber() + y);
                    System.out.println("添加成功！目前购物车中" + pro.getName() + "的数量为" + pro.getNumber());
                } else {
                    System.out.println("添加购物车失败，请重新添加！");
                }
            } else {
                System.out.println("请输入已有商品的序号！");
            }
            // 递归继续添加商品
            x = addShoppingCar(products);
        }

        return 0;
    }

    @Override
    public int buyProduct(List<Product> products) {
        int bill = 0;
        System.out.println("您购买的商品清单：");
        for (Product pro : products) {
            pro.getAccount();
            bill += pro.getBill();
        }
        System.out.println("您需要支付的账单金额共计：" + bill);

        return -1;
    }

    @Override
    public int viewShoppingCar(List<Product> products) {
        System.out.println("您的购物车中的商品：");
        for (Product pro : products) {
            pro.getAccount();
        }
        System.out.println();
        return 0;
    }
}
