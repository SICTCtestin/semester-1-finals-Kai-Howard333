package com.example.finalapp.ui.sciFi;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.finalapp.R;

import java.util.Random;

public class SciFiFragment extends Fragment {

    //Defining the widget variables
    EditText firstNameTXT;
    EditText lastNameTXT;
    EditText cityNameTXT;
    EditText schoolNameTXT;
    EditText broNameTXT;
    EditText sisNameTXT;
    Button generateBTN;
    TextView output;
    
    private SciFiViewModel sciFiViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_scifi,container,false);



        firstNameTXT = root.findViewById(R.id.firstTXT);
        lastNameTXT = root.findViewById(R.id.lastTXT);
        cityNameTXT = root.findViewById(R.id.cityTXT);
        schoolNameTXT = root.findViewById(R.id.schoolTXT);
        broNameTXT = root.findViewById(R.id.broTXT);
        sisNameTXT = root.findViewById(R.id.sisTXT);
        output = root.findViewById(R.id.output);
        generateBTN = root.findViewById(R.id.generator);

        generateBTN.setOnClickListener(new View.OnClickListener() {
        @Override
            public void onClick(View view) { generate(); }
        });

        return root;
    }

//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.fragment_scifi);
//
//        //utilize an onClickListener to connect to the button
//
//



    //generate the sci fi name
    private void generate(){
        String first = String.valueOf(firstNameTXT.getText());
        String last = String.valueOf(lastNameTXT.getText());
        String city = String.valueOf(cityNameTXT.getText());
        String school = String.valueOf(schoolNameTXT.getText());
        String brother = String.valueOf(broNameTXT.getText());
        String sister = String.valueOf(sisNameTXT.getText());

        int rF = (int) (Math.random()*firstNameTXT.length());
        int rL = (int) (Math.random()*lastNameTXT.length());
        int rC = (int) (Math.random()*cityNameTXT.length());
        int rSc = (int) (Math.random()*schoolNameTXT.length());
        int rB = (int) (Math.random()*broNameTXT.length());
        int rSi = (int) (Math.random()*sisNameTXT.length());

        firstNameTXT.getText();
        lastNameTXT.getText();
        cityNameTXT.getText();
        schoolNameTXT.getText();
        broNameTXT.getText();
        sisNameTXT.getText();

        // generate sciFi first name
        String sciFiFirst = first.substring(0,rF)+last.substring(rL);
        // generate sciFi last name
        String sciFiLast = city.substring(0,rC)+school.substring(rSc);
        // generate sciFi home name
        String sciFiHome = brother.substring(rB)+sister.substring(0,rSi);

        //System.out.printf("Welcome! %s %s from %s",sciFiFirst,sciFiLast, sciFiHome);
        output.setText(String.format("Welcome! %s %s from %s",sciFiFirst,sciFiLast, sciFiHome));
        //f"something else {variable}"
    }


}