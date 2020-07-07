package com.example.kok_checklist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Query extends AppCompatActivity {


    TextView querytextView;


    KOKChecklistDBHandler handler;

    private static final boolean USE_FLAG = true;
    private static final int mFlag = Intent.FLAG_ACTIVITY_REORDER_TO_FRONT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_query);

        Log.d("QueryActivity:", "Starting Query page.");

        querytextView = findViewById(R.id.queryTextView);
        querytextView.setMovementMethod(new ScrollingMovementMethod());




        handler = new KOKChecklistDBHandler(this);







    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public void OnQueryToMainButtonClick(View v) {
        Intent myIntent = new Intent(this, MainActivity.class);

        if(USE_FLAG)
            myIntent.addFlags(mFlag);

        startActivity(myIntent);
    }

    public void onEmailClick(View v) {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        String today = dateFormat.format(date);

        List<Integer> employeesIDs = handler.findWorkingEmployeesIDs(handler.getWritableDatabase());
        String workingEmployees = "";
        for(int i : employeesIDs){
            workingEmployees += handler.printEmployeeTasksDoneToday(handler.getWritableDatabase(), i);
        }

        String notCompleted = handler.printEmployeeTasksNotDoneToday(handler.getWritableDatabase());

        String emailAddress = "robbiebarnes8@gmail.com";
        String emailSubject = "Today's Checklist: " + today;
        String msgBody = "Completed Today: \n" + workingEmployees + "\n\n\n\nNot Completed Today: \n" + notCompleted;

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

    public void onRadioButtonClicked(View v) {
        boolean checked = ((RadioButton) v).isChecked();

        switch(v.getId()) {
            case R.id.radioButton1:
                if(checked) {
                    String name = handler.findWorkingEmployees(handler.getWritableDatabase());
                    querytextView.setText(name);
                }

                break;
            case R.id.radioButton2:
                if(checked) {
                    String tasks = handler.findCompletedTasks(handler.getWritableDatabase());
                    querytextView.setText(tasks);
                }

                break;
        }
    }
}
