import androidx.compose.runtime.DisposableEffect
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
        val socket = MySocket()

        DisposableEffect(Unit) {
            onDispose {
                socket.disconnect()
            }
        }
    }