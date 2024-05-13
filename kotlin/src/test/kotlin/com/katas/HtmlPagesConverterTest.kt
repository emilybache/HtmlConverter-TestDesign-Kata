package com.katas

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class HtmlPagesConverterTest {
    @Test
    fun foo() {
        val converter = HtmlPagesConverter("foo")
        assertThat(converter.filename).isEqualTo("fixme")
    }
}
