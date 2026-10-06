package main.java.snake_08.upper_01.test01_05;

public class Item05
{
  private String id;
  private String name;
  private double price;
  private double tax;


  public Item05 id( String id ){
    this.id = id;
    return this;
  }

  public Item05 name( String name ){
    this.name = name;
    return this;
  }

  public Item05 price( double price ){
    this.price = price;
    return this;
  }

  public Item05 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public static void save( ){
    indi( "save :" );
  }








  public String toString(){
    return( "Item05 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
