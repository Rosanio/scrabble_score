import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class Scrabble {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/scrabble", (request, response) -> {
      HashMap model = new HashMap();

      model.put("template", "templates/scrabble.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/scrabbleresult", (request, response) -> {
      HashMap model = new HashMap();

      String wordEntry = request.queryParams("wordEntry");
      Integer scoreResult = Scrabble.scrabbleScore(wordEntry);

      model.put("wordEntry", wordEntry);
      model.put("scoreResult", scoreResult);
      model.put("template", "templates/scrabbleresult.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }

  public static Integer scrabbleScore(String word) {
    word = word.toLowerCase();
    char[] charArray = word.toCharArray();
    Integer sumScore = 0;
    for(char letter: charArray) {
      sumScore += letterScore(letter);
    }
    return sumScore;
  }

  public static Integer letterScore(char letter) {
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
    if(letter == ' ') {
      return 0;
    }
    return 1;
  }
}
