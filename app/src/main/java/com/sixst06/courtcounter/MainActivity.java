package com.sixst06.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.sixst06.courtcounter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private int contadorA;
    private int contadorB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.btn3PtsA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorA = contadorA + 3;
                binding.contadorA.setText("" + contadorA);
            }
        });

        binding.btn2PtsA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorA = contadorA  + 2;
                binding.contadorA.setText("" + contadorA);
            }
        });

        binding.btnFreeTA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorA = contadorA + 1 ;
                binding.contadorA.setText("" + contadorA);
            }
        });

        binding.btn3PtsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorB = contadorB + 3;
                binding.contadorB.setText("" + contadorB);
            }
        });

        binding.btn2PtsB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorB = contadorB + 2;
                binding.contadorB.setText("" + contadorB);
            }
        });

        binding.btnFreeTB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorB = contadorB + 1 ;
                binding.contadorB.setText("" + contadorB);
            }
        });

        binding.btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contadorB = 0;
                contadorA = 0;
                binding.contadorA.setText("" + contadorA);
                binding.contadorB.setText("" + contadorB);
            }
        });
    }
}