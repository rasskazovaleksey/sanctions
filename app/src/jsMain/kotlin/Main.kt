import androidx.compose.ui.window.Window
import com.github.rasskazovalexey.sanction.NavigationHost
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    onWasmReady {
        Window("Challenge") {
            NavigationHost()
        }
    }
}
