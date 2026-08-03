package main.java.snake_08.upper_12.test12_06;

import java.util.function.Consumer;

public class Item06
{
  private String id;
  private String name;
  private double price;
  private double tax;


  public Item06 id( String id ){
    this.id = id;
    return this;
  }

  public Item06 name( String name ){
    this.name = name;
    return this;
  }

  public Item06 price( double price ){
    this.price = price;
    return this;
  }

  public Item06 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public static void save( Consumer<Item06> con ){
    Item06 item = new Item06();
    con.accept( item );
    indi( "save :" + item );
  }








  public String toString(){
    return( "Item06 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
