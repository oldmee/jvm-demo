package chapter3;

/**
 * @author R.oldmee
 * @date 2019/1/11 8:37 PM
 */
public class FinalizeEscape {
    private static FinalizeEscape hook = null;



    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize方法执行");
        hook = this;
    }

    public static void main(String[] args) throws InterruptedException {
        hook = new FinalizeEscape();
        hook = null;
        System.gc();
        Thread.sleep(500);
        if (hook != null) {
            hook.isAlive();
        } else {
            System.out.println("我被回收了");
        }

        hook = null;
        System.gc();
        Thread.sleep(500);
        if (hook != null) {
            hook.isAlive();
        } else {
            System.out.println("我被回收了");
        }

    }

    private void isAlive() {
        System.out.println("我还活着");
    }
}
