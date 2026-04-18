package main.java.snake_08.upper_11.test11_05;

import demo_06.Interface;

public class Calc05 extends Item05
{
  private String name;

  public Calc05( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc05 calc = new Calc05( "Poly-morphism" );
      calc.process( () -> {
        System.out.println( "関心事を記述" );

        Item05.save( item -> {
          item.id( "掛け算" )
              .name( "税込み価格" )
              .price( 980 )
              .tax( 1.1 )
              .calc( calc );

          System.out.println( "計算式 :" + item.getId() );

          item.display();
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
