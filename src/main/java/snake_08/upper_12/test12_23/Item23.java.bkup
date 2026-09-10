package main.java.snake_08.upper_12.test12_23;

import java.util.function.Consumer;

public class Item23
{
  private String id;
  private String name;
  private double price;
  private double tax;


  public Item23 id( String id ){
    this.id = id;
    return this;
  }

  public Item23 name( String name ){
    this.name = name;
    return this;
  }

  public Item23 price( double price ){
    this.price = price;
    return this;
  }

  public Item23 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public static void save( Consumer<Item23> con ){
    Item23 item = new Item23();
    con.accept( item );
    indi( "save :" + item );
  }








  public String toString(){
    return( "Item23 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
