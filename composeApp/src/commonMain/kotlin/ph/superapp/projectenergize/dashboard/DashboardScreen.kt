package ph.superapp.projectenergize.dashboard

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun DashboardScreen() {
    DashboardContent()
}

@Composable
private fun DashboardContent() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

        Text("Dashboard Screen!")
    }
}

@Composable
@Preview
private fun DashboardPreview() {
    DashboardScreen()
}