package main.java.snake_08.upper_11.test11_22;

import java.util.function.Consumer;

public class Item22
{
  private String id;
  private String name;
  private double price;
  private double tax;


  public Item22 id( String id ){
    this.id = id;
    return this;
  }

  public Item22 name( String name ){
    this.name = name;
    return this;
  }

  public Item22 price( double price ){
    this.price = price;
    return this;
  }

  public Item22 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public static void save( Consumer<Item22> con ){
    Item22 item = new Item22();
    con.accept( item );
    indi( "save :" + item );
  }








  public String toString(){
    return( "Item22 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
