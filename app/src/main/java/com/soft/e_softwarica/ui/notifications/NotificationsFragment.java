package com.soft.e_softwarica.ui.notifications;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.soft.e_softwarica.R;

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;
    private  WebView webview;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
        webview = root.findViewById(R.id.webView);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        webview.getSettings().setDomStorageEnabled(true);
        webview.getSettings().setAllowFileAccess(true);
        webview.getSettings().setAllowFileAccessFromFileURLs(true);
        webview.setWebViewClient(new WebViewClient());
        webview.loadUrl("https://www.softwarica.edu.np/");
        //String data="<html><body><h1>Hello, Javatpoint!</h1></body></html>";
        //webview.loadData(data, "text/html", "utf-8");
       // final TextView textView = root.findViewById(R.id.text_notifications);
        //notificationsViewModel.getText().observe(this, new Observer<String>() {
            //@Override
            //public void onChanged(@Nullable String s) {
               // textView.setText(s);
            //}

        //});

        return root;
    }
}