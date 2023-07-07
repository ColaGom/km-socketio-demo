import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.singleWindowApplication
import kr.alphaca.socket.MySocket

fun main() =
    singleWindowApplication(
        title = "Socket.io",
        state = WindowState(size = DpSize(360.dp, 640.dp))
    ) {
        var signal by remember { mutableStateOf("") }

        val socket = MySocket {
            signal = it
        }

        Text(signal)

        DisposableEffect(Unit) {
            onDispose {
                socket.disconnect()
            }
        }
    }