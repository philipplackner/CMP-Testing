package com.plcoding.cmp_testing

import assertk.assertThat
import assertk.assertions.isEqualTo
import getInitials
import kotlin.test.Test


class GetInitialsKtTest {

    @Test
    fun testGetInitials() {
        val fullName = "Philipp Lackner"

        assertThat(getInitials(fullName)).isEqualTo("PL")
    }
}