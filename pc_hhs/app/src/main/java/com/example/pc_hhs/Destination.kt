package com.example.pc_hhs

interface Destonations{
    val Route : String
}

object Home : Destonations{
    override val Route = "Home"
}

object Second : Destonations{
    override val Route = "Second"
}