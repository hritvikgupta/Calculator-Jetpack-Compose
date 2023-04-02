package com.example.calculator_jetpack_compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType.Companion.Text
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Calculator(
    State:CalculatorState,
    modifier:Modifier = Modifier,
    buttonSpacing: Dp = 8.dp,
    onAction: (CalculatorActions) -> Unit
) {
        Box(modifier = modifier){
            Column(
                modifier= Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter),
                verticalArrangement = Arrangement.spacedBy(buttonSpacing)

            ) {
                Text(
                    text = State.number1 + (State.operation?.symbol?:"")+ State.number2,
                    textAlign = TextAlign.End,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 32.dp),
                    fontWeight = FontWeight.Light,
                    fontSize = 80.sp,
                    maxLines = 2
                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ) {
                    CalculatorButton(symbol = "AC",
                        modifier = Modifier
                            .background(Color.LightGray)
                            .aspectRatio(2f)
                            .weight(2f),
                        onClick = {
                            onAction(CalculatorActions.clear)
                        }
                    )

                    CalculatorButton(symbol = "Del",
                        modifier = Modifier
                            .background(Color.LightGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorActions.Delete)
                        }
                    )

                    CalculatorButton(symbol = "/",
                        modifier = Modifier
                            .background(Color.Yellow)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorActions.operation(CalculationOperations.Divide))
                        }
                    )
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ){
                    CalculatorButton(symbol = "7",
                        modifier = Modifier
                            .background(Color.DarkGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorActions.Number(7))
                        }
                    )

                    CalculatorButton(symbol = "8",
                        modifier = Modifier
                            .background(Color.DarkGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorActions.Number(8))
                        }
                    )

                    CalculatorButton(symbol = "9",
                        modifier = Modifier
                            .background(Color.DarkGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorActions.Number(9))
                        }
                    )

                    CalculatorButton(symbol = "x",
                        modifier = Modifier
                            .background(Color.Yellow)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorActions.operation(CalculationOperations.Multiply))
                        }
                    )
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ){
                    CalculatorButton(symbol = "4",
                        modifier = Modifier
                            .background(Color.DarkGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorActions.Number(4))
                        }
                    )

                    CalculatorButton(symbol = "5",
                        modifier = Modifier
                            .background(Color.DarkGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorActions.Number(5))
                        }
                    )

                    CalculatorButton(symbol = "6",
                        modifier = Modifier
                            .background(Color.DarkGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorActions.Number(6))
                        }
                    )

                    CalculatorButton(symbol = "-",
                        modifier = Modifier
                            .background(Color.Yellow)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorActions.operation(CalculationOperations.Subtract))
                        }
                    )
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ){
                    CalculatorButton(symbol = "1",
                        modifier = Modifier
                            .background(Color.DarkGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorActions.Number(1))
                        }
                    )

                    CalculatorButton(symbol = "2",
                        modifier = Modifier
                            .background(Color.DarkGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorActions.Number(2))
                        }
                    )

                    CalculatorButton(symbol = "3",
                        modifier = Modifier
                            .background(Color.DarkGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorActions.Number(3))
                        }
                    )

                    CalculatorButton(symbol = "+",
                        modifier = Modifier
                            .background(Color.Yellow)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorActions.operation(CalculationOperations.Add))
                        }
                    )
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
                ){
                    CalculatorButton(symbol = "0",
                        modifier = Modifier
                            .background(Color.DarkGray)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorActions.Number(0))
                        }
                    )

                    CalculatorButton(symbol = "8",
                        modifier = Modifier
                            .background(Color.DarkGray)
                            .aspectRatio(2f)
                            .weight(2f),
                        onClick = {
                            onAction(CalculatorActions.Number(8))
                        }
                    )


                    CalculatorButton(symbol = "=",
                        modifier = Modifier
                            .background(Color.Yellow)
                            .aspectRatio(1f)
                            .weight(1f),
                        onClick = {
                            onAction(CalculatorActions.Calculate)
                        }
                    )
                }
            }
        }
}