package net.cyberits.valend69.mediagnosis;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import net.cyberits.valend69.mediagnosis.R;

/**
 * Created by Satria W Sandi on 6/27/2015.
 */
public class DiagnosisFragment1 extends Fragment {
    public DiagnosisFragment1()
    {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        return inflater.inflate(R.layout.diagnosis_fragment_q01, container, false);
    }
}
