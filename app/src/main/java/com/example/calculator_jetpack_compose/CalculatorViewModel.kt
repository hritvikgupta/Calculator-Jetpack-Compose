package com.example.calculator_jetpack_compose

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CalculatorViewModel:ViewModel() {
    var state by mutableStateOf(CalculatorState())

    fun onAction(action: CalculatorActions){
        when(action){
            is CalculatorActions.Number -> enterNumber(action.number)
            is CalculatorActions.Decimal -> enterDecimal()
            is CalculatorActions.clear -> state = CalculatorState()
            is CalculatorActions.operation -> enterOperation(action.operations)
            is CalculatorActions.Calculate -> performCalculation()
            is CalculatorActions.Delete -> performDeletion()


        }
    }

    private fun performDeletion() {
        when{
            state.number2.isNotBlank() -> state = state.copy(
                number2 = state.number2.dropLast(1)
            )
            state.operation !=null-> state = state.copy(
                operation = null
            )
            state.number1.isNotBlank() -> state = state.copy(
                number1 = state.number1.dropLast(1)
            )
        }
    }

    private fun performCalculation() {
        val number1 = state.number1.toDoubleOrNull()
        val number2 = state.number2.toDoubleOrNull()
        val result = when(state.operation){
            is CalculationOperations.Add -> number1?.plus(number2!!)
            is CalculationOperations.Subtract -> number1?.minus((number2!!))
            is CalculationOperations.Divide -> number1?.div((number2!!))
            is CalculationOperations.Multiply -> number1?.times((number2!!))

            else -> {return }
        }
        state = state.copy(
            number1 =  result.toString().take(15),
            number2 = "",
            operation = null
        )

    }

    private fun enterOperation(operations: CalculationOperations) {
        if(state.number1.isNotBlank()){
            state = state.copy(operation = operations)
        }

    }

    private fun enterNumber(number: Int) {
        if(state.operation == null){
            if(state.number1.length >= MAX_NUM_LENGTH){
                return
            }
            state = state.copy(
                number1 = state.number1 + number
            )
            return
        }
        if(state.number2.length >= MAX_NUM_LENGTH){
            return
        }
        state = state.copy(
            number2 = state.number2 + number
        )



    }
    private fun enterDecimal(){
        if (state.operation == null && !state.number1.contains(".")
            && state.number1.isNotBlank()){
            state = state.copy(
                number1 = state.number1 + "."
            )
            return
        }
        if (!state.number2.contains(".") && state.number2.isNotBlank()){
            state = state.copy(
                number2 = state.number2 + "."
            )

        }

    }
    companion object{
        private val MAX_NUM_LENGTH = 8
    }

}