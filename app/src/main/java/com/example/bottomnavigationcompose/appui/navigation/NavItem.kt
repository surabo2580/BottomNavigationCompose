package com.example.bottomnavigationcompose.appui.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.bottomnavigationcompose.R


sealed class NavItem(
    @StringRes val title: Int,
    @DrawableRes val icon: Int,
    val navRoute: String
) {
    object Home : NavItem(R.string.home, R.drawable.ic_home, NAV_HOME)
    object Fav : NavItem(R.string.fav, R.drawable.ic_fav, NAV_FAV)
    object Feed : NavItem(R.string.feed, R.drawable.ic_feed, NAV_FEED)
    object Profile : NavItem(R.string.feed, R.drawable.ic_profile, NAV_PROFILE)
}