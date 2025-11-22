package main.java.snake_08.upper_08.test08_11;

import java.util.function.Consumer;

public class Item11
{
  private String id;
  private String name;
  private double price;
  private double tax;


  public Item11 id( String id ){
    this.id = id;
    return this;
  }

  public Item11 name( String name ){
    this.name = name;
    return this;
  }

  public Item11 price( double price ){
    this.price = price;
    return this;
  }

  public Item11 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public static void save( Consumer<Item11> con ){
    Item11 item = new Item11();
    con.accept( item );
    indi( "save :" + item );
  }








  public String toString(){
    return( "Item11 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
