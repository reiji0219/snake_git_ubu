import java.lang.Math;
import java.util.function.Consumer;

public class Item27
{
  private String id;
  private String name;
  private double price;
  private double tax;
  private Calc27 calc;


// コンストラクタで記述
  public Item27( String id, String name, double price, double tax, Calc27 calc ){
    this.id = id;
    this.name = name;
    this.price = price;
    this.tax = tax;
    this.calc = calc;
  }



// setter で記述
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

  public void setCalc( Calc27 calc ){
    this.calc = calc;
  }


// 重複するコンストラクタを使用してチェーンメソッドで記述する場合には、引数無しのコンストラクタの記述が必要
  public Item27(){
    super();
  }

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

  public Item27 calc( Calc27 calc ){
    this.calc = calc;
    return this;
  }

  public static void save( Consumer<Item27> con ){
    Item27 itemChain = new Item27();
    con.accept( itemChain );
    indi( "save :" + itemChain );
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

  public void sam(){
    indi( "表示内容 :" + name );

    double totalSam = total( price, tax );
      // 再度、計算結果を10^5 で割る
      double result = Math.pow( 10, 5 );
        indi( "合計は" + ( totalSam / result ) + "です" );

    calc.display();
  }
// 小数の足し算は誤差が生じるので一度整数にして計算後、小数に戻す　のに Math.pow( 10の, 何乗 ) を記述 
  public static double total( double price, double tax ){
    double result = Math.pow( 10, 5 );
      return( ( result * price ) + ( result * tax ) );
  }


  public void clacMinus(){
    indi( "表示内容 :" + name );

    double totalMinus = minus( price, tax );
      double multiply = Math.pow( 10, 2 );
        indi( "引き算の結果は" + ( totalMinus / multiply ) + "です" );

    calc.display();
  }

  public static double minus( double price, double tax ){
    double multiply = Math.pow( 10, 2 );
      return( ( multiply * price ) - ( multiply * tax ) );
  }


  public String toString(){
    return( "Item27 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
  }

  public static void indi( String s0 ){
    System.out.println( s0 );
  }
}
