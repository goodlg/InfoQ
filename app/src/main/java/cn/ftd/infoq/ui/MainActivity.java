package cn.ftd.infoq.ui;

import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import cn.ftd.infoq.R;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDl;
    private Toolbar mToolbar;
    private TextView mTitle;
    private ActionBarDrawerToggle mAbdt;
    private NavigationView mNv;
    private FragmentManager mFmanager;
    private MenuItem mMi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupUI();
    }

    private void setupUI() {
        mDl = (DrawerLayout) findViewById(R.id.drawer_layout);
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mToolbar.setTitle("");
        setSupportActionBar(mToolbar);
        //mTitle = (TextView) findViewById(R.id.custom_title);
        mAbdt = new ActionBarDrawerToggle(this, mDl, mToolbar, 0, 0);
        mAbdt.syncState();
        mDl.addDrawerListener(mAbdt);
        mNv = (NavigationView) findViewById(R.id.nav_view);
        mNv.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.account_conf:
                Toast.makeText(this, "account_conf", Toast.LENGTH_SHORT).show();
                break;
            case R.id.read_list:
                Toast.makeText(this, "read_list", Toast.LENGTH_SHORT).show();
                break;
            case R.id.preference_conf:
                Toast.makeText(this, "preference_conf", Toast.LENGTH_SHORT).show();
                break;
            case R.id.about:
                Toast.makeText(this, "about", Toast.LENGTH_SHORT).show();
                break;
            case R.id.logout:
                Toast.makeText(this, "logout", Toast.LENGTH_SHORT).show();
                break;
        }
        mDl.closeDrawers();
        return false;
    }
}
