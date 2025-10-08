package main.java.snake_07.under_07.test06_30;

import java.util.function.Consumer;

public class Item30
{
  private String id;
  private String name;
  private double price;
  private double tax;


  public Item30 id( String id ){
    this.id = id;
    return this;
  }

  public Item30 name( String name ){
    this.name = name;
    return this;
  }

  public Item30 price( double price ){
    this.price = price;
    return this;
  }

  public Item30 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public static void save( Consumer<Item30> con ){
    Item30 item = new Item30();
    con.accept( item );
    indi( "save :" + item );
  }








  public String toString(){
    return( "Item30 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
