package service;

import entity.Product;

import java.util.List;

/**
 * 超市购物接口类
 */
public interface MarketService {
    /**
     * 初始化逛超市方法
     *
     * @return
     */
    int init();

    /**
     * 展示商品方法
     *
     * @param products
     * @return
     */
    int showProduct(List<Product> products);

    /**
     * 添加商品到购物车方法
     *
     * @param products
     * @return
     */
    int addShoppingCar(List<Product> products);

    /**
     * 结算购物车方法
     *
     * @param products
     * @return
     */
    int buyProduct(List<Product> products);

    /**
     * 购物车查看功能
     *
     * @param products
     * @return
     */
    int viewShoppingCar(List<Product> products);
}
