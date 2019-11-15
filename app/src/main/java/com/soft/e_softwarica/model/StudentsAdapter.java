package com.soft.e_softwarica.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.soft.e_softwarica.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class StudentsAdapter extends RecyclerView.Adapter<StudentsAdapter.StudentsViewHolder> {
     Context mContext;
     List<StudentModel> studentModelList;


    public StudentsAdapter(Context mContext, List<StudentModel> studentModelList) {
        this.mContext = mContext;
        this.studentModelList = studentModelList;
    }

    @NonNull


    @Override
    public StudentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.student,parent,false);

        return new StudentsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentsViewHolder holder, final int position) {
         final StudentModel studentModel = studentModelList.get(position);

            holder.tvName.setText(studentModel.getFullName());
            holder.tvAge.setText(Integer.toString(studentModel.getAge()));
            holder.tvAddress.setText(studentModel.getAddress());
            holder.tvGender.setText(studentModel.getGender());
        if (studentModel.getGender().equals("Male")) {
            holder.imgProfile.setImageResource(R.drawable.male);
        } else if (studentModel.getGender().equals("Female")) {
            holder.imgProfile.setImageResource(R.drawable.female);
        }

        holder.imgDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                studentModelList.remove(position);
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return studentModelList.size();
    }

    public  class StudentsViewHolder extends RecyclerView.ViewHolder{
        CircleImageView imgProfile;
        TextView tvName, tvAge, tvAddress, tvGender;
        ImageButton imgDelete;

        public StudentsViewHolder(@NonNull View itemView) {
            super(itemView);
            imgProfile = itemView.findViewById(R.id.imgProfile);
            tvName = itemView.findViewById(R.id.tvName);
            tvAge = itemView.findViewById(R.id.tvAge);
            tvAddress = itemView.findViewById(R.id.tvAddress);
            tvGender = itemView.findViewById(R.id.tvGender);
            imgDelete = itemView.findViewById(R.id.imageView);

        }
    }
}
