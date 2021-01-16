package co.edu.unipiloto.laboratorioconstraintlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Sintomas extends AppCompatActivity implements View.OnClickListener {

    private Button btnEnviarSintomas;
    private Spinner respuesta1, respuesta2, respuesta3, respuesta4, respuesta5, respuesta6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sintomas);

        this.btnEnviarSintomas = (Button) findViewById(R.id.btn_sintomas);
        this.respuesta1 = (Spinner) findViewById(R.id.sp_respuesta_1);
        this.respuesta2 = (Spinner) findViewById(R.id.sp_respuesta_2);
        this.respuesta3 = (Spinner) findViewById(R.id.sp_respuesta_3);
        this.respuesta4 = (Spinner) findViewById(R.id.sp_respuesta_4);
        this.respuesta5 = (Spinner) findViewById(R.id.sp_respuesta_5);
        this.respuesta6 = (Spinner) findViewById(R.id.sp_respuesta_6);

        this.btnEnviarSintomas.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId() == btnEnviarSintomas.getId()){
            String resultados = "Sus respuestas fueron:\n"+
                    getResources().getString(R.string.reporteNotificacion_check_dif_respirar) + ": " + this.respuesta1.getSelectedItem()+ "\n"+
                    getResources().getString(R.string.reporteNotificacion_check_fatiga) + ": " + this.respuesta2.getSelectedItem() + "\n" +
                    getResources().getString(R.string.reporteNotificacion_check_fiebre) + ": " + this.respuesta3.getSelectedItem() + "\n" +
                    getResources().getString(R.string.reporteNotificacion_check_tos) + ": " + this.respuesta4.getSelectedItem() + "\n" +
                    getResources().getString(R.string.reporteNotificacion_check_dis_olfato_sabor) + ": " + this.respuesta5.getSelectedItem() + "\n" +
                    getResources().getString(R.string.reporteNotificacion_check_contacto) + ": " + this.respuesta6.getSelectedItem();

            Toast.makeText(Sintomas.this, resultados, Toast.LENGTH_LONG).show();
        }
    }
}