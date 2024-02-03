/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab1_CPIT252;

import java.time.LocalDate;

public class FoodProduct extends Product{
  
  private LocalDate expirationDate;

  public FoodProduct(int id, double price, String name, LocalDate expirationDate,double weight){
    super(id, price, name,weight);
    this.expirationDate = expirationDate;
  }

   @Override
  public void getSellableStatus(){
      System.out.println("This product is sellable");

  }
  
  @Override
  public String toString(){
    return super.toString() +"\t Expiration Date: " + this.expirationDate;
  }
}
