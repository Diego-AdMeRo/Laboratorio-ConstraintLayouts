package co.edu.unipiloto.laboratorioconstraintlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSendActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSendActivity2 = (Button) findViewById(R.id.btn_ac_2);

        btnSendActivity2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == btnSendActivity2.getId()){
            Intent activity2 = new Intent(MainActivity.this, Activity2.class);
            startActivity(activity2);
            finish();
        }
    }
}