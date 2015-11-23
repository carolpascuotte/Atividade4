package com.example.projeto1;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Projeto1Activity extends Activity {

	private EditText txtPeso;
	private EditText txtAltura;
	private Button btnCalcular;
	private TextView txtResultadoFinal;
	private double peso;
	private double altura;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_projeto1);

		txtPeso = (EditText) findViewById(R.id.txtPeso);
		txtAltura = (EditText) findViewById(R.id.txtAltura);
		btnCalcular = (Button) findViewById(R.id.btnCalcular);
		txtResultadoFinal = (TextView) findViewById(R.id.txtResultadoFinal);
		btnCalcular.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				peso = Double.parseDouble(txtPeso.getText().toString());
				altura = Double.parseDouble(txtAltura.getText().toString());
				
				Double resultadocalculo = calcularIMC(peso, altura);
				txtResultadoFinal.setText(resultadocalculo.toString());
				
			}
		});
		
	}

	private double calcularIMC(double n1, double n2) {
		double resultadoIMC = ((n1/(n2 * n2)) * 10000);
		return resultadoIMC;
	}
	
}
