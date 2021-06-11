package com.zuhlke.isolationmanager

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}