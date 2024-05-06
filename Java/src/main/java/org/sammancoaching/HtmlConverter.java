package org.sammancoaching;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HtmlConverter {

    public String convertToHtml(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        // bug: should be "<html>"
        StringBuilder html = new StringBuilder("<html<");
        while (line != null)
        {
            html.append("<p>");
            line = line.trim();
            html.append(StringEscapeUtils.escapeHtml(line));
            // bug: should be "</p>"
            html.append("<br />");
            line = reader.readLine();
        }
        html.append("</html>");
        return html.toString();
    }
}
