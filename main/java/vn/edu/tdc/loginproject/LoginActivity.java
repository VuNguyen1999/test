package vn.edu.tdc.loginproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        final EditText edtUsername = (EditText) findViewById(R.id.edtUsername);
        EditText edtPassword = (EditText) findViewById(R.id.edtPassword);
        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        Button btnCancel = (Button) findViewById(R.id.btnCancel);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Hello thằng" + edtUsername.getText(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
