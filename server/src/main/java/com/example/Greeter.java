package com.example;
/** Say Hello.
 * @author Doug Lowe
 * @author www.LoweWriter.com
 * @version 1.5
 * @since 1.0
  */
public class Greeter {

  /** Constructor */
  public Greeter() {

  }

  /** add name
  @param String someone
  */
  public final String greet(final String someone) {
    return String.format("Hello babacar, %s!", someone);
  }
}
