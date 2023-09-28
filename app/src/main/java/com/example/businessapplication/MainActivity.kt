package com.example.businessapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businessapplication.ui.theme.BusinessApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}
//
@Composable
fun BusinessCardApp(){
   Column(modifier = Modifier.background(Color.LightGray), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
       val image = painterResource(R.drawable.android_logo)
       Image(
           painter = image,
           contentDescription = null,
           modifier = Modifier.size(150.dp)
               .background(Color.Black)
           )
       Text(
           text = stringResource(R.string.tirth_patel),
           modifier = Modifier.padding(top = 20.dp, bottom = 5.dp),
           fontWeight = FontWeight.Bold
       )
       Text(
           text = "Android Developer",
       )

   }
    DetailsCard()
}
@Preview(showBackground = true)
@Composable
fun DetailsCard(){
    Column(modifier = Modifier.absolutePadding(bottom = 10.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally,

    )

    {
        Row (modifier=Modifier){
            Icon(
                Icons.Default.Call,
                contentDescription = "Phone",
                modifier = Modifier
                    .absolutePadding(right = 5.dp)
                    .size(18.dp),
            )
            Text(
                text = "+1 222 333 4444",
                fontSize = 20.sp,
                modifier = Modifier.absolutePadding(bottom = 10.dp),
                textAlign = TextAlign.Justify
            )
        }
        Row {
            Icon(
                Icons.Default.Share,
                contentDescription = "Share",
                modifier = Modifier
                    .absolutePadding(right = 5.dp)
                    .size(18.dp)

            )
            Text(
                text = "@AndroidDev",
                fontSize = 20.sp,
                modifier = Modifier.absolutePadding(bottom = 10.dp),
                textAlign = TextAlign.Justify
            )
        }
        Row {
            Icon(
                Icons.Default.Email,
                contentDescription = "Share",
                modifier = Modifier
                    .absolutePadding(right = 5.dp)
                    .size(18.dp)

            )
            Text(
                text = "tirth@gmail.com",
                fontSize = 20.sp,
                modifier = Modifier.absolutePadding(bottom = 10.dp),
                textAlign = TextAlign.Justify
            )
        }





    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessApplicationTheme {
        BusinessCardApp()

    }
}