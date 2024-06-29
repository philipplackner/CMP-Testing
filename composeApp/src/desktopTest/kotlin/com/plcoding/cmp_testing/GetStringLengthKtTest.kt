package com.plcoding.cmp_testing

import assertk.assertThat
import assertk.assertions.isEqualTo
import getStringLength
import org.junit.Test

class GetStringLengthKtTest {

    @Test
    fun testGetStringLength() {
        assertThat(getStringLength("ABC")).isEqualTo(3)
    }

}