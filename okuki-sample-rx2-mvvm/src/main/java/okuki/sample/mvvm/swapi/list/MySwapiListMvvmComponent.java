package okuki.sample.mvvm.swapi.list;

import okuki.PlaceConfig;
import okuki.SimplePlace;
import okuki.sample.mvvm.R;
import okuki.sample.mvvm.common.mvvm.MvvmComponent;
import okuki.sample.mvvm.common.mvvm.ViewModel;
import okuki.sample.mvvm.swapi.SwapiPlace;

/**
 * Created by fengbincao on 2018/12/24.
 */
@PlaceConfig(parent = SwapiPlace.class)
public class MySwapiListMvvmComponent extends SimplePlace implements MvvmComponent {

    @Override
    public int getLayoutResId() {
        return R.layout.my_swapi_list;
    }

    @Override
    public ViewModel getViewModel() {
        return new MySwapiListViewModel(new MySwapiItem("姓名","链接"));
    }

}

