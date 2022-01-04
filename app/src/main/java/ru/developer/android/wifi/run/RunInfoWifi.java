package ru.developer.android.wifi.run;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.text.format.Formatter;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ru.developer.android.R;

public class RunInfoWifi extends AppCompatActivity {

    Button button;
    TextView textInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run_info_wifi);

        ActionBar actionBar = this.getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        actionBar.setTitle("Запуск программы");
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        button = findViewById(R.id.button);
        textInfo = (TextView) findViewById(R.id.textInfo);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                WifiInfo wifiInfo = wifiManager.getConnectionInfo();
                int ip = wifiInfo.getIpAddress();

                @SuppressLint("MissingPermission")
                int rssi = wifiInfo.getRssi();
                int linkSpeed = wifiInfo.getLinkSpeed();
                String ssid = wifiInfo.getSSID();
                int netWorkId = wifiInfo.getNetworkId();
                String ipAddress = Formatter.formatIpAddress(ip);
                String info = "ipAddress: " + ipAddress + "\n" +
                        "ssid: " + ssid + "\n" +
                        "network: " + netWorkId + "\n" +
                        "rssi: " + rssi + "\n" +
                        "link speed: " + linkSpeed;
                textInfo.setText(info);


            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
