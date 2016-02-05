package real.saying.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ListView;
import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import real.saying.app.data.SayingData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.list_saying)
    protected ListView sayingListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar((Toolbar) findViewById(R.id.main_toolbar));
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        ButterKnife.bind(this);

        List<SayingData> sayingList = new ArrayList<SayingData>();
        sayingList.add(new SayingData("시간이 금이다", "Time is gold"));
        sayingList.add(new SayingData("힘들다", "I'm tired"));

        sayingListView.setAdapter(new SayingListAdapter(this, sayingList));

    }


    @OnClick(R.id.check_all)
    public void onClickCheck() {

    }

    @OnClick(R.id.button_add)
    public void onClickAdd() {
        startActivity(new Intent(this, SayingAddActivity.class));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_add) {
            onClickAdd();
            return true;
        } else if (id == R.id.action_check) {
            onClickCheck();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
