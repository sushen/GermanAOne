package com.biswas.germana1.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.biswas.germana1.R
import com.biswas.germana1.ui.theme.BrandCharcoal
import com.biswas.germana1.ui.theme.BrandRed
import com.biswas.germana1.ui.theme.BrandYellow

@Composable
fun BrandLogoHeader(
    modifier: Modifier = Modifier,
    compact: Boolean = false
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(if (compact) 44.dp else 68.dp)
                .clip(CircleShape)
                .background(BrandCharcoal),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .size(if (compact) 38.dp else 60.dp)
                    .clip(CircleShape)
                    .background(BrandYellow),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_brand_airplane),
                    contentDescription = "Germany Journey Airplane",
                    tint = BrandCharcoal,
                    modifier = Modifier.size(if (compact) 22.dp else 34.dp)
                )
            }
        }

        Spacer(modifier = Modifier.height(if (compact) 6.dp else 12.dp))

        Text(
            text = "জার্মানি যাবো",
            style = if (compact) MaterialTheme.typography.titleLarge else MaterialTheme.typography.headlineLarge,
            fontWeight = FontWeight.Bold,
            color = BrandCharcoal,
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(2.dp))

        Row(
            modifier = Modifier
                .padding(vertical = 2.dp)
                .clip(RoundedCornerShape(2.dp))
        ) {
            Box(
                modifier = Modifier
                    .height(3.dp)
                    .width(16.dp)
                    .background(BrandCharcoal)
            )
            Box(
                modifier = Modifier
                    .height(3.dp)
                    .width(16.dp)
                    .background(BrandRed)
            )
            Box(
                modifier = Modifier
                    .height(3.dp)
                    .width(16.dp)
                    .background(BrandYellow)
            )
        }

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = "German A1 Language Course",
            style = if (compact) MaterialTheme.typography.labelMedium else MaterialTheme.typography.titleSmall,
            fontWeight = FontWeight.Medium,
            color = BrandRed,
            letterSpacing = 0.5.sp,
            textAlign = TextAlign.Center
        )
    }
}
