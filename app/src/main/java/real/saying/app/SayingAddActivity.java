package real.saying.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import butterknife.ButterKnife;


public class SayingAddActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_saying);
        setSupportActionBar((Toolbar) findViewById(R.id.main_toolbar));

        ButterKnife.bind(this);


    }


}
