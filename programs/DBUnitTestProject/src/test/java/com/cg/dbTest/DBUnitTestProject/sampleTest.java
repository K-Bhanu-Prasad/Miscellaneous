package com.cg.dbTest.DBUnitTestProject;

import java.io.FileInputStream;

import org.dbunit.DBTestCase;
import org.dbunit.PropertiesBasedJdbcDatabaseTester;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ITable;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Test;

/**
 * @author bkuraman
 *
 */
public class sampleTest extends DBTestCase {

  public sampleTest(String name) {

    super(name);
    System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_DRIVER_CLASS, "org.hsqldb.jdbcDriver");
    System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_CONNECTION_URL, "jdbc.hsqldb:sample");
    System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_USERNAME, "sa");
    System.setProperty(PropertiesBasedJdbcDatabaseTester.DBUNIT_PASSWORD, "");

  }

  @Override
  protected IDataSet getDataSet() throws Exception {

    return new FlatXmlDataSetBuilder().build(new FileInputStream("dataSet.xml"));
  }

  @Override
  protected DatabaseOperation getSetUpOperation() throws Exception {

    return DatabaseOperation.REFRESH;
  }

  @Override
  protected DatabaseOperation getTearDownOperation() throws Exception {

    return DatabaseOperation.NONE;
  }

  @Test
  public void testTableName() throws DataSetException, Exception {

    ITable responseTable = getDataSet().getTable("USER");
    System.out.println(responseTable);
  }

}
