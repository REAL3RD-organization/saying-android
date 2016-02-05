package real.saying.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.ButterKnife;
import real.saying.app.data.SayingData;
import real.saying.app.support.CustomListAdapter;

import java.util.List;

/**
 * Created by Baek on 2016-02-04.
 */
public class SayingListAdapter extends CustomListAdapter<SayingData> {

    public SayingListAdapter(Context context, List<SayingData> list) {
        super(context, list, R.layout.saying_list_item);
    }

    @Override
    public void drawItem(SayingData data, View view, ViewGroup parent) {
        TextView sayingText = ButterKnife.findById(view, R.id.text_saying);
        TextView sayingTransText = ButterKnife.findById(view, R.id.text_saying_trans);

        sayingText.setText(data.getSaying());
        sayingTransText.setText(data.getSayingTranslated());
    }
}
