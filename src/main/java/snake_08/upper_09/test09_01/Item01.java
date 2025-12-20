package main.java.snake_08.upper_09.test09_01;

import java.util.function.Consumer;

public class Item01
{
  private String id;
  private String name;
  private double price;
  private double tax;


  public Item01 id( String id ){
    this.id = id;
    return this;
  }

  public Item01 name( String name ){
    this.name = name;
    return this;
  }

  public Item01 price( double price ){
    this.price = price;
    return this;
  }

  public Item01 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public static void save( Consumer<Item01> con ){
    Item01 item = new Item01();
    con.accept( item );
    indi( "save :" + item );
  }








  public String toString(){
    return( "Item01 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
