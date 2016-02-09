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
    for(char scoreLetter: score4) {
      if(letter == scoreLetter) {
        return 4;
      }
    }
    return 1;
  }
}
