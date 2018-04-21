package com.example.android.taller1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import static com.example.android.taller1.metodos.calculo;

public class principal extends AppCompatActivity {

    private Spinner sexo, tipo, marca;
    private TextView resultado;
    private EditText cant;
    private String opcSexo[], opcTipo[], opcMarca[];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        sexo = findViewById(R.id.cmbSexo);
        tipo = findViewById(R.id.cmbTipo);
        marca = findViewById(R.id.cmbMarca);
        resultado = findViewById(R.id.txtResultado);
        cant = findViewById(R.id.cant1);

        opcSexo = this.getResources().getStringArray(R.array.sexo);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opcSexo);
        sexo.setAdapter(adapter);

        opcTipo = this.getResources().getStringArray(R.array.tipo);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opcTipo);
        tipo.setAdapter(adapter1);

        opcMarca = this.getResources().getStringArray(R.array.marca);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, opcMarca);
        marca.setAdapter(adapter2);
    }

    public void calcular(View v) {
        int spSexo , spTipo, spMarca, cant1, resul;
        if(validar()){
            spSexo = sexo.getSelectedItemPosition();
            spTipo = tipo.getSelectedItemPosition();
            spMarca = marca.getSelectedItemPosition();
            cant1 = Integer.parseInt(cant.getText().toString());
            resul = calculo(spSexo,spTipo,spMarca,cant1);
            this.resultado.setText(""+resul);
        }
    }

    public boolean validar() {
        if (cant.getText().toString().isEmpty()) {
            cant.setError(this.getResources().getString(R.string.error));
            resultado.requestFocus();
            return false;
        }
        return true;
    }

    public void limpiar (View v){
        cant.setText ("");
        resultado.setText("");
        cant.requestFocus();
    }


}
