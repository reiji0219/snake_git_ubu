package main.java.snake_08.upper_12.test12_10;

import java.util.function.Consumer;

public class Item10
{
  private String id;
  private String name;
  private double price;
  private double tax;


  public Item10 id( String id ){
    this.id = id;
    return this;
  }

  public Item10 name( String name ){
    this.name = name;
    return this;
  }

  public Item10 price( double price ){
    this.price = price;
    return this;
  }

  public Item10 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public static void save( Consumer<Item10> con ){
    Item10 item = new Item10();
    con.accept( item );
    indi( "save :" + item );
  }








  public String toString(){
    return( "Item10 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
