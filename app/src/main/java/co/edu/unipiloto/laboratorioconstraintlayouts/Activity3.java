package co.edu.unipiloto.laboratorioconstraintlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity3 extends AppCompatActivity implements View.OnClickListener {

    private Button btnSendActivity4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        btnSendActivity4 = (Button) findViewById(R.id.btn_ac_4);

        btnSendActivity4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == btnSendActivity4.getId()){
            Intent activity4 = new Intent(Activity3.this, Activity4.class);
            startActivity(activity4);
            finish();
        }
    }
}