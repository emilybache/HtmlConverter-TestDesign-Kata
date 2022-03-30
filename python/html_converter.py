import html as html_converter

class UnicodeFileToHtmlTextConverter:

    def __init__(self, full_filename_with_path=None, stream=None):
        self.full_filename_with_path = full_filename_with_path
        self.stream = stream

    def convert_to_html(self):
        if self.full_filename_with_path:
            f = open(self.full_filename_with_path, "r")
        else:
            f = self.stream
        html = ""
        for line in f:
            line = line.rstrip()
            html += html_converter.escape(line, quote=True)
            html += "<br />"

        return html