package main.java.snake_08.upper_12.test12_20;

import java.util.function.Consumer;

public class Item20
{
  private String id;
  private String name;
  private double price;
  private double tax;


  public Item20 id( String id ){
    this.id = id;
    return this;
  }

  public Item20 name( String name ){
    this.name = name;
    return this;
  }

  public Item20 price( double price ){
    this.price = price;
    return this;
  }

  public Item20 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public static void save( Consumer<Item20> con ){
    Item20 item = new Item20();
    con.accept( item );
    indi( "save :" + item );
  }








  public String toString(){
    return( "Item20 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
