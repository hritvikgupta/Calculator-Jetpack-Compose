package com.example.calculator_jetpack_compose

sealed class CalculationOperations(val symbol:String){
    object Add:CalculationOperations("+")
    object Subtract:CalculationOperations("-")
    object Multiply:CalculationOperations("*")
    object Divide:CalculationOperations("/")

}
