import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;

public class ScrabbleTest {

  @Test
  public void letterScore_UserEntersA_Returns1() {
    Integer score = 1;
    assertEquals(score, Scrabble.letterScore('a'));
  }

  @Test
  public void letterScore_UserEntersF_Returns4() {
    Integer score = 4;
    assertEquals(score, Scrabble.letterScore('f'));
  }

  @Test
  public void letterScore_UserEntersC_Returns3() {
    Integer score = 3;
    assertEquals(score, Scrabble.letterScore('c'));
  }

  @Test
  public void letterScore_UserEntersD_Returns2() {
    Integer score = 2;
    assertEquals(score, Scrabble.letterScore('d'));
  }

  @Test
  public void letterScore_UserEntersK_Returns5() {
    Integer score = 5;
    assertEquals(score, Scrabble.letterScore('k'));
  }

  @Test
  public void letterScore_UserEntersJ_Returns8() {
    Integer score = 8;
    assertEquals(score, Scrabble.letterScore('j'));
  }

  @Test
  public void letterScore_UserEntersZ_Returns10() {
    Integer score = 10;
    assertEquals(score, Scrabble.letterScore('z'));
  }

  @Test
  public void scrabbleScore_UserEntersIt_Returns2() {
    Integer score = 2;
    assertEquals(score, Scrabble.scrabbleScore("it"));
  }

  @Test
  public void scrabbleScore_UserEntersAWord_ReturnsScore() {
    Integer score = 14;
    assertEquals(score, Scrabble.scrabbleScore("it works"));
  }
}
