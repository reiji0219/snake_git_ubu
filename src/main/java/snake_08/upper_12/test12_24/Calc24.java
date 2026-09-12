package main.java.snake_08.upper_12.test12_24;

import demo_06.Interface;

public class Calc24 extends Item24
{
  private String name;

  public Calc24( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc24 calc = new Calc24( "Poly-morphism" );
      calc.process( () -> {
        System.out.println( "関心事を記述" );

        Item24.save( item -> {
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
