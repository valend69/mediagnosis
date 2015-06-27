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

    public String result = "Result : "; // variabel buat isi result yang di lempar ke activity result
    private int flagD = 0; // counter kecocokan pengguna terhadap penyakit DBD
    private int flagT = 0; // counter kecocokan pengguna terhadap penyakit Tifus

    private final int maxFlagD = 6; // variabel static untuk nanti dibagi dalam result penyakit DBD
    private final int maxFlagT = 10; // variabel static untuk nanti dibagi dalam result penyakit Tifus

    Button Ya; //variabel button Ya pada tampilan untuk diambil triggernya kelak
    Button Tidak; //variabel button Tidak pada tampilan untuk diambil triggernya kelak

    protected void onCreate(Bundle savedInstanceState) // fungsi yang jalan saat object dipanggil (kayak constructor)
    {
        super.onCreate(savedInstanceState); // jalanin fungsi asli parent nya (Activity) leave it like this
        setContentView(R.layout.activity_diagnosis); // jalanin xml miliki activity ini sendiri yang berisi suatu LinearLayout yang akan diisi secara dinamis

        Ya = (Button) findViewById(R.id.button_y); // ngisi variabel dengan button Ya realtime di tampilan android
        Tidak = (Button) findViewById(R.id.button_t); // ngisi variabel dengan button Tidak realtime di tampilan android

        replaceFragment1(); // jalanin fungsi fragment pertama kali (liat bawah untuk detail) intinya ini akan "semi" rekursif sampai ke pertanyaan ke 13

        // disini harusnya panggil fungsi cetak resultyang lempar ke activity result
    }

    public void replaceFragment1() // fungsi untuk isi LinearLayout dengan fragment pertama
    {
        FragmentManager fragmentManager = getFragmentManager(); // panggil fragment manager (ini copas percis aja di fungsi yang baru)
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction(); // memulai transaksi pada fragment manager diatas (ini copas percis aja di fungsi yang baru)
        DiagnosisFragment1 diagnoseFragment1 = new DiagnosisFragment1(); // buat objek fragment 1 dari class yang udah dibikin (copas aja terus ganti angkanya sesuai dengan urutan berapa)
        fragmentTransaction.replace(R.id.diagnose_fragment_container, diagnoseFragment1); // intinya isi ke containernya (diagnose_fragment_container) dengan objek yang telah dibikin diatas (angkanya samain aja) nb: sebenernya harusnya pertama kali add bukan replace tapi karena satu dan lain hal jadinya replace dan kalian pasti pake replace terus untuk yang ini dan saat ini -SWS
        fragmentTransaction.commit(); // commit dengan apa yang telah dilakukan pada fragment manager

        Ya.setOnClickListener(new View.OnClickListener() { // masuk ke fungsi ini kalo tombol ya yang sedang tampil di run time di tekan
            @Override // ya override,kalo ga ngerti copas aja
            public void onClick(View v) { // di dalem fungsi ini di definisiin mau ngapa-ngapain aja sementara panggil fungsi replaceFragment selanjutnya aja
                replaceFragment2(); // fungsi replace fragment selanjutnya dipanggil
            }
        });

        Tidak.setOnClickListener(new View.OnClickListener() { // intinya samaaja kok cuman ini kalo tombol tidak yang ditekan waktu run time
            @Override // copas
            public void onClick(View v) { // sama kayak yang ditombol yes intinya dalemnyaadaaction action apa yang mo dikerjain
                replaceFragment2(); //ya begitulah harusnya tau
            }
        });
    } // catatan : panggil terus sampe yang ke 13 ato 14 biarin kosong actionnya (kalomo dijadiinyang 14 bikin class fragment ama layoutnya dulu)

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
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                DiagnosisFragment3 diagnoseFragment3 = new DiagnosisFragment3();
                fragmentTransaction.replace(R.id.diagnose_fragment_container, diagnoseFragment3);
                fragmentTransaction.commit();
            }
        });
    }
}
