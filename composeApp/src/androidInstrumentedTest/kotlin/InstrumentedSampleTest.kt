import android.content.Context
import androidx.test.core.app.ApplicationProvider
import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.Test

class InstrumentedSampleTest {

    @Test
    fun testContext() {
        val context = ApplicationProvider.getApplicationContext<Context>()

        assertThat(context.packageName).isEqualTo("com.plcoding.cmp_testing")
    }
}