package main.java.snake_08.upper_12.test12_15;

import java.util.function.Consumer;

public class Item15
{
  private String id;
  private String name;
  private double price;
  private double tax;


  public Item15 id( String id ){
    this.id = id;
    return this;
  }

  public Item15 name( String name ){
    this.name = name;
    return this;
  }

  public Item15 price( double price ){
    this.price = price;
    return this;
  }

  public Item15 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public static void save( Consumer<Item15> con ){
    Item15 item = new Item15();
    con.accept( item );
    indi( "save :" + item );
  }

  public String getId(){
    return id;
  }

  public void display(){
    indi( "表示内容 :" + name );

    double calcInTax = calcTax( price, tax );
      indi( "税込み価格は" + calcInTax + "円です" );

    
  }

  public static double calcTax( double price, double tax ){
    return( price * tax );
  }

  public String toString(){
    return( "Item15 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
