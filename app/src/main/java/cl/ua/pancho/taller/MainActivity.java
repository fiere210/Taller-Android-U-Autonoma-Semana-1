package cl.ua.pancho.taller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button_count, button_toast;
    TextView text_count;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_count = (TextView)findViewById(R.id.show_count);

    }

    public void eventCount(View view){
        count++;
        text_count.setText(String.valueOf(count));
    }

    public void eventToast(View view){
        Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("COUNT", count);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        count = savedInstanceState.getInt("COUNT");
        text_count.setText(String.valueOf(count));
    }


}
