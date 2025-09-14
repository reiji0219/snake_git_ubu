package main.java.snake_07.under_07.test06_27;

public class Item27
{
  private String id;
  private String name;
  private double price;
  private double tax;


  public Item27 id( String id ){
    this.id = id;
    return this;
  }

  public Item27 name( String name ){
    this.name = name;
    return this;
  }

  public Item27 price( double price ){
    this.price = price;
    return this;
  }

  public Item27 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public static void save( ){
    indi( "save :" );
  }








  public String toString(){
    return( "Item27 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
