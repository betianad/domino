package ar.com.palomonte.domino;
import java.lang.String;
import java.util.*;

public class Domino {


  static int numberOfTiles(String domino) {

    int tilesCount = 1;
    int maxTilesCount = 1;

    char leftNumber, rightNumber;
    String leftTile, rightTile;
    String[] tiles = domino.split(",");
    if (tiles.length < 2) return tiles.length;

   //More than 1 tile
    else {
      ArrayList<String> tilesList = new ArrayList<String>();
      for (String tile : tiles) {
        tilesList.add(tile);
         }
      Iterator<String> iterator = tilesList.iterator();
      leftTile = iterator.next();
      rightNumber = leftTile.charAt(2);
      while (iterator.hasNext()) {

        rightTile = iterator.next();
        leftNumber = rightTile.charAt(0);
        if (leftNumber == rightNumber) {
          tilesCount++;
          if(tilesCount>maxTilesCount) maxTilesCount=tilesCount;}
        else tilesCount = 1;

        leftTile = rightTile;
        rightNumber = leftTile.charAt(2);


      }

      return maxTilesCount;

    }
  }
}
