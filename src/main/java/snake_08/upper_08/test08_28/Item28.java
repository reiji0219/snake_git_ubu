package main.java.snake_08.upper_08.test08_28;

public class Item28
{
  private String id;
  private String name;
  private double price;
  private double tax;


  public Item28 id( String id ){
    this.id = id;
    return this;
  }

  public Item28 name( String name ){
    this.name = name;
    return this;
  }

  public Item28 price( double price ){
    this.price = price;
    return this;
  }

  public Item28 tax( double tax ){
    this.tax = tax;
    return this;
  }

  public static void save( ){
    indi( "save :" );
  }








  public String toString(){
    return( "Item28 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
