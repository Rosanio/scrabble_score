import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class ScrabbleTest {

  @Test
  public void letterScore_UserEntersA_Returns1() {
    Scrabble testApp = new Scrabble();
    Integer score = 1;
    assertEquals(score, testApp.letterScore('a'));
  }

  @Test
  public void letterScore_UserEntersH_Returns4() {
    Scrabble testApp = new Scrabble();
    Integer score = 4;
    assertEquals(score, testApp.letterScore('f'));
  }

  @Test
  public void letterScore_UserEntersH_Returns4() {
    Scrabble testApp = new Scrabble();
    Integer score = 3;
    assertEquals(score, testApp.letterScore('c'));
  }
}
