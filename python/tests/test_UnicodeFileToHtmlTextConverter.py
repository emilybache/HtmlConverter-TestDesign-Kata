import UnicodeFileToHtmlTextConverter


def test_html_converter():
    converter = UnicodeFileToHtmlTextConverter.UnicodeFileToHtmlTextConverter("foo")
    assert "foo" == converter.full_filename_with_path
