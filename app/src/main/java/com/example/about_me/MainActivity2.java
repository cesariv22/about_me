package com.example.about_me;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;


import com.example.about_me.databinding.ActivityMain2Binding;


public class MainActivity2 extends AppCompatActivity {
    public ActivityMain2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnLinkedin.setOnClickListener(v -> {
            String url = "https://www.linkedin.com/in/cesar-riveros-martinez/";
            Intent intento = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
            startActivity(intento);
            Log.d("click btnLinkedin","ok");

        });
        binding.btnWhatsapp.setOnClickListener(v -> {
            Uri url_wapp = Uri.parse("https://wa.me/56956128136");
            Intent intento = new Intent(Intent.ACTION_VIEW, url_wapp);
            startActivity(intento);
            Log.d("click btnWhatsapp","ok");
        });
        binding.btnMail.setOnClickListener(v -> {
            String message = binding.txtmsg.getText().toString();
            Intent intento = new Intent(Intent.ACTION_SENDTO);
            intento.setData(Uri.parse("mailto:"));
            intento.putExtra(Intent.EXTRA_TEXT, message);
            startActivity(intento);
            Log.d("click btnMail", "ok");
        });
    }
}