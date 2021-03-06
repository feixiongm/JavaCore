package com.imooc.sort;

public class Goods implements Comparable<Goods> {

    private String id;
    private String name;
    private double price;

    public Goods() {
    }

    public Goods(String id, String name, double price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Goods o) {
        //取出商品价格
//        double price1 = this.getPrice();
//        double price2 = o.getPrice();
//         int a = (int) (price2 - price1);
//        return a;

        String name1 = this.getName();
        String name2 = o.getName();
        return name1.compareTo(name2);

    }


}
