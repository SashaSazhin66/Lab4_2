package com.work.lab4_2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_second.*

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) =
        inflater.inflate(R.layout.fragment_second, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        web.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                return false
            }
        }
    }

    fun openPage(page: String) {
        when (page) {
            "Google" -> web.loadUrl("https://www.google.com/")
            "Facebook" -> web.loadUrl("https://uk-ua.facebook.com/")
            "Twitter" -> web.loadUrl("https://twitter.com/")
            "Xda-developer" -> web.loadUrl("https://www.xda-developers.com/")
        }
    }
}
