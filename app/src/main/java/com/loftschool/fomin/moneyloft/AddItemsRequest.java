package com.loftschool.fomin.moneyloft;

class AddItemsRequest {
    private int price;
    private String name;
    private String type;

    AddItemsRequest(int price, String name, String type) {
        this.price = price;
        this.name = name;
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
