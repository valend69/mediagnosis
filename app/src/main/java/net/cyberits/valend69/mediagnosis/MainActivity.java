package net.cyberits.valend69.mediagnosis;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity
{
    private Button tombol;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tombol = (Button) findViewById(R.id.buttonMulai);
        tombol.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this,DiagnosisActivity.class));
                finish();
            }
        });
    }
}