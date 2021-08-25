package com.cg.wordwrap.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cg.wordwrap.main.WordWrap;

/**
 * @author bkuraman
 *
 */
public class WordWrapTest {

  WordWrap wordWrap;

  /**
   * @throws java.lang.Exception
   */
  @Before
  public void setUp() throws Exception {

    this.wordWrap = new WordWrap();
  }

  /**
   * @throws java.lang.Exception
   */
  @After
  public void tearDown() throws Exception {

    this.wordWrap = null;
  }

  /**
   *
   */
  @Test
  public void testWordWrapStringNotNull() {

    StringBuilder accumulator = new StringBuilder();
    accumulator.append("ABCD EF");
    accumulator.append("\n");
    accumulator.append("GH IJKL");

    String result = WordWrap.wrap("ABCD EFGH IJKL", 7);
    assertEquals(accumulator.toString(), result);
  }

  /**
   *
   */
  @Test
  public void testWordWrapStringNull() {

    String result = WordWrap.wrap(null, 7);
    assertNull(result);
  }

}
