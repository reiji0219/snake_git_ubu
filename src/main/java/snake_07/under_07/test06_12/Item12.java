package main.java.snake_07.under_07.test06_12;

import demo_06.Interface;
import java.util.function.Consumer;

public class Item12 implements Interface
{
  public void execute(){
    indi( "Lambda" );

  }

  private String id;
  private String name;
  private double price;
  private double tax;
  private Calc12 calc;


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

  public Item12 calc( Calc12 calc ){
    this.calc = calc;
    return this;
  }

  public static void save( Consumer<Item12> con ){
    Item12 item = new Item12();
    con.accept( item );
    indi( "save :" + item );
  }

  public String getId(){
    return id;
  }

  public void display(){
    indi( "表示内容" + name );

    double calcInTax = calcTax( price, tax );
      indi( "税込み価格は" + calcInTax + "円です" );

    calc.display();
  }

  public static double calcTax( double price, double tax ){
    return( price * tax );
  }

  public String toString(){
    return( "Item12 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
   System.out.println( s0 );
  }
}
