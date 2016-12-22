package nyc.c4q.yojana.testanimal;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.os.Bundle;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by yojanasharma on 12/21/16.
 */

public class MyFragment extends Fragment {
    private RecyclerView recyclerView;

    final static String URL = "http://jsjrobotics.nyc/cgi-bin/12_21_2016_exam.pl/";
    List<Features> list;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        MyFragment fragment = new MyFragment();
        fragmentTransaction.add(R.id.activity_main, fragment);
        fragmentTransaction.commit();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create()).build();

        AnimalApi service = retrofit.create(AnimalApi.class);
        Call<Features> call = service.getListofAnimals();

    }
}




