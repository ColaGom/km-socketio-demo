package kr.alphaca.socket

import io.socket.client.IO
import io.socket.client.Socket

class MySocket(
    private val listener: Listener
) {
    fun interface Listener {
        fun onSignal(message: String)
    }

    private val socket: Socket = IO.socket("http://localhost:3000")

    init {
        socket.connect()

        socket.on("signal") {
            val message = it[0]
            listener.onSignal(message.toString())
        }
    }

    fun disconnect() {
        socket.disconnect()
    }
}
