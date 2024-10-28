using Xunit;

namespace HtmlConverterKata;

public class HtmlConverterTest
{
    [Fact]
    public void ConvertToHtml_UsesValidHtmlTags()
    {
        // TODO: write this test
    }    
    
    [Fact]
    public void ConvertToHtml_UsesValidParagraphTags()
    {
        // TODO: write this test
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
