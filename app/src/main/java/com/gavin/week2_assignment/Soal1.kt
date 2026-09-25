package com.gavin.week2_assignment

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Soal1View() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 50.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Row(
            modifier = Modifier
                .width(320.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.dropdown_button),
                contentDescription = "Image",
                modifier = Modifier.size(24.dp)
            )
            Text(
                "Liked Songs",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Image(
                painter = painterResource(id = R.drawable.three_dot),
                contentDescription = "Image",
                modifier = Modifier.size(24.dp)
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Image(
                painter = painterResource(id = R.drawable.boti_jejer),
                contentDescription = "Image",
                modifier = Modifier
                    .size(340.dp)
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        Row(
            modifier = Modifier
                .width(320.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    "Hooligan",
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp
                )
                Text(
                    "BTS",
                    fontSize = 20.sp
                )
            }
            Image(
                painter = painterResource(id = R.drawable.love),
                contentDescription = "Image",
                modifier = Modifier
                    .size(35.dp)
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            HorizontalDivider(
                thickness = 5.dp,
                color = Color.Black,
                modifier = Modifier.width(320.dp)
            )

            Spacer(modifier = Modifier.height(10.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .width(320.dp)
            ) {
                Text("0: 12", fontSize = 17.sp)
                Text("-2: 14", fontSize = 17.sp)
            }

            Spacer(modifier = Modifier.height(20.dp))

            Image(
                painter = painterResource(id = R.drawable.play_button),
                contentDescription = "Image"
            )


        }

        Spacer(modifier = Modifier.height(20.dp))

        Column(
            horizontalAlignment = Alignment.Start,
            modifier = Modifier
                .width(320.dp)
                .height(300.dp)
                .background(
                    Color(0xff430f0a),
                    shape = RoundedCornerShape(16.dp)
                )
                .verticalScroll(rememberScrollState())

        ) {
            Text(
                "Lyrics",
                color = Color.White,
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(15.dp)
            )
            Text(
                "[Refrain: j-hope]\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "We pop out, we actin' a fool again (Ooh)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan (Ooh)\n" +
                        "\n" +
                        "[Chorus: Jung Kook, RM]\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "\n" +
                        "[Verse 1: j-hope]\n" +
                        "Man, I'm 'bout to blow a fuse (Yeah)\n" +
                        "통제불능, 머리 춤 (Yeah)\n" +
                        "뛰어 미친놈인 듯 (Uh)\n" +
                        "Me everywhere, 얼쑤\n" +
                        "Somebody move (Move), somebody move (Move)\n" +
                        "다들 모여 하나 둘 (둘)\n" +
                        "I can never ever choose (Yeah)\n" +
                        "Every one o' you a muse\n" +
                        "\n" +
                        "[Pre-Chorus: j-hope]\n" +
                        "Crowd lookin' like a campus\n" +
                        "Beat drop, 우린 dancin'\n" +
                        "You might also like\n" +
                        "Body to Body\n" +
                        "BTS\n" +
                        "Aliens\n" +
                        "BTS\n" +
                        "2.0\n" +
                        "BTS\n" +
                        "[Refrain: RM]\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "We pop out, we actin' a fool again\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "\n" +
                        "[Chorus: V, RM, j-hope]\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "\n" +
                        "[Verse 2: SUGA, Jung Kook, Jin, Jimin]\n" +
                        "I go cuckoo crazy, loco, save me, woo\n" +
                        "Like El Cucuy, 굳이 말 안 해도 알잖아, woo\n" +
                        "Hooligan, like hooligan, 때려 부숴 like hooligan\n" +
                        "시간 됐으니 좀 비켜 좀, all clear 이상 무\n" +
                        "Take you out, take you out\n" +
                        "What's the future? Where's the now?\n" +
                        "This is international\n" +
                        "Make it unforgettable\n" +
                        "\n" +
                        "[Refrain: SUGA]\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "We pop out, we actin' a fool again (Ooh)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan (Ooh)\n" +
                        "[Bridge: RM]\n" +
                        "Yeah, we the mess, gonna get a bigger mop here (Bigger mop)\n" +
                        "This that K, gotta get a better pop here (Better pop)\n" +
                        "You gon' hear this one playin' 'round the clock, yeah ('Round the clock)\n" +
                        "'Round the clock, clock, clock, clock\n" +
                        "\n" +
                        "[Chorus: Jimin, SUGA, Jin, V, (RM)]\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan\n" +
                        "Why this bassline slappin' so rude?\n" +
                        "Drop it lower than chopped and screwed (Screwed, screwed, screwed)\n" +
                        "Ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha-ha, hooligan\n" +
                        "Watch this, watch this beat goin' hooligan",
                color = Color.White,
                fontSize = 15.sp,
                lineHeight = 28.sp,
                modifier = Modifier
                    .padding(15.dp)
            )
        }

        Spacer(modifier = Modifier.height(50.dp))
    }

}

@Preview(
    showBackground = true,
    showSystemUi = true,
    backgroundColor = 0xffa4a5,
)
@Composable
fun Soal1Preview() {
    Soal1View()
}