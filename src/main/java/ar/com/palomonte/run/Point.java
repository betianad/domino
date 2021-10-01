package ar.com.palomonte.run;

import java.util.Objects;

class Point extends Pair{
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Point point = (Point) o;
    return x == point.x && y == point.y;
  }

  @Override
  public int hashCode() {
    return Objects.hash(x, y);
  }


  public boolean runsWith(Pair pair){

    return this.equals(pair);
  }

}
