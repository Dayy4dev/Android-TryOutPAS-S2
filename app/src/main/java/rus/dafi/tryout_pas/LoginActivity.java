package rus.dafi.tryout_pas;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {

    EditText edUsername;
    EditText edPassword;
    Button btnLogin;
    SharedPreferences sharedPreferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        sharedPreferences = getSharedPreferences("LOGIN_PREF", MODE_PRIVATE);
        edUsername = (EditText) findViewById(R.id.edUsername);
        edPassword = (EditText) findViewById(R.id.edPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = edUsername.getText().toString();
                String password = edPassword.getText().toString();
                if(username.equals("dafi") && password.equals("dafi")){
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString("username", username);
                    editor.apply();
                    Toast.makeText(LoginActivity.this, "login sukses", Toast.LENGTH_SHORT).show();
                    Intent inten = new Intent(LoginActivity.this, MainMenuActivity.class);
                    startActivity(inten);
                    finish();
                }else{
                    Toast.makeText(LoginActivity.this, "login gagal", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}