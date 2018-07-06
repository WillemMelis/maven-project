package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
    * @param someone the name of the persone
    * @return greeting string
    */
  public final String greet(final String someone) {
    return String.format("Hello alles goed of niet , %s!", someone);
  }
}
