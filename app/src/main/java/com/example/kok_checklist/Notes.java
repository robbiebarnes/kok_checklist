package com.example.kok_checklist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Notes extends AppCompatActivity {

    private static final boolean USE_FLAG = true;
    private static final int mFlag = Intent.FLAG_ACTIVITY_REORDER_TO_FRONT;

    TextView noteTextView;
    EditText userNotes;
    String myString = "";

    KOKChecklistDBHandler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);

        noteTextView = findViewById(R.id.noteTextView);
        noteTextView.setMovementMethod(new ScrollingMovementMethod());
        userNotes = findViewById(R.id.userNotes);

        handler = new KOKChecklistDBHandler(this);

        String dbNotes = handler.findTodaysNotes(handler.getWritableDatabase());

        myString += dbNotes;

        noteTextView.setText(myString);

    }

    public void onNoteSubmitButtonClick(View v) {
        if(userNotes.getText().toString() != "") {
            myString += userNotes.getText() + "\n";
            noteTextView.setText(myString);
            handler.addNoteToTable(handler.getWritableDatabase(), userNotes.getText().toString());
            userNotes.setText("");
        }
    }

    public void onEmailClick(View v) {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        String today = dateFormat.format(date);

        String todaysNotes = handler.findTodaysNotesEmail(handler.getWritableDatabase());


        String emailAddress = "robbiebarnes8@gmail.com";
        String emailSubject = "Today's Notes: " + today;
        String msgBody = "Notes: \n" + todaysNotes;

        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setData(Uri.parse("mailto:"));
        emailIntent.setType("text/plain");

        emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] { emailAddress });
        emailIntent.putExtra(Intent.EXTRA_TEXT, msgBody);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, emailSubject);

        try {
            startActivity(Intent.createChooser(emailIntent, "Send Email..."));
        }
        catch (Exception e) {
            Toast.makeText(getApplicationContext(), "Problem sending email", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public void OnNotesToMainButtonClick(View V) {
        Intent myIntent = new Intent(this, MainActivity.class);

        if(USE_FLAG)
            myIntent.addFlags(mFlag);

        startActivity(myIntent);
    }
}
