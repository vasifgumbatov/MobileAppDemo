package com.vasifgumbatov.newapplication.ui.fragmentsamplePR

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vasifgumbatov.newapplication.R
import com.vasifgumbatov.newapplication.databinding.FragmentABinding
import com.vasifgumbatov.newapplication.ui.core.CoreFragment

class FragmentA : CoreFragment<FragmentABinding>() {

    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentABinding.inflate(inflater, container, false)
        binding?.fragmentATv?.text = "FragmentA"
        return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}