package com.example.sailik.resumebuilder_24_feb;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//public class AboutScreen extends AppCompatActivity implements View.OnClickListener {
//
//    private EditText mAppVersion;
//    private Button mLogoutBtn;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_about_screen);
//
//        mAppVersion =(EditText)findViewById(R.id.appversion_et);
//        mLogoutBtn = (Button)findViewById(R.id.logout_btn);
//
//        mLogoutBtn.setOnClickListener(this);
//
////        PackageManager manager = this.getPackageManager();
////        Context c = getApplicationContext();
////        PackageInfo info = manager.getPackageInfo(getPackageName(),0);
////        String version = info.versionName;
////        PackageManager manager = getPackageManager();
////        PackageInfo info = manager.getPackageInfo(getPackageName(),0);
////        String version = info.versionName;
////
////        PackageManager manager = context.getPackageManager();
////        PackageInfo info = manager.getPackageInfo(
////                context.getPackageName(), 0);
////        string version = info.versionName;
//
//        PackageInfo packageInfo = null;
//        String version ="";
//        try {
//            packageInfo = getPackageManager().getPackageInfo(getPackageName(),0);
//            version = packageInfo.versionName;
//            //int versionCode = packageInfo.versionCode;
//        } catch (PackageManager.NameNotFoundException e) {
//            e.printStackTrace();
//        }
//        mAppVersion.setText(version);
//
//    }
//
//    @Override
//    public void onClick(View v) {
//        switch(v.getId()){
//            case R.id.logout_btn:
//                Intent intent=new Intent();
//                intent.putExtra("MESSAGE","logout");
//                setResult(2,intent);
//                finish();
//        }
//    }
//}
public class AboutScreen extends ActionBarActivity {

    //public static SessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction().replace(android.R.id.content, new SettingsFragment()).commit();
        //session = new SessionManager(this);

    }


//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        switch (item.getItemId()) {
//            // Respond to the action bar's Up/Home button
//            case android.R.id.home:
//                finish();
//                return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
}