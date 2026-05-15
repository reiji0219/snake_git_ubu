package main.java.snake_08.upper_11.test11_07;

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

  public static void save( ){
    indi( "save :" );
  }










  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
