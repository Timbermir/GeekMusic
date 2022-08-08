package com.timberta.geekmusic.featureMain.presentation.ui.fragments.search

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timberta.geekmusic.coreUI.base.BaseFragment
import com.timberta.geekmusic.feature_main.R
import com.timberta.geekmusic.feature_main.databinding.FragmentSearchBinding

class SearchFragment :
    BaseFragment<FragmentSearchBinding, SearchViewModel>(R.layout.fragment_search) {
    override val binding by viewBinding(FragmentSearchBinding::bind)
    override val viewModel by viewModels<SearchViewModel>()

}