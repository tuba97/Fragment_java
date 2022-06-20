package ders.yasin.fragmentapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import java.util.logging.ConsoleHandler;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        FragmentManager manager=getSupportFragmentManager();
        FragmentTransaction transaction= manager.beginTransaction();
        LoginFragment loginFragment=new LoginFragment();
        transaction.add(R.id.container,loginFragment);
        transaction.commit();

        /*LoginFragment loginFragment1=new LoginFragment();
        getSupportFragmentManager().beginTransaction().add(R.id.container,loginFragment1).commit();
        */


    }
}