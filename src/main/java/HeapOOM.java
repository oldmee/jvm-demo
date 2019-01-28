import java.util.ArrayList;
import java.util.List;

/**
 * @author R.oldmee
 * @date 2019/1/9 8:48 PM
 */
public class HeapOOM {
    static class OOMObject {

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true) {
            list.add(new OOMObject());
        }
    }
}
