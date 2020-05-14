package com.ingwilson.misuperparte2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Comunicacion1  extends AppCompatActivity {
    EditText edtnombre;
    EditText edtedad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comunicacion1);
        edtnombre=findViewById(R.id.edtnombre);
        edtedad=findViewById(R.id.edtedad);
    }
    public void Verificar(View view){
        Intent intent = new Intent(this, Comunicacion2.class);
        intent.putExtra("nombre", edtnombre.getText().toString());
        intent.putExtra("edad", Integer.parseInt(edtedad.getText().toString()));
        startActivity(intent);
    }
}