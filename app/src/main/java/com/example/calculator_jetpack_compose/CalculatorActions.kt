package com.example.calculator_jetpack_compose

sealed class CalculatorActions{
    data class Number(val number:Int):CalculatorActions()
    object clear:CalculatorActions()
    object Delete:CalculatorActions()
    object Decimal:CalculatorActions()
    object Calculate:CalculatorActions()
    data class operation(val operations: CalculationOperations):CalculatorActions()

}
