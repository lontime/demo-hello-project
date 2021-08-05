package com.github.ollgei.demo.hello;

import com.google.gson.JsonObject;

/**
 * Main.
 * @author ollgei
 * @return 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        JsonObject object = new JsonObject();
        object.addProperty("1223", 122);
        System.out.println(object.toString());
        System.out.println("hello");
    }

}
