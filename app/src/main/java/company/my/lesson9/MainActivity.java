package company.my.lesson9;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button=findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent I = new Intent(MainActivity.this, Main2Activity.class);
                // Добавление передаваемого значения путём указания ключа и значения
                // в качестве ключей используются строки, а в качестве значений
                // могут быть использованы объекты любых типов
                I.putExtra("key","Android is cool");
                // Запуск второго Activity (окна) передав объект Intent
                startActivity(I);
            }
        });
    }
}
