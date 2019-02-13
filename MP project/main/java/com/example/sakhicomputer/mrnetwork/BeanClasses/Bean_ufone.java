package com.example.sakhicomputer.mrnetwork.BeanClasses;

/**
 * Created by SAkhi COmputer on 25/01/2018.
 */

public class Bean_ufone {

    String id;
    String bucket_name;
    String validity;
    String category;
    String price;
    String subscription_code;
    String network;

    public Bean_ufone(String id, String bucket_name, String validity, String category, String price,
                      String subscription_code, String network) {
        this.id = id;
        this.bucket_name = bucket_name;
        this.validity = validity;
        this.category = category;
        this.price = price;
        this.subscription_code = subscription_code;
        this.network = network;
    }

    @Override
    public String toString() {
        return "Bean_ufone{" +
                "id='" + id + '\'' +
                ", bucket_name='" + bucket_name + '\'' +
                ", validity='" + validity + '\'' +
                ", category='" + category + '\'' +
                ", price='" + price + '\'' +
                ", subscription_code='" + subscription_code + '\'' +
                ", network='" + network + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBucket_name() {
        return bucket_name;
    }

    public void setBucket_name(String bucket_name) {
        this.bucket_name = bucket_name;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSubscription_code() {
        return subscription_code;
    }

    public void setSubscription_code(String subscription_code) {
        this.subscription_code = subscription_code;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }
}
