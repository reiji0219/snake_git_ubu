package main.java.snake_08.upper_12.test12_03;

import java.util.function.Consumer;

public class Item03
{
  private String id;
  private String name;
  private double price;
  private double tax;


  public Item03 id( String id ){
    this.id = id;
    return this;
  }

  public Item03 name( String name ){
    this.name = name;
    return this;
  }

  public Item03 price( double price ){
    this.price = price;
    return this;
  }

  public Item03 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public static void save( Consumer<Item03> con ){
    Item03 item = new Item03();
    con.accept( item );
    indi( "save :" + item );
  }








  public String toString(){
    return( "Item03 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
