/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_CPIT252;

public abstract class  Product {
    private int id;
    private double price;
    private String name;
    private static int quantity;
    private double weight;

    public Product(int id, double price, String name, double weight) {
        this.id = id;
        this.price = price;
        this.name = name;
        this.weight = weight;
        quantity++;
    }

   
    public void applySaleDiscount(double percentage){
        this.price = this.price - ((percentage/100) * this.price);
    }

    public final void addToShoppingCart(){
        System.out.println(this.name + " has been added to the shopping cart.");
    }

    public int getTotalQuantity(){
        return quantity;
    }

    public abstract void getSellableStatus();

    public String toString(){
        return "Product info:\n+Id: " + this.id + "\t" + "name: " + this.name +
                "\tPrice: SR" + this.price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight <0){
            throw new IllegalArgumentException("invalid weight value");
        }
        this.weight=weight;
    }
    
}
