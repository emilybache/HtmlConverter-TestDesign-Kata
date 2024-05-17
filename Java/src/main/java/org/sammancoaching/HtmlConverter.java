package org.sammancoaching;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import static org.sammancoaching.StringEscapeUtils.escapeHtml;

public class HtmlConverter {

    public String convertToHtml(String filename) throws IOException {
        var in = new FileReader(filename);
        return convertToHtml(in);
    }

    public String convertToHtml(Reader in) throws IOException {
        BufferedReader reader = new BufferedReader(in);
        String line = reader.readLine();
        // bug: should be "<html>"
        var html = new StringBuilder("<html<");
        while (line != null) {
            html.append("<p>");
            line = line.trim();
            html.append(escapeHtml(line));
            // bug: should be "</p>"
            html.append("<br />");
            line = reader.readLine();
        }
        html.append("</html>");
        return html.toString();
    }

    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Usage: java HtmlConverter <filename>");
            System.exit(1);
        }
        HtmlConverter converter = new HtmlConverter();
        System.out.print(converter.convertToHtml(args[0]));
    }
}
