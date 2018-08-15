package br.com.etecia.segundaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);
        
    }
}
<EditText
    android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Usuário"
            android:inputType="textPersonName" />

<EditText
    android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:hint="Senha"
            android:inputType="textPassword" />

<Button
    android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Entrar" />

<Button
    android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="Sair" />