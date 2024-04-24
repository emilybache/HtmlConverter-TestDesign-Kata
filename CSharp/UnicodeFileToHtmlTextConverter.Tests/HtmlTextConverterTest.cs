
using Xunit;
namespace TDDMicroExercises.UnicodeFileToHtmlTextConverter
{
    public class HtmlTextConverterTest
    {
        [Fact]
        public void Foobar()
        {
            HtmlTextConverter converter = new HtmlTextConverter("foobar.txt");
            Assert.Equal("fixme", converter.GetFilename());
        }        
        
        [Fact]
        public void Foobar2()
        {
            HtmlPagesConverter converter = new HtmlPagesConverter("foobar.txt");
            Assert.Equal("fixme", converter.GetFilename());
        }
    }
}
