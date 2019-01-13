import org.junit.Assert;

import static org.junit.Assert.*;

/**
 * Created by admin on 24-02-2017.
 */
public class NumberOfHopsTest {
    @org.junit.Test
    public void main() throws Exception {

        Assert.assertEquals(NumberOfHops.getNumberOfHops(12,7),4);
        Assert.assertEquals(NumberOfHops.getNumberOfHops(14,7),2);
        Assert.assertEquals(NumberOfHops.getNumberOfHops(15,7),3);
        Assert.assertEquals(NumberOfHops.getNumberOfHops(10,7),4);
        Assert.assertEquals(NumberOfHops.getNumberOfHops(9,7),3);

    }

}