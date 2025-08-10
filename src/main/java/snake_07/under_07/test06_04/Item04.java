public class Item04
{
  private String id;
  private String name;
  private double price;
  private double tax;



  public Item04 id( String id ){
    this.id = id;
    return this;
  }

  public Item04 name( String name ){
    this.name = name;
    return this;
  }

  public Item04 price( double price ){
    this.price = price;
    return this;
  }

  public Item04 tax( double tax ){
    this.tax = tax;
    return this;
  }










  public String toString(){
    return( "Item04 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
