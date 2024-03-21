package com.example.to_docompose.ui.screens.list

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.compose.material.MaterialTheme
import com.example.to_docompose.data.models.Priority
import com.example.to_docompose.data.models.ToDoTask
import com.example.to_docompose.ui.theme.LARGE_PADDING
import com.example.to_docompose.ui.theme.PRIORITY_INDICATOR_SIZE
import com.example.to_docompose.ui.theme.TASK_ITEM_ELEVATION
import com.example.to_docompose.ui.theme.taskItemBackgroundColor
import com.example.to_docompose.ui.theme.taskItemTextColor

@Composable
fun ListContent(){

}

@Composable
fun TaskItem(
    toDoTask: ToDoTask,
    navigateToTaskScreen: (taskId: Int) -> Unit
){
    Surface(modifier = Modifier.fillMaxWidth(),
        color = MaterialTheme.colors.taskItemBackgroundColor,
        shape = RectangleShape,
        shadowElevation = TASK_ITEM_ELEVATION,
        onClick = {
            navigateToTaskScreen(toDoTask.id)
        }
        ) {

        Column(modifier = Modifier
            .padding(all = LARGE_PADDING)
            .fillMaxWidth()) {
            Row{
                Text(modifier = Modifier.weight(8f),
                    text = toDoTask.title,
                    color = MaterialTheme.colors.taskItemTextColor,
                    style = MaterialTheme.typography.title1,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1)
                Box(modifier = Modifier.fillMaxWidth()
                    .weight(1f),
                    contentAlignment = Alignment.TopEnd
                ){
                    Canvas(
                        modifier = Modifier
                            .width(PRIORITY_INDICATOR_SIZE)
                            .height(PRIORITY_INDICATOR_SIZE)
                    ) {
                        drawCircle(
                            color = toDoTask.priority.color
                        )
                    }
                }
            }
            Text(modifier = Modifier.fillMaxWidth(),
                text = toDoTask.description,
                color = MaterialTheme.colors.taskItemTextColor,
                style = MaterialTheme.typography.caption1,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis)

        }
    }
}

@Composable
@Preview
fun TaskItemPreview(){
    TaskItem(
        toDoTask = ToDoTask(
            id = 0,
            title = "Title",
            description = "Sample Task",
            priority = Priority.MEDIUM
        ),
        navigateToTaskScreen = {}
    )
}
