package com.example.task8;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class Buyer implements  IBuyer, IUseBasket, Runnable {
    private int numberOfBasket = 100;
    private final Goods goods = new Goods();
    private final Random random = new Random();

    public Buyer(int numberOfBasket) {
        this.numberOfBasket = numberOfBasket;
    }

    public Buyer() {}

    @Override
    public void enterToMarket() {
        String buyerName = Thread.currentThread().getName();
        System.out.println(buyerName);
    }

    @Override
    public void chooseGoods() throws InterruptedException {
        int MAXIMUM_PRODUCT_SELECTION_TIME = 1500;
        int MINIMUM_PRODUCT_SELECTION_TIME = 500;
        int time_to_select_product = MINIMUM_PRODUCT_SELECTION_TIME + random.nextInt(MAXIMUM_PRODUCT_SELECTION_TIME);
        Thread.sleep(time_to_select_product);
        System.out.println(Thread.currentThread().getName() + "  has chosen goods");
        putGoodsToBasket();
    }

    @Override
    public void goOut() {
        synchronized (Buyer.class) {
            numberOfBasket++;
            Buyer.class.notifyAll();
        }
        System.out.println(Thread.currentThread().getName() + " gave back a basket");
    }

    @Override
    public void takeBasket() {
        synchronized (Buyer.class) {
            while (numberOfBasket <= 0) {
                try {
                    System.out.println(Thread.currentThread().getName() + " is waiting for a basket");
                    Buyer.class.wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
            numberOfBasket--;
        }
        System.out.println(Thread.currentThread().getName() + " took a basket");
    }

    @Override
    public void putGoodsToBasket() {
        int MINIMUM_PRODUCT_AMOUNT = 1;
        int MAXIMUM_PRODUCT_AMOUNT = 10;
        Map<String, Pair<Integer, Double>> goodsMap = goods.getGoods();
        List<String> selectedGoods = goodsMap.keySet().stream().limit(MINIMUM_PRODUCT_AMOUNT + random.nextInt(MAXIMUM_PRODUCT_AMOUNT)).toList();

        for (String good : selectedGoods) {
            synchronized (goods) {
                Pair<Integer, Double> pair = goodsMap.get(good);
                if (pair.getKey() > 0) {
                    goods.getAmountOfProduct(good, 1);
                    System.out.println(Thread.currentThread().getName() + " " + good);
                } else {
                    System.out.println(good + " is out of stock");
                }
            }
        }
    }

    @Override
    public void run() {
        try {
            enterToMarket();
            takeBasket();
            chooseGoods();
            goOut();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
