package com.katas

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UnicodeFileToHtmlTextConverterTest {
    @Test
    fun foo() {
        val converter = UnicodeFileToHtmlTextConverter("foo")
        assertThat(converter.filename).isEqualTo("fixme")
    }
}
