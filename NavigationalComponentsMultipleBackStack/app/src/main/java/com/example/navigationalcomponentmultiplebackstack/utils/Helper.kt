package com.example.navigationalcomponentmultiplebackstack.utils

import androidx.navigation.NavController

class Helper {

    companion object {
        fun isCurrentDestination(navController: NavController, fragment: Int): Boolean {
            return navController.currentDestination?.id == fragment
        }
    }

}