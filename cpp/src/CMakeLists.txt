set(SRC_LIB_NAME src)
set(SOURCES UnicodeFileToHtmlTextConverter.cpp HtmlConverter.cpp string_escape_utils.h
        HtmlPagesConverter.cpp
        HtmlPagesConverter.h)
add_library(${SRC_LIB_NAME} ${SOURCES})
target_sources(${SRC_LIB_NAME} PRIVATE ${SOURCES})
target_include_directories(${SRC_LIB_NAME} PUBLIC ${CMAKE_CURRENT_SOURCE_DIR})
