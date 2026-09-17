package main.java.snake_08.upper_12.test12_26;

import demo_06.Interface;

public class Calc26 extends Item26
{
  private String name;

  public Calc26( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc26 calc = new Calc26( "Poly-morphism" );
      calc.process( () -> {
        System.out.println( "関心事を記述" );

        Item26.save( item -> {
          item.id( "掛け算" )
              .name( "税込み価格" )
              .price( 980 )
              .tax( 1.1 )
              .calc( calc );

          System.out.println( "計算式   :" + item.getId() );

          item.display();

          item.execute();
        });
      });
    };
  }

  public void display(){
    indi( name );
  }

  public void process( Interface inter ){
    indi( "start" );

    inter.execute();

    indi( "end" );
  }
}
