import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {
        String header1 = "Content-Type: text/html; charset=utf-8;";
        String header2 = "Content-Type: text/html; charset=windows-1251;";
        String header3 = "Content-Type: text/html; charset=ISO-8859-1;";
        String header4 = "Content-Type: text/html;";
        String header5 = "Content-Type: text/html; charset=";
        String header6 = "Content-Type: text/html; charset=;";
        String[] headers = { header1, header2, header3, header4, header5, header6 };

        StringJoiner joiner = new StringJoiner(", ");
        for (int i = 0; i < headers.length; i++) {
            String encoding = getEncoding(headers[i]);
            if (!encoding.isEmpty()) {
                joiner.add(encoding);
            }
        }

        System.out.println(joiner);
    }

    public static String getEncoding(String header) {
        String charsetStr = "charset=";
        int start = header.indexOf(charsetStr);
        if (start < 0) {
            return "";
        }
        start += charsetStr.length();
        int end = header.indexOf(';', start);
        if (end < 0) {
            return "";
        }
        return header.substring(start, end);
    }
}