package com.example.bidlive.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.bidlive.R

data class Onboarding(
    @DrawableRes val imageResourceId: Int,
    @StringRes val description: Int
)

val OnboardingList = listOf(
    Onboarding(R.drawable.cuate,R.string.onboarding_1),
    Onboarding(R.drawable.amico,R.string.onboarding_2),
    Onboarding(R.drawable.bro,R.string.onboarding_3)
)