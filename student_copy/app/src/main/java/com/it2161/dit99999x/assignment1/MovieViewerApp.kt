package com.it2161.dit99999x.assignment1

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun MovieViewerApp() {

    Scaffold(

        modifier = Modifier.fillMaxSize()

    ) { innerPadding ->

        var modifier = Modifier.fillMaxSize().padding(innerPadding)

    }


}





