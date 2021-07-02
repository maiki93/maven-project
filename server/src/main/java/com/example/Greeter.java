package com.example;

/** 
 Say Hello.
 * @author Doug Lowe
 * @author www.LoweWriter.com
 * @version 1.0
 * @since 1.0
 */
public class Greeter {

  /** Constructor. */
  public Greeter() {

  }

  /** Say greet with name.
  @param someone name of a person
  @return gretting string
  */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
