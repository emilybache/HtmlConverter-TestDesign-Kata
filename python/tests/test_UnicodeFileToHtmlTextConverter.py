from UnicodeFileToHtmlTextConverter import UnicodeFileToHtmlTextConverter

import io


def test_html_converter():
    converter = UnicodeFileToHtmlTextConverter(full_filename_with_path="foo")
    assert "foo" == converter.full_filename_with_path


def test_convert():
    fake_file = io.StringIO("""foobar\n '' \n " """)
    converter = UnicodeFileToHtmlTextConverter(stream=fake_file)
    result = converter.convert_to_html()
    assert result == "foobar<br /> &#x27;&#x27;<br /> &quot;<br />"
