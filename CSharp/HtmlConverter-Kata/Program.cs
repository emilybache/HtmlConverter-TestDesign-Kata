using System;
using System.IO;
using HtmlConverterKata;

class Program
{
    static void Main(string[] args)
    {
        if (args.Length < 1)
        {
            Console.WriteLine("Please provide a filename as an argument.");
            return;
        }

        string filename = args[0];

        try
        {
            string html = new HtmlConverter().ConvertToHtml(filename);
            Console.WriteLine(html);
        }
        catch (IOException e)
        {
            Console.WriteLine("An error occurred while reading the file: " + e.Message);
        }
    }
}