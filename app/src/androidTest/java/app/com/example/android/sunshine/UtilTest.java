package app.com.example.android.sunshine;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by kkrause on 8/21/2015.
 */
public class UtilTest extends TestCase {

    public void testAdd()  {
        int actual = 0;

        actual = Util.Add(3, 2);

        Assert.assertEquals(5, actual);
    }
}