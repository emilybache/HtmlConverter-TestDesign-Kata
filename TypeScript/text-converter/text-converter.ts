import * as fs from 'fs';
import * as rd from 'readline';
import htmlEncode from "./http-utility";

export default class HtmlConverter {

  public convertToHtml(filename: string): string {
    const reader = rd.createInterface(fs.createReadStream(filename));
    return this.ConvertToHtml(reader);
  }

  private ConvertToHtml(reader: rd.ReadLine) {
    // bug: should be '<html>'
    let html = '<html<';
    reader.on("line", (line: string) => {
      html += '<p>';
      const trimmedLine = line.trim();
      html += htmlEncode(trimmedLine);
      // bug: should be '</p>'
      html += '<br />';
    });
    reader.on('close', () => {
      html += '</html>';
    });
    return html;
  }
}
