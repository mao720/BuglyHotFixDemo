package com.mjf.buglyhotfixdemo.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.mjf.buglyhotfixdemo.BuildConfig
import com.mjf.buglyhotfixdemo.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel
        message.text = "version--${BuildConfig.VERSION_NAME}--123456789"
        message.setOnClickListener {
            val text: String? = ""
            Toast.makeText(activity, "version--${BuildConfig.VERSION_NAME}--123456789", Toast.LENGTH_LONG).show()
        }
    }

}
