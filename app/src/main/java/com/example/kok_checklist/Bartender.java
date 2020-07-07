package com.example.kok_checklist;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.BatteryManager;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.ByteArrayOutputStream;


/**
 * A simple {@link Fragment} subclass.
 */
public class Bartender extends Fragment {

    View view;

    private static final int CAMERA_REQUEST = 1888;

    private int buttonNumber;

    private ImageView photo37;
    private ImageView photo38;
    private ImageView photo39;
    private ImageView photo40;
    private ImageView photo41;
    private ImageView photo42;
    private ImageView photo43;
    private ImageView photo44;
    private ImageView photo45;
    private ImageView photo46;
    private ImageView photo47;
    private ImageView photo48;
    private ImageView photo49;
    private ImageView photo50;
    private ImageView photo51;
    private ImageView photo52;
    private ImageView photo53;
    private ImageView photo54;
    private ImageView photo55;
    private ImageView photo56;
    private ImageView photo57;
    private ImageView photo58;
    private ImageView photo59;
    private ImageView photo60;
    private ImageView photo61;
    private ImageView photo62;
    private ImageView photo63;
    private ImageView photo64;
    private ImageView photo65;
    private ImageView photo66;
    private ImageView photo67;
    private ImageView photo68;
    private ImageView photo69;
    private ImageView photo70;
    private ImageView photo71;
    private ImageView photo72;
    private ImageView photo73;
    private ImageView photo74;
    private ImageView photo75;

    private Bitmap[] imageList = new Bitmap[39];


    public Bartender() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_bartender, container, false);

        photo37 = view.findViewById(R.id.photo37);
        photo38 = view.findViewById(R.id.photo38);
        photo39 = view.findViewById(R.id.photo39);
        photo40 = view.findViewById(R.id.photo40);
        photo41 = view.findViewById(R.id.photo41);
        photo42 = view.findViewById(R.id.photo42);
        photo43 = view.findViewById(R.id.photo43);
        photo44 = view.findViewById(R.id.photo44);
        photo45 = view.findViewById(R.id.photo45);
        photo46 = view.findViewById(R.id.photo46);
        photo47 = view.findViewById(R.id.photo47);
        photo48 = view.findViewById(R.id.photo48);
        photo49 = view.findViewById(R.id.photo49);
        photo50 = view.findViewById(R.id.photo50);
        photo51 = view.findViewById(R.id.photo51);
        photo52 = view.findViewById(R.id.photo52);
        photo53 = view.findViewById(R.id.photo53);
        photo54 = view.findViewById(R.id.photo54);
        photo55 = view.findViewById(R.id.photo55);
        photo56 = view.findViewById(R.id.photo56);
        photo57 = view.findViewById(R.id.photo57);
        photo58 = view.findViewById(R.id.photo58);
        photo59 = view.findViewById(R.id.photo59);
        photo60 = view.findViewById(R.id.photo60);
        photo61 = view.findViewById(R.id.photo61);
        photo62 = view.findViewById(R.id.photo62);
        photo63 = view.findViewById(R.id.photo63);
        photo64 = view.findViewById(R.id.photo64);
        photo65 = view.findViewById(R.id.photo65);
        photo66 = view.findViewById(R.id.photo66);
        photo67 = view.findViewById(R.id.photo67);
        photo68 = view.findViewById(R.id.photo68);
        photo69 = view.findViewById(R.id.photo69);
        photo70 = view.findViewById(R.id.photo70);
        photo71 = view.findViewById(R.id.photo71);
        photo72 = view.findViewById(R.id.photo72);
        photo73 = view.findViewById(R.id.photo73);
        photo74 = view.findViewById(R.id.photo74);
        photo75 = view.findViewById(R.id.photo75);

        imageList[0] = null;
        imageList[1] = null;
        imageList[2] = null;
        imageList[3] = null;
        imageList[4] = null;
        imageList[5] = null;
        imageList[6] = null;
        imageList[7] = null;
        imageList[8] = null;
        imageList[9] = null;
        imageList[10] = null;
        imageList[11] = null;
        imageList[12] = null;
        imageList[13] = null;
        imageList[14] = null;
        imageList[15] = null;
        imageList[16] = null;
        imageList[17] = null;
        imageList[18] = null;
        imageList[19] = null;
        imageList[20] = null;
        imageList[21] = null;
        imageList[22] = null;
        imageList[23] = null;
        imageList[24] = null;
        imageList[25] = null;
        imageList[26] = null;
        imageList[27] = null;
        imageList[28] = null;
        imageList[29] = null;
        imageList[30] = null;
        imageList[31] = null;
        imageList[32] = null;
        imageList[33] = null;
        imageList[34] = null;
        imageList[35] = null;
        imageList[36] = null;
        imageList[37] = null;
        imageList[38] = null;

        // OPEN SHIFT

        final TextView textView37 = view.findViewById(R.id.textView37);
        final EditText editText37 = view.findViewById(R.id.editText37);
        final TextView textView38 = view.findViewById(R.id.textView38);
        final EditText editText38 = view.findViewById(R.id.editText38);
        final TextView textView39 = view.findViewById(R.id.textView39);
        final EditText editText39 = view.findViewById(R.id.editText39);
        final TextView textView40 = view.findViewById(R.id.textView40);
        final EditText editText40 = view.findViewById(R.id.editText40);
        final TextView textView41 = view.findViewById(R.id.textView41);
        final EditText editText41 = view.findViewById(R.id.editText41);
        final TextView textView42 = view.findViewById(R.id.textView42);
        final EditText editText42 = view.findViewById(R.id.editText42);
        final TextView textView43 = view.findViewById(R.id.textView43);
        final EditText editText43 = view.findViewById(R.id.editText43);
        final TextView textView44 = view.findViewById(R.id.textView44);
        final EditText editText44 = view.findViewById(R.id.editText44);
        final TextView textView45 = view.findViewById(R.id.textView45);
        final EditText editText45 = view.findViewById(R.id.editText45);


        final ImageButton infoImageButton37 = view.findViewById(R.id.infoImageButton37);
        infoImageButton37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 1");
                Bartender.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton37 = view.findViewById(R.id.photoImageButton37);
        photoImageButton37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 37;
            }
        });

        final ImageButton infoImageButton38 = view.findViewById(R.id.infoImageButton38);
        infoImageButton38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 2");
                Bartender.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton38 = view.findViewById(R.id.photoImageButton38);
        photoImageButton38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 38;
            }
        });

        final ImageButton infoImageButton39 = view.findViewById(R.id.infoImageButton39);
        infoImageButton39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 3");
                Bartender.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton39 = view.findViewById(R.id.photoImageButton39);
        photoImageButton39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 39;
            }
        });

        final ImageButton infoImageButton40 = view.findViewById(R.id.infoImageButton40);
        infoImageButton40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 4");
                Bartender.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton40 = view.findViewById(R.id.photoImageButton40);
        photoImageButton40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 40;
            }
        });

        final ImageButton infoImageButton41 = view.findViewById(R.id.infoImageButton41);
        infoImageButton41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 5");
                Bartender.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton41 = view.findViewById(R.id.photoImageButton41);
        photoImageButton41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 41;
            }
        });

        final ImageButton infoImageButton42 = view.findViewById(R.id.infoImageButton42);
        infoImageButton42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 6");
                Bartender.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton42 = view.findViewById(R.id.photoImageButton42);
        photoImageButton42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 42;
            }
        });

        final ImageButton infoImageButton43 = view.findViewById(R.id.infoImageButton43);
        infoImageButton43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 7");
                Bartender.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton43 = view.findViewById(R.id.photoImageButton43);
        photoImageButton43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 43;
            }
        });

        final ImageButton infoImageButton44 = view.findViewById(R.id.infoImageButton44);
        infoImageButton44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 8");
                Bartender.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton44 = view.findViewById(R.id.photoImageButton44);
        photoImageButton44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 44;
            }
        });

        final ImageButton infoImageButton45 = view.findViewById(R.id.infoImageButton45);
        infoImageButton45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 9");
                Bartender.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton45 = view.findViewById(R.id.photoImageButton45);
        photoImageButton45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 45;
            }
        });

        final Button minimize5 = view.findViewById(R.id.minimizeButton5);
        minimize5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView37.getVisibility() == View.GONE) {
                    minimize5.setText("^");
                    textView37.setVisibility(View.VISIBLE);
                    editText37.setVisibility(View.VISIBLE);
                    infoImageButton37.setVisibility(View.VISIBLE);
                    photoImageButton37.setVisibility(View.VISIBLE);
                    textView38.setVisibility(View.VISIBLE);
                    editText38.setVisibility(View.VISIBLE);
                    infoImageButton38.setVisibility(View.VISIBLE);
                    photoImageButton38.setVisibility(View.VISIBLE);
                    textView39.setVisibility(View.VISIBLE);
                    editText39.setVisibility(View.VISIBLE);
                    infoImageButton39.setVisibility(View.VISIBLE);
                    photoImageButton39.setVisibility(View.VISIBLE);
                    textView40.setVisibility(View.VISIBLE);
                    editText40.setVisibility(View.VISIBLE);
                    infoImageButton40.setVisibility(View.VISIBLE);
                    photoImageButton40.setVisibility(View.VISIBLE);
                    textView41.setVisibility(View.VISIBLE);
                    editText41.setVisibility(View.VISIBLE);
                    infoImageButton41.setVisibility(View.VISIBLE);
                    photoImageButton41.setVisibility(View.VISIBLE);
                    textView42.setVisibility(View.VISIBLE);
                    editText42.setVisibility(View.VISIBLE);
                    infoImageButton42.setVisibility(View.VISIBLE);
                    photoImageButton42.setVisibility(View.VISIBLE);
                    textView43.setVisibility(View.VISIBLE);
                    editText43.setVisibility(View.VISIBLE);
                    infoImageButton43.setVisibility(View.VISIBLE);
                    photoImageButton43.setVisibility(View.VISIBLE);
                    textView44.setVisibility(View.VISIBLE);
                    editText44.setVisibility(View.VISIBLE);
                    infoImageButton44.setVisibility(View.VISIBLE);
                    photoImageButton44.setVisibility(View.VISIBLE);
                    textView45.setVisibility(View.VISIBLE);
                    editText45.setVisibility(View.VISIBLE);
                    infoImageButton45.setVisibility(View.VISIBLE);
                    photoImageButton45.setVisibility(View.VISIBLE);

                }
                else {
                    minimize5.setText("⌄");
                    textView37.setVisibility(View.GONE);
                    editText37.setVisibility(View.GONE);
                    infoImageButton37.setVisibility(View.GONE);
                    photoImageButton37.setVisibility(View.GONE);
                    textView38.setVisibility(View.GONE);
                    editText38.setVisibility(View.GONE);
                    infoImageButton38.setVisibility(View.GONE);
                    photoImageButton38.setVisibility(View.GONE);
                    textView39.setVisibility(View.GONE);
                    editText39.setVisibility(View.GONE);
                    infoImageButton39.setVisibility(View.GONE);
                    photoImageButton39.setVisibility(View.GONE);
                    textView40.setVisibility(View.GONE);
                    editText40.setVisibility(View.GONE);
                    infoImageButton40.setVisibility(View.GONE);
                    photoImageButton40.setVisibility(View.GONE);
                    textView41.setVisibility(View.GONE);
                    editText41.setVisibility(View.GONE);
                    infoImageButton41.setVisibility(View.GONE);
                    photoImageButton41.setVisibility(View.GONE);
                    textView42.setVisibility(View.GONE);
                    editText42.setVisibility(View.GONE);
                    infoImageButton42.setVisibility(View.GONE);
                    photoImageButton42.setVisibility(View.GONE);
                    textView43.setVisibility(View.GONE);
                    editText43.setVisibility(View.GONE);
                    infoImageButton43.setVisibility(View.GONE);
                    photoImageButton43.setVisibility(View.GONE);
                    textView44.setVisibility(View.GONE);
                    editText44.setVisibility(View.GONE);
                    infoImageButton44.setVisibility(View.GONE);
                    photoImageButton44.setVisibility(View.GONE);
                    textView45.setVisibility(View.GONE);
                    editText45.setVisibility(View.GONE);
                    infoImageButton45.setVisibility(View.GONE);
                    photoImageButton45.setVisibility(View.GONE);
                }

            }
        });

        // DURING SHIFT (ALL SHIFTS)

        final TextView textView46 = view.findViewById(R.id.textView46);
        final EditText editText46 = view.findViewById(R.id.editText46);
        final TextView textView47 = view.findViewById(R.id.textView47);
        final EditText editText47 = view.findViewById(R.id.editText47);
        final TextView textView48 = view.findViewById(R.id.textView48);
        final EditText editText48 = view.findViewById(R.id.editText48);
        final TextView textView49 = view.findViewById(R.id.textView49);
        final EditText editText49 = view.findViewById(R.id.editText49);
        final TextView textView50 = view.findViewById(R.id.textView50);
        final EditText editText50 = view.findViewById(R.id.editText50);
        final TextView textView51 = view.findViewById(R.id.textView51);
        final EditText editText51 = view.findViewById(R.id.editText51);
        final TextView textView52 = view.findViewById(R.id.textView52);
        final EditText editText52 = view.findViewById(R.id.editText52);
        final TextView textView53 = view.findViewById(R.id.textView53);
        final EditText editText53 = view.findViewById(R.id.editText53);


        final ImageButton infoImageButton46 = view.findViewById(R.id.infoImageButton46);
        infoImageButton46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","During Shift 1");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton46 = view.findViewById(R.id.photoImageButton46);
        photoImageButton46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 46;
            }
        });

        final ImageButton infoImageButton47 = view.findViewById(R.id.infoImageButton47);
        infoImageButton47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","During Shift 2");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton47 = view.findViewById(R.id.photoImageButton47);
        photoImageButton47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 47;
            }
        });

        final ImageButton infoImageButton48 = view.findViewById(R.id.infoImageButton48);
        infoImageButton48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","During Shift 3");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton48 = view.findViewById(R.id.photoImageButton48);
        photoImageButton48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 48;
            }
        });

        final ImageButton infoImageButton49 = view.findViewById(R.id.infoImageButton49);
        infoImageButton49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","During Shift 4");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton49 = view.findViewById(R.id.photoImageButton49);
        photoImageButton49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 49;
            }
        });

        final ImageButton infoImageButton50 = view.findViewById(R.id.infoImageButton50);
        infoImageButton50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","During Shift 5");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton50 = view.findViewById(R.id.photoImageButton50);
        photoImageButton50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 50;
            }
        });

        final ImageButton infoImageButton51 = view.findViewById(R.id.infoImageButton51);
        infoImageButton51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","During Shift 6");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton51 = view.findViewById(R.id.photoImageButton51);
        photoImageButton51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 51;
            }
        });

        final ImageButton infoImageButton52 = view.findViewById(R.id.infoImageButton52);
        infoImageButton52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","During Shift 7");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton52 = view.findViewById(R.id.photoImageButton50);
        photoImageButton52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 52;
            }
        });

        final ImageButton infoImageButton53 = view.findViewById(R.id.infoImageButton53);
        infoImageButton53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","During Shift 8");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton53 = view.findViewById(R.id.photoImageButton53);
        photoImageButton53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 53;
            }
        });

        final Button minimize6 = view.findViewById(R.id.minimizeButton6);
        minimize6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView46.getVisibility() == View.GONE) {
                    minimize6.setText("^");
                    textView46.setVisibility(View.VISIBLE);
                    editText46.setVisibility(View.VISIBLE);
                    infoImageButton46.setVisibility(View.VISIBLE);
                    photoImageButton46.setVisibility(View.VISIBLE);
                    textView47.setVisibility(View.VISIBLE);
                    editText47.setVisibility(View.VISIBLE);
                    infoImageButton47.setVisibility(View.VISIBLE);
                    photoImageButton47.setVisibility(View.VISIBLE);
                    textView48.setVisibility(View.VISIBLE);
                    editText48.setVisibility(View.VISIBLE);
                    infoImageButton48.setVisibility(View.VISIBLE);
                    photoImageButton48.setVisibility(View.VISIBLE);
                    textView49.setVisibility(View.VISIBLE);
                    editText49.setVisibility(View.VISIBLE);
                    infoImageButton49.setVisibility(View.VISIBLE);
                    photoImageButton49.setVisibility(View.VISIBLE);
                    textView50.setVisibility(View.VISIBLE);
                    editText50.setVisibility(View.VISIBLE);
                    infoImageButton50.setVisibility(View.VISIBLE);
                    photoImageButton50.setVisibility(View.VISIBLE);
                    textView51.setVisibility(View.VISIBLE);
                    editText51.setVisibility(View.VISIBLE);
                    infoImageButton51.setVisibility(View.VISIBLE);
                    photoImageButton51.setVisibility(View.VISIBLE);
                    textView52.setVisibility(View.VISIBLE);
                    editText52.setVisibility(View.VISIBLE);
                    infoImageButton52.setVisibility(View.VISIBLE);
                    photoImageButton52.setVisibility(View.VISIBLE);
                    textView53.setVisibility(View.VISIBLE);
                    editText53.setVisibility(View.VISIBLE);
                    infoImageButton53.setVisibility(View.VISIBLE);
                    photoImageButton53.setVisibility(View.VISIBLE);
                }
                else {
                    minimize6.setText("⌄");
                    textView46.setVisibility(View.GONE);
                    editText46.setVisibility(View.GONE);
                    infoImageButton46.setVisibility(View.GONE);
                    photoImageButton46.setVisibility(View.GONE);
                    textView47.setVisibility(View.GONE);
                    editText47.setVisibility(View.GONE);
                    infoImageButton47.setVisibility(View.GONE);
                    photoImageButton47.setVisibility(View.GONE);
                    textView48.setVisibility(View.GONE);
                    editText48.setVisibility(View.GONE);
                    infoImageButton48.setVisibility(View.GONE);
                    photoImageButton48.setVisibility(View.GONE);
                    textView49.setVisibility(View.GONE);
                    editText49.setVisibility(View.GONE);
                    infoImageButton49.setVisibility(View.GONE);
                    photoImageButton49.setVisibility(View.GONE);
                    textView50.setVisibility(View.GONE);
                    editText50.setVisibility(View.GONE);
                    infoImageButton50.setVisibility(View.GONE);
                    photoImageButton50.setVisibility(View.GONE);
                    textView51.setVisibility(View.GONE);
                    editText51.setVisibility(View.GONE);
                    infoImageButton51.setVisibility(View.GONE);
                    photoImageButton51.setVisibility(View.GONE);
                    textView52.setVisibility(View.GONE);
                    editText52.setVisibility(View.GONE);
                    infoImageButton52.setVisibility(View.GONE);
                    photoImageButton52.setVisibility(View.GONE);
                    textView53.setVisibility(View.GONE);
                    editText53.setVisibility(View.GONE);
                    infoImageButton53.setVisibility(View.GONE);
                    photoImageButton53.setVisibility(View.GONE);
                }
            }
        });


        // Happy Hour

        final TextView textView54 = view.findViewById(R.id.textView54);
        final EditText editText54 = view.findViewById(R.id.editText54);
        final TextView textView55 = view.findViewById(R.id.textView55);
        final EditText editText55 = view.findViewById(R.id.editText55);
        final TextView textView56 = view.findViewById(R.id.textView56);
        final EditText editText56 = view.findViewById(R.id.editText56);
        final TextView textView57 = view.findViewById(R.id.textView57);
        final EditText editText57 = view.findViewById(R.id.editText57);
        final TextView textView58 = view.findViewById(R.id.textView58);
        final EditText editText58 = view.findViewById(R.id.editText58);

        final ImageButton infoImageButton54 = view.findViewById(R.id.infoImageButton54);
        infoImageButton54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Happy Hour 1");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton54 = view.findViewById(R.id.photoImageButton54);
        photoImageButton54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 54;
            }
        });

        final ImageButton infoImageButton55 = view.findViewById(R.id.infoImageButton55);
        infoImageButton55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Happy Hour 2");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton55 = view.findViewById(R.id.photoImageButton55);
        photoImageButton55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 55;
            }
        });

        final ImageButton infoImageButton56 = view.findViewById(R.id.infoImageButton56);
        infoImageButton56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Happy Hour 3");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton56 = view.findViewById(R.id.photoImageButton56);
        photoImageButton56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 56;
            }
        });

        final ImageButton infoImageButton57 = view.findViewById(R.id.infoImageButton57);
        infoImageButton57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Happy Hour 4");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton57 = view.findViewById(R.id.photoImageButton57);
        photoImageButton57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 57;
            }
        });

        final ImageButton infoImageButton58 = view.findViewById(R.id.infoImageButton58);
        infoImageButton58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Happy Hour 5");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton58 = view.findViewById(R.id.photoImageButton58);
        photoImageButton58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 58;
            }
        });



        final Button minimize7 = view.findViewById(R.id.minimizeButton7);
        minimize7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView54.getVisibility() == View.GONE) {
                    minimize7.setText("^");
                    textView54.setVisibility(View.VISIBLE);
                    editText54.setVisibility(View.VISIBLE);
                    infoImageButton54.setVisibility(View.VISIBLE);
                    photoImageButton54.setVisibility(View.VISIBLE);
                    textView55.setVisibility(View.VISIBLE);
                    editText55.setVisibility(View.VISIBLE);
                    infoImageButton55.setVisibility(View.VISIBLE);
                    photoImageButton55.setVisibility(View.VISIBLE);
                    textView56.setVisibility(View.VISIBLE);
                    editText56.setVisibility(View.VISIBLE);
                    infoImageButton56.setVisibility(View.VISIBLE);
                    photoImageButton56.setVisibility(View.VISIBLE);
                    textView57.setVisibility(View.VISIBLE);
                    editText57.setVisibility(View.VISIBLE);
                    infoImageButton57.setVisibility(View.VISIBLE);
                    photoImageButton57.setVisibility(View.VISIBLE);
                    textView58.setVisibility(View.VISIBLE);
                    editText58.setVisibility(View.VISIBLE);
                    infoImageButton58.setVisibility(View.VISIBLE);
                    photoImageButton58.setVisibility(View.VISIBLE);

                }
                else {
                    minimize7.setText("⌄");
                    textView54.setVisibility(View.GONE);
                    editText54.setVisibility(View.GONE);
                    infoImageButton54.setVisibility(View.GONE);
                    photoImageButton54.setVisibility(View.GONE);
                    textView55.setVisibility(View.GONE);
                    editText55.setVisibility(View.GONE);
                    infoImageButton55.setVisibility(View.GONE);
                    photoImageButton55.setVisibility(View.GONE);
                    textView56.setVisibility(View.GONE);
                    editText56.setVisibility(View.GONE);
                    infoImageButton56.setVisibility(View.GONE);
                    photoImageButton56.setVisibility(View.GONE);
                    textView57.setVisibility(View.GONE);
                    editText57.setVisibility(View.GONE);
                    infoImageButton57.setVisibility(View.GONE);
                    photoImageButton57.setVisibility(View.GONE);
                    textView58.setVisibility(View.GONE);
                    editText58.setVisibility(View.GONE);
                    infoImageButton58.setVisibility(View.GONE);
                    photoImageButton58.setVisibility(View.GONE);
                }
            }
        });


        // Closing

        final TextView textView59 = view.findViewById(R.id.textView59);
        final EditText editText59 = view.findViewById(R.id.editText59);
        final TextView textView60 = view.findViewById(R.id.textView60);
        final EditText editText60 = view.findViewById(R.id.editText60);
        final TextView textView61 = view.findViewById(R.id.textView61);
        final EditText editText61 = view.findViewById(R.id.editText61);
        final TextView textView62 = view.findViewById(R.id.textView62);
        final EditText editText62 = view.findViewById(R.id.editText62);
        final TextView textView63 = view.findViewById(R.id.textView63);
        final EditText editText63 = view.findViewById(R.id.editText63);
        final TextView textView64 = view.findViewById(R.id.textView64);
        final EditText editText64 = view.findViewById(R.id.editText64);
        final TextView textView65 = view.findViewById(R.id.textView65);
        final EditText editText65 = view.findViewById(R.id.editText65);
        final TextView textView66 = view.findViewById(R.id.textView66);
        final EditText editText66 = view.findViewById(R.id.editText66);
        final TextView textView67 = view.findViewById(R.id.textView67);
        final EditText editText67 = view.findViewById(R.id.editText67);
        final TextView textView68 = view.findViewById(R.id.textView68);
        final EditText editText68 = view.findViewById(R.id.editText68);
        final TextView textView69 = view.findViewById(R.id.textView69);
        final EditText editText69 = view.findViewById(R.id.editText69);
        final TextView textView70 = view.findViewById(R.id.textView70);
        final EditText editText70 = view.findViewById(R.id.editText70);
        final TextView textView71 = view.findViewById(R.id.textView71);
        final EditText editText71 = view.findViewById(R.id.editText71);
        final TextView textView72 = view.findViewById(R.id.textView72);
        final EditText editText72 = view.findViewById(R.id.editText72);
        final TextView textView73 = view.findViewById(R.id.textView73);
        final EditText editText73 = view.findViewById(R.id.editText73);
        final TextView textView74 = view.findViewById(R.id.textView74);
        final EditText editText74 = view.findViewById(R.id.editText74);
        final TextView textView75 = view.findViewById(R.id.textView75);
        final EditText editText75 = view.findViewById(R.id.editText75);

        final ImageButton infoImageButton59 = view.findViewById(R.id.infoImageButton59);
        infoImageButton59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 1");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton59 = view.findViewById(R.id.photoImageButton59);
        photoImageButton59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 59;
            }
        });

        final ImageButton infoImageButton60 = view.findViewById(R.id.infoImageButton60);
        infoImageButton60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 2");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton60 = view.findViewById(R.id.photoImageButton60);
        photoImageButton60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 60;
            }
        });

        final ImageButton infoImageButton61 = view.findViewById(R.id.infoImageButton61);
        infoImageButton61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 3");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton61 = view.findViewById(R.id.photoImageButton61);
        photoImageButton61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 61;
            }
        });

        final ImageButton infoImageButton62 = view.findViewById(R.id.infoImageButton62);
        infoImageButton62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 4");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton62 = view.findViewById(R.id.photoImageButton62);
        photoImageButton62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 62;
            }
        });

        final ImageButton infoImageButton63 = view.findViewById(R.id.infoImageButton63);
        infoImageButton63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 5");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton63 = view.findViewById(R.id.photoImageButton63);
        photoImageButton63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 63;
            }
        });

        final ImageButton infoImageButton64 = view.findViewById(R.id.infoImageButton64);
        infoImageButton64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 6");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton64 = view.findViewById(R.id.photoImageButton64);
        photoImageButton64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 64;
            }
        });

        final ImageButton infoImageButton65 = view.findViewById(R.id.infoImageButton65);
        infoImageButton65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 7");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton65 = view.findViewById(R.id.photoImageButton65);
        photoImageButton65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 65;
            }
        });

        final ImageButton infoImageButton66 = view.findViewById(R.id.infoImageButton66);
        infoImageButton66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 8");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton66 = view.findViewById(R.id.photoImageButton66);
        photoImageButton66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 66;
            }
        });

        final ImageButton infoImageButton67 = view.findViewById(R.id.infoImageButton67);
        infoImageButton67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 9");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton67 = view.findViewById(R.id.photoImageButton67);
        photoImageButton67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 67;
            }
        });

        final ImageButton infoImageButton68 = view.findViewById(R.id.infoImageButton68);
        infoImageButton68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 10");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton68 = view.findViewById(R.id.photoImageButton68);
        photoImageButton68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 68;
            }
        });

        final ImageButton infoImageButton69 = view.findViewById(R.id.infoImageButton69);
        infoImageButton69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 11");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton69 = view.findViewById(R.id.photoImageButton69);
        photoImageButton69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 69;
            }
        });

        final ImageButton infoImageButton70 = view.findViewById(R.id.infoImageButton70);
        infoImageButton70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 12");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton70 = view.findViewById(R.id.photoImageButton70);
        photoImageButton70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 70;
            }
        });

        final ImageButton infoImageButton71 = view.findViewById(R.id.infoImageButton71);
        infoImageButton71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 13");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton71 = view.findViewById(R.id.photoImageButton71);
        photoImageButton71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 71;
            }
        });

        final ImageButton infoImageButton72 = view.findViewById(R.id.infoImageButton72);
        infoImageButton72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 14");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton72 = view.findViewById(R.id.photoImageButton72);
        photoImageButton72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 72;
            }
        });

        final ImageButton infoImageButton73 = view.findViewById(R.id.infoImageButton73);
        infoImageButton73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 15");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton73 = view.findViewById(R.id.photoImageButton73);
        photoImageButton73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 73;
            }
        });

        final ImageButton infoImageButton74 = view.findViewById(R.id.infoImageButton74);
        infoImageButton74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 16");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton74 = view.findViewById(R.id.photoImageButton74);
        photoImageButton74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 74;
            }
        });

        final ImageButton infoImageButton75 = view.findViewById(R.id.infoImageButton75);
        infoImageButton75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Bartender.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 17");
                Bartender.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton75 = view.findViewById(R.id.photoImageButton75);
        photoImageButton75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 75;
            }
        });



        final Button minimize8 = view.findViewById(R.id.minimizeButton8);
        minimize8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView59.getVisibility() == View.GONE) {
                    minimize8.setText("^");
                    textView59.setVisibility(View.VISIBLE);
                    editText59.setVisibility(View.VISIBLE);
                    infoImageButton59.setVisibility(View.VISIBLE);
                    photoImageButton59.setVisibility(View.VISIBLE);
                    textView60.setVisibility(View.VISIBLE);
                    editText60.setVisibility(View.VISIBLE);
                    infoImageButton60.setVisibility(View.VISIBLE);
                    photoImageButton60.setVisibility(View.VISIBLE);
                    textView61.setVisibility(View.VISIBLE);
                    editText61.setVisibility(View.VISIBLE);
                    infoImageButton61.setVisibility(View.VISIBLE);
                    photoImageButton61.setVisibility(View.VISIBLE);
                    textView62.setVisibility(View.VISIBLE);
                    editText62.setVisibility(View.VISIBLE);
                    infoImageButton62.setVisibility(View.VISIBLE);
                    photoImageButton62.setVisibility(View.VISIBLE);
                    textView63.setVisibility(View.VISIBLE);
                    editText63.setVisibility(View.VISIBLE);
                    infoImageButton63.setVisibility(View.VISIBLE);
                    photoImageButton63.setVisibility(View.VISIBLE);
                    textView64.setVisibility(View.VISIBLE);
                    editText64.setVisibility(View.VISIBLE);
                    infoImageButton64.setVisibility(View.VISIBLE);
                    photoImageButton64.setVisibility(View.VISIBLE);
                    textView65.setVisibility(View.VISIBLE);
                    editText65.setVisibility(View.VISIBLE);
                    infoImageButton65.setVisibility(View.VISIBLE);
                    photoImageButton65.setVisibility(View.VISIBLE);
                    textView66.setVisibility(View.VISIBLE);
                    editText66.setVisibility(View.VISIBLE);
                    infoImageButton66.setVisibility(View.VISIBLE);
                    photoImageButton66.setVisibility(View.VISIBLE);
                    textView67.setVisibility(View.VISIBLE);
                    editText67.setVisibility(View.VISIBLE);
                    infoImageButton67.setVisibility(View.VISIBLE);
                    photoImageButton67.setVisibility(View.VISIBLE);
                    textView68.setVisibility(View.VISIBLE);
                    editText68.setVisibility(View.VISIBLE);
                    infoImageButton68.setVisibility(View.VISIBLE);
                    photoImageButton68.setVisibility(View.VISIBLE);
                    textView69.setVisibility(View.VISIBLE);
                    editText69.setVisibility(View.VISIBLE);
                    infoImageButton69.setVisibility(View.VISIBLE);
                    photoImageButton69.setVisibility(View.VISIBLE);
                    textView70.setVisibility(View.VISIBLE);
                    editText70.setVisibility(View.VISIBLE);
                    infoImageButton70.setVisibility(View.VISIBLE);
                    photoImageButton70.setVisibility(View.VISIBLE);
                    textView71.setVisibility(View.VISIBLE);
                    editText71.setVisibility(View.VISIBLE);
                    infoImageButton71.setVisibility(View.VISIBLE);
                    photoImageButton71.setVisibility(View.VISIBLE);
                    textView72.setVisibility(View.VISIBLE);
                    editText72.setVisibility(View.VISIBLE);
                    infoImageButton72.setVisibility(View.VISIBLE);
                    photoImageButton72.setVisibility(View.VISIBLE);
                    textView73.setVisibility(View.VISIBLE);
                    editText73.setVisibility(View.VISIBLE);
                    infoImageButton73.setVisibility(View.VISIBLE);
                    photoImageButton73.setVisibility(View.VISIBLE);
                    textView74.setVisibility(View.VISIBLE);
                    editText74.setVisibility(View.VISIBLE);
                    infoImageButton74.setVisibility(View.VISIBLE);
                    photoImageButton74.setVisibility(View.VISIBLE);
                    textView75.setVisibility(View.VISIBLE);
                    editText75.setVisibility(View.VISIBLE);
                    infoImageButton75.setVisibility(View.VISIBLE);
                    photoImageButton75.setVisibility(View.VISIBLE);

                }
                else {
                    minimize8.setText("⌄");
                    textView59.setVisibility(View.GONE);
                    editText59.setVisibility(View.GONE);
                    infoImageButton59.setVisibility(View.GONE);
                    photoImageButton59.setVisibility(View.GONE);
                    textView60.setVisibility(View.GONE);
                    editText60.setVisibility(View.GONE);
                    infoImageButton60.setVisibility(View.GONE);
                    photoImageButton60.setVisibility(View.GONE);
                    textView61.setVisibility(View.GONE);
                    editText61.setVisibility(View.GONE);
                    infoImageButton61.setVisibility(View.GONE);
                    photoImageButton61.setVisibility(View.GONE);
                    textView62.setVisibility(View.GONE);
                    editText62.setVisibility(View.GONE);
                    infoImageButton62.setVisibility(View.GONE);
                    photoImageButton62.setVisibility(View.GONE);
                    textView63.setVisibility(View.GONE);
                    editText63.setVisibility(View.GONE);
                    infoImageButton63.setVisibility(View.GONE);
                    photoImageButton63.setVisibility(View.GONE);
                    textView64.setVisibility(View.GONE);
                    editText64.setVisibility(View.GONE);
                    infoImageButton64.setVisibility(View.GONE);
                    photoImageButton64.setVisibility(View.GONE);
                    textView65.setVisibility(View.GONE);
                    editText65.setVisibility(View.GONE);
                    infoImageButton65.setVisibility(View.GONE);
                    photoImageButton65.setVisibility(View.GONE);
                    textView66.setVisibility(View.GONE);
                    editText66.setVisibility(View.GONE);
                    infoImageButton66.setVisibility(View.GONE);
                    photoImageButton66.setVisibility(View.GONE);
                    textView67.setVisibility(View.GONE);
                    editText67.setVisibility(View.GONE);
                    infoImageButton67.setVisibility(View.GONE);
                    photoImageButton67.setVisibility(View.GONE);
                    textView68.setVisibility(View.GONE);
                    editText68.setVisibility(View.GONE);
                    infoImageButton68.setVisibility(View.GONE);
                    photoImageButton68.setVisibility(View.GONE);
                    textView69.setVisibility(View.GONE);
                    editText69.setVisibility(View.GONE);
                    infoImageButton69.setVisibility(View.GONE);
                    photoImageButton69.setVisibility(View.GONE);
                    textView70.setVisibility(View.GONE);
                    editText70.setVisibility(View.GONE);
                    infoImageButton70.setVisibility(View.GONE);
                    photoImageButton70.setVisibility(View.GONE);
                    textView71.setVisibility(View.GONE);
                    editText71.setVisibility(View.GONE);
                    infoImageButton71.setVisibility(View.GONE);
                    photoImageButton71.setVisibility(View.GONE);
                    textView72.setVisibility(View.GONE);
                    editText72.setVisibility(View.GONE);
                    infoImageButton72.setVisibility(View.GONE);
                    photoImageButton72.setVisibility(View.GONE);
                    textView73.setVisibility(View.GONE);
                    editText73.setVisibility(View.GONE);
                    infoImageButton73.setVisibility(View.GONE);
                    photoImageButton73.setVisibility(View.GONE);
                    textView74.setVisibility(View.GONE);
                    editText74.setVisibility(View.GONE);
                    infoImageButton74.setVisibility(View.GONE);
                    photoImageButton74.setVisibility(View.GONE);
                    textView75.setVisibility(View.GONE);
                    editText75.setVisibility(View.GONE);
                    infoImageButton75.setVisibility(View.GONE);
                    photoImageButton75.setVisibility(View.GONE);

                }
            }
        });


        // Submit Button

        final Button bartenderSubmitButton = view.findViewById(R.id.bartenderSubmitButton);
        bartenderSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KOKChecklistDBHandler handler = new KOKChecklistDBHandler(Bartender.this.getActivity());

                int[] ids = new int[]{R.id.editText37, R.id.editText38, R.id.editText39, R.id.editText40, R.id.editText41, R.id.editText42, R.id.editText43, R.id.editText44, R.id.editText45, R.id.editText46, R.id.editText47, R.id.editText48, R.id.editText49, R.id.editText50, R.id.editText51, R.id.editText52, R.id.editText53, R.id.editText54, R.id.editText55, R.id.editText56, R.id.editText57, R.id.editText58, R.id.editText59, R.id.editText60, R.id.editText61, R.id.editText62, R.id.editText63, R.id.editText64, R.id.editText65, R.id.editText66, R.id.editText67, R.id.editText68, R.id.editText69, R.id.editText70, R.id.editText71, R.id.editText72, R.id.editText73, R.id.editText74, R.id.editText75};
                int i = 37;
                for(int id : ids) {
                    EditText initials = view.findViewById(id);
                    if(initials.getText().toString().trim().length() == 2) {
                        byte[] image = null;
                        if(imageList[i-37] != null) {
                            ByteArrayOutputStream stream = new ByteArrayOutputStream();
                            imageList[i-37].compress(Bitmap.CompressFormat.PNG, 100, stream);
                            byte[] bytesArray = stream.toByteArray();
                            image = bytesArray;
                        }
                        handler.addTaskToLog(handler.getWritableDatabase(),2, i, initials.getText().toString(), image);
                    }
                    initials.setText("");
                    imageList[i-37] = null;
                    i++;
                }
            }
        });
        // Inflate the layout for this fragment
        return view;
    }


    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == CAMERA_REQUEST) {
            Bitmap bmp = (Bitmap) data.getExtras().get("data");
            ByteArrayOutputStream stream = new ByteArrayOutputStream();

            bmp.compress(Bitmap.CompressFormat.PNG, 100, stream);
            byte[] bytesArray = stream.toByteArray();

            Bitmap bitmap = BitmapFactory.decodeByteArray(bytesArray, 0, bytesArray.length);



            switch (buttonNumber) {
                case 37:
                    photo37.setImageBitmap(bitmap);
                    imageList[0]= bitmap;
                    break;
                case 38:
                    photo38.setImageBitmap(bitmap);
                    imageList[1]= bitmap;
                    break;
                case 39:
                    photo39.setImageBitmap(bitmap);
                    imageList[2]= bitmap;
                    break;
                case 40:
                    photo40.setImageBitmap(bitmap);
                    imageList[3]= bitmap;
                    break;
                case 41:
                    photo41.setImageBitmap(bitmap);
                    imageList[4]= bitmap;
                    break;
                case 42:
                    photo42.setImageBitmap(bitmap);
                    imageList[5]= bitmap;
                    break;
                case 43:
                    photo43.setImageBitmap(bitmap);
                    imageList[6]= bitmap;
                    break;
                case 44:
                    photo44.setImageBitmap(bitmap);
                    imageList[7]= bitmap;
                    break;
                case 45:
                    photo45.setImageBitmap(bitmap);
                    imageList[8]= bitmap;
                    break;
                case 46:
                    photo46.setImageBitmap(bitmap);
                    imageList[9]= bitmap;
                    break;
                case 47:
                    photo47.setImageBitmap(bitmap);
                    imageList[10]= bitmap;
                    break;
                case 48:
                    photo48.setImageBitmap(bitmap);
                    imageList[11]= bitmap;
                    break;
                case 49:
                    photo49.setImageBitmap(bitmap);
                    imageList[12]= bitmap;
                    break;
                case 50:
                    photo50.setImageBitmap(bitmap);
                    imageList[13]= bitmap;
                    break;
                case 51:
                    photo51.setImageBitmap(bitmap);
                    imageList[14]= bitmap;
                    break;
                case 52:
                    photo52.setImageBitmap(bitmap);
                    imageList[15]= bitmap;
                    break;
                case 53:
                    photo53.setImageBitmap(bitmap);
                    imageList[16]= bitmap;
                    break;
                case 54:
                    photo54.setImageBitmap(bitmap);
                    imageList[17]= bitmap;
                    break;
                case 55:
                    photo55.setImageBitmap(bitmap);
                    imageList[18]= bitmap;
                    break;
                case 56:
                    photo56.setImageBitmap(bitmap);
                    imageList[19]= bitmap;
                    break;
                case 57:
                    photo57.setImageBitmap(bitmap);
                    imageList[20]= bitmap;
                    break;
                case 58:
                    photo58.setImageBitmap(bitmap);
                    imageList[21]= bitmap;
                    break;
                case 59:
                    photo59.setImageBitmap(bitmap);
                    imageList[22]= bitmap;
                    break;
                case 60:
                    photo60.setImageBitmap(bitmap);
                    imageList[23]= bitmap;
                    break;
                case 61:
                    photo61.setImageBitmap(bitmap);
                    imageList[24]= bitmap;
                    break;
                case 62:
                    photo62.setImageBitmap(bitmap);
                    imageList[25]= bitmap;
                    break;
                case 63:
                    photo63.setImageBitmap(bitmap);
                    imageList[26]= bitmap;
                    break;
                case 64:
                    photo64.setImageBitmap(bitmap);
                    imageList[27]= bitmap;
                    break;
                case 65:
                    photo65.setImageBitmap(bitmap);
                    imageList[28]= bitmap;
                    break;
                case 66:
                    photo66.setImageBitmap(bitmap);
                    imageList[29]= bitmap;
                    break;
                case 67:
                    photo67.setImageBitmap(bitmap);
                    imageList[30]= bitmap;
                    break;
                case 68:
                    photo68.setImageBitmap(bitmap);
                    imageList[31]= bitmap;
                    break;
                case 69:
                    photo69.setImageBitmap(bitmap);
                    imageList[32]= bitmap;
                    break;
                case 70:
                    photo70.setImageBitmap(bitmap);
                    imageList[33]= bitmap;
                    break;
                case 71:
                    photo71.setImageBitmap(bitmap);
                    imageList[34]= bitmap;
                    break;
                case 72:
                    photo72.setImageBitmap(bitmap);
                    imageList[35]= bitmap;
                    break;
                case 73:
                    photo73.setImageBitmap(bitmap);
                    imageList[36]= bitmap;
                    break;
                case 74:
                    photo74.setImageBitmap(bitmap);
                    imageList[37]= bitmap;
                    break;
                case 75:
                    photo75.setImageBitmap(bitmap);
                    imageList[38]= bitmap;
                    break;
            }
        }
    }
}
