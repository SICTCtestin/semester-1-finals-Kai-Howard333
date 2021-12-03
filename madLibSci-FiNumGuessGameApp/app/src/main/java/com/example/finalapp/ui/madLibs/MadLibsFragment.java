package com.example.finalapp.ui.madLibs;

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
import com.example.finalapp.ui.sciFi.SciFiViewModel;

import java.util.Random;

public class MadLibsFragment extends Fragment {

    //Defining the widget variables
    EditText adj1TXT;
    EditText adj2TXT;
    EditText adj3TXT;
    EditText animalTXT;
    EditText noun1TXT;
    EditText bodyTXT;
    EditText adj4TXT;
    EditText crawlyTXT;
    EditText colorTXT;
    EditText adj5TXT;
    EditText noun2TXT;
    EditText subjTXT;
    EditText nameTXT;
    EditText verbTXT;
    Button generateBTN;
    TextView output;

    private MadLibsViewModel MadLibsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_madlibs,container,false);

        adj1TXT = root.findViewById(R.id.adj1TXT);
        adj2TXT = root.findViewById(R.id.adj2TXT);
        adj3TXT = root.findViewById(R.id.adj3TXT);
        animalTXT = root.findViewById(R.id.animalTXT);
        noun1TXT = root.findViewById(R.id.noun1TXT);
        bodyTXT = root.findViewById(R.id.bodyTXT);
        adj4TXT = root.findViewById(R.id.adj4TXT);
        crawlyTXT = root.findViewById(R.id.crawlyTXT);
        colorTXT = root.findViewById(R.id.colorTXT);
        adj5TXT = root.findViewById(R.id.adj5TXT);
        noun2TXT = root.findViewById(R.id.noun2TXT);
        subjTXT = root.findViewById(R.id.subjTXT);
        nameTXT = root.findViewById(R.id.nameTXT);
        verbTXT = root.findViewById(R.id.verbTXT);
        output = root.findViewById(R.id.output);
        generateBTN = root.findViewById(R.id.generator);

        generateBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                generate();
            }
        });

        return root;
    }

    //generate the madlib
    private void generate(){
        String adjective1 = String.valueOf(adj1TXT.getText());
        String adjective2 = String.valueOf(adj2TXT.getText());
        String adjective3 = String.valueOf(adj3TXT.getText());
        String animal = String.valueOf(animalTXT.getText());
        String noun1 = String.valueOf(noun1TXT.getText());
        String body = String.valueOf(bodyTXT.getText());
        String adjective4 = String.valueOf(adj4TXT.getText());
        String creepyCrawly = String.valueOf(crawlyTXT.getText());
        String color = String.valueOf(colorTXT.getText());
        String adjective5 = String.valueOf(adj5TXT.getText());
        String noun2 = String.valueOf(noun2TXT.getText());
        String schoolSubject = String.valueOf(subjTXT.getText());
        String name = String.valueOf(nameTXT.getText());
        String verb = String.valueOf(verbTXT.getText());

        String vehicle = new String("");

        int randomVehicle = new Random().nextInt(4);
        if (randomVehicle == 1) {
            vehicle = "car";
        }
        else if (randomVehicle == 2) {
            vehicle = "boat";
        }
        else {
            vehicle = "plane";
        }

        int randomStory = new Random().nextInt(4);
//        int randomStory = new Integer(2);
        if (randomStory == 1) {
            output.setText(String.format(("My school is pretty %s for most of the year, except in late October. %s Cobwebs appear in the hallway, with really %s %s " +
                    "        hanging from them. The lunch-room has orange and black %s everywhere, and they serve roasted %s for lunch. Someone told me " +
                    "        that a giant %s %s took over the principal’s office. All of the teachers look different; one is a zombie with %s hair, " +
                    "        another is a %s %s, and I think my %s teacher is a %s now. Tombstones line the hallways, and one said, " +
                    "        ”Here lies %s, who died of %s”"),adjective1,adjective2,adjective3,animal,noun1,body,adjective4,creepyCrawly,color,adjective5,noun2,schoolSubject,vehicle,name,verb));
        }

        if (randomStory == 2) {
            output.setText(String.format(("You are pretty %s. I say that because you're also %s. You also have a %s %s that loves %s. They're very %s and the only" +
                    " thing they'll eat is a %s. I know your favorite color is %s and it has to be on a %s %s. You despise looking at a %s above all else. " +
                    "Your favorite subject is %s. Your dream vehicle is a %s. The person you love most is %s, and they love %s."),adjective1,adjective2,adjective3,animal,noun1,adjective4,body,color,adjective5,noun2,
                    creepyCrawly,schoolSubject,vehicle,name,verb));
        }
        else {
            output.setText(String.format(("There once was a %s %s %s %s. They always loved %s that involved %s and a delicious %s %s. If you wore the color %s, nothing " +
                    "        would stop it from beating you with a %s %s. It had an odd ability to sense any %s %s around the vicinity. it desired " +
                    "        people with the name of %s most and you could only escape it by %s"),adjective1,adjective2,adjective3,animal,noun1,body,adjective4,creepyCrawly,color,adjective5,noun2,schoolSubject,
                    vehicle,name,verb));
        }
    }
}
