from html_pages_converter import HtmlPagesConverter


def test_html_converter():
    converter = HtmlPagesConverter("foo")
    assert "foo" == converter.filename
