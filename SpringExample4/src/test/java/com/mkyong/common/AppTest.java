package com.mkyong.common;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/** 
 * @ClassName: AppTest 
 * @author: Hoboson
 * @Email:  1104069183@qq.com  
 * @date: 2017年12月5日 上午9:52:53  
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
}
