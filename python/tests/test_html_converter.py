import io

import pytest

from html_converter import HtmlConverter


def FakeFile_v1(text):
    return io.StringIO(text)


def FakeFile_v2(text):
    return text.splitlines(True)


def test_html_converter_uses_valid_html_tags():
    text = ""
    file = FakeFile_v1(text)
    result = HtmlConverter().convert_file_contents_to_html(file)
    assert result == "<html></html>"


def test_html_converter_uses_valid_paragraph_tags():
    text = """\
    line 1
    line 2   """
    file = FakeFile_v1(text)
    result = HtmlConverter().convert_file_contents_to_html(file)
    assert result == "<html><p>line 1</p><p>line 2</p></html>"


def test_html_converter_uses_valid_html_tags_with_stub():
    file = StubEmptyFile()
    result = HtmlConverter().convert_file_contents_to_html(file)
    assert result == "<html></html>"


def test_html_converter_uses_valid_paragraph_tags_with_stub():
    file = StubTwoLineFile()
    result = HtmlConverter().convert_file_contents_to_html(file)
    assert result == "<html><p>line 1</p><p>line 2</p></html>"


class StubEmptyFile:
    def __iter__(self):
        return self

    def __next__(self):
        raise StopIteration


class StubTwoLineFile:
    def __init__(self):
        self.current = -1

    def __iter__(self):
        return self

    def __next__(self):
        self.current += 1
        if self.current == 0:
            return " line 1"
        if self.current == 1:
            return " line 2  "
        raise StopIteration

