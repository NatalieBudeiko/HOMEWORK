package homework21;

public class StringVsStringBuffer {

    public static final int INT = 300000;

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String result = "";
        for (int i = 0; i < INT; i++) {
            result = result + "b";
        }
        System.out.println((System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < INT; i++) {
            stringBuffer.append('b');
        }
        System.out.println((System.currentTimeMillis() - start));

    }
}
