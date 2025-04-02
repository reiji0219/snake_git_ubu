package snake_01.src.main.java.snake.snake_03.under_03;

import snake_01.src.demo_06.Interface;
import java.util.function.Consumer;

public class Item25 implements Interface
{
  public void execute(){
    indi( "Lambda" );

  }

  private String id;
  private String name;
  private double price;
  private double tax;
  private Calc25 calc;


  public Item25 id( String id ){
    this.id = id;
    return this;
  }

  public Item25 name( String name ){
    this.name = name;
    return this;
  }

  public Item25 price( double price ){
    this.price = price;
    return this;
  }

  public Item25 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public Item25 calc( Calc25 calc ){
    this.calc = calc;
    return this;
  }

  public static void save( Consumer<Item25> con ){
    Item25 item = new Item25();
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

  public static double calcTax( double price, double tax ){
    return( price * tax );
  }

  public String toString(){
    return( "Item25 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
