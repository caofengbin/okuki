package okuki.sample.mvvm.main;

import android.databinding.ObservableField;

import javax.inject.Inject;

import okuki.Okuki;
import okuki.sample.mvvm.common.mvvm.BaseViewModel;
import okuki.sample.mvvm.common.mvvm.MvvmComponent;
import okuki.sample.mvvm.swapi.list.MySwapiListMvvmComponent;

public class MainViewModel extends BaseViewModel {

    @Inject
    Okuki okuki;

    public final ObservableField<MvvmComponent> mainComponent = new ObservableField<>();

    @Override
    public void onAttach() {
        super.onAttach();
//        addToAutoDispose(
//                RxOkuki.onPlace(okuki, SwapiListPlace.class).subscribe(
//                        mainComponent::set,
//                        Errors.log()
//                ),
//                RxOkuki.onPlace(okuki, SwapiImagePlace.class).subscribe(
//                        mainComponent::set,
//                        Errors.log()
//                )
//        );
//        if (okuki.getCurrentPlace() == null) {
//            okuki.gotoPlace(new SwapiListPlace(), HistoryAction.TRY_BACK_TO_SAME_TYPE);
//        }

        //okuki.gotoPlace(new MySwapiListMvvmComponent(), HistoryAction.TRY_BACK_TO_SAME_TYPE);

        mainComponent.set(new MySwapiListMvvmComponent());
    }

    boolean handleBack() {
        return okuki.goBack();
    }

}
