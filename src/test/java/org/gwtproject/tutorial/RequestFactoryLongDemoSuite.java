package org.gwtproject.tutorial;

import org.gwtproject.tutorial.client.RequestFactoryLongDemoTest;
import com.google.gwt.junit.tools.GWTTestSuite;
import junit.framework.Test;
import junit.framework.TestSuite;

public class RequestFactoryLongDemoSuite extends GWTTestSuite {
  public static Test suite() {
    TestSuite suite = new TestSuite("Tests for RequestFactoryLongDemo");
    suite.addTestSuite(RequestFactoryLongDemoTest.class);
    return suite;
  }
}
