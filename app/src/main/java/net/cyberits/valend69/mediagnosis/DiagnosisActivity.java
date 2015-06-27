package net.cyberits.valend69.mediagnosis;

/**
 * Created by VALEND69 on 24/06/15.
 *
 * Modified by Satria W Sandi on 27/06/2015
 */

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/*import net.cyberits.valend69.test.R;*/

public class DiagnosisActivity extends Activity
{
    public int counter=1;
    public final int maxCounter = 13;

    int flag = 0;

    Button Ya;
    Button Tidak;

    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosis);
        Ya = (Button) findViewById(R.id.button_y);
        Tidak = (Button) findViewById(R.id.button_t);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        DiagnosisFragment1 diagnoseFragment1 = new DiagnosisFragment1();
        fragmentTransaction.replace(R.id.diagnose_fragment_container, diagnoseFragment1);
        fragmentTransaction.commit();

        Ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag++;
                counter++;
                replaceFragment2();
            }
        });

        Tidak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                replaceFragment2();
            }
        });
    }

    public void replaceFragment2()
    {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        DiagnosisFragment2 diagnoseFragment2 = new DiagnosisFragment2();
        fragmentTransaction.replace(R.id.diagnose_fragment_container, diagnoseFragment2);
        fragmentTransaction.commit();

        Ya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flag++;
                counter++;
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                DiagnosisFragment3 diagnoseFragment3 = new DiagnosisFragment3();
                fragmentTransaction.replace(R.id.diagnose_fragment_container, diagnoseFragment3);
                fragmentTransaction.commit();
            }
        });
        Tidak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                DiagnosisFragment3 diagnoseFragment3 = new DiagnosisFragment3();
                fragmentTransaction.replace(R.id.diagnose_fragment_container, diagnoseFragment3);
                fragmentTransaction.commit();
            }
        });
    }
}
