package com.example.kok_checklist;


import android.app.Activity;
import android.app.Service;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.ByteArrayOutputStream;


/**
 * A simple {@link Fragment} subclass.
 */
public class Server extends Fragment {

    View view;

    private static final int CAMERA_REQUEST = 1888;

    private int buttonNumber;

    private ImageView photo1;
    private ImageView photo2;
    private ImageView photo3;
    private ImageView photo4;
    private ImageView photo5;
    private ImageView photo6;
    private ImageView photo7;
    private ImageView photo8;
    private ImageView photo9;
    private ImageView photo10;
    private ImageView photo11;
    private ImageView photo12;
    private ImageView photo13;
    private ImageView photo14;
    private ImageView photo15;
    private ImageView photo16;
    private ImageView photo17;
    private ImageView photo18;
    private ImageView photo19;
    private ImageView photo20;
    private ImageView photo21;
    private ImageView photo22;
    private ImageView photo23;
    private ImageView photo24;
    private ImageView photo25;
    private ImageView photo26;
    private ImageView photo27;
    private ImageView photo28;
    private ImageView photo29;
    private ImageView photo30;
    private ImageView photo31;
    private ImageView photo32;
    private ImageView photo33;
    private ImageView photo34;
    private ImageView photo35;
    private ImageView photo36;

    private Bitmap[] imageList = new Bitmap[36];

    public Server() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_server, container, false);


        photo1 = view.findViewById(R.id.photo1);
        photo2 = view.findViewById(R.id.photo2);
        photo3 = view.findViewById(R.id.photo3);
        photo4 = view.findViewById(R.id.photo4);
        photo5 = view.findViewById(R.id.photo5);
        photo6 = view.findViewById(R.id.photo6);
        photo7 = view.findViewById(R.id.photo7);
        photo8 = view.findViewById(R.id.photo8);
        photo9 = view.findViewById(R.id.photo9);
        photo10 = view.findViewById(R.id.photo10);
        photo11 = view.findViewById(R.id.photo11);
        photo12 = view.findViewById(R.id.photo12);
        photo13 = view.findViewById(R.id.photo13);
        photo14 = view.findViewById(R.id.photo14);
        photo15 = view.findViewById(R.id.photo15);
        photo16 = view.findViewById(R.id.photo16);
        photo17 = view.findViewById(R.id.photo17);
        photo18 = view.findViewById(R.id.photo18);
        photo19 = view.findViewById(R.id.photo19);
        photo20 = view.findViewById(R.id.photo20);
        photo21 = view.findViewById(R.id.photo21);
        photo22 = view.findViewById(R.id.photo22);
        photo23 = view.findViewById(R.id.photo23);
        photo24 = view.findViewById(R.id.photo24);
        photo25 = view.findViewById(R.id.photo25);
        photo26 = view.findViewById(R.id.photo26);
        photo27 = view.findViewById(R.id.photo27);
        photo28 = view.findViewById(R.id.photo28);
        photo29 = view.findViewById(R.id.photo29);
        photo30 = view.findViewById(R.id.photo30);
        photo31 = view.findViewById(R.id.photo31);
        photo32 = view.findViewById(R.id.photo32);
        photo33 = view.findViewById(R.id.photo33);
        photo34 = view.findViewById(R.id.photo34);
        photo35 = view.findViewById(R.id.photo35);
        photo36 = view.findViewById(R.id.photo36);

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



        // OPEN SHIFT

        final TextView textView1 = view.findViewById(R.id.textView1);
        final EditText editText1 = view.findViewById(R.id.editText1);
        final TextView textView2 = view.findViewById(R.id.textView2);
        final EditText editText2 = view.findViewById(R.id.editText2);
        final TextView textView3 = view.findViewById(R.id.textView3);
        final EditText editText3 = view.findViewById(R.id.editText3);
        final TextView textView4 = view.findViewById(R.id.textView4);
        final EditText editText4 = view.findViewById(R.id.editText4);
        final TextView textView5 = view.findViewById(R.id.textView5);
        final EditText editText5 = view.findViewById(R.id.editText5);
        final TextView textView6 = view.findViewById(R.id.textView6);
        final EditText editText6 = view.findViewById(R.id.editText6);
        final TextView textView7 = view.findViewById(R.id.textView7);
        final EditText editText7 = view.findViewById(R.id.editText7);
        final TextView textView8 = view.findViewById(R.id.textView8);
        final EditText editText8 = view.findViewById(R.id.editText8);
        final TextView textView9 = view.findViewById(R.id.textView9);
        final EditText editText9 = view.findViewById(R.id.editText9);
        final TextView textView10 = view.findViewById(R.id.textView10);
        final EditText editText10 = view.findViewById(R.id.editText10);
        final TextView textView11 = view.findViewById(R.id.textView11);
        final EditText editText11 = view.findViewById(R.id.editText11);
        final TextView textView12 = view.findViewById(R.id.textView12);
        final EditText editText12 = view.findViewById(R.id.editText12);
        final TextView textView13 = view.findViewById(R.id.textView13);
        final EditText editText13 = view.findViewById(R.id.editText13);
        final TextView textView14 = view.findViewById(R.id.textView14);
        final EditText editText14 = view.findViewById(R.id.editText14);
        final TextView textView15 = view.findViewById(R.id.textView15);
        final EditText editText15 = view.findViewById(R.id.editText15);


        final ImageButton infoImageButton1 = view.findViewById(R.id.infoImageButton1);
        infoImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 1");
                Server.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton1 = view.findViewById(R.id.photoImageButton1);
        photoImageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 1;

            }
        });

        final ImageButton infoImageButton2 = view.findViewById(R.id.infoImageButton2);
        infoImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 2");
                Server.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton2 = view.findViewById(R.id.photoImageButton2);
        photoImageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 2;
            }
        });

        final ImageButton infoImageButton3 = view.findViewById(R.id.infoImageButton3);
        infoImageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 3");
                Server.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton3 = view.findViewById(R.id.photoImageButton3);
        photoImageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 3;
            }
        });

        final ImageButton infoImageButton4 = view.findViewById(R.id.infoImageButton4);
        infoImageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 4");
                Server.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton4 = view.findViewById(R.id.photoImageButton4);
        photoImageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 4;
            }
        });

        final ImageButton infoImageButton5 = view.findViewById(R.id.infoImageButton5);
        infoImageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 5");
                Server.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton5 = view.findViewById(R.id.photoImageButton5);
        photoImageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 5;
            }
        });

        final ImageButton infoImageButton6 = view.findViewById(R.id.infoImageButton6);
        infoImageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 6");
                Server.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton6 = view.findViewById(R.id.photoImageButton6);
        photoImageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 6;
            }
        });

        final ImageButton infoImageButton7 = view.findViewById(R.id.infoImageButton7);
        infoImageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 7");
                Server.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton7 = view.findViewById(R.id.photoImageButton7);
        photoImageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 7;
            }
        });

        final ImageButton infoImageButton8 = view.findViewById(R.id.infoImageButton8);
        infoImageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 8");
                Server.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton8 = view.findViewById(R.id.photoImageButton8);
        photoImageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 8;
            }
        });

        final ImageButton infoImageButton9 = view.findViewById(R.id.infoImageButton9);
        infoImageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 9");
                Server.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton9 = view.findViewById(R.id.photoImageButton9);
        photoImageButton9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 9;
            }
        });

        final ImageButton infoImageButton10 = view.findViewById(R.id.infoImageButton10);
        infoImageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 10");
                Server.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton10 = view.findViewById(R.id.photoImageButton10);
        photoImageButton10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 10;
            }
        });

        final ImageButton infoImageButton11 = view.findViewById(R.id.infoImageButton11);
        infoImageButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 11");
                Server.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton11 = view.findViewById(R.id.photoImageButton11);
        photoImageButton11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 11;
            }
        });

        final ImageButton infoImageButton12 = view.findViewById(R.id.infoImageButton12);
        infoImageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 12");
                Server.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton12 = view.findViewById(R.id.photoImageButton12);
        photoImageButton12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 12;
            }
        });

        final ImageButton infoImageButton13 = view.findViewById(R.id.infoImageButton13);
        infoImageButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 13");
                Server.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton13 = view.findViewById(R.id.photoImageButton13);
        photoImageButton13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 13;
            }
        });

        final ImageButton infoImageButton14 = view.findViewById(R.id.infoImageButton14);
        infoImageButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 14");
                Server.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton14 = view.findViewById(R.id.photoImageButton14);
        photoImageButton14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 14;
            }
        });

        final ImageButton infoImageButton15 = view.findViewById(R.id.infoImageButton15);
        infoImageButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Task 15");
                Server.this.startActivity(myIntent);
            }
        });

        final ImageButton photoImageButton15 = view.findViewById(R.id.photoImageButton15);
        photoImageButton15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 15;
            }
        });

        final Button minimize1 = view.findViewById(R.id.minimizeButton1);
        minimize1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView1.getVisibility() == View.GONE) {
                    minimize1.setText("^");
                    textView1.setVisibility(View.VISIBLE);
                    editText1.setVisibility(View.VISIBLE);
                    infoImageButton1.setVisibility(View.VISIBLE);
                    photoImageButton1.setVisibility(View.VISIBLE);
                    textView2.setVisibility(View.VISIBLE);
                    editText2.setVisibility(View.VISIBLE);
                    infoImageButton2.setVisibility(View.VISIBLE);
                    photoImageButton2.setVisibility(View.VISIBLE);
                    textView3.setVisibility(View.VISIBLE);
                    editText3.setVisibility(View.VISIBLE);
                    infoImageButton3.setVisibility(View.VISIBLE);
                    photoImageButton3.setVisibility(View.VISIBLE);
                    textView4.setVisibility(View.VISIBLE);
                    editText4.setVisibility(View.VISIBLE);
                    infoImageButton4.setVisibility(View.VISIBLE);
                    photoImageButton4.setVisibility(View.VISIBLE);
                    textView5.setVisibility(View.VISIBLE);
                    editText5.setVisibility(View.VISIBLE);
                    infoImageButton5.setVisibility(View.VISIBLE);
                    photoImageButton5.setVisibility(View.VISIBLE);
                    textView6.setVisibility(View.VISIBLE);
                    editText6.setVisibility(View.VISIBLE);
                    infoImageButton6.setVisibility(View.VISIBLE);
                    photoImageButton6.setVisibility(View.VISIBLE);
                    textView7.setVisibility(View.VISIBLE);
                    editText7.setVisibility(View.VISIBLE);
                    infoImageButton7.setVisibility(View.VISIBLE);
                    photoImageButton7.setVisibility(View.VISIBLE);
                    textView8.setVisibility(View.VISIBLE);
                    editText8.setVisibility(View.VISIBLE);
                    infoImageButton8.setVisibility(View.VISIBLE);
                    photoImageButton8.setVisibility(View.VISIBLE);
                    textView9.setVisibility(View.VISIBLE);
                    editText9.setVisibility(View.VISIBLE);
                    infoImageButton9.setVisibility(View.VISIBLE);
                    photoImageButton9.setVisibility(View.VISIBLE);
                    textView10.setVisibility(View.VISIBLE);
                    editText10.setVisibility(View.VISIBLE);
                    infoImageButton10.setVisibility(View.VISIBLE);
                    photoImageButton10.setVisibility(View.VISIBLE);
                    textView11.setVisibility(View.VISIBLE);
                    editText11.setVisibility(View.VISIBLE);
                    infoImageButton11.setVisibility(View.VISIBLE);
                    photoImageButton11.setVisibility(View.VISIBLE);
                    textView12.setVisibility(View.VISIBLE);
                    editText12.setVisibility(View.VISIBLE);
                    infoImageButton12.setVisibility(View.VISIBLE);
                    photoImageButton12.setVisibility(View.VISIBLE);
                    textView13.setVisibility(View.VISIBLE);
                    editText13.setVisibility(View.VISIBLE);
                    infoImageButton13.setVisibility(View.VISIBLE);
                    photoImageButton13.setVisibility(View.VISIBLE);
                    textView14.setVisibility(View.VISIBLE);
                    editText14.setVisibility(View.VISIBLE);
                    infoImageButton14.setVisibility(View.VISIBLE);
                    photoImageButton14.setVisibility(View.VISIBLE);
                    textView15.setVisibility(View.VISIBLE);
                    editText15.setVisibility(View.VISIBLE);
                    infoImageButton15.setVisibility(View.VISIBLE);
                    photoImageButton15.setVisibility(View.VISIBLE);



                }
                else {
                    minimize1.setText("⌄");
                    textView1.setVisibility(View.GONE);
                    editText1.setVisibility(View.GONE);
                    infoImageButton1.setVisibility(View.GONE);
                    photoImageButton1.setVisibility(View.GONE);
                    textView2.setVisibility(View.GONE);
                    editText2.setVisibility(View.GONE);
                    infoImageButton2.setVisibility(View.GONE);
                    photoImageButton2.setVisibility(View.GONE);
                    textView3.setVisibility(View.GONE);
                    editText3.setVisibility(View.GONE);
                    infoImageButton3.setVisibility(View.GONE);
                    photoImageButton3.setVisibility(View.GONE);
                    textView4.setVisibility(View.GONE);
                    editText4.setVisibility(View.GONE);
                    infoImageButton4.setVisibility(View.GONE);
                    photoImageButton4.setVisibility(View.GONE);
                    textView5.setVisibility(View.GONE);
                    editText5.setVisibility(View.GONE);
                    infoImageButton5.setVisibility(View.GONE);
                    photoImageButton5.setVisibility(View.GONE);
                    textView6.setVisibility(View.GONE);
                    editText6.setVisibility(View.GONE);
                    infoImageButton6.setVisibility(View.GONE);
                    photoImageButton6.setVisibility(View.GONE);
                    textView7.setVisibility(View.GONE);
                    editText7.setVisibility(View.GONE);
                    infoImageButton7.setVisibility(View.GONE);
                    photoImageButton7.setVisibility(View.GONE);
                    textView8.setVisibility(View.GONE);
                    editText8.setVisibility(View.GONE);
                    infoImageButton8.setVisibility(View.GONE);
                    photoImageButton8.setVisibility(View.GONE);
                    textView9.setVisibility(View.GONE);
                    editText9.setVisibility(View.GONE);
                    infoImageButton9.setVisibility(View.GONE);
                    photoImageButton9.setVisibility(View.GONE);
                    textView10.setVisibility(View.GONE);
                    editText10.setVisibility(View.GONE);
                    infoImageButton10.setVisibility(View.GONE);
                    photoImageButton10.setVisibility(View.GONE);
                    textView11.setVisibility(View.GONE);
                    editText11.setVisibility(View.GONE);
                    infoImageButton11.setVisibility(View.GONE);
                    photoImageButton11.setVisibility(View.GONE);
                    textView12.setVisibility(View.GONE);
                    editText12.setVisibility(View.GONE);
                    infoImageButton12.setVisibility(View.GONE);
                    photoImageButton12.setVisibility(View.GONE);
                    textView13.setVisibility(View.GONE);
                    editText13.setVisibility(View.GONE);
                    infoImageButton13.setVisibility(View.GONE);
                    photoImageButton13.setVisibility(View.GONE);
                    textView14.setVisibility(View.GONE);
                    editText14.setVisibility(View.GONE);
                    infoImageButton14.setVisibility(View.GONE);
                    photoImageButton14.setVisibility(View.GONE);
                    textView15.setVisibility(View.GONE);
                    editText15.setVisibility(View.GONE);
                    infoImageButton15.setVisibility(View.GONE);
                    photoImageButton15.setVisibility(View.GONE);
                }

            }
        });

        // DURING SHIFT (ALL SHIFTS)

        final TextView textView16 = view.findViewById(R.id.textView16);
        final EditText editText16 = view.findViewById(R.id.editText16);
        final TextView textView17 = view.findViewById(R.id.textView17);
        final EditText editText17 = view.findViewById(R.id.editText17);
        final TextView textView18 = view.findViewById(R.id.textView18);
        final EditText editText18 = view.findViewById(R.id.editText18);
        final TextView textView19 = view.findViewById(R.id.textView19);
        final EditText editText19 = view.findViewById(R.id.editText19);

        final ImageButton infoImageButton16 = view.findViewById(R.id.infoImageButton16);
        infoImageButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","During Shift 1");
                Server.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton16 = view.findViewById(R.id.photoImageButton16);
        photoImageButton16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 16;
            }
        });

        final ImageButton infoImageButton17 = view.findViewById(R.id.infoImageButton17);
        infoImageButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","During Shift 2");
                Server.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton17 = view.findViewById(R.id.photoImageButton17);
        photoImageButton17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 17;
            }
        });

        final ImageButton infoImageButton18 = view.findViewById(R.id.infoImageButton18);
        infoImageButton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","During Shift 3");
                Server.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton18 = view.findViewById(R.id.photoImageButton18);
        photoImageButton18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 18;
            }
        });

        final ImageButton infoImageButton19 = view.findViewById(R.id.infoImageButton19);
        infoImageButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","During Shift 4");
                Server.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton19 = view.findViewById(R.id.photoImageButton19);
        photoImageButton19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 19;
            }
        });

        final Button minimize2 = view.findViewById(R.id.minimizeButton2);
        minimize2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView16.getVisibility() == View.GONE) {
                    minimize2.setText("^");
                    textView16.setVisibility(View.VISIBLE);
                    editText16.setVisibility(View.VISIBLE);
                    infoImageButton16.setVisibility(View.VISIBLE);
                    photoImageButton16.setVisibility(View.VISIBLE);
                    textView17.setVisibility(View.VISIBLE);
                    editText17.setVisibility(View.VISIBLE);
                    infoImageButton17.setVisibility(View.VISIBLE);
                    photoImageButton17.setVisibility(View.VISIBLE);
                    textView18.setVisibility(View.VISIBLE);
                    editText18.setVisibility(View.VISIBLE);
                    infoImageButton18.setVisibility(View.VISIBLE);
                    photoImageButton18.setVisibility(View.VISIBLE);
                    textView19.setVisibility(View.VISIBLE);
                    editText19.setVisibility(View.VISIBLE);
                    infoImageButton19.setVisibility(View.VISIBLE);
                    photoImageButton19.setVisibility(View.VISIBLE);
                } else {
                    minimize2.setText("⌄");
                    textView16.setVisibility(View.GONE);
                    editText16.setVisibility(View.GONE);
                    infoImageButton16.setVisibility(View.GONE);
                    photoImageButton16.setVisibility(View.GONE);
                    textView17.setVisibility(View.GONE);
                    editText17.setVisibility(View.GONE);
                    infoImageButton17.setVisibility(View.GONE);
                    photoImageButton17.setVisibility(View.GONE);
                    textView18.setVisibility(View.GONE);
                    editText18.setVisibility(View.GONE);
                    infoImageButton18.setVisibility(View.GONE);
                    photoImageButton18.setVisibility(View.GONE);
                    textView19.setVisibility(View.GONE);
                    editText19.setVisibility(View.GONE);
                    infoImageButton19.setVisibility(View.GONE);
                    photoImageButton19.setVisibility(View.GONE);
                }
            }
        });


        // Happy Hour

        final TextView textView20 = view.findViewById(R.id.textView20);
        final EditText editText20 = view.findViewById(R.id.editText20);
        final TextView textView21 = view.findViewById(R.id.textView21);
        final EditText editText21 = view.findViewById(R.id.editText21);
        final TextView textView22 = view.findViewById(R.id.textView22);
        final EditText editText22 = view.findViewById(R.id.editText22);
        final TextView textView23 = view.findViewById(R.id.textView23);
        final EditText editText23 = view.findViewById(R.id.editText23);
        final TextView textView24 = view.findViewById(R.id.textView24);
        final EditText editText24 = view.findViewById(R.id.editText24);
        final TextView textView25 = view.findViewById(R.id.textView25);
        final EditText editText25 = view.findViewById(R.id.editText25);
        final TextView textView26 = view.findViewById(R.id.textView26);
        final EditText editText26 = view.findViewById(R.id.editText26);

        final ImageButton infoImageButton20 = view.findViewById(R.id.infoImageButton20);
        infoImageButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Happy Hour 1");
                Server.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton20 = view.findViewById(R.id.photoImageButton20);
        photoImageButton20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 20;
            }
        });

        final ImageButton infoImageButton21 = view.findViewById(R.id.infoImageButton21);
        infoImageButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Happy Hour 2");
                Server.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton21 = view.findViewById(R.id.photoImageButton21);
        photoImageButton21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 21;
            }
        });

        final ImageButton infoImageButton22 = view.findViewById(R.id.infoImageButton22);
        infoImageButton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Happy Hour 3");
                Server.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton22 = view.findViewById(R.id.photoImageButton22);
        photoImageButton22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 22;
            }
        });

        final ImageButton infoImageButton23 = view.findViewById(R.id.infoImageButton23);
        infoImageButton23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Happy Hour 4");
                Server.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton23 = view.findViewById(R.id.photoImageButton23);
        photoImageButton23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 23;
            }
        });

        final ImageButton infoImageButton24 = view.findViewById(R.id.infoImageButton24);
        infoImageButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Happy Hour 5");
                Server.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton24 = view.findViewById(R.id.photoImageButton24);
        photoImageButton24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 24;
            }
        });

        final ImageButton infoImageButton25 = view.findViewById(R.id.infoImageButton25);
        infoImageButton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Happy Hour 6");
                Server.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton25 = view.findViewById(R.id.photoImageButton25);
        photoImageButton25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 25;
            }
        });

        final ImageButton infoImageButton26 = view.findViewById(R.id.infoImageButton26);
        infoImageButton26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Happy Hour 7");
                Server.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton26 = view.findViewById(R.id.photoImageButton26);
        photoImageButton26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 26;
            }
        });

        final Button minimize3 = view.findViewById(R.id.minimizeButton3);
        minimize3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView20.getVisibility() == View.GONE) {
                    minimize3.setText("^");
                    textView20.setVisibility(View.VISIBLE);
                    editText20.setVisibility(View.VISIBLE);
                    infoImageButton20.setVisibility(View.VISIBLE);
                    photoImageButton20.setVisibility(View.VISIBLE);
                    textView21.setVisibility(View.VISIBLE);
                    editText21.setVisibility(View.VISIBLE);
                    infoImageButton21.setVisibility(View.VISIBLE);
                    photoImageButton21.setVisibility(View.VISIBLE);
                    textView22.setVisibility(View.VISIBLE);
                    editText22.setVisibility(View.VISIBLE);
                    infoImageButton22.setVisibility(View.VISIBLE);
                    photoImageButton22.setVisibility(View.VISIBLE);
                    textView23.setVisibility(View.VISIBLE);
                    editText23.setVisibility(View.VISIBLE);
                    infoImageButton23.setVisibility(View.VISIBLE);
                    photoImageButton23.setVisibility(View.VISIBLE);
                    textView24.setVisibility(View.VISIBLE);
                    editText24.setVisibility(View.VISIBLE);
                    infoImageButton24.setVisibility(View.VISIBLE);
                    photoImageButton24.setVisibility(View.VISIBLE);
                    textView25.setVisibility(View.VISIBLE);
                    editText25.setVisibility(View.VISIBLE);
                    infoImageButton25.setVisibility(View.VISIBLE);
                    photoImageButton25.setVisibility(View.VISIBLE);
                    textView26.setVisibility(View.VISIBLE);
                    editText26.setVisibility(View.VISIBLE);
                    infoImageButton26.setVisibility(View.VISIBLE);
                    photoImageButton26.setVisibility(View.VISIBLE);

                } else {
                    minimize3.setText("⌄");
                    textView20.setVisibility(View.GONE);
                    editText20.setVisibility(View.GONE);
                    infoImageButton20.setVisibility(View.GONE);
                    photoImageButton20.setVisibility(View.GONE);
                    textView21.setVisibility(View.GONE);
                    editText21.setVisibility(View.GONE);
                    infoImageButton21.setVisibility(View.GONE);
                    photoImageButton21.setVisibility(View.GONE);
                    textView22.setVisibility(View.GONE);
                    editText22.setVisibility(View.GONE);
                    infoImageButton22.setVisibility(View.GONE);
                    photoImageButton22.setVisibility(View.GONE);
                    textView23.setVisibility(View.GONE);
                    editText23.setVisibility(View.GONE);
                    infoImageButton23.setVisibility(View.GONE);
                    photoImageButton23.setVisibility(View.GONE);
                    textView24.setVisibility(View.GONE);
                    editText24.setVisibility(View.GONE);
                    infoImageButton24.setVisibility(View.GONE);
                    photoImageButton24.setVisibility(View.GONE);
                    textView25.setVisibility(View.GONE);
                    editText25.setVisibility(View.GONE);
                    infoImageButton25.setVisibility(View.GONE);
                    photoImageButton25.setVisibility(View.GONE);
                    textView26.setVisibility(View.GONE);
                    editText26.setVisibility(View.GONE);
                    infoImageButton26.setVisibility(View.GONE);
                    photoImageButton26.setVisibility(View.GONE);
                }
            }
        });


        // Closing

        final TextView textView27 = view.findViewById(R.id.textView27);
        final EditText editText27 = view.findViewById(R.id.editText27);
        final TextView textView28 = view.findViewById(R.id.textView28);
        final EditText editText28 = view.findViewById(R.id.editText28);
        final TextView textView29 = view.findViewById(R.id.textView29);
        final EditText editText29 = view.findViewById(R.id.editText29);
        final TextView textView30 = view.findViewById(R.id.textView30);
        final EditText editText30 = view.findViewById(R.id.editText30);
        final TextView textView31 = view.findViewById(R.id.textView31);
        final EditText editText31 = view.findViewById(R.id.editText31);
        final TextView textView32 = view.findViewById(R.id.textView32);
        final EditText editText32 = view.findViewById(R.id.editText32);
        final TextView textView33 = view.findViewById(R.id.textView33);
        final EditText editText33 = view.findViewById(R.id.editText33);
        final TextView textView34 = view.findViewById(R.id.textView34);
        final EditText editText34 = view.findViewById(R.id.editText34);
        final TextView textView35 = view.findViewById(R.id.textView35);
        final EditText editText35 = view.findViewById(R.id.editText35);
        final TextView textView36 = view.findViewById(R.id.textView36);
        final EditText editText36 = view.findViewById(R.id.editText36);

        final ImageButton infoImageButton27 = view.findViewById(R.id.infoImageButton27);
        infoImageButton27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 1");
                Server.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton27 = view.findViewById(R.id.photoImageButton27);
        photoImageButton27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 27;
            }
        });

        final ImageButton infoImageButton28 = view.findViewById(R.id.infoImageButton28);
        infoImageButton28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 2");
                Server.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton28 = view.findViewById(R.id.photoImageButton28);
        photoImageButton28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 28;
            }
        });

        final ImageButton infoImageButton29 = view.findViewById(R.id.infoImageButton29);
        infoImageButton29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 3");
                Server.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton29 = view.findViewById(R.id.photoImageButton29);
        photoImageButton29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 29;
            }
        });

        final ImageButton infoImageButton30 = view.findViewById(R.id.infoImageButton30);
        infoImageButton30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 4");
                Server.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton30 = view.findViewById(R.id.photoImageButton30);
        photoImageButton30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 30;
            }
        });

        final ImageButton infoImageButton31 = view.findViewById(R.id.infoImageButton31);
        infoImageButton31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 5");
                Server.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton31 = view.findViewById(R.id.photoImageButton31);
        photoImageButton31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 31;
            }
        });

        final ImageButton infoImageButton32 = view.findViewById(R.id.infoImageButton32);
        infoImageButton32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 6");
                Server.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton32 = view.findViewById(R.id.photoImageButton32);
        photoImageButton32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 32;
            }
        });

        final ImageButton infoImageButton33 = view.findViewById(R.id.infoImageButton33);
        infoImageButton33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 7");
                Server.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton33 = view.findViewById(R.id.photoImageButton33);
        photoImageButton33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 33;
            }
        });

        final ImageButton infoImageButton34 = view.findViewById(R.id.infoImageButton34);
        infoImageButton34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 8");
                Server.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton34 = view.findViewById(R.id.photoImageButton34);
        photoImageButton34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 34;
            }
        });

        final ImageButton infoImageButton35 = view.findViewById(R.id.infoImageButton35);
        infoImageButton35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 9");
                Server.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton35 = view.findViewById(R.id.photoImageButton35);
        photoImageButton35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 35;
            }
        });

        final ImageButton infoImageButton36 = view.findViewById(R.id.infoImageButton36);
        infoImageButton36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(Server.this.getActivity(),PopUp.class);
                myIntent.putExtra("popUpData","Closing 10");
                Server.this.startActivity(myIntent);

            }
        });

        final ImageButton photoImageButton36 = view.findViewById(R.id.photoImageButton36);
        photoImageButton36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(myIntent, CAMERA_REQUEST);
                buttonNumber = 36;
            }
        });

        final Button minimize4 = view.findViewById(R.id.minimizeButton4);
        minimize4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView27.getVisibility() == View.GONE) {
                    minimize4.setText("^");
                    textView27.setVisibility(View.VISIBLE);
                    editText27.setVisibility(View.VISIBLE);
                    infoImageButton27.setVisibility(View.VISIBLE);
                    photoImageButton27.setVisibility(View.VISIBLE);
                    textView28.setVisibility(View.VISIBLE);
                    editText28.setVisibility(View.VISIBLE);
                    infoImageButton28.setVisibility(View.VISIBLE);
                    photoImageButton28.setVisibility(View.VISIBLE);
                    textView29.setVisibility(View.VISIBLE);
                    editText29.setVisibility(View.VISIBLE);
                    infoImageButton29.setVisibility(View.VISIBLE);
                    photoImageButton29.setVisibility(View.VISIBLE);
                    textView30.setVisibility(View.VISIBLE);
                    editText30.setVisibility(View.VISIBLE);
                    infoImageButton30.setVisibility(View.VISIBLE);
                    photoImageButton30.setVisibility(View.VISIBLE);
                    textView31.setVisibility(View.VISIBLE);
                    editText31.setVisibility(View.VISIBLE);
                    infoImageButton31.setVisibility(View.VISIBLE);
                    photoImageButton31.setVisibility(View.VISIBLE);
                    textView32.setVisibility(View.VISIBLE);
                    editText32.setVisibility(View.VISIBLE);
                    infoImageButton32.setVisibility(View.VISIBLE);
                    photoImageButton32.setVisibility(View.VISIBLE);
                    textView33.setVisibility(View.VISIBLE);
                    editText33.setVisibility(View.VISIBLE);
                    infoImageButton33.setVisibility(View.VISIBLE);
                    photoImageButton33.setVisibility(View.VISIBLE);
                    textView34.setVisibility(View.VISIBLE);
                    editText34.setVisibility(View.VISIBLE);
                    infoImageButton34.setVisibility(View.VISIBLE);
                    photoImageButton34.setVisibility(View.VISIBLE);
                    textView35.setVisibility(View.VISIBLE);
                    editText35.setVisibility(View.VISIBLE);
                    infoImageButton35.setVisibility(View.VISIBLE);
                    photoImageButton35.setVisibility(View.VISIBLE);
                    textView36.setVisibility(View.VISIBLE);
                    editText36.setVisibility(View.VISIBLE);
                    infoImageButton36.setVisibility(View.VISIBLE);
                    photoImageButton36.setVisibility(View.VISIBLE);

                } else {
                    minimize4.setText("⌄");
                    textView27.setVisibility(View.GONE);
                    editText27.setVisibility(View.GONE);
                    infoImageButton27.setVisibility(View.GONE);
                    photoImageButton27.setVisibility(View.GONE);
                    textView28.setVisibility(View.GONE);
                    editText28.setVisibility(View.GONE);
                    infoImageButton28.setVisibility(View.GONE);
                    photoImageButton28.setVisibility(View.GONE);
                    textView29.setVisibility(View.GONE);
                    editText29.setVisibility(View.GONE);
                    infoImageButton29.setVisibility(View.GONE);
                    photoImageButton29.setVisibility(View.GONE);
                    textView30.setVisibility(View.GONE);
                    editText30.setVisibility(View.GONE);
                    infoImageButton30.setVisibility(View.GONE);
                    photoImageButton30.setVisibility(View.GONE);
                    textView31.setVisibility(View.GONE);
                    editText31.setVisibility(View.GONE);
                    infoImageButton31.setVisibility(View.GONE);
                    photoImageButton31.setVisibility(View.GONE);
                    textView32.setVisibility(View.GONE);
                    editText32.setVisibility(View.GONE);
                    infoImageButton32.setVisibility(View.GONE);
                    photoImageButton32.setVisibility(View.GONE);
                    textView33.setVisibility(View.GONE);
                    editText33.setVisibility(View.GONE);
                    infoImageButton33.setVisibility(View.GONE);
                    photoImageButton33.setVisibility(View.GONE);
                    textView34.setVisibility(View.GONE);
                    editText34.setVisibility(View.GONE);
                    infoImageButton34.setVisibility(View.GONE);
                    photoImageButton34.setVisibility(View.GONE);
                    textView35.setVisibility(View.GONE);
                    editText35.setVisibility(View.GONE);
                    infoImageButton35.setVisibility(View.GONE);
                    photoImageButton35.setVisibility(View.GONE);
                    textView36.setVisibility(View.GONE);
                    editText36.setVisibility(View.GONE);
                    infoImageButton36.setVisibility(View.GONE);
                    photoImageButton36.setVisibility(View.GONE);
                }
            }
        });


        // Submit Button

        final Button serverSubmitButton = view.findViewById(R.id.serverSubmitButton);
        serverSubmitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                KOKChecklistDBHandler handler = new KOKChecklistDBHandler(Server.this.getActivity());

                int[] ids = new int[]{R.id.editText1, R.id.editText2, R.id.editText3, R.id.editText4, R.id.editText5, R.id.editText6, R.id.editText7, R.id.editText8, R.id.editText9, R.id.editText10, R.id.editText11, R.id.editText12, R.id.editText13, R.id.editText14, R.id.editText15, R.id.editText16, R.id.editText17, R.id.editText18, R.id.editText19, R.id.editText20, R.id.editText21, R.id.editText22, R.id.editText23, R.id.editText24, R.id.editText25, R.id.editText26, R.id.editText27, R.id.editText28, R.id.editText29, R.id.editText30, R.id.editText31, R.id.editText32, R.id.editText33, R.id.editText34, R.id.editText35, R.id.editText36};
                int i = 1;
                for(int id : ids) {
                    EditText initials = view.findViewById(id);
                    if(initials.getText().toString().trim().length() == 2) {
                        byte[] image = null;
                        if(imageList[i-1] != null) {
                            ByteArrayOutputStream stream = new ByteArrayOutputStream();
                            imageList[i-1].compress(Bitmap.CompressFormat.PNG, 100, stream);
                            byte[] bytesArray = stream.toByteArray();
                            image = bytesArray;
                        }

                        handler.addTaskToLog(handler.getWritableDatabase(),2, i, initials.getText().toString(), image);
                    }
                    initials.setText("");
                    imageList[i-1] = null;
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
                case 1:
                    photo1.setImageBitmap(bitmap);
                    imageList[0]= bitmap;
                    break;
                case 2:
                    photo2.setImageBitmap(bitmap);
                    imageList[1]= bitmap;
                    break;
                case 3:
                    photo3.setImageBitmap(bitmap);
                    imageList[2]= bitmap;
                    break;
                case 4:
                    photo4.setImageBitmap(bitmap);
                    imageList[3]= bitmap;
                    break;
                case 5:
                    photo5.setImageBitmap(bitmap);
                    imageList[4]= bitmap;
                    break;
                case 6:
                    photo6.setImageBitmap(bitmap);
                    imageList[5]= bitmap;
                    break;
                case 7:
                    photo7.setImageBitmap(bitmap);
                    imageList[6]= bitmap;
                    break;
                case 8:
                    photo8.setImageBitmap(bitmap);
                    imageList[7]= bitmap;
                    break;
                case 9:
                    photo9.setImageBitmap(bitmap);
                    imageList[8]= bitmap;
                    break;
                case 10:
                    photo10.setImageBitmap(bitmap);
                    imageList[9]= bitmap;
                    break;
                case 11:
                    photo11.setImageBitmap(bitmap);
                    imageList[10]= bitmap;
                    break;
                case 12:
                    photo12.setImageBitmap(bitmap);
                    imageList[11]= bitmap;
                    break;
                case 13:
                    photo13.setImageBitmap(bitmap);
                    imageList[12]= bitmap;
                    break;
                case 14:
                    photo14.setImageBitmap(bitmap);
                    imageList[13]= bitmap;
                    break;
                case 15:
                    photo15.setImageBitmap(bitmap);
                    imageList[14]= bitmap;
                    break;
                case 16:
                    photo16.setImageBitmap(bitmap);
                    imageList[15]= bitmap;
                    break;
                case 17:
                    photo17.setImageBitmap(bitmap);
                    imageList[16]= bitmap;
                    break;
                case 18:
                    photo18.setImageBitmap(bitmap);
                    imageList[17]= bitmap;
                    break;
                case 19:
                    photo19.setImageBitmap(bitmap);
                    imageList[18]= bitmap;
                    break;
                case 20:
                    photo20.setImageBitmap(bitmap);
                    imageList[19]= bitmap;
                    break;
                case 21:
                    photo21.setImageBitmap(bitmap);
                    imageList[20]= bitmap;
                    break;
                case 22:
                    photo22.setImageBitmap(bitmap);
                    imageList[21]= bitmap;
                    break;
                case 23:
                    photo23.setImageBitmap(bitmap);
                    imageList[22]= bitmap;
                    break;
                case 24:
                    photo24.setImageBitmap(bitmap);
                    imageList[23]= bitmap;
                    break;
                case 25:
                    photo25.setImageBitmap(bitmap);
                    imageList[24]= bitmap;
                    break;
                case 26:
                    photo26.setImageBitmap(bitmap);
                    imageList[25]= bitmap;
                    break;
                case 27:
                    photo27.setImageBitmap(bitmap);
                    imageList[26]= bitmap;
                    break;
                case 28:
                    photo28.setImageBitmap(bitmap);
                    imageList[27]= bitmap;
                    break;
                case 29:
                    photo29.setImageBitmap(bitmap);
                    imageList[28]= bitmap;
                    break;
                case 30:
                    photo30.setImageBitmap(bitmap);
                    imageList[29]= bitmap;
                    break;
                case 31:
                    photo31.setImageBitmap(bitmap);
                    imageList[30]= bitmap;
                    break;
                case 32:
                    photo32.setImageBitmap(bitmap);
                    imageList[31]= bitmap;
                    break;
                case 33:
                    photo33.setImageBitmap(bitmap);
                    imageList[32]= bitmap;
                    break;
                case 34:
                    photo34.setImageBitmap(bitmap);
                    imageList[33]= bitmap;
                    break;
                case 35:
                    photo35.setImageBitmap(bitmap);
                    imageList[34]= bitmap;
                    break;
                case 36:
                    photo36.setImageBitmap(bitmap);
                    imageList[35]= bitmap;
                    break;
            }
        }
    }



}
