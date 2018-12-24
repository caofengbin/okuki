package okuki.sample.mvvm.swapi.list;

/**
 * Created by fengbincao on 2018/12/24.
 */
public class MySwapiItem {

    public String name;
    public String url;

    public MySwapiItem(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String name() {
        return name;
    }

    public String url() {
        return url;

    }
}
