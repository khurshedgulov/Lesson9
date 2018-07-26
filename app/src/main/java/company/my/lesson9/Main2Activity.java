package company.my.lesson9;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView text = findViewById(R.id.foam);
        // Получение значения переданного через объект класса Intent класса Activity
        text.setText(getIntent().getStringExtra("key"));

    }
}
