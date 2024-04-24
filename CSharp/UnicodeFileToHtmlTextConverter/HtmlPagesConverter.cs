namespace TDDMicroExercises.UnicodeFileToHtmlTextConverter;

using System;
using System.Collections.Generic;
using System.IO;
using System.Text;

public class HtmlPagesConverter
{
    private string filename;
    private List<int> breaks = new List<int>();

    public HtmlPagesConverter(string filename)
    {
        this.filename = filename;

        this.breaks.Add(0);
        using (StreamReader reader = new StreamReader(this.filename))
        {
            int cumulativeCharCount = 0;
            string line;
            while ((line = reader.ReadLine()) != null)
            {
                cumulativeCharCount += line.Length + 1; // add one for the newline
                if (line.Contains("PAGE_BREAK"))
                {
                    int pageBreakPosition = cumulativeCharCount;
                    breaks.Add(pageBreakPosition);
                }
            }
        }
    }

    public string GetHtmlPage(int page)
    {
        using (StreamReader reader = new StreamReader(this.filename))
        {
            reader.BaseStream.Seek(breaks[page], SeekOrigin.Begin);
            StringBuilder htmlPage = new StringBuilder();
            string line;
            while ((line = reader.ReadLine()) != null)
            {
                if (line.Contains("PAGE_BREAK"))
                {
                    break;
                }

                htmlPage.Append(System.Web.HttpUtility.HtmlEncode(line));
                htmlPage.Append("<br />");
            }

            return htmlPage.ToString();
        }
    }

    public string GetFilename()
    {
        return this.filename;
    }
}