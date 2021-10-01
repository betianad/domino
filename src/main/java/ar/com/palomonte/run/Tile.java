package ar.com.palomonte.run;

public class Tile extends  Pair{

  public Tile(int x, int y) {
    this.x = x;
    this.y = y;
  }


  public boolean runsWith(Pair pair){

    return (this.y == pair.x);
  }
}
