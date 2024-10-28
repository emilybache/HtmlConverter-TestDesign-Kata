
export default function htmlEncode(line: string): string {
  line = line.replace(/</g, "&lt;");
  line = line.replace(/>/g, "&gt;");
  line = line.replace(/&/g, "&amp;");
  line = line.replace(/"/g, "&quot;");
  line = line.replace(/'/g, "&quot;");
  return line;
}
