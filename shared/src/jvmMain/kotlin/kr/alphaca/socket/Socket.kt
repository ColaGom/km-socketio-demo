package kr.alphaca.socket

import io.socket.client.IO
import io.socket.client.Socket

class MySocket {
    private val socket: Socket = IO.socket("http://localhost:3000")

    init {
        socket.connect()
    }

    fun disconnect() {
        socket.disconnect()
    }
}
