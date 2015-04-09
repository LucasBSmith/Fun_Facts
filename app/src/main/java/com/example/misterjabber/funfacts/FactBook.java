package com.example.misterjabber.funfacts;

import java.util.Random;

/**
 * Created by Mister Jabber on 3/14/2015.
 */
public class FactBook {

    public String[] mFacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually mostly made out of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach the Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
            "Treehouse is not actually in a tree."};

   public String getFact(){



       // Declare the 'fact' string
       String fact = "";
       Random randomGenerator = new Random();
       int randomNumber = randomGenerator.nextInt(mFacts.length);
       // Assign the 'fact' to the specific element from the array

       fact = mFacts[randomNumber];

       return fact;
   }


}
