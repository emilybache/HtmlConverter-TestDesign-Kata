"""
This is a python translation of the original exercise from Luca Minudel
"""
import html as html_converter


class UnicodeFileToHtmlTextConverter:

    def __init__(self, full_filename_with_path=None, stream=None):
        self.full_filename_with_path = full_filename_with_path
        self.stream  = stream

    def convert_to_html(self):
        if self.full_filename_with_path is not None:
            f = open(self.full_filename_with_path, "r")
        elif self.stream is not None:
            f = self.stream
        else:
            raise ValueError("Either full_filename_with_path or stream must be specified")

        html = ""
        for line in f:
            line = line.rstrip()
            html += html_converter.escape(line, quote=True)
            html += "<br />"

        return html
