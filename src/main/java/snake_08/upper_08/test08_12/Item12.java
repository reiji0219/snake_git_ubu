package main.java.snake_08.upper_08.test08_12;

import java.util.function.Consumer;

public class Item12
{
  private String id;
  private String name;
  private double price;
  private double tax;


  public Item12 id( String id ){
    this.id = id;
    return this;
  }

  public Item12 name( String name ){
    this.name = name;
    return this;
  }

  public Item12 price( double price ){
    this.price = price;
    return this;
  }

  public Item12 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public static void save( Consumer<Item12> con ){
    Item12 item = new Item12();
    con.accept( item );
    indi( "save :" + item );
  }








  public String toString(){
    return( "Item12 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
