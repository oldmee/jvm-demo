/**
 * @author R.oldmee
 * @date 2019/1/9 11:20 PM
 */
public class JavaVmStackOOM {

    private void dontStop() {
        while (true) {
            new JavaVmStackOOM();
        }
    }

    public void stackLeakByThread() {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                dontStop();
            }
        });
        thread.start();
    }

    public static void main(String[] args) {
        JavaVmStackOOM oom = new JavaVmStackOOM();
        oom.stackLeakByThread();
    }
}
