package mcm.edu.ph.wage_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button;

        button = findViewById(R.id. button);

        button.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        EditText txtOperand;
        TextView textView, textView4, textView6, textView9;

        txtOperand = findViewById(R.id.txtOperand);

        textView = findViewById(R.id.textView);
        textView4 = findViewById(R.id.textView4);
        textView6 = findViewById(R.id.textView6);
        textView9 = findViewById(R.id.textView9);

        Double op1 = 0.0;
        Double sal = 100.0;
        Double day = 9.0;
        Double osal = 130.0;

        Double tsalary = 0.0;
        Double hrender = 0.0;
        Double hover = 0.0;
        Double wover = 0.0;

        op1 = Double.parseDouble(txtOperand.getText().toString());

        switch(v.getId()){
            case R.id.button:
                if(op1 > 8) {
                    tsalary = op1 * sal;
                    hrender = op1;
                    hover = op1 - day;
                    wover = hover * osal;

                    textView.setText(Double.toString(tsalary));
                    textView4.setText(Double.toString(hrender));
                    textView6.setText(Double.toString(hover));
                    textView9.setText(Double.toString(wover));

                }
                else {
                    tsalary = op1 * sal;
                    hrender = op1;

                    textView.setText(Double.toString(tsalary));
                    textView4.setText(Double.toString(hrender));
                    textView6.setText(Double.toString(hover));
                    textView9.setText(Double.toString(wover));

                }

        }
    }
}