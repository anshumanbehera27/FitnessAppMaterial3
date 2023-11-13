package com.example.fitpro.data

interface Destination{
    val route:String
}
object  welcome:Destination{
    override val route = "welcome"

}
object home:Destination{
    override val route = "home"
}