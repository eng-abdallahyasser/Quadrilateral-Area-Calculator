package com.abdallahyasser.areacalculator.triangleScreen

import androidx.lifecycle.ViewModel

class TriangleVM:ViewModel() {
    private var list= listOf(
        Traingle(null,null,null,null),
        Traingle(null,null,null,null),
        Traingle(null,null,null,null),
        Traingle(1f,1f,1f,null),

    )

    fun getLastItem(): Traingle {
        return list.last()
    }
    fun saveCalculation(t: Traingle) {
       list = list +t
    }
}