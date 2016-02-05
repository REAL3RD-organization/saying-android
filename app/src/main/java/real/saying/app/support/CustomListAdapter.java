package real.saying.app.support;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Baek on 2016-02-04.
 */
public abstract class CustomListAdapter<T> extends BaseAdapter {
    protected Context context;
    protected LayoutInflater inflater;
    private List<T> list = new ArrayList<T>();
    private int itemResource = 0;

    public CustomListAdapter(Context context, List<T> list, int resource) {
        this.context = context;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.list = list;
        this.itemResource = resource;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        T data = list.get(i);

        if (view == null) {
            view = inflater.inflate(itemResource, parent, false);

        }

        drawItem(data, view, parent);
        return view;
    }

    public abstract void drawItem(T data, View view, ViewGroup parent);

}
