package stringBuilderBuffer;

public class StringEx {
    public static void main(String[] args) {
        StringBuilder sbl = new StringBuilder();
        sbl.append("hello");
        sbl.append(" ");
        sbl.append("jump to java");
        String result = sbl.toString();
        System.out.println(result);

        System.out.println();

        StringBuffer sb = new StringBuffer();
        sb.append("jump to java");
        sb.insert(0, "hello ");
        System.out.println(sb);
        System.out.println(sb.substring(0, 4));
    }
}
