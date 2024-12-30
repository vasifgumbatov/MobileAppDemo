package com.vasifgumbatov.newapplication.ui.createaccountscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vasifgumbatov.newapplication.R
import com.vasifgumbatov.newapplication.databinding.FragmentCreateAccountBinding
import com.vasifgumbatov.newapplication.ui.core.CoreFragment

class CreateAccountFragment : CoreFragment<FragmentCreateAccountBinding>() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentCreateAccountBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.backToSignIn?.setOnClickListener {
            parentFragmentManager.popBackStack()
        }
    }
}