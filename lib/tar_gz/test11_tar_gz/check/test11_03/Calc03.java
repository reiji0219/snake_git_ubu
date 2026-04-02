package main.java.snake_08.upper_10.test11_03;

import demo_06.Interface;

public class Calc03 extends Item03
{
  private String name;

  public Calc03( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() -> {
      Calc03 calc = new Calc03( "Poly-morphism" );
      calc.process( () -> {
        System.out.println( "関心事を記述" );
        Item03.save( item -> {
          item.id( "掛け算" )
              .name( "税込み価格" )
              .price( 980 )
              .tax( 1.1 )
              .calc( calc );

          System.out.println( "計算式   :" + item.getId() );

          item.display();

          item.execute();
        });
        System.out.println( "Hello World_1" );
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
