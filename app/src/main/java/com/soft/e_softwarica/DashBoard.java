package com.soft.e_softwarica;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.soft.e_softwarica.model.StudentModel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import java.util.ArrayList;
import java.util.List;

public class DashBoard extends AppCompatActivity {
    public  static List<StudentModel> studentModelList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
        loadList();

    }

    public void loadList(){
        if (studentModelList.size()==0){
            studentModelList.add(new StudentModel("bibek dhami","ktm","Male",21));
            studentModelList.add(new StudentModel("sujan","ktm","Female",21));
        }
    }


    }


