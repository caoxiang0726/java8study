package jdk8inaction.ch2.sec2;

import jdk8inaction.ch1.sec2.title2.Apple;

public class AppleHeavyWeightPredicate implements ApplePredicate{
 public boolean test(Apple apple){
 return apple.getWeight() > 150; 
 } 
}