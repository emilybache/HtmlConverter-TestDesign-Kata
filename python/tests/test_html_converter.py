import pytest

from html_converter import HtmlConverter


def test_html_converter_uses_valid_html_tags():
    # TODO: finish this test
    pass


def test_html_converter_uses_valid_paragraph_tags():
    # TODO: finish this test
    pass


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
            return " line 1\n"
        if self.current == 1:
            return " line 2  \n"
        raise StopIteration

