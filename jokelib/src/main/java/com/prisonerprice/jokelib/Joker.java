package com.prisonerprice.jokelib;

/*
Joke Reference: https://www.rd.com/funny-stuff/short-jokes/
 */

import java.util.Random;

public class Joker {

    private static String[] jokes = new String[]{
        "What's the best thing about Switzerland?\nI don't know, but the flag is a big plus.",
                "I invented a new word!\nPlagiarism!",
                "Did you hear about the mathematician who's afraid of negative numbers?\nHe will stop at nothing to avoid them.",
                "Why do we tell actors to break a leg?\nBecause every play has a cast.",
                "Helvetica and Times New Roman walk into a bar.\n\"Get out of here!\"shouts the bartender.\"We don't serve your type!\"",
                "Yesterday I saw a guy spill all his Scrabble letters on the road.\nI asked him, \"What's the word on the street?\"",
                "Here about the new restaurant called Karma?\nThere's no menu: You get what you deserve.",
                "Why don't scientists trust atoms?\nBecause they make up everything."
    };

    public static String getJoke(){
        int length = jokes.length;
        Random random = new Random();
        int r = random.nextInt(length);
        return jokes[r];
    }
}
