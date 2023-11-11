package com.azurduy.app;

public class ItemInvoice {
    private Product product;
    private int count;
    // CONSTRUCTOR

    public ItemInvoice(int count, Product product) {
        this.product=product;
        this.count=count;
    }
    //GETTER AND SETTER

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getCount() {
        return count;
    }
    public void setCount(Integer count) {
        this.count = count;
    }

    public double calculateImport(){
        return this.count * this.product.getPrice();
    }

    @Override
    public String toString() {
        return product.toString()+
                "\t"+count+
                "\t"+calculateImport();
    }
}
