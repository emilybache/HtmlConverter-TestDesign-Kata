using System.IO;
using System.Linq;

namespace HtmlConverterKata;

public class HtmlConverter
{
    public string ConvertToHtml(string filename)
    {
        using (TextReader unicodeFileStream = File.OpenText(filename))
        {
            // bug: should be "<html>"
            var html = "<html<";
            var line = unicodeFileStream.ReadLine();
            while (line != null)
            {
                html += "<p>";
                line = line.Trim();
                html += HttpUtility.HtmlEncode(line);
                // bug: should be "</p>"
                html += "<br />";
                line = unicodeFileStream.ReadLine();
            }

            html += "</html>";
            return html;
        }
    }

    
}