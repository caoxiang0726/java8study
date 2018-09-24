package ch2.sec2;

import ch1.sec2.title2.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate{
 public boolean test(Apple apple){
 return apple.getWeight() > 150; 
 } 
}