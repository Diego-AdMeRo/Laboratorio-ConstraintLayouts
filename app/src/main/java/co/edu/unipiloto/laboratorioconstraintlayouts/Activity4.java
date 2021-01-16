package co.edu.unipiloto.laboratorioconstraintlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity4 extends AppCompatActivity implements View.OnClickListener {

    private Button btnInicio, btnSintomas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        btnInicio = (Button) findViewById(R.id.btn_ac_main);
        btnSintomas = (Button) findViewById(R.id.btn_sintomas);

        btnInicio.setOnClickListener(this);
        btnSintomas.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v.getId() == btnInicio.getId()){
            Intent activityInicio = new Intent(Activity4.this, MainActivity.class);
            startActivity(activityInicio);
            finish();
        }else if(v.getId() == btnSintomas.getId()){
            Intent activityAnterior = new Intent(Activity4.this, Sintomas.class);
            startActivity(activityAnterior);
            finish();
        }
    }
}