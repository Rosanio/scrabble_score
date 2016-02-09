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
  public void letterScore_UserEntersF_Returns4() {
    Scrabble testApp = new Scrabble();
    Integer score = 4;
    assertEquals(score, testApp.letterScore('f'));
  }

  @Test
  public void letterScore_UserEntersC_Returns3() {
    Scrabble testApp = new Scrabble();
    Integer score = 3;
    assertEquals(score, testApp.letterScore('c'));
  }

  @Test
  public void letterScore_UserEntersD_Returns2() {
    Scrabble testApp = new Scrabble();
    Integer score = 2;
    assertEquals(score, testApp.letterScore('d'));
  }

  @Test
  public void letterScore_UserEntersK_Returns5() {
    Scrabble testApp = new Scrabble();
    Integer score = 5;
    assertEquals(score, testApp.letterScore('k'));
  }

  @Test
  public void letterScore_UserEntersJ_Returns8() {
    Scrabble testApp = new Scrabble();
    Integer score = 8;
    assertEquals(score, testApp.letterScore('j'));
  }

  @Test
  public void letterScore_UserEntersZ_Returns10() {
    Scrabble testApp = new Scrabble();
    Integer score = 10;
    assertEquals(score, testApp.letterScore('z'));
  }
}
