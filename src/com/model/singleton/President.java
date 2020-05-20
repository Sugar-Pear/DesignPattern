package com.model.singleton;

public class President {
    private static volatile President instance = null;

    private President(){
        System.out.println("产生一个总统！");
    }

    public static synchronized President getInstance(){
        if (instance == null){
            instance = new President();
        }else {
            System.out.println("总统已经存在！");
        }

        return instance;
    }

    public void getName(){
        System.out.println("123");
    }

}
