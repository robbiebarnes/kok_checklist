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
public class Barback extends Fragment {

    View view;

    private static final int CAMERA_REQUEST = 1888;

    private int buttonNumber;

    private ImageView photo114;
    private ImageView photo115;
    private ImageView photo116;
    private ImageView photo117;
    private ImageView photo118;
    private ImageView photo119;
    private ImageView photo120;
    private ImageView photo121;
    private ImageView photo122;
    private ImageView photo123;
    private ImageView photo124;
    private ImageView photo125;
    private ImageView photo126;
    private ImageView photo127;
    private ImageView photo128;
    private ImageView photo129;
    private ImageView photo130;
    private ImageView photo131;
    private ImageView photo132;
    private ImageView photo133;
    private ImageView photo134;
    private ImageView photo135;
    private ImageView photo136;
    private ImageView photo137;
    private ImageView photo138;
    private ImageView photo139;
    private ImageView photo140;
    private ImageView photo141;
    private ImageView photo142;
    private ImageView photo143;
    private ImageView photo144;
    private ImageView photo145;
    private ImageView photo146;
    private ImageView photo147;
    private ImageView photo148;
    private ImageView photo149;
    private ImageView photo150;
    private ImageView photo151;
    private ImageView photo152;

    private Bitmap[] imageList = new Bitmap[39];


    public Barback() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_barback, container, false);

        photo114 = view.findViewById(R.id.photo114);
        photo115 = view.findViewById(R.id.photo115);
        photo116 = view.findViewById(R.id.photo116);
        photo117 = view.findViewById(R.id.photo117);
        photo118 = view.findViewById(R.id.photo118);
        photo119 = view.findViewById(R.id.photo119);
        photo120 = view.findViewById(R.id.photo120);
        photo121 = view.findViewById(R.id.photo121);
        photo122 = view.findViewById(R.id.photo122);
        photo123 = view.findViewById(R.id.photo123);
        photo124 = view.findViewById(R.id.photo124);
        photo125 = view.findViewById(R.id.photo125);
        photo126 = view.findViewById(R.id.photo126);
        photo127 = view.findViewById(R.id.photo127);
        photo128 = view.findViewById(R.id.photo128);
        photo129 = view.findViewById(R.id.photo129);
        photo130 = view.findViewById(R.id.photo130);
        photo131 = view.findViewById(R.id.photo131);
        photo132 = view.findViewById(R.id.photo132);
        photo133 = view.findViewById(R.id.photo133);
        photo134 = view.findViewById(R.id.photo134);
        photo135 = view.findViewById(R.id.photo135);
        photo136 = view.findViewById(R.id.photo136);
        photo137 = view.findViewById(R.id.photo137);
        photo138 = view.findViewById(R.id.photo138);
        photo139 = view.findViewById(R.id.photo139);
        photo140 = view.findViewById(R.id.photo140);
        photo141 = view.findViewById(R.id.photo141);
        photo142 = view.findViewById(R.id.photo142);
        photo143 = view.findViewById(R.id.photo143);
        photo144 = view.findViewById(R.id.photo144);
        photo145 = view.findViewById(R.id.photo145);
        photo146 = view.findViewById(R.id.photo146);
        photo147 = view.findViewById(R.id.photo147);
        photo148 = view.findViewById(R.id.photo148);
        photo149 = view.findViewById(R.id.photo149);
        photo150 = view.findViewById(R.id.photo150);
        photo151 = view.findViewById(R.id.photo151);
        photo152 = view.findViewById(R.id.photo152);

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

        final TextView textView114 = view.findViewById(R.id.textView114);
        final EditText editText114 = view.findViewById(R.id.editText114);
        final TextView textView115 = view.findViewById(R.id.textView115);
        final EditText editText115 = view.findViewById(R.id.editText115);
        final TextView textView116 = view.findViewById(R.id.textView116);
        final EditText editText116 = view.findViewById(R.id.editText116);
        final TextView textView117 = view.findViewById(R.id.textView117);
        final EditText editText117 = view.findViewById(R.id.editText117);
        final TextView textView118 = view.findViewById(R.id.textView118);
        final EditText editText118 = view.findViewById(R.id.editText118);
        final TextView textView119 = view.findViewById(R.id.textView119);
        final EditText editText119 = view.findViewById(R.id.editText119);
        final TextView textView120 = view.findViewById(R.id.textView120);
        final EditText editText120 = view.findViewById(R.id.editText120);
        final TextView textView121 = view.findViewById(R.id.textView121);
        final EditText editText121 = view.findViewById(R.id.editText121);
        final TextView textView122 = view.findViewById(R.id.textView122);
        final EditText editText122 = view.findViewById(R.id.editText122);

        final ImageButton infoImageButton114 = view.findViewById(R.id.infoImageButton114);
        infoImageButton114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 1");
                Barback.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton114 = view.findViewById(R.id.photoImageButton114);
        photoImageButton114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 114;
            }
        });

        final ImageButton infoImageButton115 = view.findViewById(R.id.infoImageButton115);
        infoImageButton115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 2");
                Barback.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton115 = view.findViewById(R.id.photoImageButton115);
        photoImageButton115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 115;
            }
        });

        final ImageButton infoImageButton116 = view.findViewById(R.id.infoImageButton116);
        infoImageButton116.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 3");
                Barback.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton116 = view.findViewById(R.id.photoImageButton116);
        photoImageButton116.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 116;
            }
        });

        final ImageButton infoImageButton117 = view.findViewById(R.id.infoImageButton117);
        infoImageButton117.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 4");
                Barback.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton117 = view.findViewById(R.id.photoImageButton117);
        photoImageButton117.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 117;
            }
        });

        final ImageButton infoImageButton118 = view.findViewById(R.id.infoImageButton118);
        infoImageButton118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 5");
                Barback.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton118 = view.findViewById(R.id.photoImageButton118);
        photoImageButton118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 118;
            }
        });

        final ImageButton infoImageButton119 = view.findViewById(R.id.infoImageButton119);
        infoImageButton119.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 6");
                Barback.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton119 = view.findViewById(R.id.photoImageButton119);
        photoImageButton119.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 119;
            }
        });

        final ImageButton infoImageButton120 = view.findViewById(R.id.infoImageButton120);
        infoImageButton120.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 7");
                Barback.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton120 = view.findViewById(R.id.photoImageButton120);
        photoImageButton120.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 120;
            }
        });

        final ImageButton infoImageButton121 = view.findViewById(R.id.infoImageButton121);
        infoImageButton121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 8");
                Barback.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton121 = view.findViewById(R.id.photoImageButton121);
        photoImageButton121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 121;
            }
        });

        final ImageButton infoImageButton122 = view.findViewById(R.id.infoImageButton122);
        infoImageButton122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 9");
                Barback.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton122 = view.findViewById(R.id.photoImageButton122);
        photoImageButton122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 122;
            }
        });

        final Button minimize13 = view.findViewById(R.id.minimizeButton13);
        minimize13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView114.getVisibility() == View.GONE) {
                    minimize13.setText("^");
                    textView114.setVisibility(View.VISIBLE);
                    editText114.setVisibility(View.VISIBLE);
                    infoImageButton114.setVisibility(View.VISIBLE);
                    photoImageButton114.setVisibility(View.VISIBLE);
                    textView115.setVisibility(View.VISIBLE);
                    editText115.setVisibility(View.VISIBLE);
                    infoImageButton115.setVisibility(View.VISIBLE);
                    photoImageButton115.setVisibility(View.VISIBLE);
                    textView116.setVisibility(View.VISIBLE);
                    editText116.setVisibility(View.VISIBLE);
                    infoImageButton116.setVisibility(View.VISIBLE);
                    photoImageButton116.setVisibility(View.VISIBLE);
                    textView117.setVisibility(View.VISIBLE);
                    editText117.setVisibility(View.VISIBLE);
                    infoImageButton117.setVisibility(View.VISIBLE);
                    photoImageButton117.setVisibility(View.VISIBLE);
                    textView118.setVisibility(View.VISIBLE);
                    editText118.setVisibility(View.VISIBLE);
                    infoImageButton118.setVisibility(View.VISIBLE);
                    photoImageButton118.setVisibility(View.VISIBLE);
                    textView119.setVisibility(View.VISIBLE);
                    editText119.setVisibility(View.VISIBLE);
                    infoImageButton119.setVisibility(View.VISIBLE);
                    photoImageButton119.setVisibility(View.VISIBLE);
                    textView120.setVisibility(View.VISIBLE);
                    editText120.setVisibility(View.VISIBLE);
                    infoImageButton120.setVisibility(View.VISIBLE);
                    photoImageButton120.setVisibility(View.VISIBLE);
                    textView121.setVisibility(View.VISIBLE);
                    editText121.setVisibility(View.VISIBLE);
                    infoImageButton121.setVisibility(View.VISIBLE);
                    photoImageButton121.setVisibility(View.VISIBLE);
                    textView122.setVisibility(View.VISIBLE);
                    editText122.setVisibility(View.VISIBLE);
                    infoImageButton122.setVisibility(View.VISIBLE);
                    photoImageButton122.setVisibility(View.VISIBLE);

                }
                else {
                    minimize13.setText("⌄");
                    textView114.setVisibility(View.GONE);
                    editText114.setVisibility(View.GONE);
                    infoImageButton114.setVisibility(View.GONE);
                    photoImageButton114.setVisibility(View.GONE);
                    textView115.setVisibility(View.GONE);
                    editText115.setVisibility(View.GONE);
                    infoImageButton115.setVisibility(View.GONE);
                    photoImageButton115.setVisibility(View.GONE);
                    textView116.setVisibility(View.GONE);
                    editText116.setVisibility(View.GONE);
                    infoImageButton116.setVisibility(View.GONE);
                    photoImageButton116.setVisibility(View.GONE);
                    textView117.setVisibility(View.GONE);
                    editText117.setVisibility(View.GONE);
                    infoImageButton117.setVisibility(View.GONE);
                    photoImageButton117.setVisibility(View.GONE);
                    textView118.setVisibility(View.GONE);
                    editText118.setVisibility(View.GONE);
                    infoImageButton118.setVisibility(View.GONE);
                    photoImageButton118.setVisibility(View.GONE);
                    textView119.setVisibility(View.GONE);
                    editText119.setVisibility(View.GONE);
                    infoImageButton119.setVisibility(View.GONE);
                    photoImageButton119.setVisibility(View.GONE);
                    textView120.setVisibility(View.GONE);
                    editText120.setVisibility(View.GONE);
                    infoImageButton120.setVisibility(View.GONE);
                    photoImageButton120.setVisibility(View.GONE);
                    textView121.setVisibility(View.GONE);
                    editText121.setVisibility(View.GONE);
                    infoImageButton121.setVisibility(View.GONE);
                    photoImageButton121.setVisibility(View.GONE);
                    textView122.setVisibility(View.GONE);
                    editText122.setVisibility(View.GONE);
                    infoImageButton122.setVisibility(View.GONE);
                    photoImageButton122.setVisibility(View.GONE);
                }

            }
        });

        // DURING SHIFT (ALL SHIFTS)

        final TextView textView123 = view.findViewById(R.id.textView123);
        final EditText editText123 = view.findViewById(R.id.editText123);
        final TextView textView124 = view.findViewById(R.id.textView124);
        final EditText editText124 = view.findViewById(R.id.editText124);
        final TextView textView125 = view.findViewById(R.id.textView125);
        final EditText editText125 = view.findViewById(R.id.editText125);
        final TextView textView126 = view.findViewById(R.id.textView126);
        final EditText editText126 = view.findViewById(R.id.editText126);
        final TextView textView127 = view.findViewById(R.id.textView127);
        final EditText editText127 = view.findViewById(R.id.editText127);
        final TextView textView128 = view.findViewById(R.id.textView128);
        final EditText editText128 = view.findViewById(R.id.editText128);
        final TextView textView129 = view.findViewById(R.id.textView129);
        final EditText editText129 = view.findViewById(R.id.editText129);
        final TextView textView130 = view.findViewById(R.id.textView130);
        final EditText editText130 = view.findViewById(R.id.editText130);

        final ImageButton infoImageButton123 = view.findViewById(R.id.infoImageButton123);
        infoImageButton123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","During Shift 1");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton123 = view.findViewById(R.id.photoImageButton123);
        photoImageButton123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 123;
            }
        });

        final ImageButton infoImageButton124 = view.findViewById(R.id.infoImageButton124);
        infoImageButton124.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","During Shift 2");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton124 = view.findViewById(R.id.photoImageButton124);
        photoImageButton124.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 124;
            }
        });

        final ImageButton infoImageButton125 = view.findViewById(R.id.infoImageButton125);
        infoImageButton125.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","During Shift 3");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton125 = view.findViewById(R.id.photoImageButton125);
        photoImageButton125.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 125;
            }
        });

        final ImageButton infoImageButton126 = view.findViewById(R.id.infoImageButton126);
        infoImageButton126.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","During Shift 4");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton126 = view.findViewById(R.id.photoImageButton126);
        photoImageButton126.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 126;
            }
        });

        final ImageButton infoImageButton127 = view.findViewById(R.id.infoImageButton127);
        infoImageButton127.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","During Shift 5");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton127 = view.findViewById(R.id.photoImageButton127);
        photoImageButton127.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 127;
            }
        });

        final ImageButton infoImageButton128 = view.findViewById(R.id.infoImageButton128);
        infoImageButton128.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","During Shift 6");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton128 = view.findViewById(R.id.photoImageButton128);
        photoImageButton128.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 128;
            }
        });

        final ImageButton infoImageButton129 = view.findViewById(R.id.infoImageButton129);
        infoImageButton129.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","During Shift 7");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton129 = view.findViewById(R.id.photoImageButton129);
        photoImageButton129.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 129;
            }
        });

        final ImageButton infoImageButton130 = view.findViewById(R.id.infoImageButton130);
        infoImageButton130.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","During Shift 8");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton130 = view.findViewById(R.id.photoImageButton130);
        photoImageButton130.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 130;
            }
        });

        final Button minimize14 = view.findViewById(R.id.minimizeButton14);
        minimize14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView123.getVisibility() == View.GONE) {
                    minimize14.setText("^");
                    textView123.setVisibility(View.VISIBLE);
                    editText123.setVisibility(View.VISIBLE);
                    infoImageButton123.setVisibility(View.VISIBLE);
                    photoImageButton123.setVisibility(View.VISIBLE);
                    textView124.setVisibility(View.VISIBLE);
                    editText124.setVisibility(View.VISIBLE);
                    infoImageButton124.setVisibility(View.VISIBLE);
                    photoImageButton124.setVisibility(View.VISIBLE);
                    textView125.setVisibility(View.VISIBLE);
                    editText125.setVisibility(View.VISIBLE);
                    infoImageButton125.setVisibility(View.VISIBLE);
                    photoImageButton125.setVisibility(View.VISIBLE);
                    textView126.setVisibility(View.VISIBLE);
                    editText126.setVisibility(View.VISIBLE);
                    infoImageButton126.setVisibility(View.VISIBLE);
                    photoImageButton126.setVisibility(View.VISIBLE);
                    textView127.setVisibility(View.VISIBLE);
                    editText127.setVisibility(View.VISIBLE);
                    infoImageButton127.setVisibility(View.VISIBLE);
                    photoImageButton127.setVisibility(View.VISIBLE);
                    textView128.setVisibility(View.VISIBLE);
                    editText128.setVisibility(View.VISIBLE);
                    infoImageButton128.setVisibility(View.VISIBLE);
                    photoImageButton128.setVisibility(View.VISIBLE);
                    textView129.setVisibility(View.VISIBLE);
                    editText129.setVisibility(View.VISIBLE);
                    infoImageButton129.setVisibility(View.VISIBLE);
                    photoImageButton129.setVisibility(View.VISIBLE);
                    textView130.setVisibility(View.VISIBLE);
                    editText130.setVisibility(View.VISIBLE);
                    infoImageButton130.setVisibility(View.VISIBLE);
                    photoImageButton130.setVisibility(View.VISIBLE);
                }
                else {
                    minimize13.setText("⌄");
                    textView123.setVisibility(View.GONE);
                    editText123.setVisibility(View.GONE);
                    infoImageButton123.setVisibility(View.GONE);
                    photoImageButton123.setVisibility(View.GONE);
                    textView124.setVisibility(View.GONE);
                    editText124.setVisibility(View.GONE);
                    infoImageButton124.setVisibility(View.GONE);
                    photoImageButton124.setVisibility(View.GONE);
                    textView125.setVisibility(View.GONE);
                    editText125.setVisibility(View.GONE);
                    infoImageButton125.setVisibility(View.GONE);
                    photoImageButton125.setVisibility(View.GONE);
                    textView126.setVisibility(View.GONE);
                    editText126.setVisibility(View.GONE);
                    infoImageButton126.setVisibility(View.GONE);
                    photoImageButton126.setVisibility(View.GONE);
                    textView127.setVisibility(View.GONE);
                    editText127.setVisibility(View.GONE);
                    infoImageButton127.setVisibility(View.GONE);
                    photoImageButton127.setVisibility(View.GONE);
                    textView128.setVisibility(View.GONE);
                    editText128.setVisibility(View.GONE);
                    infoImageButton128.setVisibility(View.GONE);
                    photoImageButton128.setVisibility(View.GONE);
                    textView129.setVisibility(View.GONE);
                    editText129.setVisibility(View.GONE);
                    infoImageButton129.setVisibility(View.GONE);
                    photoImageButton129.setVisibility(View.GONE);
                    textView130.setVisibility(View.GONE);
                    editText130.setVisibility(View.GONE);
                    infoImageButton130.setVisibility(View.GONE);
                    photoImageButton130.setVisibility(View.GONE);
                }
            }
        });

        // Happy Hour

        final TextView textView131 = view.findViewById(R.id.textView131);
        final EditText editText131 = view.findViewById(R.id.editText131);
        final TextView textView132 = view.findViewById(R.id.textView132);
        final EditText editText132 = view.findViewById(R.id.editText132);
        final TextView textView133 = view.findViewById(R.id.textView133);
        final EditText editText133 = view.findViewById(R.id.editText133);
        final TextView textView134 = view.findViewById(R.id.textView134);
        final EditText editText134 = view.findViewById(R.id.editText134);
        final TextView textView135 = view.findViewById(R.id.textView135);
        final EditText editText135 = view.findViewById(R.id.editText135);

        final ImageButton infoImageButton131 = view.findViewById(R.id.infoImageButton131);
        infoImageButton131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Happy Hour 1");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton131 = view.findViewById(R.id.photoImageButton131);
        photoImageButton131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 131;
            }
        });

        final ImageButton infoImageButton132 = view.findViewById(R.id.infoImageButton132);
        infoImageButton132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Happy Hour 2");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton132 = view.findViewById(R.id.photoImageButton132);
        photoImageButton132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 132;
            }
        });

        final ImageButton infoImageButton133 = view.findViewById(R.id.infoImageButton133);
        infoImageButton133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Happy Hour 3");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton133 = view.findViewById(R.id.photoImageButton133);
        photoImageButton133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 133;
            }
        });

        final ImageButton infoImageButton134 = view.findViewById(R.id.infoImageButton134);
        infoImageButton134.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Happy Hour 4");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton134 = view.findViewById(R.id.photoImageButton134);
        photoImageButton134.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 134;
            }
        });

        final ImageButton infoImageButton135 = view.findViewById(R.id.infoImageButton135);
        infoImageButton135.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Happy Hour 5");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton135 = view.findViewById(R.id.photoImageButton135);
        photoImageButton135.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 135;
            }
        });

        final Button minimize15 = view.findViewById(R.id.minimizeButton15);
        minimize15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView131.getVisibility() == View.GONE) {
                    minimize15.setText("^");
                    textView131.setVisibility(View.VISIBLE);
                    editText131.setVisibility(View.VISIBLE);
                    infoImageButton131.setVisibility(View.VISIBLE);
                    photoImageButton131.setVisibility(View.VISIBLE);
                    textView132.setVisibility(View.VISIBLE);
                    editText132.setVisibility(View.VISIBLE);
                    infoImageButton132.setVisibility(View.VISIBLE);
                    photoImageButton132.setVisibility(View.VISIBLE);
                    textView133.setVisibility(View.VISIBLE);
                    editText133.setVisibility(View.VISIBLE);
                    infoImageButton133.setVisibility(View.VISIBLE);
                    photoImageButton133.setVisibility(View.VISIBLE);
                    textView134.setVisibility(View.VISIBLE);
                    editText134.setVisibility(View.VISIBLE);
                    infoImageButton134.setVisibility(View.VISIBLE);
                    photoImageButton134.setVisibility(View.VISIBLE);
                    textView135.setVisibility(View.VISIBLE);
                    editText135.setVisibility(View.VISIBLE);
                    infoImageButton135.setVisibility(View.VISIBLE);
                    photoImageButton135.setVisibility(View.VISIBLE);

                }
                else {
                    minimize15.setText("⌄");
                    textView131.setVisibility(View.GONE);
                    editText131.setVisibility(View.GONE);
                    infoImageButton131.setVisibility(View.GONE);
                    photoImageButton131.setVisibility(View.GONE);
                    textView132.setVisibility(View.GONE);
                    editText132.setVisibility(View.GONE);
                    infoImageButton132.setVisibility(View.GONE);
                    photoImageButton132.setVisibility(View.GONE);
                    textView133.setVisibility(View.GONE);
                    editText133.setVisibility(View.GONE);
                    infoImageButton133.setVisibility(View.GONE);
                    photoImageButton133.setVisibility(View.GONE);
                    textView134.setVisibility(View.GONE);
                    editText134.setVisibility(View.GONE);
                    infoImageButton134.setVisibility(View.GONE);
                    photoImageButton134.setVisibility(View.GONE);
                    textView135.setVisibility(View.GONE);
                    editText135.setVisibility(View.GONE);
                    infoImageButton135.setVisibility(View.GONE);
                    photoImageButton135.setVisibility(View.GONE);
                }
            }
        });

        // Closing

        final TextView textView136 = view.findViewById(R.id.textView136);
        final EditText editText136 = view.findViewById(R.id.editText136);
        final TextView textView137 = view.findViewById(R.id.textView137);
        final EditText editText137 = view.findViewById(R.id.editText137);
        final TextView textView138 = view.findViewById(R.id.textView138);
        final EditText editText138 = view.findViewById(R.id.editText138);
        final TextView textView139 = view.findViewById(R.id.textView139);
        final EditText editText139 = view.findViewById(R.id.editText139);
        final TextView textView140 = view.findViewById(R.id.textView140);
        final EditText editText140 = view.findViewById(R.id.editText140);
        final TextView textView141 = view.findViewById(R.id.textView141);
        final EditText editText141 = view.findViewById(R.id.editText141);
        final TextView textView142 = view.findViewById(R.id.textView142);
        final EditText editText142 = view.findViewById(R.id.editText142);
        final TextView textView143 = view.findViewById(R.id.textView143);
        final EditText editText143 = view.findViewById(R.id.editText143);
        final TextView textView144 = view.findViewById(R.id.textView144);
        final EditText editText144 = view.findViewById(R.id.editText144);
        final TextView textView145 = view.findViewById(R.id.textView145);
        final EditText editText145 = view.findViewById(R.id.editText145);
        final TextView textView146 = view.findViewById(R.id.textView146);
        final EditText editText146 = view.findViewById(R.id.editText146);
        final TextView textView147 = view.findViewById(R.id.textView147);
        final EditText editText147 = view.findViewById(R.id.editText147);
        final TextView textView148 = view.findViewById(R.id.textView148);
        final EditText editText148 = view.findViewById(R.id.editText148);
        final TextView textView149 = view.findViewById(R.id.textView149);
        final EditText editText149 = view.findViewById(R.id.editText149);
        final TextView textView150 = view.findViewById(R.id.textView150);
        final EditText editText150 = view.findViewById(R.id.editText150);
        final TextView textView151 = view.findViewById(R.id.textView151);
        final EditText editText151 = view.findViewById(R.id.editText151);
        final TextView textView152 = view.findViewById(R.id.textView152);
        final EditText editText152 = view.findViewById(R.id.editText152);

        final ImageButton infoImageButton136 = view.findViewById(R.id.infoImageButton136);
        infoImageButton136.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 1");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton136 = view.findViewById(R.id.photoImageButton136);
        photoImageButton136.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 136;
            }
        });

        final ImageButton infoImageButton137 = view.findViewById(R.id.infoImageButton137);
        infoImageButton137.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 2");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton137 = view.findViewById(R.id.photoImageButton137);
        photoImageButton137.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 137;
            }
        });

        final ImageButton infoImageButton138 = view.findViewById(R.id.infoImageButton138);
        infoImageButton138.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 3");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton138 = view.findViewById(R.id.photoImageButton138);
        photoImageButton138.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 138;
            }
        });

        final ImageButton infoImageButton139 = view.findViewById(R.id.infoImageButton139);
        infoImageButton139.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 4");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton139 = view.findViewById(R.id.photoImageButton139);
        photoImageButton139.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 139;
            }
        });

        final ImageButton infoImageButton140 = view.findViewById(R.id.infoImageButton140);
        infoImageButton140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 5");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton140 = view.findViewById(R.id.photoImageButton140);
        photoImageButton140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 140;
            }
        });

        final ImageButton infoImageButton141 = view.findViewById(R.id.infoImageButton141);
        infoImageButton141.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 6");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton141 = view.findViewById(R.id.photoImageButton141);
        photoImageButton141.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 141;
            }
        });

        final ImageButton infoImageButton142 = view.findViewById(R.id.infoImageButton142);
        infoImageButton142.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 7");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton142 = view.findViewById(R.id.photoImageButton142);
        photoImageButton142.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 142;
            }
        });

        final ImageButton infoImageButton143 = view.findViewById(R.id.infoImageButton143);
        infoImageButton143.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 8");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton143 = view.findViewById(R.id.photoImageButton143);
        photoImageButton143.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 143;
            }
        });

        final ImageButton infoImageButton144 = view.findViewById(R.id.infoImageButton144);
        infoImageButton144.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 9");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton144 = view.findViewById(R.id.photoImageButton144);
        photoImageButton144.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 144;
            }
        });

        final ImageButton infoImageButton145 = view.findViewById(R.id.infoImageButton145);
        infoImageButton145.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 10");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton145 = view.findViewById(R.id.photoImageButton145);
        photoImageButton145.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 145;
            }
        });

        final ImageButton infoImageButton146 = view.findViewById(R.id.infoImageButton146);
        infoImageButton146.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 11");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton146 = view.findViewById(R.id.photoImageButton146);
        photoImageButton146.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 146;
            }
        });

        final ImageButton infoImageButton147 = view.findViewById(R.id.infoImageButton147);
        infoImageButton147.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 12");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton147 = view.findViewById(R.id.photoImageButton147);
        photoImageButton147.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 147;
            }
        });

        final ImageButton infoImageButton148 = view.findViewById(R.id.infoImageButton148);
        infoImageButton148.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 13");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton148 = view.findViewById(R.id.photoImageButton148);
        photoImageButton148.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 148;
            }
        });

        final ImageButton infoImageButton149 = view.findViewById(R.id.infoImageButton149);
        infoImageButton149.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 14");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton149 = view.findViewById(R.id.photoImageButton149);
        photoImageButton149.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 149;
            }
        });

        final ImageButton infoImageButton150 = view.findViewById(R.id.infoImageButton150);
        infoImageButton150.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 15");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton150 = view.findViewById(R.id.photoImageButton150);
        photoImageButton150.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 150;
            }
        });

        final ImageButton infoImageButton151 = view.findViewById(R.id.infoImageButton151);
        infoImageButton151.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 16");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton151= view.findViewById(R.id.photoImageButton151);
        photoImageButton151.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 151;
            }
        });

        final ImageButton infoImageButton152 = view.findViewById(R.id.infoImageButton152);
        infoImageButton152.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Barback.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 17");
                Barback.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton152 = view.findViewById(R.id.photoImageButton152);
        photoImageButton152.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 152;
            }
        });

        final Button minimize16 = view.findViewById(R.id.minimizeButton16);
        minimize16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView136.getVisibility() == View.GONE) {
                    minimize16.setText("^");
                    textView136.setVisibility(View.VISIBLE);
                    editText136.setVisibility(View.VISIBLE);
                    infoImageButton136.setVisibility(View.VISIBLE);
                    photoImageButton136.setVisibility(View.VISIBLE);
                    textView137.setVisibility(View.VISIBLE);
                    editText137.setVisibility(View.VISIBLE);
                    infoImageButton137.setVisibility(View.VISIBLE);
                    photoImageButton137.setVisibility(View.VISIBLE);
                    textView138.setVisibility(View.VISIBLE);
                    editText138.setVisibility(View.VISIBLE);
                    infoImageButton139.setVisibility(View.VISIBLE);
                    photoImageButton139.setVisibility(View.VISIBLE);
                    textView140.setVisibility(View.VISIBLE);
                    editText140.setVisibility(View.VISIBLE);
                    infoImageButton140.setVisibility(View.VISIBLE);
                    photoImageButton140.setVisibility(View.VISIBLE);
                    textView141.setVisibility(View.VISIBLE);
                    editText141.setVisibility(View.VISIBLE);
                    infoImageButton141.setVisibility(View.VISIBLE);
                    photoImageButton141.setVisibility(View.VISIBLE);
                    textView142.setVisibility(View.VISIBLE);
                    editText142.setVisibility(View.VISIBLE);
                    infoImageButton142.setVisibility(View.VISIBLE);
                    photoImageButton142.setVisibility(View.VISIBLE);
                    textView142.setVisibility(View.VISIBLE);
                    editText142.setVisibility(View.VISIBLE);
                    infoImageButton142.setVisibility(View.VISIBLE);
                    photoImageButton142.setVisibility(View.VISIBLE);
                    textView143.setVisibility(View.VISIBLE);
                    editText143.setVisibility(View.VISIBLE);
                    infoImageButton143.setVisibility(View.VISIBLE);
                    photoImageButton143.setVisibility(View.VISIBLE);
                    textView144.setVisibility(View.VISIBLE);
                    editText144.setVisibility(View.VISIBLE);
                    infoImageButton144.setVisibility(View.VISIBLE);
                    photoImageButton144.setVisibility(View.VISIBLE);
                    textView145.setVisibility(View.VISIBLE);
                    editText145.setVisibility(View.VISIBLE);
                    infoImageButton145.setVisibility(View.VISIBLE);
                    photoImageButton145.setVisibility(View.VISIBLE);
                    textView146.setVisibility(View.VISIBLE);
                    editText146.setVisibility(View.VISIBLE);
                    infoImageButton146.setVisibility(View.VISIBLE);
                    photoImageButton146.setVisibility(View.VISIBLE);
                    textView147.setVisibility(View.VISIBLE);
                    editText147.setVisibility(View.VISIBLE);
                    infoImageButton147.setVisibility(View.VISIBLE);
                    photoImageButton147.setVisibility(View.VISIBLE);
                    textView148.setVisibility(View.VISIBLE);
                    editText148.setVisibility(View.VISIBLE);
                    infoImageButton148.setVisibility(View.VISIBLE);
                    photoImageButton148.setVisibility(View.VISIBLE);
                    textView149.setVisibility(View.VISIBLE);
                    editText149.setVisibility(View.VISIBLE);
                    infoImageButton149.setVisibility(View.VISIBLE);
                    photoImageButton149.setVisibility(View.VISIBLE);
                    textView150.setVisibility(View.VISIBLE);
                    editText150.setVisibility(View.VISIBLE);
                    infoImageButton150.setVisibility(View.VISIBLE);
                    photoImageButton150.setVisibility(View.VISIBLE);
                    textView151.setVisibility(View.VISIBLE);
                    editText151.setVisibility(View.VISIBLE);
                    infoImageButton151.setVisibility(View.VISIBLE);
                    photoImageButton151.setVisibility(View.VISIBLE);
                    textView152.setVisibility(View.VISIBLE);
                    editText152.setVisibility(View.VISIBLE);
                    infoImageButton152.setVisibility(View.VISIBLE);
                    photoImageButton152.setVisibility(View.VISIBLE);

                }
                else {
                    minimize16.setText("⌄");
                    textView136.setVisibility(View.GONE);
                    editText136.setVisibility(View.GONE);
                    infoImageButton136.setVisibility(View.GONE);
                    photoImageButton136.setVisibility(View.GONE);
                    textView137.setVisibility(View.GONE);
                    editText137.setVisibility(View.GONE);
                    infoImageButton137.setVisibility(View.GONE);
                    photoImageButton137.setVisibility(View.GONE);
                    textView138.setVisibility(View.GONE);
                    editText138.setVisibility(View.GONE);
                    infoImageButton139.setVisibility(View.GONE);
                    photoImageButton139.setVisibility(View.GONE);
                    textView140.setVisibility(View.GONE);
                    editText140.setVisibility(View.GONE);
                    infoImageButton140.setVisibility(View.GONE);
                    photoImageButton140.setVisibility(View.GONE);
                    textView141.setVisibility(View.GONE);
                    editText141.setVisibility(View.GONE);
                    infoImageButton141.setVisibility(View.GONE);
                    photoImageButton141.setVisibility(View.GONE);
                    textView142.setVisibility(View.GONE);
                    editText142.setVisibility(View.GONE);
                    infoImageButton142.setVisibility(View.GONE);
                    photoImageButton142.setVisibility(View.GONE);
                    textView142.setVisibility(View.GONE);
                    editText142.setVisibility(View.GONE);
                    infoImageButton142.setVisibility(View.GONE);
                    photoImageButton142.setVisibility(View.GONE);
                    textView143.setVisibility(View.GONE);
                    editText143.setVisibility(View.GONE);
                    infoImageButton143.setVisibility(View.GONE);
                    photoImageButton143.setVisibility(View.GONE);
                    textView144.setVisibility(View.GONE);
                    editText144.setVisibility(View.GONE);
                    infoImageButton144.setVisibility(View.GONE);
                    photoImageButton144.setVisibility(View.GONE);
                    textView145.setVisibility(View.GONE);
                    editText145.setVisibility(View.GONE);
                    infoImageButton145.setVisibility(View.GONE);
                    photoImageButton145.setVisibility(View.GONE);
                    textView146.setVisibility(View.GONE);
                    editText146.setVisibility(View.GONE);
                    infoImageButton146.setVisibility(View.GONE);
                    photoImageButton146.setVisibility(View.GONE);
                    textView147.setVisibility(View.GONE);
                    editText147.setVisibility(View.GONE);
                    infoImageButton147.setVisibility(View.GONE);
                    photoImageButton147.setVisibility(View.GONE);
                    textView148.setVisibility(View.GONE);
                    editText148.setVisibility(View.GONE);
                    infoImageButton148.setVisibility(View.GONE);
                    photoImageButton148.setVisibility(View.GONE);
                    textView149.setVisibility(View.GONE);
                    editText149.setVisibility(View.GONE);
                    infoImageButton149.setVisibility(View.GONE);
                    photoImageButton149.setVisibility(View.GONE);
                    textView150.setVisibility(View.GONE);
                    editText150.setVisibility(View.GONE);
                    infoImageButton150.setVisibility(View.GONE);
                    photoImageButton150.setVisibility(View.GONE);
                    textView151.setVisibility(View.GONE);
                    editText151.setVisibility(View.GONE);
                    infoImageButton151.setVisibility(View.GONE);
                    photoImageButton151.setVisibility(View.GONE);
                    textView152.setVisibility(View.GONE);
                    editText152.setVisibility(View.GONE);
                    infoImageButton152.setVisibility(View.GONE);
                    photoImageButton152.setVisibility(View.GONE);

                }
            }
        });

        // Submit Button

        final Button barbackSubmitButton = view.findViewById(R.id.barbackSubmitButton);
        barbackSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                KOKChecklistDBHandler handler = new KOKChecklistDBHandler(Barback.this.getActivity());

                int[] ids = new int[]{R.id.editText114, R.id.editText115, R.id.editText116, R.id.editText117, R.id.editText118, R.id.editText119, R.id.editText120, R.id.editText121, R.id.editText122, R.id.editText123, R.id.editText124, R.id.editText125, R.id.editText126, R.id.editText127, R.id.editText128, R.id.editText129, R.id.editText130, R.id.editText131, R.id.editText132, R.id.editText133, R.id.editText134, R.id.editText135, R.id.editText136, R.id.editText137, R.id.editText138, R.id.editText139, R.id.editText140, R.id.editText141, R.id.editText142, R.id.editText143, R.id.editText144, R.id.editText145, R.id.editText146, R.id.editText147, R.id.editText148, R.id.editText149, R.id.editText150, R.id.editText151, R.id.editText152};
                int i = 114;
                for(int id : ids) {
                    EditText initials = view.findViewById(id);
                    if(initials.getText().toString().trim().length() == 2) {
                        byte[] image = null;
                        if(imageList[i-114] != null) {
                            ByteArrayOutputStream stream = new ByteArrayOutputStream();
                            imageList[i-114].compress(Bitmap.CompressFormat.PNG, 100, stream);
                            byte[] bytesArray = stream.toByteArray();
                            image = bytesArray;
                        }
                        handler.addTaskToLog(handler.getWritableDatabase(),3, i, initials.getText().toString(), image);
                    }
                    initials.setText("");
                    imageList[i-114] = null;
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
                case 114:
                    photo114.setImageBitmap(bitmap);
                    imageList[0]= bitmap;
                    break;
                case 115:
                    photo115.setImageBitmap(bitmap);
                    imageList[1]= bitmap;
                    break;
                case 116:
                    photo116.setImageBitmap(bitmap);
                    imageList[2]= bitmap;
                    break;
                case 117:
                    photo117.setImageBitmap(bitmap);
                    imageList[3]= bitmap;
                    break;
                case 118:
                    photo118.setImageBitmap(bitmap);
                    imageList[4]= bitmap;
                    break;
                case 119:
                    photo119.setImageBitmap(bitmap);
                    imageList[5]= bitmap;
                    break;
                case 120:
                    photo120.setImageBitmap(bitmap);
                    imageList[6]= bitmap;
                    break;
                case 121:
                    photo121.setImageBitmap(bitmap);
                    imageList[7]= bitmap;
                    break;
                case 122:
                    photo122.setImageBitmap(bitmap);
                    imageList[8]= bitmap;
                    break;
                case 123:
                    photo123.setImageBitmap(bitmap);
                    imageList[9]= bitmap;
                    break;
                case 124:
                    photo124.setImageBitmap(bitmap);
                    imageList[10]= bitmap;
                    break;
                case 125:
                    photo125.setImageBitmap(bitmap);
                    imageList[11]= bitmap;
                    break;
                case 126:
                    photo126.setImageBitmap(bitmap);
                    imageList[12]= bitmap;
                    break;
                case 127:
                    photo127.setImageBitmap(bitmap);
                    imageList[13]= bitmap;
                    break;
                case 128:
                    photo128.setImageBitmap(bitmap);
                    imageList[14]= bitmap;
                    break;
                case 129:
                    photo129.setImageBitmap(bitmap);
                    imageList[15]= bitmap;
                    break;
                case 130:
                    photo130.setImageBitmap(bitmap);
                    imageList[16]= bitmap;
                    break;
                case 131:
                    photo131.setImageBitmap(bitmap);
                    imageList[17]= bitmap;
                    break;
                case 132:
                    photo132.setImageBitmap(bitmap);
                    imageList[18]= bitmap;
                    break;
                case 133:
                    photo133.setImageBitmap(bitmap);
                    imageList[19]= bitmap;
                    break;
                case 134:
                    photo134.setImageBitmap(bitmap);
                    imageList[20]= bitmap;
                    break;
                case 135:
                    photo135.setImageBitmap(bitmap);
                    imageList[21]= bitmap;
                    break;
                case 136:
                    photo136.setImageBitmap(bitmap);
                    imageList[22]= bitmap;
                    break;
                case 137:
                    photo137.setImageBitmap(bitmap);
                    imageList[23]= bitmap;
                    break;
                case 138:
                    photo138.setImageBitmap(bitmap);
                    imageList[24]= bitmap;
                    break;
                case 139:
                    photo139.setImageBitmap(bitmap);
                    imageList[25]= bitmap;
                    break;
                case 140:
                    photo140.setImageBitmap(bitmap);
                    imageList[26]= bitmap;
                    break;
                case 141:
                    photo141.setImageBitmap(bitmap);
                    imageList[27]= bitmap;
                    break;
                case 142:
                    photo142.setImageBitmap(bitmap);
                    imageList[28]= bitmap;
                    break;
                case 143:
                    photo143.setImageBitmap(bitmap);
                    imageList[29]= bitmap;
                    break;
                case 144:
                    photo144.setImageBitmap(bitmap);
                    imageList[30]= bitmap;
                    break;
                case 145:
                    photo145.setImageBitmap(bitmap);
                    imageList[31]= bitmap;
                    break;
                case 146:
                    photo146.setImageBitmap(bitmap);
                    imageList[32]= bitmap;
                    break;
                case 147:
                    photo147.setImageBitmap(bitmap);
                    imageList[33]= bitmap;
                    break;
                case 148:
                    photo148.setImageBitmap(bitmap);
                    imageList[34]= bitmap;
                    break;
                case 149:
                    photo149.setImageBitmap(bitmap);
                    imageList[35]= bitmap;
                    break;
                case 150:
                    photo150.setImageBitmap(bitmap);
                    imageList[36]= bitmap;
                    break;
                case 151:
                    photo151.setImageBitmap(bitmap);
                    imageList[37]= bitmap;
                    break;
                case 152:
                    photo152.setImageBitmap(bitmap);
                    imageList[38]= bitmap;
                    break;
            }
        }
    }
}
