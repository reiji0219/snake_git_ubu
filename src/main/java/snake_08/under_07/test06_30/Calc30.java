package main.java.snake_08.under_07.test06_30;

import demo_06.Interface;

public class Calc30 extends Item30
{
  private String name;

  public Calc30( String name ){
    super();
    this.name = name;
  }

  public static Interface create(){
    return() ->{
      Calc30 calc = new Calc30( "Poly-morphism" );

      Item30.save( item -> {
        item.id( "掛け算" )
            .name( "税込み価格" )
            .price( 980 )
            .tax( 1.1 )
            .calc( calc );

        System.out.println( "計算式 :" + item.getId() );

        item.display();

        item.execute();
      });
    };
  }

  public void display(){
    indi( name );
  }

  public void process( Interface inter ){
    indi( "Lambda" );

    inter.execute();

    indi( "end" );
  }
}
