import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class Scrabble {
  public static void main(String[] args) {

  }

  public Integer scrabbleScore(String word) {
    char[] charArray = word.toCharArray();

    for(char letter: charArray) {
      return letterScore(letter);
    }
    return 0;
  }

  public Integer letterScore(char letter) {
    char[] score4 = {'f','h','v','w','y'};
    char[] score3 = {'b','c','m','p'};
    for(char scoreLetter: score4) {
      if(letter == scoreLetter) {
        return 4;
      }
    }
    for(char scoreLetter: score3) {
      if(letter == scoreLetter) {
        return 3;
      }
    }
    if(letter == 'd' || letter == 'g') {
      return 2;
    }
    if(letter == 'k') {
      return 5;
    }
    if(letter == 'j' || letter == 'x') {
      return 8;
    }
    if(letter == 'q' || letter == 'z') {
      return 10;
    }
    return 1;
  }
}
