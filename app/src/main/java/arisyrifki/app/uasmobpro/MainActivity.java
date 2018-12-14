package arisyrifki.app.uasmobpro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnHewan;
    private Button btnPurba;
    private Button btnFunfact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnHewan = (Button)findViewById(R.id.btn_list_hewan);
        btnPurba = (Button)findViewById(R.id.btn_list_purba);
        btnFunfact = (Button)findViewById(R.id.btn_list_funfact);

        btnMove();
    }

    private void btnMove() {

        btnHewan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentHewan = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(intentHewan);
            }
        });
        btnPurba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentPurba = new Intent(MainActivity.this, DetailActivityPurba.class);
                startActivity(intentPurba);
            }
        });
        btnFunfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentFunfact = new Intent(MainActivity.this, DetailActivityFun.class);
                startActivity(intentFunfact);
            }
        });




    }

}
