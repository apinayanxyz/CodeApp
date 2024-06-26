package com.example.codeapp.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.codeapp.Question;
import com.example.codeapp.R;
import com.example.codeapp.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    private Button revisionButton;
    private Button lineCodeButton;
    private Button missingCodeButton;
    private Button randomButton;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        revisionButton = root.findViewById(R.id.revisionButton);
        revisionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Question.class);
                intent.putExtra("QuestionType",1);
                startActivity(intent);
                getActivity().overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.fade_out);
            }
        });
        lineCodeButton = root.findViewById(R.id.lineButton);
        lineCodeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Question.class);
                intent.putExtra("QuestionType",2);
                startActivity(intent);
                getActivity().overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.fade_out);
            }
        });
        missingCodeButton = root.findViewById(R.id.missingButton);
        missingCodeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Question.class);
                intent.putExtra("QuestionType",3);
                startActivity(intent);
                getActivity().overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.fade_out);
            }
        });
        randomButton = root.findViewById(R.id.randomButton);
        randomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Question.class);
                intent.putExtra("QuestionType",0);
                startActivity(intent);
                getActivity().overridePendingTransition(android.R.anim.slide_in_left,android.R.anim.fade_out);
            }
        });


        final TextView textView = binding.textHome;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}