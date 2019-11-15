package com.soft.e_softwarica.ui.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.soft.e_softwarica.DashBoard;
import com.soft.e_softwarica.R;
import com.soft.e_softwarica.model.StudentModel;


public class DashboardFragment extends Fragment {
    DashboardViewModel dashboardViewModel;
    EditText etName, etAge, etAddress;
    Button btnSave;
    RadioGroup rbGender;
    RadioButton rbMale, rbFemale, rbOthers;
    String name, gender, address;
    int age;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        BindView(root);
        etName = root.findViewById(R.id.etName);
        etAge = root.findViewById(R.id.etAge);
        etAddress = root.findViewById(R.id.etAddress);
        rbGender = root.findViewById(R.id.rbGender);
        btnSave = root.findViewById(R.id.btnAdd);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = etName.getText().toString();
                age = Integer.parseInt(etAge.getText().toString());
                address = etAddress.getText().toString();
                if (rbMale.isChecked()) {
                    gender = "Male";
                } else if (rbFemale.isChecked()) {
                    gender = "Female";
                } else if (rbOthers.isChecked()) {
                    gender = "Others";
                } else {
                    Toast.makeText(getActivity(), "Select Gender", Toast.LENGTH_SHORT).show();
                    return;
                }
                DashBoard.studentModelList.add(new StudentModel(name, address, gender, age));
                Toast.makeText(getActivity(), "Student added", Toast.LENGTH_SHORT).show();

            }
        });


        return root;
    }

    public void BindView(View v) {
        etName = v.findViewById(R.id.etName);
        etAge = v.findViewById(R.id.etAge);
        etAddress = v.findViewById(R.id.etAddress);
        btnSave = v.findViewById(R.id.btnAdd);
        rbMale = v.findViewById(R.id.rbMale);
        rbFemale = v.findViewById(R.id.rbFemale);
        rbOthers = v.findViewById(R.id.rbOthers);

    }


}