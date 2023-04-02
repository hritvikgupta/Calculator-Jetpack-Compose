package com.example.calculator_jetpack_compose

data class CalculatorState(
    val number1:String = "",
    val number2:String = "",
    val operation:CalculationOperations?=null
)

