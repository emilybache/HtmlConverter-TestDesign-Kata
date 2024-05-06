namespace TDDMicroExercises.UnicodeFileToHtmlTextConverter;

class HttpUtility
{
    public static string HtmlEncode(string line)
    {
        line = line.Replace("<", "&lt;");
        line = line.Replace(">", "&gt;");
        line = line.Replace("&", "&amp;");
        line = line.Replace("\"", "&quot;");
        line = line.Replace("\'", "&quot;");
        return line;
    }
}