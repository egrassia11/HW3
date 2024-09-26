/*
 * *** YOUR NAME GOES HERE / YOUR SECTION NUMBER ***
 *           Ethan Grassia / Section 001
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

 import java.util.*;

 public class TreeProblems {
 
   /**
    * Method different()
    *
    * Given two TreeSets of integers, return a TreeSet containing all elements 
    * that are NOT in both sets. In other words, return a TreeSet of all the
    * elements that are in one set but not the other.
    */
   
   public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
     // Create two temporary sets to store differences
     Set<Integer> tempA = new TreeSet<>(setA);
     Set<Integer> tempB = new TreeSet<>(setB);
 
     // Remove elements common to both sets
     tempA.removeAll(setB);
     tempB.removeAll(setA);
 
     // Add the remaining elements from both sets
     tempA.addAll(tempB);
 
     return tempA;
   }
 
 
   /**
    * Method removeEven()
    *
    * Given a treeMap with the key as an integer, and the value as a String,
    * remove all <key, value> pairs where the key is even. 
    */
 
   public static void removeEven(Map<Integer, String> treeMap) {
     // Create a temporary set of keys
     Set<Integer> keysToRemove = new HashSet<>();
     for (Integer key : treeMap.keySet()) {
       if (key % 2 == 0) {  // Check if the key is even
         keysToRemove.add(key);
       }
     }
 
     // Remove the collected keys
     for (Integer key : keysToRemove) {
       treeMap.remove(key);
     }
   }
 
 
   /**
    * Method treesEqual()
    *
    * Given two treeMaps, each with the key as an integer, and the value as a String,
    * return a boolean value indicating if the two trees are equal or not.
    */
 
   public boolean treesEqual(Map<Integer, String> tree1, Map<Integer, String> tree2) {
     return tree1.equals(tree2);
   }
 
 } // end treeProblems class