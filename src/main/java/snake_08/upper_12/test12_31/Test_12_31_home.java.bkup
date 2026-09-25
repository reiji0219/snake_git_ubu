package main.java.snake_08.upper_12.test12_31;

import java.util.function.Consumer;

public class Item31
{
  private String id;
  private String name;
  private double price;
  private double tax;


  public Item31 id( String id ){
    this.id = id;
    return this;
  }

  public Item31 name( String name ){
    this.name = name;
    return this;
  }

  public Item31 price( double price ){
    this.price = price;
    return this;
  }

  public Item31 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public static void save( Consumer<Item31> con ){
    Item31 item = new Item31();
    con.accept( item );
    indi( "save :" + item );
  }








  public String toString(){
    return( "Item31 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
