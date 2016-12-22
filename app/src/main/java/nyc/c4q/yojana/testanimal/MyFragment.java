package nyc.c4q.yojana.testanimal;

//import android.app.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by yojanasharma on 12/21/16.
 */

public class MyFragment extends Fragment {
    private RecyclerView recyclerView;
    private View mRoot;
    private AnimalAdapter adapter;
    final static String URL = "http://jsjrobotics.nyc/cgi-bin/12_21_2016_exam.pl/";
    List<Features> list;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList<>();


        android.support.v4.app.FragmentManager fragmentManager = getFragmentManager();
        android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        MyFragment fragment = new MyFragment();
        fragmentTransaction.add(R.id.activity_main, fragment);
        fragmentTransaction.commit();

        recyclerView.setAdapter(new AnimalAdapter((Features) list));
       recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        }

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create()).build();

        AnimalApi service = retrofit.create(AnimalApi.class);
        Call<Features> call = service.getListofAnimals();

    }









