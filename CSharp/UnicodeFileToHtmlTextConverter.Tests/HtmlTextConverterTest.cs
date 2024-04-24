
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
    }
}
