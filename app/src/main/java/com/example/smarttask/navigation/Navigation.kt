package com.example.smarttask.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.smarttask.screens.home.HomeScreen
import com.example.smarttask.screens.oneNotice.TodoScreen


@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(
            route = Screen.HomeScreen.route
        ) {
            HomeScreen(navController)
        }
        composable(
            //route = Screen.TodoScreen.route, //without argument
            route = Screen.TodoScreen.route + "?noteNumber={noteNumber}", //with optional argument
            //route = Screen.TodoScreen.route + "/{noteNumber}", //without optional argument
            arguments = listOf(  //with argument
                navArgument("noteNumber") {
                    type = NavType.StringType
                    defaultValue = null //hier kann z.b. auch ein richtiger Default Wert (z.B. als String) hin
                    nullable = true
                })
        ) {entry ->  //with argument
            //TodoScreen() //without argument
            TodoScreen(noteNumber = entry.arguments?.getString("noteNumber")) //with arguments
        }
    }
}


