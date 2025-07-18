package snake_01.src.main.java.snake.snake_03.under_03.test06_19;

import snake_01.src.demo_06.Interface;
import java.util.function.Consumer;

public class Item19 implements Interface
{
  public void execute(){
    indi( "Lambda" );

  }

  private String id;
  private String name;
  private double price;
  private double tax;

  public Item19( String id, String name, double price, double tax ){
    this.id = id;
    this.name = name;
    this.price = price;
    this.tax = tax;
  }

  public void setId( String id ){
   this.id = id;
  }

  public void setName( String name ){
   this.name = name;
  }

  public void setPrice( double price ){
   this.price = price;
  }

  public void setTax( double tax ){
   this.tax = tax;
  }

  public Item19(){

  }

  public Item19 id( String id ){
   this.id = id;
   return this;
  }

  public Item19 name( String name ){
   this.name = name;
   return this;
  }

  public Item19 price( double price ){
   this.price = price;
   return this;
  }

  public Item19 tax( double tax ){
   this.tax = tax;
   return this;
  }

  public static void save( Consumer<Item19> con ){
    Item19 chain = new Item19();
    con.accept( chain );
    indi( "save :" + chain );
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
   return( "Item19" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
