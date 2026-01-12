package main.java.snake_08.upper_09.test09_08;

import java.util.function.Consumer;

public class Item08
{
  private String id;
  private String name;
  private double price;
  private double tax;


  public Item08 id( String id ){
    this.id = id;
    return this;
  }

  public Item08 name( String name ){
    this.name = name;
    return this;
  }

  public Item08 price( double price ){
    this.price = price;
    return this;
  }

  public Item08 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public static void save( Consumer<Item08> con ){
    Item08 item = new Item08();
    con.accept( item );
    indi( "save" + item );
  }








  public String toString(){
    return( "Item08 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
