#include <iostream>
#include <fstream>
#include <string>

#include "HtmlConverter.h"

int main(int argc, char* argv[]) {
    if (argc < 2) {
        std::cerr << "Usage: " << argv[0] << " <filename>" << std::endl;
        return 1;
    }
    std::string filename(argv[1]);
    std::cout << HtmlConverter().convertToHtml(filename);
    return 0;
}
