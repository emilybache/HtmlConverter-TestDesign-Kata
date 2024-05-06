using System.IO;
using System.Linq;

namespace TDDMicroExercises.UnicodeFileToHtmlTextConverter;

public class HtmlConverter
{
    public string ConvertToHtml(string filename)
    {
        using (TextReader unicodeFileStream = File.OpenText(filename))
        {
            // bug: should be "<html>"
            string html = "<html<";
            string line = unicodeFileStream.ReadLine();
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