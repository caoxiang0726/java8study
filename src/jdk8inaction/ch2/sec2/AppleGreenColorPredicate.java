package jdk8inaction.ch2.sec2;

import jdk8inaction.ch1.sec2.title2.Apple;

public class AppleGreenColorPredicate implements ApplePredicate{
 public boolean test(Apple apple){
 return "green".equals(apple.getColor()); 
 } 
}