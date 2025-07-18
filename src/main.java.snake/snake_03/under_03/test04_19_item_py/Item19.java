//package snake_01.src.main.java.snake.snake_03.under_03.test04_19;

public class Item19
{
  private String id;
  private String name;
  private double price;
  private double tax;


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
    return( "Item19 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
     System.out.println( s0 );
  }
}
