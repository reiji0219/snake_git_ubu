package main.java.snake_07.upper_08.test08_02;

import demo_06.Interface;
import java.util.function.Consumer;

public class Item02 implements Interface
{
  public void execute(){
    indi( "Lambda" );

  }

  private String id;
  private String name;
  private double price;
  private double tax;
  private Calc02 calc;

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

  public Item02 calc( Calc02 calc ){
    this.calc = calc;
    return this;
  }

  public staitc void save( Consumer<Item02> con ){
    Item02 item = new Item02();
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

    calc.display();
  }

  public staitc double calcTax( double price, double tax ){
    return( price * tax );
  }

  public String toString(){
    return( "Item02 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public staitc void indi( String s0 ){
    System.out.println( s0 );
  }
}
