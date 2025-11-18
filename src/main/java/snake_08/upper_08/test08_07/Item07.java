package main.java.snake_08.upper_08.test08_07;

import java.util.function.Consumer;

public class Item07
{
  private String id;
  private String name;
  private double price;
  private double tax;


  public Item07 id( String id ){
    this.id = id;
    return this;
  }

  public Item07 name( String name ){
    this.name = name;
    return this;
  }

  public Item07 price( double price ){
    this.price = price;
    return this;
  }

  public Item07 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public static void save( Consumer<Item07> con ){
    Item07 item = new Item07();
    con.accept( item );
    indi( "save :" + item );
  }








  public String toString(){
    return( "Item07 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
