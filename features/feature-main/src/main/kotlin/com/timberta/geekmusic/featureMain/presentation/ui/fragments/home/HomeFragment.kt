package com.timberta.geekmusic.featureMain.presentation.ui.fragments.home

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timberta.geekmusic.coreUI.base.BaseFragment
import com.timberta.geekmusic.feature_main.R
import com.timberta.geekmusic.feature_main.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(R.layout.fragment_home) {
    override val binding by viewBinding(FragmentHomeBinding::bind)
    override val viewModel by viewModels<HomeViewModel>()

}