package co.nelson.appuno;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView nombreUsuario;
    Button btn1, btn2;

    /* 
    boolean result = false;
    String name = "Triana";
    */

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            nombreUsuario = /*(TextView)*/ findViewById(R.id.usuario);
            btn1 = /*(Button)*/ findViewById(R.id.btn1);
            btn2 = /*(Button)*/ findViewById(R.id.btn2);

            btn1.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    nombreUsuario.setText("Triana es gei");
                }
            });

            btn2.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View view){
                    nombreUsuario.setText("Triana es maricon");
                }
            });
    }

    public double calcularArea(int l1, int l2){
        return l1*l2;
    }
}