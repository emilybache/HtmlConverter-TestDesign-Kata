
using Xunit;
namespace TDDMicroExercises.UnicodeFileToHtmlTextConverter
{
    public class UnicodeFileToHtmlTextConverterTest
    {
        [Fact]
        public void Foobar()
        {
            var converter = new UnicodeFileToHtmlTextConverter("foobar.txt");
            Assert.Equal("fixme", converter.GetFilename());
        }        
        
    }
}
