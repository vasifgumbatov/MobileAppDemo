package com.vasifgumbatov.newapplication.ui.examplescreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vasifgumbatov.newapplication.R
import com.vasifgumbatov.newapplication.databinding.FragmentExampleBinding
import com.vasifgumbatov.newapplication.ui.core.CoreFragment

class ExampleFragment : CoreFragment<FragmentExampleBinding>() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentExampleBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}