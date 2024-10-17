package com.alexmncn.practica2

import android.os.Bundle
import android.widget.RadioGroup
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.alexmncn.practica2.ui.theme.Practica2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView1 = findViewById<TextView>(R.id.textView1);
        val radioGroup1 = findViewById<RadioGroup>(R.id.radioGroup1);

        val textView1def = getString(R.string.curso_matriculado).toString();

        textView1.text = textView1def;

        radioGroup1.setOnCheckedChangeListener { group, checkedId ->
            var curso = "";

            when (checkedId) {
                R.id.radioButton1 -> curso = "Primero"
                R.id.radioButton2 -> curso = "Segundo"
                R.id.radioButton3 -> curso = "Tercero"
                R.id.radioButton4 -> curso = "Cuarto"
            }

            textView1.text = String.format("%s %s", textView1def, curso);

        }
    }
}