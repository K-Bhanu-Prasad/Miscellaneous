package com.cg.wordwrap.main;

import static java.lang.Math.min;

public class WordWrap {

  public static String wrap(final String inputLine, final int lineLength) {

    if (inputLine != null) {
      final StringBuilder accumulator = new StringBuilder();
      final int length = inputLine.length();

      accumulator.append(inputLine, 0, min(length, lineLength));

      int split = lineLength;

      while (length > split) {
        accumulator.append('\n');
        accumulator.append(inputLine, split, min(length, split + lineLength));
        split += lineLength;
      }
      return accumulator.toString();
    } else {
      return null;
    }
  }
}
