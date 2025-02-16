package ph.superapp.projectenergize.member

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun AddMemberScreen() {
    AddMemberContent()
}

@Composable
private fun AddMemberContent() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {

        Text("Add Member Screen!")
    }
}

@Composable
@Preview
private fun AddMemberPreview() {
    MemberListScreen()
}