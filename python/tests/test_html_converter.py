import pytest

from html_converter import UnicodeFileToHtmlTextConverter


def test_html_converter():
    converter = UnicodeFileToHtmlTextConverter("foo")
    assert "foo" == converter.full_filename_with_path
