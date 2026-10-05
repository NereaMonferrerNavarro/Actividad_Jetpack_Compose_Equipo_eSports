package com.example.sports

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.sports.ui.theme.SportsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SportsTheme {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .statusBarsPadding()
                        ) {
                            Text(
                                text= "TEAM TITANS",
                                color = MaterialTheme.colorScheme.primary,
                                style = MaterialTheme.typography.headlineMedium,
                                fontWeight = FontWeight.ExtraBold,
                                modifier = Modifier
                                    .align(Alignment.CenterHorizontally)
                                    .padding(top = 15.dp)

                            )

                            HorizontalDivider(
                                thickness =30.dp ,
                                color = colorResource(id = R.color.teal_700),
                                modifier = Modifier
                                .fillMaxWidth()
                            )

                            Jugador("AlexPro", "Atacante", 21, 87, R.drawable.jugador1)

                            HorizontalDivider(
                                thickness =15.dp ,
                                color = colorResource(id = R.color.teal_700),
                                modifier = Modifier
                                .fillMaxWidth())

                            Jugador("ShadowX", "Defensor", 24, 91, R.drawable.jugador2)

                            HorizontalDivider( thickness =15.dp ,
                                color = colorResource(id = R.color.teal_700),
                                modifier = Modifier
                                    .fillMaxWidth()
                            )

                            Jugador("MartaGG", "Soporte", 20, 84, R.drawable.jugador3)

                            HorizontalDivider( thickness =15.dp ,
                                color = colorResource(id = R.color.teal_700),
                                modifier = Modifier
                                    .fillMaxWidth()
                            )

                            Jugador("Destroyer", "Atacante", 23, 89, R.drawable.jugador4)

                            HorizontalDivider( thickness =15.dp ,
                                color = colorResource(id = R.color.teal_700),
                                modifier = Modifier
                                    .fillMaxWidth()
                            )

                        }
                }
            }
        }
    }


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SportsTheme {
        Jugador("PepeLuis", "Mago",56, 33, R.drawable.jugador1)
    }
}

@Composable
fun Jugador(nombre: String, rol: String, edad: Int, nivel: Int, @DrawableRes perfil: Int){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(colorResource(id = R.color.azulBebe))
            .padding(30.dp)
    ) {

        Image(
            painter = painterResource(id = perfil),
            contentDescription = "Perfil de $nombre",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
                .clip(CircleShape)
        )

        Column(
            modifier = Modifier
                .padding(start = 20.dp, top = 25.dp)
                .weight(1f)
        ) {
            Text(
                text = nombre,
                fontSize = 22.sp,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                color = colorResource(id = R.color.CnombreUsuario)
            )

            Text(
                text = "Rol: $rol",
                color = colorResource(id = R.color.Crol)
            )
        }

        Column(
            horizontalAlignment = Alignment.End,
            modifier = Modifier
                .padding( top = 26.dp)
        ) {
            Text(
                text = "Edad: $edad",
                color = colorResource(id = R.color.Cedad),
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Nivel: $nivel",
                color = colorResource(id = R.color.Cnivel),
                fontWeight = FontWeight.Bold
            )
        }
    }
}