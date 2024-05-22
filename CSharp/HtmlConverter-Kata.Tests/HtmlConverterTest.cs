using Xunit;

namespace HtmlConverterKata;

public class HtmlConverterTest
{
    [Fact]
    public void ConvertToHtml_UsesValidHtmlTags()
    {
        TextReader sr = new StringReader("");
        var result = HtmlConverter.ConvertToHtml(sr);
        Assert.Equal("<html></html>", result);
    }

    [Fact]
    public void ConvertToHtml_UsesValidParagraphTags()
    {
        TextReader sr = new StringReader("first line\n second line  \n");
        var result = HtmlConverter.ConvertToHtml(sr);
        Assert.Equal("<html></html>", result);
    }    
    
    [Fact]
    public void ConvertToHtml_UsesValidHtmlTags_Stub()
    {
        TextReader sr = new StubEmptyReader();
        var result = HtmlConverter.ConvertToHtml(sr);
        Assert.Equal("<html></html>", result);
    }

    [Fact]
    public void ConvertToHtml_UsesValidParagraphTags_Stub()
    { 
        TextReader sr = new StubTwoLineReader();
        var result = HtmlConverter.ConvertToHtml(sr);
        Assert.Equal("<html><p>first line</p><p>second line</p></html>", result);
    }
}

class StubTwoLineReader : TextReader
{
    private int _counter = -1;

    public override string? ReadLine()
    {
        _counter++;
        if (_counter == 0)
        {
            return "first line\n";
        }
        else if (_counter == 1)
        {
            return "  second line  \n";
        }
        return null;
    }

    public override void Close()
    {
    }
}

class StubEmptyReader : TextReader
{

    public override string? ReadLine()
    {
        return null;
    }
    
    public override void Close()
    {
    }
}