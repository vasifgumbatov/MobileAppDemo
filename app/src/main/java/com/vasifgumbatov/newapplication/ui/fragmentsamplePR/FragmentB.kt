package com.vasifgumbatov.newapplication.ui.fragmentsamplePR

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vasifgumbatov.newapplication.R
import com.vasifgumbatov.newapplication.databinding.FragmentBBinding
import com.vasifgumbatov.newapplication.ui.core.CoreFragment

class FragmentB : CoreFragment<FragmentBBinding>() {

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentBBinding.inflate(inflater, container, false)
        binding?.fragmentBTv?.text = "FragmentB"
        return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}