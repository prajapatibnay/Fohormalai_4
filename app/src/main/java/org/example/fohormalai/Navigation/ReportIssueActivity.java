package org.example.fohormalai.Navigation;

import android.content.Intent;

import android.net.Uri;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import org.example.fohormalai.R;


public class ReportIssueActivity extends AppCompatActivity {

    private static final String TAG = "ReportIssueActivity";


    private Button report;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_issue);

        // get action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Report Waste Issues !");


        Log.i(TAG," On Create View");

        // Enabling Up / Back navigation
        actionBar.setDisplayHomeAsUpEnabled(true);

        report = (Button) findViewById(R.id.btn_report);

        report.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:clustered.concepts018@gmail.com"));
                startActivity(emailIntent);
            }
        });

        }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        int id = item.getItemId();
        if (id == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
