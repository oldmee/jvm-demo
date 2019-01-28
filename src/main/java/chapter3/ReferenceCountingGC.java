package chapter3;

import org.junit.Test;

/**
 * @author R.oldmee
 * @date 2019/1/10 10:26 PM
 */
public class ReferenceCountingGC {
    public Object instance = null;
    private static final int _1MB = 1024 * 1024;

    private byte[] size = new byte[2 * _1MB];

    @Test
    public void test() {
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();

        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;

        System.gc();
    }
}
