package snake_01.src.main.java.snake.snake_03.under_03.test06_19;

import snake_01.src.demo_06.Interface;

public class Calc19 extends Item19
{
  private String name;

  public Calc19( String name ){
    super();
    this.name = name;
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
