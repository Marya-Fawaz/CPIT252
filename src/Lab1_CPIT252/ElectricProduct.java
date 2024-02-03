/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_CPIT252;

public class ElectricProduct extends Product{

  private String voltage;

  public ElectricProduct(int id, double price, String name, String voltage,double weight){
    super(id, price, name,weight);
    this.voltage = voltage;
  }

  @Override
  public void getSellableStatus(){
      System.out.println("This product is sellable");

  }
  @Override
  public String toString(){
    return super.toString() +"\t Voltage: " + this.voltage;
  }

}