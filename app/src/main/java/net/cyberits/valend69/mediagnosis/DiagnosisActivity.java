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

/*import net.cyberits.valend69.test.R;*/

public class DiagnosisActivity extends Activity
{
    public int counter;
    public final int maxCounter = 13;
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnosis);

        for( counter=1; counter<=maxCounter; counter++)
        {
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            if(counter==1){
                DiagnosisFragment1 diagnoseFragment1 = new DiagnosisFragment1();
                fragmentTransaction.add(R.id.diagnose_fragment_container, diagnoseFragment1);
            }
            else if(counter==2){
                DiagnosisFragment2 diagnoseFragment2 = new DiagnosisFragment2();
                fragmentTransaction.replace(R.id.diagnose_fragment_container, diagnoseFragment2);
            }
            else if(counter==3){
                DiagnosisFragment3 diagnoseFragment3 = new DiagnosisFragment3();
                fragmentTransaction.replace(R.id.diagnose_fragment_container, diagnoseFragment3);
            }
            else if(counter==4){
                DiagnosisFragment4 diagnoseFragment4 = new DiagnosisFragment4();
                fragmentTransaction.replace(R.id.diagnose_fragment_container, diagnoseFragment4);
            }
            else if(counter==5){
                DiagnosisFragment5 diagnoseFragment5 = new DiagnosisFragment5();
                fragmentTransaction.replace(R.id.diagnose_fragment_container, diagnoseFragment5);
            }
            else if(counter==6){
                DiagnosisFragment6 diagnoseFragment6 = new DiagnosisFragment6();
                fragmentTransaction.replace(R.id.diagnose_fragment_container, diagnoseFragment6);
            }
            else if(counter==7){
                DiagnosisFragment7 diagnoseFragment7 = new DiagnosisFragment7();
                fragmentTransaction.replace(R.id.diagnose_fragment_container, diagnoseFragment7);
            }
            else if(counter==8){
                DiagnosisFragment8 diagnoseFragment8 = new DiagnosisFragment8();
                fragmentTransaction.replace(R.id.diagnose_fragment_container, diagnoseFragment8);
            }
            else if(counter==9){
                DiagnosisFragment9 diagnoseFragment9 = new DiagnosisFragment9();
                fragmentTransaction.replace(R.id.diagnose_fragment_container, diagnoseFragment9);
            }
            else if(counter==10){
                DiagnosisFragment10 diagnoseFragment10 = new DiagnosisFragment10();
                fragmentTransaction.replace(R.id.diagnose_fragment_container, diagnoseFragment10);
            }
            else if(counter==11){
                DiagnosisFragment11 diagnoseFragment11 = new DiagnosisFragment11();
                fragmentTransaction.replace(R.id.diagnose_fragment_container, diagnoseFragment11);
            }
            else if(counter==12){
                DiagnosisFragment12 diagnoseFragment12 = new DiagnosisFragment12();
                fragmentTransaction.replace(R.id.diagnose_fragment_container, diagnoseFragment12);
            }
            else {
                DiagnosisFragment13 diagnoseFragment13 = new DiagnosisFragment13();
                fragmentTransaction.replace(R.id.diagnose_fragment_container, diagnoseFragment13);
            }
            fragmentTransaction.commit();
        }
    }
}
