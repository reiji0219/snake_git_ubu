package main.java.snake_08.upper_12.test12_19;

import java.util.function.Consumer;

public class Item19
{
  private String id;
  private String name;
  private double price;
  private double tax;


  public Item19 id( String id ){
    this.id = id;
    return this;
  }

  public Item19 name( String name ){
    this.name = name;
    return this;
  }

  public Item19 price( double price ){
    this.price = price;
    return this;
  }

  public Item19 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public static void save( Consumer<Item19> con ){
    Item19 item = new Item19();
    con.accept( item );
    indi( "save :" + item );
  }








  public String toString(){
    return( "Item19 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
