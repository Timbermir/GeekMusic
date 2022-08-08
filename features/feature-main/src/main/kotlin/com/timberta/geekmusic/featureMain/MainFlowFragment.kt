package com.timberta.geekmusic.featureMain

import androidx.navigation.NavController
import androidx.navigation.ui.NavigationUI.setupWithNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timberta.geekmusic.coreUI.base.BaseFlowFragment
import com.timberta.geekmusic.feature_main.R
import com.timberta.geekmusic.feature_main.databinding.FragmentMainFlowBinding

class MainFlowFragment :
    BaseFlowFragment(R.layout.fragment_main_flow, R.id.nav_host_fragment_main_container) {

    private val binding by viewBinding(FragmentMainFlowBinding::bind)

    override fun setupNavigation(navController: NavController) {
        binding.bottomNavigation.itemIconTintList = null

        establishBottomNavigation(navController)
    }

    private fun establishBottomNavigation(navController: NavController) {
        setupWithNavController(binding.bottomNavigation, navController)
    }
}