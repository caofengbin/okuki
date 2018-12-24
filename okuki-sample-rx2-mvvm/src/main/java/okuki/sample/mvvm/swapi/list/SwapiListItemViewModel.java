package okuki.sample.mvvm.swapi.list;

import android.databinding.ObservableField;
import android.util.Log;

import javax.inject.Inject;

import okuki.Okuki;
import okuki.sample.mvvm.common.api.swapi.SwapiItem;
import okuki.sample.mvvm.common.mvvm.BaseViewModel;
import okuki.sample.mvvm.swapi.image.SwapiImagePlace;

public class SwapiListItemViewModel extends BaseViewModel {

    private static final String TAG = "SwapiListItemViewModel";
    @Inject
    Okuki okuki;

    public final ObservableField<String> name = new ObservableField<>();

    public SwapiListItemViewModel(SwapiItem swapiItem) {
        name.set(swapiItem.name());
    }

    public void selectItem() {
        okuki.gotoPlace(new SwapiImagePlace(name.get()));
    }

    @Override
    public void onAttach() {
        Log.e(TAG, "onAttach: " + name.get());
    }

    @Override
    public void onDetach() {
        Log.e(TAG, "onDetach: " + name.get());
    }


}
