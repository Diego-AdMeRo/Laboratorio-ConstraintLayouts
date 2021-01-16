package co.edu.unipiloto.laboratorioconstraintlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity2 extends AppCompatActivity implements View.OnClickListener {

    private Button btnSendActivity3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        btnSendActivity3 = (Button) findViewById(R.id.btn_ac_3);

        btnSendActivity3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == btnSendActivity3.getId()){
            Intent activity3 = new Intent(Activity2.this, Activity3.class);
            startActivity(activity3);
            finish();
        }
    }
}