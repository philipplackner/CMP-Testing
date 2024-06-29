import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun Counter() {
    var counter by remember { mutableIntStateOf(0) }
    Column {
        Text(counter.toString())
        Button(onClick = { counter++ }) {
            Text("Increment")
        }
    }
}