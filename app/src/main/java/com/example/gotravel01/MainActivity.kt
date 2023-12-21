package com.example.gotravel01

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button
import android.widget.Spinner;
import android.widget.Toast;
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.gotravel01.ui.theme.GoTravel01Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //spinner code is here
        val spinnerDest = findViewById<Spinner>(R.id.spinner_dest);
        val adapter : ArrayAdapter<CharSequence> = ArrayAdapter.createFromResource(this, R.array.destinations, android.R.layout.simple_spinner_item)
            .also { adapter ->
                // Specify the layout to use when the list of choices appears.
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                // Apply the adapter to the spinner.
                spinnerDest.adapter = adapter
                spinnerDest.setAdapter(adapter);
            }

        val nextButton : Button = findViewById(R.id.buttonMain)

        nextButton.setOnClickListener(View.OnClickListener() {
            val intent = Intent(this, InterestsScreen::class.java)
            startActivity(intent)
        })
    }
}