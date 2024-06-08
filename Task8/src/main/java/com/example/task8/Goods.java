package com.example.task8;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class Goods {
    private static final Map<String, Pair<Integer, Double>> informationOfGood = new HashMap<>();

    static {
        Pair<Integer, Double> apples = new Pair<>(100, 5.0);
        informationOfGood.put("Apple", apples);

        Pair<Integer, Double> orange = new Pair<>(200, 12.0);
        informationOfGood.put("Orange", orange);

        Pair<Integer, Double> strawberry = new Pair<>(100, 15.5);
        informationOfGood.put("Strawberry", strawberry);
    }

    public void addNewProduct(String good, Integer amount, Double price) {
        informationOfGood.put(good, new Pair<>(amount, price));
    }

    public void addAmountOfProduct(String good, Integer amount) {
        Pair<Integer, Double> pair = informationOfGood.get(good);
        if (pair != null) {
            pair.setKey(pair.getKey() + amount);
        }
    }

    public void  getAmountOfProduct(String good, Integer amount) {
        Pair<Integer, Double> pair = informationOfGood.get(good);
        if (pair != null) {
            pair.setKey(pair.getKey() - amount);
        }
    }

    public void  getAmountOfProduct(String good) {
        Pair<Integer, Double> pair = informationOfGood.get(good);
        if (pair != null) {
            pair.setKey(pair.getKey() - 1);
        }
    }

    public Double returnPrice(String good) {
         return informationOfGood.get(good).getValue();
    }

    public Integer returnAmountOfProduct(String good) {
        return informationOfGood.get(good).getKey();
    }


    public Map<String, Pair<Integer, Double>> getGoods() {
        return informationOfGood;
    }
}
