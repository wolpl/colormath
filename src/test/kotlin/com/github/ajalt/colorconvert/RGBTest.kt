package com.github.ajalt.colorconvert

import com.github.ajalt.testing.softly
import org.assertj.core.api.Assertions
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class RGBTest {
    @Test
    fun `RGB to HSV`() {
        softly {
            assertThat(RGB(0, 0, 0).toHSV()).isEqualTo(HSV(0, 0, 0))
            assertThat(RGB(140, 200, 100).toHSV()).isEqualTo(HSV(96, 50, 78))
            assertThat(RGB(96, 127, 83).toHSV()).isEqualTo(HSV(102, 35, 50))
            assertThat(RGB(255, 255, 255).toHSV()).isEqualTo(HSV(0, 0, 100))
        }
    }

    @Test
    fun `RGB to HSL`() {
        softly {
            assertThat(RGB(0, 0, 0).toHSL()).isEqualTo(HSL(0, 0, 0))
            assertThat(RGB(140, 200, 100).toHSL()).isEqualTo(HSL(96, 48, 59))
            assertThat(RGB(96, 127, 83).toHSL()).isEqualTo(HSL(102, 21, 41))
            assertThat(RGB(255, 255, 255).toHSL()).isEqualTo(HSL(0, 0, 100))
        }
    }

    @Test
    fun `RGB to Hex`() {
        softly {
            assertThat(RGB(0, 0, 0).toHex()).isEqualTo("000000")
            assertThat(RGB(140, 200, 100).toHex(true)).isEqualTo("#8cc864")
            assertThat(RGB(255, 255, 255).toHex()).isEqualTo("ffffff")
        }
    }

    @Test
    fun `Hex to RGB`() {
        softly {
            assertThat(RGB("000000")).isEqualTo(RGB(0, 0, 0))
            assertThat(RGB("#8CC864")).isEqualTo(RGB(140, 200, 100))
            assertThat(RGB("ffffff")).isEqualTo(RGB(255, 255, 255))
        }
    }
}
