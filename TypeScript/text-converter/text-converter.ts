import * as fs from 'fs';
import * as rd from 'readline';

export default class HtmlConverter {

  public convertToHtml(filename: string): string {
    const reader = rd.createInterface(fs.createReadStream(filename));

    // bug: should be '<html>'
    let html = '<html<';
    reader.on("line", (line: string) => {
      html += '<p>';
      const trimmedLine = line.trim();
      html += htmlEncode(trimmedLine); // For encoding HTML, you can use a library like 'he' if necessary
      // bug: should be '</p>'
      html += '<br />';
    });
    reader.on('close', () => {
      html += '</html>';
    });
    return html;
  }
}
