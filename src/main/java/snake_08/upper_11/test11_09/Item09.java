package main.java.snake_08.upper_11.test11_09;

import java.util.function.Consumer;

public class Item09
{
  private String id;
  private String name;
  private double price;
  private double tax;


  public Item09 id( String id ){
    this.id = id;
    return this;
  }

  public Item09 name( String name ){
    this.name = name;
    return this;
  }

  public Item09 price( double price ){
    this.price = price;
    return this;
  }

  public Item09 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public static void save( Consumer<Item09> con ){
    Item09 item = new Item09();
    con.accept( item );
    indi( "save :" + item );
  }








  public String toString(){
    return( "Item09 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
