import demo_06.Interface;

public class Calc28 extends Item28
{
  private String name;

  public Calc28( String name ){
    super();
    this.name = name;
   }

  public void display(){
    indi( name );
  }

  public void display( Interface inter ){
    indi( "start" );

    inter.execute();

    indi( "end" );
  }
}
