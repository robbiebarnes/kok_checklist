package com.example.kok_checklist;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
public class Security extends Fragment {

    View view;

    private static final int CAMERA_REQUEST = 1888;

    private int buttonNumber;

    private ImageView photo76;
    private ImageView photo77;
    private ImageView photo78;
    private ImageView photo79;
    private ImageView photo80;
    private ImageView photo81;
    private ImageView photo82;
    private ImageView photo83;
    private ImageView photo84;
    private ImageView photo85;
    private ImageView photo86;
    private ImageView photo87;
    private ImageView photo88;
    private ImageView photo89;
    private ImageView photo90;
    private ImageView photo91;
    private ImageView photo92;
    private ImageView photo93;
    private ImageView photo94;
    private ImageView photo95;
    private ImageView photo96;
    private ImageView photo97;
    private ImageView photo98;
    private ImageView photo99;
    private ImageView photo100;
    private ImageView photo101;
    private ImageView photo102;
    private ImageView photo103;
    private ImageView photo104;
    private ImageView photo105;
    private ImageView photo106;
    private ImageView photo107;
    private ImageView photo108;
    private ImageView photo109;
    private ImageView photo110;
    private ImageView photo111;
    private ImageView photo112;
    private ImageView photo113;

    private Bitmap[] imageList = new Bitmap[38];

    public Security() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_security, container, false);

        photo76 = view.findViewById(R.id.photo76);
        photo77 = view.findViewById(R.id.photo77);
        photo78 = view.findViewById(R.id.photo78);
        photo79 = view.findViewById(R.id.photo79);
        photo80 = view.findViewById(R.id.photo80);
        photo81 = view.findViewById(R.id.photo81);
        photo82 = view.findViewById(R.id.photo82);
        photo83 = view.findViewById(R.id.photo83);
        photo84 = view.findViewById(R.id.photo84);
        photo85 = view.findViewById(R.id.photo85);
        photo86 = view.findViewById(R.id.photo86);
        photo87 = view.findViewById(R.id.photo87);
        photo88 = view.findViewById(R.id.photo88);
        photo89 = view.findViewById(R.id.photo89);
        photo90 = view.findViewById(R.id.photo90);
        photo91 = view.findViewById(R.id.photo91);
        photo92 = view.findViewById(R.id.photo92);
        photo93 = view.findViewById(R.id.photo93);
        photo94 = view.findViewById(R.id.photo94);
        photo95 = view.findViewById(R.id.photo95);
        photo96 = view.findViewById(R.id.photo96);
        photo97 = view.findViewById(R.id.photo97);
        photo98 = view.findViewById(R.id.photo98);
        photo99 = view.findViewById(R.id.photo99);
        photo100 = view.findViewById(R.id.photo100);
        photo101 = view.findViewById(R.id.photo101);
        photo102 = view.findViewById(R.id.photo102);
        photo103 = view.findViewById(R.id.photo103);
        photo104 = view.findViewById(R.id.photo104);
        photo105 = view.findViewById(R.id.photo105);
        photo106 = view.findViewById(R.id.photo106);
        photo107 = view.findViewById(R.id.photo107);
        photo108 = view.findViewById(R.id.photo108);
        photo109 = view.findViewById(R.id.photo109);
        photo110 = view.findViewById(R.id.photo110);
        photo111 = view.findViewById(R.id.photo111);
        photo112 = view.findViewById(R.id.photo112);
        photo113 = view.findViewById(R.id.photo113);

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

        // OPEN SHIFT

        final TextView textView76 = view.findViewById(R.id.textView76);
        final EditText editText76 = view.findViewById(R.id.editText76);
        final TextView textView77 = view.findViewById(R.id.textView77);
        final EditText editText77 = view.findViewById(R.id.editText77);
        final TextView textView78 = view.findViewById(R.id.textView78);
        final EditText editText78 = view.findViewById(R.id.editText78);
        final TextView textView79 = view.findViewById(R.id.textView79);
        final EditText editText79 = view.findViewById(R.id.editText79);
        final TextView textView80 = view.findViewById(R.id.textView80);
        final EditText editText80 = view.findViewById(R.id.editText80);

        final ImageButton infoImageButton76 = view.findViewById(R.id.infoImageButton76);
        infoImageButton76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 1");
                Security.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton76 = view.findViewById(R.id.photoImageButton76);
        photoImageButton76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 76;
            }
        });

        final ImageButton infoImageButton77 = view.findViewById(R.id.infoImageButton77);
        infoImageButton77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 2");
                Security.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton77 = view.findViewById(R.id.photoImageButton77);
        photoImageButton77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 77;
            }
        });

        final ImageButton infoImageButton78 = view.findViewById(R.id.infoImageButton78);
        infoImageButton78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 3");
                Security.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton78 = view.findViewById(R.id.photoImageButton78);
        photoImageButton78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 78;
            }
        });

        final ImageButton infoImageButton79 = view.findViewById(R.id.infoImageButton79);
        infoImageButton79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 4");
                Security.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton79 = view.findViewById(R.id.photoImageButton79);
        photoImageButton79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 79;
            }
        });

        final ImageButton infoImageButton80 = view.findViewById(R.id.infoImageButton80);
        infoImageButton80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 5");
                Security.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton80 = view.findViewById(R.id.photoImageButton80);
        photoImageButton80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 80;
            }
        });

        final Button minimize9 = view.findViewById(R.id.minimizeButton9);
        minimize9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView76.getVisibility() == View.GONE) {
                    minimize9.setText("^");
                    textView76.setVisibility(View.VISIBLE);
                    editText76.setVisibility(View.VISIBLE);
                    infoImageButton76.setVisibility(View.VISIBLE);
                    photoImageButton76.setVisibility(View.VISIBLE);
                    textView77.setVisibility(View.VISIBLE);
                    editText77.setVisibility(View.VISIBLE);
                    infoImageButton77.setVisibility(View.VISIBLE);
                    photoImageButton77.setVisibility(View.VISIBLE);
                    textView78.setVisibility(View.VISIBLE);
                    editText78.setVisibility(View.VISIBLE);
                    infoImageButton78.setVisibility(View.VISIBLE);
                    photoImageButton78.setVisibility(View.VISIBLE);
                    textView79.setVisibility(View.VISIBLE);
                    editText79.setVisibility(View.VISIBLE);
                    infoImageButton79.setVisibility(View.VISIBLE);
                    photoImageButton79.setVisibility(View.VISIBLE);
                    textView80.setVisibility(View.VISIBLE);
                    editText80.setVisibility(View.VISIBLE);
                    infoImageButton80.setVisibility(View.VISIBLE);
                    photoImageButton80.setVisibility(View.VISIBLE);
                }
                else {
                    minimize9.setText("⌄");
                    textView76.setVisibility(View.GONE);
                    editText76.setVisibility(View.GONE);
                    infoImageButton76.setVisibility(View.GONE);
                    photoImageButton76.setVisibility(View.GONE);
                    textView77.setVisibility(View.GONE);
                    editText77.setVisibility(View.GONE);
                    infoImageButton77.setVisibility(View.GONE);
                    photoImageButton77.setVisibility(View.GONE);
                    textView78.setVisibility(View.GONE);
                    editText78.setVisibility(View.GONE);
                    infoImageButton78.setVisibility(View.GONE);
                    photoImageButton78.setVisibility(View.GONE);
                    textView79.setVisibility(View.GONE);
                    editText79.setVisibility(View.GONE);
                    infoImageButton79.setVisibility(View.GONE);
                    photoImageButton79.setVisibility(View.GONE);
                    textView80.setVisibility(View.GONE);
                    editText80.setVisibility(View.GONE);
                    infoImageButton80.setVisibility(View.GONE);
                    photoImageButton80.setVisibility(View.GONE);
                }

            }
        });

        // DURING SHIFT (ALL SHIFTS)

        final TextView textView81 = view.findViewById(R.id.textView81);
        final EditText editText81 = view.findViewById(R.id.editText81);
        final TextView textView82 = view.findViewById(R.id.textView82);
        final EditText editText82 = view.findViewById(R.id.editText82);
        final TextView textView83 = view.findViewById(R.id.textView83);
        final EditText editText83 = view.findViewById(R.id.editText83);
        final TextView textView84 = view.findViewById(R.id.textView84);
        final EditText editText84 = view.findViewById(R.id.editText84);
        final TextView textView85 = view.findViewById(R.id.textView85);
        final EditText editText85 = view.findViewById(R.id.editText85);
        final TextView textView86 = view.findViewById(R.id.textView86);
        final EditText editText86 = view.findViewById(R.id.editText86);

        final ImageButton infoImageButton81 = view.findViewById(R.id.infoImageButton81);
        infoImageButton81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","During Shift 1");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton81 = view.findViewById(R.id.photoImageButton81);
        photoImageButton81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 81;
            }
        });

        final ImageButton infoImageButton82 = view.findViewById(R.id.infoImageButton82);
        infoImageButton82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","During Shift 2");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton82 = view.findViewById(R.id.photoImageButton82);
        photoImageButton82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 82;
            }
        });

        final ImageButton infoImageButton83 = view.findViewById(R.id.infoImageButton83);
        infoImageButton83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","During Shift 3");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton83 = view.findViewById(R.id.photoImageButton83);
        photoImageButton83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 83;
            }
        });

        final ImageButton infoImageButton84 = view.findViewById(R.id.infoImageButton84);
        infoImageButton84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","During Shift 4");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton84 = view.findViewById(R.id.photoImageButton84);
        photoImageButton84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 84;
            }
        });

        final ImageButton infoImageButton85 = view.findViewById(R.id.infoImageButton85);
        infoImageButton85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","During Shift 5");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton85 = view.findViewById(R.id.photoImageButton85);
        photoImageButton85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 85;
            }
        });

        final ImageButton infoImageButton86 = view.findViewById(R.id.infoImageButton86);
        infoImageButton86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","During Shift 6");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton86 = view.findViewById(R.id.photoImageButton86);
        photoImageButton86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 86;
            }
        });

        final Button minimize10 = view.findViewById(R.id.minimizeButton10);
        minimize10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView81.getVisibility() == View.GONE) {
                    minimize10.setText("^");
                    textView81.setVisibility(View.VISIBLE);
                    editText81.setVisibility(View.VISIBLE);
                    infoImageButton81.setVisibility(View.VISIBLE);
                    photoImageButton81.setVisibility(View.VISIBLE);
                    textView82.setVisibility(View.VISIBLE);
                    editText82.setVisibility(View.VISIBLE);
                    infoImageButton82.setVisibility(View.VISIBLE);
                    photoImageButton82.setVisibility(View.VISIBLE);
                    textView83.setVisibility(View.VISIBLE);
                    editText83.setVisibility(View.VISIBLE);
                    infoImageButton83.setVisibility(View.VISIBLE);
                    photoImageButton83.setVisibility(View.VISIBLE);
                    textView84.setVisibility(View.VISIBLE);
                    editText84.setVisibility(View.VISIBLE);
                    infoImageButton84.setVisibility(View.VISIBLE);
                    photoImageButton84.setVisibility(View.VISIBLE);
                    textView85.setVisibility(View.VISIBLE);
                    editText85.setVisibility(View.VISIBLE);
                    infoImageButton85.setVisibility(View.VISIBLE);
                    photoImageButton85.setVisibility(View.VISIBLE);
                    textView86.setVisibility(View.VISIBLE);
                    editText86.setVisibility(View.VISIBLE);
                    infoImageButton86.setVisibility(View.VISIBLE);
                    photoImageButton86.setVisibility(View.VISIBLE);
                }
                else {
                    minimize10.setText("⌄");
                    textView81.setVisibility(View.GONE);
                    editText81.setVisibility(View.GONE);
                    infoImageButton81.setVisibility(View.GONE);
                    photoImageButton81.setVisibility(View.GONE);
                    textView82.setVisibility(View.GONE);
                    editText82.setVisibility(View.GONE);
                    infoImageButton82.setVisibility(View.GONE);
                    photoImageButton82.setVisibility(View.GONE);
                    textView83.setVisibility(View.GONE);
                    editText83.setVisibility(View.GONE);
                    infoImageButton83.setVisibility(View.GONE);
                    photoImageButton83.setVisibility(View.GONE);
                    textView84.setVisibility(View.GONE);
                    editText84.setVisibility(View.GONE);
                    infoImageButton84.setVisibility(View.GONE);
                    photoImageButton84.setVisibility(View.GONE);
                    textView85.setVisibility(View.GONE);
                    editText85.setVisibility(View.GONE);
                    infoImageButton85.setVisibility(View.GONE);
                    photoImageButton85.setVisibility(View.GONE);
                    textView86.setVisibility(View.GONE);
                    editText86.setVisibility(View.GONE);
                    infoImageButton86.setVisibility(View.GONE);
                    photoImageButton86.setVisibility(View.GONE);
                }
            }
        });

        // Happy Hour

        final TextView textView87 = view.findViewById(R.id.textView87);
        final EditText editText87 = view.findViewById(R.id.editText87);
        final TextView textView88 = view.findViewById(R.id.textView88);
        final EditText editText88 = view.findViewById(R.id.editText88);
        final TextView textView89 = view.findViewById(R.id.textView89);
        final EditText editText89 = view.findViewById(R.id.editText89);
        final TextView textView90 = view.findViewById(R.id.textView90);
        final EditText editText90 = view.findViewById(R.id.editText90);
        final TextView textView91 = view.findViewById(R.id.textView91);
        final EditText editText91 = view.findViewById(R.id.editText91);

        final ImageButton infoImageButton87 = view.findViewById(R.id.infoImageButton87);
        infoImageButton87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Happy Hour 1");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton87 = view.findViewById(R.id.photoImageButton87);
        photoImageButton87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 87;
            }
        });

        final ImageButton infoImageButton88 = view.findViewById(R.id.infoImageButton88);
        infoImageButton88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Happy Hour 2");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton88 = view.findViewById(R.id.photoImageButton88);
        photoImageButton88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 88;
            }
        });

        final ImageButton infoImageButton89 = view.findViewById(R.id.infoImageButton89);
        infoImageButton89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Happy Hour 3");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton89 = view.findViewById(R.id.photoImageButton89);
        photoImageButton89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 89;
            }
        });

        final ImageButton infoImageButton90 = view.findViewById(R.id.infoImageButton90);
        infoImageButton90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Happy Hour 4");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton90 = view.findViewById(R.id.photoImageButton90);
        photoImageButton90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 90;
            }
        });

        final ImageButton infoImageButton91 = view.findViewById(R.id.infoImageButton91);
        infoImageButton91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Happy Hour 5");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton91 = view.findViewById(R.id.photoImageButton91);
        photoImageButton91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 91;
            }
        });

        final Button minimize11 = view.findViewById(R.id.minimizeButton11);
        minimize11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView87.getVisibility() == View.GONE) {
                    minimize11.setText("^");
                    textView87.setVisibility(View.VISIBLE);
                    editText87.setVisibility(View.VISIBLE);
                    infoImageButton87.setVisibility(View.VISIBLE);
                    photoImageButton87.setVisibility(View.VISIBLE);
                    textView88.setVisibility(View.VISIBLE);
                    editText88.setVisibility(View.VISIBLE);
                    infoImageButton88.setVisibility(View.VISIBLE);
                    photoImageButton88.setVisibility(View.VISIBLE);
                    textView89.setVisibility(View.VISIBLE);
                    editText89.setVisibility(View.VISIBLE);
                    infoImageButton89.setVisibility(View.VISIBLE);
                    photoImageButton89.setVisibility(View.VISIBLE);
                    textView90.setVisibility(View.VISIBLE);
                    editText90.setVisibility(View.VISIBLE);
                    infoImageButton90.setVisibility(View.VISIBLE);
                    photoImageButton90.setVisibility(View.VISIBLE);
                    textView91.setVisibility(View.VISIBLE);
                    editText91.setVisibility(View.VISIBLE);
                    infoImageButton91.setVisibility(View.VISIBLE);
                    photoImageButton91.setVisibility(View.VISIBLE);

                }
                else {
                    minimize11.setText("⌄");
                    textView87.setVisibility(View.GONE);
                    editText87.setVisibility(View.GONE);
                    infoImageButton87.setVisibility(View.GONE);
                    photoImageButton87.setVisibility(View.GONE);
                    textView88.setVisibility(View.GONE);
                    editText88.setVisibility(View.GONE);
                    infoImageButton88.setVisibility(View.GONE);
                    photoImageButton88.setVisibility(View.GONE);
                    textView89.setVisibility(View.GONE);
                    editText89.setVisibility(View.GONE);
                    infoImageButton89.setVisibility(View.GONE);
                    photoImageButton89.setVisibility(View.GONE);
                    textView90.setVisibility(View.GONE);
                    editText90.setVisibility(View.GONE);
                    infoImageButton90.setVisibility(View.GONE);
                    photoImageButton90.setVisibility(View.GONE);
                    textView91.setVisibility(View.GONE);
                    editText91.setVisibility(View.GONE);
                    infoImageButton91.setVisibility(View.GONE);
                    photoImageButton91.setVisibility(View.GONE);
                }
            }
        });

        // Closing

        final TextView textView92 = view.findViewById(R.id.textView92);
        final EditText editText92 = view.findViewById(R.id.editText92);
        final TextView textView93 = view.findViewById(R.id.textView93);
        final EditText editText93 = view.findViewById(R.id.editText93);
        final TextView textView94 = view.findViewById(R.id.textView94);
        final EditText editText94 = view.findViewById(R.id.editText94);
        final TextView textView95 = view.findViewById(R.id.textView95);
        final EditText editText95 = view.findViewById(R.id.editText95);
        final TextView textView96 = view.findViewById(R.id.textView96);
        final EditText editText96 = view.findViewById(R.id.editText96);
        final TextView textView97 = view.findViewById(R.id.textView97);
        final EditText editText97 = view.findViewById(R.id.editText97);
        final TextView textView98 = view.findViewById(R.id.textView98);
        final EditText editText98 = view.findViewById(R.id.editText98);
        final TextView textView99 = view.findViewById(R.id.textView99);
        final EditText editText99 = view.findViewById(R.id.editText99);
        final TextView textView100 = view.findViewById(R.id.textView100);
        final EditText editText100 = view.findViewById(R.id.editText100);
        final TextView textView101 = view.findViewById(R.id.textView101);
        final EditText editText101 = view.findViewById(R.id.editText101);
        final TextView textView102 = view.findViewById(R.id.textView102);
        final EditText editText102 = view.findViewById(R.id.editText102);
        final TextView textView103 = view.findViewById(R.id.textView103);
        final EditText editText103 = view.findViewById(R.id.editText103);
        final TextView textView104 = view.findViewById(R.id.textView104);
        final EditText editText104 = view.findViewById(R.id.editText104);
        final TextView textView105 = view.findViewById(R.id.textView105);
        final EditText editText105 = view.findViewById(R.id.editText105);
        final TextView textView106 = view.findViewById(R.id.textView106);
        final EditText editText106 = view.findViewById(R.id.editText106);
        final TextView textView107 = view.findViewById(R.id.textView107);
        final EditText editText107 = view.findViewById(R.id.editText107);
        final TextView textView108 = view.findViewById(R.id.textView108);
        final EditText editText108 = view.findViewById(R.id.editText108);
        final TextView textView109 = view.findViewById(R.id.textView109);
        final EditText editText109 = view.findViewById(R.id.editText109);
        final TextView textView110 = view.findViewById(R.id.textView110);
        final EditText editText110 = view.findViewById(R.id.editText110);
        final TextView textView111 = view.findViewById(R.id.textView111);
        final EditText editText111 = view.findViewById(R.id.editText111);
        final TextView textView112 = view.findViewById(R.id.textView112);
        final EditText editText112 = view.findViewById(R.id.editText112);
        final TextView textView113 = view.findViewById(R.id.textView113);
        final EditText editText113 = view.findViewById(R.id.editText113);

        final ImageButton infoImageButton92 = view.findViewById(R.id.infoImageButton92);
        infoImageButton92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 1");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton92 = view.findViewById(R.id.photoImageButton92);
        photoImageButton92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 92;
            }
        });

        final ImageButton infoImageButton93 = view.findViewById(R.id.infoImageButton93);
        infoImageButton93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 2");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton93 = view.findViewById(R.id.photoImageButton93);
        photoImageButton93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 93;
            }
        });

        final ImageButton infoImageButton94 = view.findViewById(R.id.infoImageButton94);
        infoImageButton94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 3");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton94 = view.findViewById(R.id.photoImageButton94);
        photoImageButton94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 94;
            }
        });

        final ImageButton infoImageButton95 = view.findViewById(R.id.infoImageButton95);
        infoImageButton95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 4");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton95 = view.findViewById(R.id.photoImageButton95);
        photoImageButton95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 95;
            }
        });

        final ImageButton infoImageButton96 = view.findViewById(R.id.infoImageButton96);
        infoImageButton96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 5");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton96 = view.findViewById(R.id.photoImageButton96);
        photoImageButton96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 96;
            }
        });

        final ImageButton infoImageButton97 = view.findViewById(R.id.infoImageButton97);
        infoImageButton97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 6");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton97 = view.findViewById(R.id.photoImageButton97);
        photoImageButton97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 97;
            }
        });

        final ImageButton infoImageButton98 = view.findViewById(R.id.infoImageButton98);
        infoImageButton98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 7");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton98 = view.findViewById(R.id.photoImageButton98);
        photoImageButton98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 98;
            }
        });

        final ImageButton infoImageButton99 = view.findViewById(R.id.infoImageButton99);
        infoImageButton99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 8");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton99 = view.findViewById(R.id.photoImageButton99);
        photoImageButton99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 99;
            }
        });

        final ImageButton infoImageButton100 = view.findViewById(R.id.infoImageButton100);
        infoImageButton100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 9");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton100 = view.findViewById(R.id.photoImageButton100);
        photoImageButton100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 100;
            }
        });

        final ImageButton infoImageButton101 = view.findViewById(R.id.infoImageButton101);
        infoImageButton101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 10");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton101 = view.findViewById(R.id.photoImageButton101);
        photoImageButton101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 101;
            }
        });

        final ImageButton infoImageButton102 = view.findViewById(R.id.infoImageButton102);
        infoImageButton102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 11");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton102 = view.findViewById(R.id.photoImageButton102);
        photoImageButton102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 102;
            }
        });

        final ImageButton infoImageButton103 = view.findViewById(R.id.infoImageButton103);
        infoImageButton103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 12");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton103 = view.findViewById(R.id.photoImageButton103);
        photoImageButton103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 103;
            }
        });

        final ImageButton infoImageButton104 = view.findViewById(R.id.infoImageButton104);
        infoImageButton104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 13");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton104 = view.findViewById(R.id.photoImageButton104);
        photoImageButton104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 104;
            }
        });

        final ImageButton infoImageButton105 = view.findViewById(R.id.infoImageButton105);
        infoImageButton105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 14");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton105 = view.findViewById(R.id.photoImageButton105);
        photoImageButton105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 105;
            }
        });

        final ImageButton infoImageButton106 = view.findViewById(R.id.infoImageButton106);
        infoImageButton106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 15");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton106 = view.findViewById(R.id.photoImageButton106);
        photoImageButton106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 106;
            }
        });

        final ImageButton infoImageButton107 = view.findViewById(R.id.infoImageButton107);
        infoImageButton107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 16");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton107 = view.findViewById(R.id.photoImageButton107);
        photoImageButton107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 107;
            }
        });

        final ImageButton infoImageButton108 = view.findViewById(R.id.infoImageButton108);
        infoImageButton108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 17");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton108 = view.findViewById(R.id.photoImageButton108);
        photoImageButton108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 108;
            }
        });

        final ImageButton infoImageButton109 = view.findViewById(R.id.infoImageButton109);
        infoImageButton109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 18");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton109 = view.findViewById(R.id.photoImageButton109);
        photoImageButton109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 109;
            }
        });

        final ImageButton infoImageButton110 = view.findViewById(R.id.infoImageButton110);
        infoImageButton110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 19");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton110 = view.findViewById(R.id.photoImageButton110);
        photoImageButton110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 110;
            }
        });

        final ImageButton infoImageButton111 = view.findViewById(R.id.infoImageButton111);
        infoImageButton111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 20");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton111 = view.findViewById(R.id.photoImageButton111);
        photoImageButton111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 111;
            }
        });

        final ImageButton infoImageButton112 = view.findViewById(R.id.infoImageButton112);
        infoImageButton112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 21");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton112 = view.findViewById(R.id.photoImageButton112);
        photoImageButton112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 112;
            }
        });

        final ImageButton infoImageButton113 = view.findViewById(R.id.infoImageButton113);
        infoImageButton113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Security.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 22");
                Security.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton113 = view.findViewById(R.id.photoImageButton113);
        photoImageButton113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 113;
            }
        });

        final Button minimize12 = view.findViewById(R.id.minimizeButton12);
        minimize12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView92.getVisibility() == View.GONE) {
                    minimize12.setText("^");
                    textView92.setVisibility(View.VISIBLE);
                    editText92.setVisibility(View.VISIBLE);
                    infoImageButton92.setVisibility(View.VISIBLE);
                    photoImageButton92.setVisibility(View.VISIBLE);
                    textView93.setVisibility(View.VISIBLE);
                    editText93.setVisibility(View.VISIBLE);
                    infoImageButton93.setVisibility(View.VISIBLE);
                    photoImageButton93.setVisibility(View.VISIBLE);
                    textView94.setVisibility(View.VISIBLE);
                    editText94.setVisibility(View.VISIBLE);
                    infoImageButton94.setVisibility(View.VISIBLE);
                    photoImageButton94.setVisibility(View.VISIBLE);
                    textView95.setVisibility(View.VISIBLE);
                    editText95.setVisibility(View.VISIBLE);
                    infoImageButton95.setVisibility(View.VISIBLE);
                    photoImageButton95.setVisibility(View.VISIBLE);
                    textView96.setVisibility(View.VISIBLE);
                    editText96.setVisibility(View.VISIBLE);
                    infoImageButton96.setVisibility(View.VISIBLE);
                    photoImageButton96.setVisibility(View.VISIBLE);
                    textView97.setVisibility(View.VISIBLE);
                    editText97.setVisibility(View.VISIBLE);
                    infoImageButton97.setVisibility(View.VISIBLE);
                    photoImageButton97.setVisibility(View.VISIBLE);
                    textView98.setVisibility(View.VISIBLE);
                    editText98.setVisibility(View.VISIBLE);
                    infoImageButton98.setVisibility(View.VISIBLE);
                    photoImageButton98.setVisibility(View.VISIBLE);
                    textView99.setVisibility(View.VISIBLE);
                    editText99.setVisibility(View.VISIBLE);
                    infoImageButton99.setVisibility(View.VISIBLE);
                    photoImageButton99.setVisibility(View.VISIBLE);
                    textView100.setVisibility(View.VISIBLE);
                    editText100.setVisibility(View.VISIBLE);
                    infoImageButton100.setVisibility(View.VISIBLE);
                    photoImageButton100.setVisibility(View.VISIBLE);
                    textView101.setVisibility(View.VISIBLE);
                    editText101.setVisibility(View.VISIBLE);
                    infoImageButton101.setVisibility(View.VISIBLE);
                    photoImageButton101.setVisibility(View.VISIBLE);
                    textView102.setVisibility(View.VISIBLE);
                    editText102.setVisibility(View.VISIBLE);
                    infoImageButton102.setVisibility(View.VISIBLE);
                    photoImageButton102.setVisibility(View.VISIBLE);
                    textView103.setVisibility(View.VISIBLE);
                    editText103.setVisibility(View.VISIBLE);
                    infoImageButton103.setVisibility(View.VISIBLE);
                    photoImageButton103.setVisibility(View.VISIBLE);
                    textView104.setVisibility(View.VISIBLE);
                    editText104.setVisibility(View.VISIBLE);
                    infoImageButton104.setVisibility(View.VISIBLE);
                    photoImageButton104.setVisibility(View.VISIBLE);
                    textView105.setVisibility(View.VISIBLE);
                    editText105.setVisibility(View.VISIBLE);
                    infoImageButton105.setVisibility(View.VISIBLE);
                    photoImageButton105.setVisibility(View.VISIBLE);
                    textView106.setVisibility(View.VISIBLE);
                    editText106.setVisibility(View.VISIBLE);
                    infoImageButton106.setVisibility(View.VISIBLE);
                    photoImageButton106.setVisibility(View.VISIBLE);
                    textView107.setVisibility(View.VISIBLE);
                    editText107.setVisibility(View.VISIBLE);
                    infoImageButton107.setVisibility(View.VISIBLE);
                    photoImageButton107.setVisibility(View.VISIBLE);
                    textView108.setVisibility(View.VISIBLE);
                    editText108.setVisibility(View.VISIBLE);
                    infoImageButton108.setVisibility(View.VISIBLE);
                    photoImageButton108.setVisibility(View.VISIBLE);
                    textView109.setVisibility(View.VISIBLE);
                    editText109.setVisibility(View.VISIBLE);
                    infoImageButton109.setVisibility(View.VISIBLE);
                    photoImageButton109.setVisibility(View.VISIBLE);
                    textView110.setVisibility(View.VISIBLE);
                    editText110.setVisibility(View.VISIBLE);
                    infoImageButton110.setVisibility(View.VISIBLE);
                    photoImageButton110.setVisibility(View.VISIBLE);
                    textView111.setVisibility(View.VISIBLE);
                    editText111.setVisibility(View.VISIBLE);
                    infoImageButton111.setVisibility(View.VISIBLE);
                    photoImageButton111.setVisibility(View.VISIBLE);
                    textView112.setVisibility(View.VISIBLE);
                    editText112.setVisibility(View.VISIBLE);
                    infoImageButton112.setVisibility(View.VISIBLE);
                    photoImageButton112.setVisibility(View.VISIBLE);
                    textView113.setVisibility(View.VISIBLE);
                    editText113.setVisibility(View.VISIBLE);
                    infoImageButton113.setVisibility(View.VISIBLE);
                    photoImageButton113.setVisibility(View.VISIBLE);


                }
                else {
                    minimize12.setText("⌄");
                    textView92.setVisibility(View.GONE);
                    editText92.setVisibility(View.GONE);
                    infoImageButton92.setVisibility(View.GONE);
                    photoImageButton92.setVisibility(View.GONE);
                    textView93.setVisibility(View.GONE);
                    editText93.setVisibility(View.GONE);
                    infoImageButton93.setVisibility(View.GONE);
                    photoImageButton93.setVisibility(View.GONE);
                    textView94.setVisibility(View.GONE);
                    editText94.setVisibility(View.GONE);
                    infoImageButton94.setVisibility(View.GONE);
                    photoImageButton94.setVisibility(View.GONE);
                    textView95.setVisibility(View.GONE);
                    editText95.setVisibility(View.GONE);
                    infoImageButton95.setVisibility(View.GONE);
                    photoImageButton95.setVisibility(View.GONE);
                    textView96.setVisibility(View.GONE);
                    editText96.setVisibility(View.GONE);
                    infoImageButton96.setVisibility(View.GONE);
                    photoImageButton96.setVisibility(View.GONE);
                    textView97.setVisibility(View.GONE);
                    editText97.setVisibility(View.GONE);
                    infoImageButton97.setVisibility(View.GONE);
                    photoImageButton97.setVisibility(View.GONE);
                    textView98.setVisibility(View.GONE);
                    editText98.setVisibility(View.GONE);
                    infoImageButton98.setVisibility(View.GONE);
                    photoImageButton98.setVisibility(View.GONE);
                    textView99.setVisibility(View.GONE);
                    editText99.setVisibility(View.GONE);
                    infoImageButton99.setVisibility(View.GONE);
                    photoImageButton99.setVisibility(View.GONE);
                    textView100.setVisibility(View.GONE);
                    editText100.setVisibility(View.GONE);
                    infoImageButton100.setVisibility(View.GONE);
                    photoImageButton100.setVisibility(View.GONE);
                    textView101.setVisibility(View.GONE);
                    editText101.setVisibility(View.GONE);
                    infoImageButton101.setVisibility(View.GONE);
                    photoImageButton101.setVisibility(View.GONE);
                    textView102.setVisibility(View.GONE);
                    editText102.setVisibility(View.GONE);
                    infoImageButton102.setVisibility(View.GONE);
                    photoImageButton102.setVisibility(View.GONE);
                    textView103.setVisibility(View.GONE);
                    editText103.setVisibility(View.GONE);
                    infoImageButton103.setVisibility(View.GONE);
                    photoImageButton103.setVisibility(View.GONE);
                    textView104.setVisibility(View.GONE);
                    editText104.setVisibility(View.GONE);
                    infoImageButton104.setVisibility(View.GONE);
                    photoImageButton104.setVisibility(View.GONE);
                    textView105.setVisibility(View.GONE);
                    editText105.setVisibility(View.GONE);
                    infoImageButton105.setVisibility(View.GONE);
                    photoImageButton105.setVisibility(View.GONE);
                    textView106.setVisibility(View.GONE);
                    editText106.setVisibility(View.GONE);
                    infoImageButton106.setVisibility(View.GONE);
                    photoImageButton106.setVisibility(View.GONE);
                    textView107.setVisibility(View.GONE);
                    editText107.setVisibility(View.GONE);
                    infoImageButton107.setVisibility(View.GONE);
                    photoImageButton107.setVisibility(View.GONE);
                    textView108.setVisibility(View.GONE);
                    editText108.setVisibility(View.GONE);
                    infoImageButton108.setVisibility(View.GONE);
                    photoImageButton108.setVisibility(View.GONE);
                    textView109.setVisibility(View.GONE);
                    editText109.setVisibility(View.GONE);
                    infoImageButton109.setVisibility(View.GONE);
                    photoImageButton109.setVisibility(View.GONE);
                    textView110.setVisibility(View.GONE);
                    editText110.setVisibility(View.GONE);
                    infoImageButton110.setVisibility(View.GONE);
                    photoImageButton110.setVisibility(View.GONE);
                    textView111.setVisibility(View.GONE);
                    editText111.setVisibility(View.GONE);
                    infoImageButton111.setVisibility(View.GONE);
                    photoImageButton111.setVisibility(View.GONE);
                    textView112.setVisibility(View.GONE);
                    editText112.setVisibility(View.GONE);
                    infoImageButton112.setVisibility(View.GONE);
                    photoImageButton112.setVisibility(View.GONE);
                    textView113.setVisibility(View.GONE);
                    editText113.setVisibility(View.GONE);
                    infoImageButton113.setVisibility(View.GONE);
                    photoImageButton113.setVisibility(View.GONE);

                }
            }
        });

        // Submit Button

        final Button securitySubmitButton = view.findViewById(R.id.securitySubmitButton);
        securitySubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KOKChecklistDBHandler handler = new KOKChecklistDBHandler(Security.this.getActivity());

                int[] ids = new int[]{R.id.editText76, R.id.editText77, R.id.editText78, R.id.editText79, R.id.editText80, R.id.editText81, R.id.editText82, R.id.editText83, R.id.editText84, R.id.editText85, R.id.editText86, R.id.editText87, R.id.editText88, R.id.editText89, R.id.editText90, R.id.editText91, R.id.editText92, R.id.editText93, R.id.editText94, R.id.editText95, R.id.editText96, R.id.editText97, R.id.editText98, R.id.editText99, R.id.editText100, R.id.editText101, R.id.editText102, R.id.editText103, R.id.editText104, R.id.editText105, R.id.editText106, R.id.editText107, R.id.editText108, R.id.editText109, R.id.editText110, R.id.editText111, R.id.editText112, R.id.editText113};
                int i = 76;
                for(int id : ids) {
                    EditText initials = view.findViewById(id);
                    if(initials.getText().toString().trim().length() == 2) {
                        byte[] image = null;
                        if(imageList[i-76] != null) {
                            ByteArrayOutputStream stream = new ByteArrayOutputStream();
                            imageList[i-76].compress(Bitmap.CompressFormat.PNG, 100, stream);
                            byte[] bytesArray = stream.toByteArray();
                            image = bytesArray;
                        }
                        handler.addTaskToLog(handler.getWritableDatabase(),4, i, initials.getText().toString(), image);
                    }
                    initials.setText("");
                    imageList[i-76] = null;
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
                case 76:
                    photo76.setImageBitmap(bitmap);
                    imageList[0]= bitmap;
                    break;
                case 77:
                    photo77.setImageBitmap(bitmap);
                    imageList[1]= bitmap;
                    break;
                case 78:
                    photo78.setImageBitmap(bitmap);
                    imageList[2]= bitmap;
                    break;
                case 79:
                    photo79.setImageBitmap(bitmap);
                    imageList[3]= bitmap;
                    break;
                case 80:
                    photo80.setImageBitmap(bitmap);
                    imageList[4]= bitmap;
                    break;
                case 81:
                    photo81.setImageBitmap(bitmap);
                    imageList[5]= bitmap;
                    break;
                case 82:
                    photo82.setImageBitmap(bitmap);
                    imageList[6]= bitmap;
                    break;
                case 83:
                    photo83.setImageBitmap(bitmap);
                    imageList[7]= bitmap;
                    break;
                case 84:
                    photo84.setImageBitmap(bitmap);
                    imageList[8]= bitmap;
                    break;
                case 85:
                    photo85.setImageBitmap(bitmap);
                    imageList[9]= bitmap;
                    break;
                case 86:
                    photo86.setImageBitmap(bitmap);
                    imageList[10]= bitmap;
                    break;
                case 87:
                    photo87.setImageBitmap(bitmap);
                    imageList[11]= bitmap;
                    break;
                case 88:
                    photo88.setImageBitmap(bitmap);
                    imageList[12]= bitmap;
                    break;
                case 89:
                    photo89.setImageBitmap(bitmap);
                    imageList[13]= bitmap;
                    break;
                case 90:
                    photo90.setImageBitmap(bitmap);
                    imageList[14]= bitmap;
                    break;
                case 91:
                    photo91.setImageBitmap(bitmap);
                    imageList[15]= bitmap;
                    break;
                case 92:
                    photo92.setImageBitmap(bitmap);
                    imageList[16]= bitmap;
                    break;
                case 93:
                    photo93.setImageBitmap(bitmap);
                    imageList[17]= bitmap;
                    break;
                case 94:
                    photo94.setImageBitmap(bitmap);
                    imageList[18]= bitmap;
                    break;
                case 95:
                    photo95.setImageBitmap(bitmap);
                    imageList[19]= bitmap;
                    break;
                case 96:
                    photo96.setImageBitmap(bitmap);
                    imageList[20]= bitmap;
                    break;
                case 97:
                    photo97.setImageBitmap(bitmap);
                    imageList[21]= bitmap;
                    break;
                case 98:
                    photo98.setImageBitmap(bitmap);
                    imageList[22]= bitmap;
                    break;
                case 99:
                    photo99.setImageBitmap(bitmap);
                    imageList[23]= bitmap;
                    break;
                case 100:
                    photo100.setImageBitmap(bitmap);
                    imageList[24]= bitmap;
                    break;
                case 101:
                    photo101.setImageBitmap(bitmap);
                    imageList[25]= bitmap;
                    break;
                case 102:
                    photo102.setImageBitmap(bitmap);
                    imageList[26]= bitmap;
                    break;
                case 103:
                    photo103.setImageBitmap(bitmap);
                    imageList[27]= bitmap;
                    break;
                case 104:
                    photo104.setImageBitmap(bitmap);
                    imageList[28]= bitmap;
                    break;
                case 105:
                    photo105.setImageBitmap(bitmap);
                    imageList[29]= bitmap;
                    break;
                case 106:
                    photo106.setImageBitmap(bitmap);
                    imageList[30]= bitmap;
                    break;
                case 107:
                    photo107.setImageBitmap(bitmap);
                    imageList[31]= bitmap;
                    break;
                case 108:
                    photo108.setImageBitmap(bitmap);
                    imageList[32]= bitmap;
                    break;
                case 109:
                    photo109.setImageBitmap(bitmap);
                    imageList[33]= bitmap;
                    break;
                case 110:
                    photo110.setImageBitmap(bitmap);
                    imageList[34]= bitmap;
                    break;
                case 111:
                    photo111.setImageBitmap(bitmap);
                    imageList[35]= bitmap;
                    break;
                case 112:
                    photo112.setImageBitmap(bitmap);
                    imageList[36]= bitmap;
                    break;
                case 113:
                    photo113.setImageBitmap(bitmap);
                    imageList[37]= bitmap;
                    break;
            }
        }
    }
}
