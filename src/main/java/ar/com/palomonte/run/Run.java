package ar.com.palomonte.run;
import java.util.*;

public class Run {


  static int longestRun(List<Pair> elements) {

    int maxRun = 1;
    int runCount = 1;
    Pair actualElement, lastElement;


    if (elements.size() < 2) return elements.size();

      //More than 1 element
    else {

      Iterator<Pair> iterator = elements.iterator();
      lastElement = iterator.next();

      while (iterator.hasNext()) {

        actualElement = iterator.next();

        if (lastElement.runsWith(actualElement)) {
          runCount++;
          if (runCount > maxRun) maxRun = runCount;
        } else runCount = 1;

        lastElement = actualElement;


      }


      return maxRun;

    }
  }


  static int longestTileRun(String domino) {

    String[] tiles = domino.split(",");
    List<Pair> tilesList = new ArrayList<Pair>();
      for (String tileString : tiles) {
        int x=Integer.parseInt(String.valueOf(tileString.charAt(0)));
        int y=Integer.parseInt(String.valueOf(tileString.charAt(2)));
        Tile tile = new Tile(x, y);
        tilesList.add(tile);
      }
   return Run.longestRun(tilesList);
  }
}

