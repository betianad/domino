package ar.com.palomonte.run;


import ar.com.palomonte.domino.Domino;
import org.junit.jupiter.api.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RunTest {

  @Test
  void testRuns() {

    List<Pair> points = Arrays.asList(new Point(2, 9), new Point(23,
            94), new Point(23, 94), new Point(23, 94));

    assertEquals(3, Run.longestRun(points));


    List<Pair> points2 = Arrays.asList(new Point(2, 9),
                                         new Point(23, 94),
                                         new Point(23, 94),
                                         new Point(23, 94),
                                         new Point(23, 2),
                                         new Point(23, 2));

    assertEquals(3, Run.longestRun(points2));


    List<Pair> points3 = Arrays.asList(new Point(2, 9),
            new Point(23, 94),
            new Point(23, 94),
            new Point(23, 94),
            new Point(23, 94),
            new Point(23, 94),
            new Point(23, 94),
            new Point(23, 2),
            new Point(23, 2));

    assertEquals(6, Run.longestRun(points3));

    List<Pair> points4 = Arrays.asList(new Point(2, 9),
            new Point(23, 94),
            new Point(23, 94),
            new Point(23, 94),
            new Point(23, 94),
            new Point(23, 94),
            new Point(23, 94),
            new Point(23, 2),
            new Point(23, 2),
            new Point(23, 2),
            new Point(23, 2),
            new Point(23, 2),
            new Point(23, 2),
            new Point(23, 2));


    assertEquals(7, Run.longestRun(points4));


  }

  @Test
  void testTiles() {

    assertEquals(1,Run.longestTileRun("1-1"));
    assertEquals(1,Run.longestTileRun("1-2,1-2"));
    assertEquals(4,Run.longestTileRun("3-2,2-1,1-4,4-4,5-4,4-2,2-1"));
    assertEquals(7,Run.longestTileRun("5-5,5-5,4-4,5-5,5-5,5-5,5-5,5-5,5-5,5-5"));
    assertEquals(4,Run.longestTileRun("1-1,3-5,5-5,5-4,4-2,1-3"));
    assertEquals(3,Run.longestTileRun("1-2,2-2,3-3,3-4,4-5,1-1,1-2"));
    assertEquals(3,Run.longestTileRun("1-1,1-1,1-1,2-2,2-2,3-3"));


  }
}
