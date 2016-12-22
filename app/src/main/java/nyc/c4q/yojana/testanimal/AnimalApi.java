package nyc.c4q.yojana.testanimal;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by yojanasharma on 12/21/16.
 */

public interface AnimalApi {
    @GET("cgi-bin/12_21_2016_exam.pl")
    Call<Features> getListofAnimals();
}
