package com.example.task8;

public interface IBuyer {
    void enterToMarket(); // вошел в магазин (мгновенно)
    void chooseGoods() throws InterruptedException; // выбрал товар (от 0,5 до 2 секунд)
    void goOut(); // отправился на выход(мгновенно)
}
