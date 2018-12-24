package okuki.sample.mvvm.swapi.list;

import android.databinding.ObservableField;
import android.util.Log;

import okuki.sample.mvvm.common.mvvm.BaseViewModel;

/**
 * Created by fengbincao on 2018/12/24.
 */
public class MySwapiListViewModel extends BaseViewModel {

    private static final String TAG = "SwapiListItemViewModel";

    public final ObservableField<String> name = new ObservableField<>();

    public MySwapiListViewModel(MySwapiItem swapiItem) {
        name.set(swapiItem.name());

        Thread myThread = new Thread(myUpdate);
        myThread.start();
    }


    @Override
    public void onAttach() {
        Log.e(TAG, "onAttach: " + name.get());
    }

    @Override
    public void onDetach() {
        Log.e(TAG, "onDetach: " + name.get());
    }


    Runnable myUpdate = new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                try {
                    Thread.sleep(1000);
                    name.set("这里是动态设置的值" + String.valueOf(i));
                } catch (InterruptedException e) {

                }
            }


        }
    };
}
