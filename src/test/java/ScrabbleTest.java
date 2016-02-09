import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class ScrabbleTest {

  @Test
  public void scrabbleScore_UserEntersA_Returns1() {
    Scrabble testApp = new Scrabble();
    Integer score = 1;
    assertEquals(score, testApp.scrabbleScore("a"));
  }

}
