package com.imooc.generic;

public class NumGeneric<T> {
    private T num;
    public T getNum(){
        return num;
    }
    public void setNum(T num){
        this.num = num;
    }

    public static void main(String[] args) {
        NumGeneric<Integer> intNum = new NumGeneric<>();
        intNum.setNum(10);
        System.out.println(intNum.getNum());

        NumGeneric<Float> floatNum = new NumGeneric<>();
        floatNum.setNum(5.0f);
        System.out.println(floatNum.getNum());
    }
}
