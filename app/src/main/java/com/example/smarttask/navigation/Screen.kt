package com.example.smarttask.navigation

sealed class Screen(val route: String) {
    object HomeScreen : Screen("home_screen")
    object TodoScreen : Screen("todo_screen")

    //zum übergeben von Argumenten an den einen Screen. Achtung: Funktioniert nur mit nicht-optionalen Args
    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}