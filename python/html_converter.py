"""
This is a variant on Luca Minudel's original exercise created by Emily Bache
"""
import html as html_converter


class HtmlConverter:

    def convert_to_html(self, filename):
        with open(filename, "r") as f:
            return self.convert_file_contents_to_html(f)

    def convert_file_contents_to_html(self, file):
        # bug: should be "<html>"
        html = "<html<"
        for line in file:
            html += "<p>"
            line = line.strip()
            html += self.escape(line, quote=True)
            # bug: should be "</p>"
            html += "<br />"
        html += "</html>"
        return html

    def escape(self, line, quote):
        return html_converter.escape(line, quote=quote)


if __name__ == "__main__":
    import sys
    if len(sys.argv) < 2:
        print("Usage: html_converter.py <filename>")
        sys.exit(1)
    filename = sys.argv[1]
    converter = HtmlConverter()
    print(converter.convert_to_html(filename))
