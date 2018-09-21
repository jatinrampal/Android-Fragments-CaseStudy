package com.example.jatin.casestudy2;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailFrag extends Fragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle
            savedInstanceState) {
        View view = inflater.inflate(R.layout.detail_fragment, container, false);
        return view;
    }
    public void setText(String item) {
        TextView view = (TextView) getView().findViewById(R.id.captain);
        view.setText(item);
    }

    public void setImage(String item)
    {
        ImageView imgView = (ImageView) getView().findViewById(R.id.imageView);
        if (item.toLowerCase().contains("daredevil"))
        {
            imgView.setImageResource(R.drawable.daredevil);
        }
        if (item.toLowerCase().contains("jessica jones"))
        {
            imgView.setImageResource(R.drawable.jessica);
        }
        if (item.toLowerCase().contains("luke cage"))
        {
            imgView.setImageResource(R.drawable.lukecage);
        }
        if (item.toLowerCase().contains("iron fist"))
        {
            imgView.setImageResource(R.drawable.ironfist);
        }
        if (item.toLowerCase().contains("punisher"))
        {
            imgView.setImageResource(R.mipmap.punisher);
        }
    }

    public void setWebPage(String item)
    {
        WebView webView = (WebView) getView().findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient());
        if (item.toLowerCase().contains("daredevil"))
        {
            webView.loadUrl("https://en.wikipedia.org/wiki/Daredevil_(TV_series)");
        }
        if (item.toLowerCase().contains("jessica jones"))
        {
            webView.loadUrl("https://en.wikipedia.org/wiki/Jessica_Jones_(TV_series)");
        }
        if (item.toLowerCase().contains("luke cage"))
        {
            webView.loadUrl("https://en.wikipedia.org/wiki/Luke_Cage_(TV_series)");
        }
        if (item.toLowerCase().contains("iron fist"))
        {
            webView.loadUrl("https://en.wikipedia.org/wiki/Iron_Fist_(TV_series)");
        }
        if (item.toLowerCase().contains("punisher"))
        {
            webView.loadUrl("https://en.wikipedia.org/wiki/The_Punisher_(TV_series)");
        }
    }
}
