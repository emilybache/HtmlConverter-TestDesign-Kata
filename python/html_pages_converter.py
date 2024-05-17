"""
This is a variant on Luca Minudel's original exercise created by Emily Bache
"""
import html as html_converter


class HtmlPagesConverter:
    def __init__(self, filename):
        self.filename = filename
        self.breaks = [0]
        cumulative_char_count = 0
        for line in open(filename, "r"):
            cumulative_char_count += len(line) + 1  # add one for the newline
            if "PAGE_BREAK" in line:
                page_break_position = cumulative_char_count
                self.breaks.append(page_break_position)

    def get_html_page(self, page):
        html_page = ""
        f = open(self.filename, "r")
        f.seek(self.breaks[page])
        for line in f:
            if "PAGE_BREAK" in line:
                break
            line = line.rstrip()
            html_page += html_converter.escape(line, quote=True)
            html_page += "<br />"
        return html_page
