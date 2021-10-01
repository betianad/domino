package ar.com.palomonte.domino;


import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DominoTest {

  @Test
  void testTiles() {

    assertEquals(1,Domino.numberOfTiles("1-1"));
    assertEquals(1,Domino.numberOfTiles("1-2,1-2"));
    assertEquals(4,Domino.numberOfTiles("3-2,2-1,1-4,4-4,5-4,4-2,2-1"));
    assertEquals(7,Domino.numberOfTiles("5-5,5-5,4-4,5-5,5-5,5-5,5-5,5-5,5-5,5-5"));
    assertEquals(4,Domino.numberOfTiles("1-1,3-5,5-5,5-4,4-2,1-3"));
    assertEquals(3,Domino.numberOfTiles("1-2,2-2,3-3,3-4,4-5,1-1,1-2"));
    assertEquals(3,Domino.numberOfTiles("1-1,1-1,1-1,2-2,2-2,3-3"));


  }
}
