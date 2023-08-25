package com.example.smarttask.screens.home

import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.smarttask.navigation.Screen

class HomeViewModel : ViewModel() {

    fun navigateToTodoScreen(navController: NavController){
        //navController.navigate(Screen.TodoScreen.withArgs("Test Notice")) //nur bei nicht-optionalen Args
        //val argForTodoScreen = "123"
        //navController.navigate("${Screen.TodoScreen.route}?noteNumber=$argForTodoScreen") //
        navController.navigate(Screen.TodoScreen.route) //wenn Argument optional ist, dann auch so möglich
    }
}