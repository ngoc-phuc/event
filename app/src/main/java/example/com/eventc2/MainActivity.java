package example.com.eventc2;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {
    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1 = (Button) findViewById(R.id.b1);
        bt1.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        EditText edita=(EditText) findViewById(R.id.e1);
        int a=Integer.parseInt(edita.getText()+"");
        EditText editb=(EditText) findViewById(R.id.e2);
        int b=Integer.parseInt(editb.getText()+"");
        TextView kq=(TextView) findViewById(R.id.kq);
        kq.setText((a+b)+"");
    }
}




      /*  cách 2:
      public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      Button bttong = (Button) findViewById(R.id.b1);
        bttong.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                EditText edita=(EditText) findViewById(R.id.e1);
                int a=Integer.parseInt(edita.getText()+"");
                EditText editb=(EditText) findViewById(R.id.e2);
                int b=Integer.parseInt(editb.getText()+"");
                TextView kq=(TextView) findViewById(R.id.kq);
                kq.setText((a+b)+"");
            }

        });
    }
       cách 1:
       public void btn_tong2so(View v){
        EditText edita=(EditText) findViewById(R.id.e1);
        int a=Integer.parseInt(edita.getText()+"");
        EditText editb=(EditText) findViewById(R.id.e2);
        int b=Integer.parseInt(editb.getText()+"");
        TextView kq=(TextView) findViewById(R.id.kq);
        kq.setText((a+b)+"");
    }*/

