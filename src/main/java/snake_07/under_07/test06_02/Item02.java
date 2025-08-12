package main.java.snake_07.under_07.test06_02;

import java.util.function.Consumer;

public class Item02
{
  private String id;
  private String name;
  private double price;
  private double tax;


  public Item02 id( String id ){
    this.id = id;
    return this;
  }

  public Item02 name( String name ){
    this.name = name;
    return this;
  }

  public Item02 price( double price ){
    this.price = price;
    return this;
  }

  public Item02 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public static void save( Consumer<Item02> con ){
    Item02 item = new Item02();
    con.accept( item );
    indi( "save :" + item );
  }

  public String getId(){
    return id;
  }

  public void display(){
    indi( "表示内容 :" + name );

    double clacInTax = clacTax( price, tax );
      indi( "税込み価格は" + clacInTax + "円です" );

    
  }

  public static double clacTax( double price, double tax ){
    return( price * tax );
  }

  public String toString(){
    return( "Item02 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
