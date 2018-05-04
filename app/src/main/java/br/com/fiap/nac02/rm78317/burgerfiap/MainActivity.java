package br.com.fiap.nac02.rm78317.burgerfiap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnBurger;
    Button btnBatata;
    Button btnRefri;
    Button btnFinaliza;

    CheckBox chbBurger;
    CheckBox chbBatata;
    CheckBox chbRefri;

    TextView valorBurger;
    TextView valorBatata;
    TextView valorRefri;
    TextView txtValorTotal;
    int valorTotal = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBurger = findViewById(R.id.btnVerMaisBurger);
        btnBatata = findViewById(R.id.btnVerMaisBatata);
        btnRefri = findViewById(R.id.btnVerMaisRefri);
        btnFinaliza = findViewById(R.id.btnFinaliza);

        chbBurger = findViewById(R.id.chbBurger);
        chbBatata = findViewById(R.id.chbBatata);
        chbRefri = findViewById(R.id.chbRefri);

        valorBurger = findViewById(R.id.valorBurger);
        valorBatata = findViewById(R.id.valorBatata);
        valorRefri = findViewById(R.id.valorRefri);
        txtValorTotal = findViewById(R.id.txtValorTotal);
    }

    public void finalizaCompra(View view) {
        if (chbBurger.isChecked()){
            valorTotal += Integer.parseInt(valorBurger.toString());
        }
        if (!chbBurger.isChecked()){
            valorTotal -= Integer.parseInt(valorBurger.toString());
        }
        if (chbBatata.isChecked()){
            valorTotal += Integer.parseInt(String.valueOf(valorBatata));
        }
        if (!chbBatata.isChecked()){
            valorTotal -= Integer.parseInt(String.valueOf(valorBatata));
        }
        if (chbRefri.isChecked()){
            valorTotal += Integer.parseInt(String.valueOf(valorRefri));
        }
        if (!chbRefri.isChecked()){
            valorTotal -= Integer.parseInt(String.valueOf(valorRefri));
        }
        System.out.println(valorTotal);
        txtValorTotal.setText(String.valueOf(valorTotal));
    }

    public void verMaisBurger(View view) {

    }

    public void verMaisBatata(View view) {
    }

    public void verMaisRefri(View view) {
    }
}
