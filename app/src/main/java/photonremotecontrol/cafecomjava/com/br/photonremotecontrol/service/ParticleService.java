package photonremotecontrol.cafecomjava.com.br.photonremotecontrol.service;

import photonremotecontrol.cafecomjava.com.br.photonremotecontrol.model.Particle;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by joel on 7/21/16.
 * http://randomdotnext.com/retrofit-rxjava/
 * http://square.github.io/retrofit/
 * https://github.com/ruler88/GithubDemo/blob/master/app/src/main/java/app/service/ServiceFactory.java
 * https://guides.codepath.com/android/Consuming-APIs-with-Retrofit
 */
public interface ParticleService {

    @FormUrlEncoded
    @POST("{id}/move")
    Observable<Particle> move(@Path("id") String deviceId,@Field("access_token") String token, @Field("args") String code);

}
