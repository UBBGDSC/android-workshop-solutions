package com.example.exercise2task;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

/**
 * <h2>SOLUTION for exercise 2 <em>(15 minutes)</em>:</h2>
 * <ul>
 * <li>a) Change the code below so that this app has 2 fragments (screens):
 * a home screen and a 2<sup>nd</sup> screen. Keep the Submit <code>Button</code>
 * and <code>EditText</code> on the first screen. Move the <code>TextView</code>
 * to the 2<sup>nd</sup> screen
 * On pressing the Submit button,
 * the user will be taken to the 2<sup>nd</sup> screen.</li>
 * <li>b) Use a <code>ViewModel</code> to store the text
 * typed by the user in the <code>TextEdit</code> </li>
 * </ul>
 * */
public class MainActivity extends AppCompatActivity {

    AppBarConfiguration appBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView);
        NavController navController = navHostFragment.getNavController();
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
    }
}