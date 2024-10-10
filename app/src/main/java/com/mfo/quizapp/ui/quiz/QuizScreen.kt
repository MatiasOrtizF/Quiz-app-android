package com.mfo.quizapp.ui.quiz

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun QuizScreen() {
    val questions = listOf<String>(
        "1",
        "2",
        "3",
        "4",
    )

    Column (
        Modifier
            .fillMaxSize()
            .padding(10.dp)
        ) {
        Text(
            text = "Question 6 of 10"
        )
        Text(
            text = "Which of these color contrast ratios defines the minimum WCAG 2.1 Level AA requirement for normal text?"
        )
        Column (Modifier.padding(top = 20.dp)) {
            questions.forEach {question ->
                QuizItem(question, modifier = Modifier)
                Spacer(modifier = Modifier.height(5.dp))
            }
        }
        Button(
            onClick = { println("submit")},
            Modifier
                .fillMaxWidth()
            ) {
                Text(text = "Submit answer")
        }
    }
}

@Composable
private fun QuizItem(
    question: String,
    modifier: Modifier = Modifier
) {
    Box (modifier = modifier
        .fillMaxWidth()
        .height(50.dp)
        .background(Color.Blue, RoundedCornerShape(10.dp))
        .padding(10.dp),
        contentAlignment = Alignment.CenterStart
    ) {
        Text(
            text = question,
            color = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
fun QuizScreenPreview() {
    QuizScreen()
}