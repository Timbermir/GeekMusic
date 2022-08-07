package com.timberta.geekmusic.feature_main

import androidx.navigation.NavController
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.NavigationUiSaveStateControl
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timberta.geekmusic.core.base.BaseFlowFragment
import com.timberta.geekmusic.feature_main.databinding.FragmentMainFlowBinding

class MainFlowFragment :
    BaseFlowFragment(R.layout.fragment_main_flow, R.id.nav_host_fragment_main_container) {

    private val binding by viewBinding(FragmentMainFlowBinding::bind)

    override fun setupNavigation(navController: NavController) {
        binding.bottomNavigation.itemIconTintList = null

        establishBottomNavigation(navController)
    }

    @OptIn(NavigationUiSaveStateControl::class)
    private fun establishBottomNavigation(navController: NavController) {
        setupWithNavController(binding.bottomNavigation, navController)
    }
}