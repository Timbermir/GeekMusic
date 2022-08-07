package com.timberta.geekmusic.feature_main.presentation.ui.fragments.playlists

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timberta.geekmusic.core.base.BaseFragment
import com.timberta.geekmusic.feature_main.R
import com.timberta.geekmusic.feature_main.databinding.FragmentPlaylistsBinding

class PlaylistsFragment :
    BaseFragment<FragmentPlaylistsBinding, PlaylistsViewModel>(R.layout.fragment_playlists) {
    override val binding by viewBinding(FragmentPlaylistsBinding::bind)
    override val viewModel by viewModels<PlaylistsViewModel>()

}