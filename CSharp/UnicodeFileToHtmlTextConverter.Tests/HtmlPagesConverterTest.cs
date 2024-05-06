using Xunit;

namespace TDDMicroExercises.UnicodeFileToHtmlTextConverter;

public class HtmlPagesConverterTest
{
            
    [Fact]
    public void Foobar()
    {
        var converter = new HtmlPagesConverter("foobar.txt");
        Assert.Equal("fixme", converter.GetFilename());
    }
}