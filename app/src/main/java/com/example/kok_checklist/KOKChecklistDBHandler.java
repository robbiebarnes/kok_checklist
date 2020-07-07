package com.example.kok_checklist;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.graphics.BitmapFactory;
import android.util.Log;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class KOKChecklistDBHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 19;
    private static final String DATABASE_NAME = "kokChecklistDB.db";

    // JOBS Table
    private static final String TABLE_JOBS = "JOBS";
    private static final String COLUMN_JOBID = "jobID";
    private static final String COLUMN_TITLE = "title";

    // SHIFTS Table
    private static final String TABLE_SHIFTS = "SHIFTS";
    private static final String COLUMN_SHIFTID = "shiftID";
    private static final String COLUMN_SHIFTNAME = "shiftName";

    // EMPLOYEE TABLE
    private static final String TABLE_EMPLOYEE = "EMPLOYEE";
    private static final String COLUMN_EMPLOYEEID = "employeeID";
    private static final String COLUMN_FIRSTNAME = "firstName";
    private static final String COLUMN_LASTNAME = "lastName";
    private static final String COLUMN_INITIALS = "initials";

    // TASKS TABLE
    private static final String TABLE_TASKS = "TASKS";
    private static final String COLUMN_TASKID = "taskID";
    private static final String COLUMN_TASKNAME = "taskName";

    // TASKS_LOG Table
    private static final String TABLE_TASKS_LOG = "TASKS_LOG";
    private static final String COLUMN_LOGID = "logID";
    private static final String COLUMN_TASK_IMAGE = "taskImage";
    private static final String COLUMN_LOG_DATE = "logDate";

    // NOTES Table
    private static final String TABLE_NOTES = "NOTES";
    private static final String COLUMN_NOTESID = "notesID";
    private static final String COLUMN_NOTE = "note";



    public KOKChecklistDBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override
    public void onCreate(SQLiteDatabase db) {
        // JOBS Table
        String CREATE_JOBS_TABLE = "CREATE TABLE " +
                TABLE_JOBS + "(" +
                COLUMN_JOBID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_TITLE + " VARCHAR(10) NOT NULL)";

        db.execSQL(CREATE_JOBS_TABLE);

        // SHIFTS Table
        String CREATE_SHIFTS_TABLE = "CREATE TABLE " +
                TABLE_SHIFTS + "(" +
                COLUMN_SHIFTID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_SHIFTNAME + " VARCHAR(10) NOT NULL)";

        db.execSQL(CREATE_SHIFTS_TABLE);

        // EMPLOYEE Table
        String CREATE_EMPLOYEE_TABLE = "CREATE TABLE " +
                TABLE_EMPLOYEE + "(" +
                COLUMN_EMPLOYEEID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_FIRSTNAME + " VARCHAR(50) NOT NULL, " +
                COLUMN_LASTNAME + " VARCHAR(50) NOT NULL, " +
                COLUMN_INITIALS + " VARCHAR(2) NOT NULL, " +
                COLUMN_JOBID + " INTEGER NOT NULL, FOREIGN KEY(" + COLUMN_JOBID + ") REFERENCES " + TABLE_JOBS + "(" + COLUMN_JOBID + "))";

        db.execSQL(CREATE_EMPLOYEE_TABLE);

        // TASKS Table
        String CREATE_TASKS_TABLE = "CREATE TABLE " +
                TABLE_TASKS + "(" +
                COLUMN_TASKID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_TASKNAME + " VARCHAR(100) NOT NULL, " +
                COLUMN_JOBID + " INTEGER NOT NULL, " +
                COLUMN_SHIFTID + " INTEGER NOT NULL, " +
                "FOREIGN KEY(" + COLUMN_JOBID + ") REFERENCES " + TABLE_JOBS + "(" + COLUMN_JOBID + "), " +
                "FOREIGN KEY(" + COLUMN_SHIFTID + ") REFERENCES " + TABLE_SHIFTS + "(" + COLUMN_SHIFTID + "))";

        db.execSQL(CREATE_TASKS_TABLE);

        // TASKS_LOG Table
        String CREATE_TASKS_LOG_TABLE = "CREATE TABLE " +
                TABLE_TASKS_LOG + "(" +
                COLUMN_LOGID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_EMPLOYEEID + " INTEGER NOT NULL, " +
                COLUMN_TASKID + " INTEGER NOT NULL, " +
                COLUMN_TASK_IMAGE + " BLOB, " +
                COLUMN_JOBID + " INTEGER NOT NULL, " +
                COLUMN_LOG_DATE + " DATE NOT NULL, " +
                "FOREIGN KEY(" + COLUMN_EMPLOYEEID + ") REFERENCES " + TABLE_EMPLOYEE + "(" + COLUMN_EMPLOYEEID + "), " +
                "FOREIGN KEY(" + COLUMN_TASKID + ") REFERENCES " + TABLE_TASKS + "(" + COLUMN_TASKID + "), " +
                "FOREIGN KEY(" + COLUMN_JOBID + ") REFERENCES " + TABLE_JOBS + "(" + COLUMN_JOBID + "))";

        db.execSQL(CREATE_TASKS_LOG_TABLE);

        // NOTES Table
        String CREATE_NOTES_TABLE = "CREATE TABLE " +
                TABLE_NOTES + "(" +
                COLUMN_NOTESID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NOTE + " VARCHAR(500) NOT NULL, " +
                COLUMN_LOG_DATE + " DATE NOT NULL)";
        db.execSQL(CREATE_NOTES_TABLE);

        addJobs(db);
        addShifts(db);
        addEmployee(db);
        addTasks(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_JOBS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SHIFTS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_EMPLOYEE);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_TASKS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_TASKS_LOG);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NOTES);

        onCreate(db);

    }

    // Add jobs to JOBS Table in the DB
    public void addJobs(SQLiteDatabase db) {
        ContentValues bartender = new ContentValues();
        bartender.put(COLUMN_TITLE, "Bartender");

        ContentValues server = new ContentValues();
        server.put(COLUMN_TITLE, "Server");

        ContentValues barback = new ContentValues();
        barback.put(COLUMN_TITLE, "Barback");

        ContentValues security = new ContentValues();
        security.put(COLUMN_TITLE, "Security");


        db.insert(TABLE_JOBS, null, bartender);
        db.insert(TABLE_JOBS, null, server);
        db.insert(TABLE_JOBS, null, barback);
        db.insert(TABLE_JOBS, null, security);

        //db.close();
    }

    // Add shifts to SHIFTS Table in the DB
    public void addShifts(SQLiteDatabase db) {
        ContentValues open = new ContentValues();
        open.put(COLUMN_SHIFTNAME, "Open");

        ContentValues all = new ContentValues();
        all.put(COLUMN_SHIFTNAME, "All");

        ContentValues hh = new ContentValues();
        hh.put(COLUMN_SHIFTNAME, "Happy Hour");

        ContentValues close = new ContentValues();
        close.put(COLUMN_SHIFTNAME, "Close");


        db.insert(TABLE_SHIFTS, null, open);
        db.insert(TABLE_SHIFTS, null, all);
        db.insert(TABLE_SHIFTS, null, hh);
        db.insert(TABLE_SHIFTS, null, close);

        //db.close();
    }

    // Add employees to EMPLOYEE Table in the DB
    public void addEmployee(SQLiteDatabase db) {
        ContentValues robbie = new ContentValues();
        robbie.put(COLUMN_FIRSTNAME, "Robbie");
        robbie.put(COLUMN_LASTNAME, "Barnes");
        robbie.put(COLUMN_INITIALS, "RB");
        robbie.put(COLUMN_JOBID, 1);

        ContentValues joey = new ContentValues();
        joey.put(COLUMN_FIRSTNAME, "Joey");
        joey.put(COLUMN_LASTNAME, "Risselmann");
        joey.put(COLUMN_INITIALS, "JR");
        joey.put(COLUMN_JOBID, 2);

        ContentValues matt = new ContentValues();
        matt.put(COLUMN_FIRSTNAME, "Matt");
        matt.put(COLUMN_LASTNAME, "Burke");
        matt.put(COLUMN_INITIALS, "MB");
        matt.put(COLUMN_JOBID, 4);

        ContentValues steve = new ContentValues();
        steve.put(COLUMN_FIRSTNAME, "Steve");
        steve.put(COLUMN_LASTNAME, "Regan");
        steve.put(COLUMN_INITIALS, "SR");
        steve.put(COLUMN_JOBID, 3);



        db.insert(TABLE_EMPLOYEE, null, robbie);
        db.insert(TABLE_EMPLOYEE, null, joey);
        db.insert(TABLE_EMPLOYEE, null, matt);
        db.insert(TABLE_EMPLOYEE, null, steve);

        //db.close();
    }

    // Add tasks to TASKS Table in the DB
    public void addTasks(SQLiteDatabase db) {
        // Server Tasks
        ContentValues serverOpen1 = new ContentValues();
        serverOpen1.put(COLUMN_TASKNAME, "Clock in and check with manager");
        serverOpen1.put(COLUMN_JOBID, 2);
        serverOpen1.put(COLUMN_SHIFTID, 1);

        ContentValues serverOpen2 = new ContentValues();
        serverOpen2.put(COLUMN_TASKNAME, "Clean, sanitize and organize server station");
        serverOpen2.put(COLUMN_JOBID, 2);
        serverOpen2.put(COLUMN_SHIFTID, 1);

        ContentValues serverOpen3 = new ContentValues();
        serverOpen3.put(COLUMN_TASKNAME, "Clean and santize all tables (downstairs, front and back patio)");
        serverOpen3.put(COLUMN_JOBID, 2);
        serverOpen3.put(COLUMN_SHIFTID, 1);

        ContentValues serverOpen4 = new ContentValues();
        serverOpen4.put(COLUMN_TASKNAME, "Verify bathrooms were cleaned and stocked the night before");
        serverOpen4.put(COLUMN_JOBID, 2);
        serverOpen4.put(COLUMN_SHIFTID, 1);

        ContentValues serverOpen5 = new ContentValues();
        serverOpen5.put(COLUMN_TASKNAME, "Refill caddies with salt/pepper shakers, ketchup, mustard, hot sauce and napkins. Wipe down caddies and bottles.");
        serverOpen5.put(COLUMN_JOBID, 2);
        serverOpen5.put(COLUMN_SHIFTID, 1);

        ContentValues serverOpen6 = new ContentValues();
        serverOpen6.put(COLUMN_TASKNAME, "Put caddies on the tables");
        serverOpen6.put(COLUMN_JOBID, 2);
        serverOpen6.put(COLUMN_SHIFTID, 1);

        ContentValues serverOpen7 = new ContentValues();
        serverOpen7.put(COLUMN_TASKNAME, "Clean/roll silverware");
        serverOpen7.put(COLUMN_JOBID, 2);
        serverOpen7.put(COLUMN_SHIFTID, 1);

        ContentValues serverOpen8 = new ContentValues();
        serverOpen8.put(COLUMN_TASKNAME, "Clean the tea machine and make tea");
        serverOpen8.put(COLUMN_JOBID, 2);
        serverOpen8.put(COLUMN_SHIFTID, 1);

        ContentValues serverOpen9 = new ContentValues();
        serverOpen9.put(COLUMN_TASKNAME, "Clean the coffee machine and make coffee");
        serverOpen9.put(COLUMN_JOBID, 2);
        serverOpen9.put(COLUMN_SHIFTID, 1);

        ContentValues serverOpen10 = new ContentValues();
        serverOpen10.put(COLUMN_TASKNAME, "Stock server station (i.e. napkins, condiments, sugar, rolled silverware etc.)");
        serverOpen10.put(COLUMN_JOBID, 2);
        serverOpen10.put(COLUMN_SHIFTID, 1);

        ContentValues serverOpen11 = new ContentValues();
        serverOpen11.put(COLUMN_TASKNAME, "Set front patio up by bringing tall tables outside and using red and white stools. Set up back patio by spreading out the chairs and tables. Wipe down tables and add caddies.");
        serverOpen11.put(COLUMN_JOBID, 2);
        serverOpen11.put(COLUMN_SHIFTID, 1);

        ContentValues serverOpen12 = new ContentValues();
        serverOpen12.put(COLUMN_TASKNAME, "Clean off menus and check books if needed");
        serverOpen12.put(COLUMN_JOBID, 2);
        serverOpen12.put(COLUMN_SHIFTID, 1);

        ContentValues serverOpen13 = new ContentValues();
        serverOpen13.put(COLUMN_TASKNAME, "Clean and sanitize trays");
        serverOpen13.put(COLUMN_JOBID, 2);
        serverOpen13.put(COLUMN_SHIFTID, 1);

        ContentValues serverOpen14 = new ContentValues();
        serverOpen14.put(COLUMN_TASKNAME, "Put out chalkboards");
        serverOpen14.put(COLUMN_JOBID, 2);
        serverOpen14.put(COLUMN_SHIFTID, 1);

        ContentValues serverOpen15 = new ContentValues();
        serverOpen15.put(COLUMN_TASKNAME, "Turn on tvs");
        serverOpen15.put(COLUMN_JOBID, 2);
        serverOpen15.put(COLUMN_SHIFTID, 1);


        ContentValues serverAll1 = new ContentValues();
        serverAll1.put(COLUMN_TASKNAME, "Keep server station clean");
        serverAll1.put(COLUMN_JOBID, 2);
        serverAll1.put(COLUMN_SHIFTID, 2);

        ContentValues serverAll2 = new ContentValues();
        serverAll2.put(COLUMN_TASKNAME, "Make tea and coffee as needed");
        serverAll2.put(COLUMN_JOBID, 2);
        serverAll2.put(COLUMN_SHIFTID, 2);

        ContentValues serverAll3 = new ContentValues();
        serverAll3.put(COLUMN_TASKNAME, "Mop floors and pick up spills when occur");
        serverAll3.put(COLUMN_JOBID, 2);
        serverAll3.put(COLUMN_SHIFTID, 2);

        ContentValues serverAll4 = new ContentValues();
        serverAll4.put(COLUMN_TASKNAME, "Bus and wipe down tables. Keep restocking napkins as needed");
        serverAll4.put(COLUMN_JOBID, 2);
        serverAll4.put(COLUMN_SHIFTID, 2);


        ContentValues serverHH1 = new ContentValues();
        serverHH1.put(COLUMN_TASKNAME, "Clean and roll silverware");
        serverHH1.put(COLUMN_JOBID, 2);
        serverHH1.put(COLUMN_SHIFTID, 3);

        ContentValues serverHH2 = new ContentValues();
        serverHH2.put(COLUMN_TASKNAME, "Check bathrooms to clean or restock soap and toilet paper");
        serverHH2.put(COLUMN_JOBID, 2);
        serverHH2.put(COLUMN_SHIFTID, 3);

        ContentValues serverHH3 = new ContentValues();
        serverHH3.put(COLUMN_TASKNAME, "Clean and sanitize tables used (in all areas)");
        serverHH3.put(COLUMN_JOBID, 2);
        serverHH3.put(COLUMN_SHIFTID, 3);

        ContentValues serverHH4 = new ContentValues();
        serverHH4.put(COLUMN_TASKNAME, "Empty bus tubs if needed");
        serverHH4.put(COLUMN_JOBID, 2);
        serverHH4.put(COLUMN_SHIFTID, 3);

        ContentValues serverHH5 = new ContentValues();
        serverHH5.put(COLUMN_TASKNAME, "Clean menus and guest books used");
        serverHH5.put(COLUMN_JOBID, 2);
        serverHH5.put(COLUMN_SHIFTID, 3);

        ContentValues serverHH6 = new ContentValues();
        serverHH6.put(COLUMN_TASKNAME, "Clean and fill all condiments (ketchup, mustard, hot sauce)");
        serverHH6.put(COLUMN_JOBID, 2);
        serverHH6.put(COLUMN_SHIFTID, 3);

        ContentValues serverHH7 = new ContentValues();
        serverHH7.put(COLUMN_TASKNAME, "Check out with manager, incoming server, and clock out");
        serverHH7.put(COLUMN_JOBID, 2);
        serverHH7.put(COLUMN_SHIFTID, 3);


        ContentValues serverClose1 = new ContentValues();
        serverClose1.put(COLUMN_TASKNAME, "Clean/roll silverware");
        serverClose1.put(COLUMN_JOBID, 2);
        serverClose1.put(COLUMN_SHIFTID, 4);

        ContentValues serverClose2 = new ContentValues();
        serverClose2.put(COLUMN_TASKNAME, "Clean and sanitize tables and chairs (in all areas)");
        serverClose2.put(COLUMN_JOBID, 2);
        serverClose2.put(COLUMN_SHIFTID, 4);

        ContentValues serverClose3 = new ContentValues();
        serverClose3.put(COLUMN_TASKNAME, "Clean off server stations and restock; wope down shelves every night");
        serverClose3.put(COLUMN_JOBID, 2);
        serverClose3.put(COLUMN_SHIFTID, 4);

        ContentValues serverClose4 = new ContentValues();
        serverClose4.put(COLUMN_TASKNAME, "Empty tea and coffee");
        serverClose4.put(COLUMN_JOBID, 2);
        serverClose4.put(COLUMN_SHIFTID, 4);

        ContentValues serverClose5 = new ContentValues();
        serverClose5.put(COLUMN_TASKNAME, "Clean all trays, menus and guest books");
        serverClose5.put(COLUMN_JOBID, 2);
        serverClose5.put(COLUMN_SHIFTID, 4);

        ContentValues serverClose6 = new ContentValues();
        serverClose6.put(COLUMN_TASKNAME, "Leave Kilroy's completely clean and ready for the lunch the next day");
        serverClose6.put(COLUMN_JOBID, 2);
        serverClose6.put(COLUMN_SHIFTID, 4);

        ContentValues serverClose7 = new ContentValues();
        serverClose7.put(COLUMN_TASKNAME, "Tell management about anything out of stock or broken");
        serverClose7.put(COLUMN_JOBID, 2);
        serverClose7.put(COLUMN_SHIFTID, 4);

        ContentValues serverClose8 = new ContentValues();
        serverClose8.put(COLUMN_TASKNAME, "Clean bathrooms and restock any necessary items");
        serverClose8.put(COLUMN_JOBID, 2);
        serverClose8.put(COLUMN_SHIFTID, 4);

        ContentValues serverClose9 = new ContentValues();
        serverClose9.put(COLUMN_TASKNAME, "Wipe off all computer screens");
        serverClose9.put(COLUMN_JOBID, 2);
        serverClose9.put(COLUMN_SHIFTID, 4);

        ContentValues serverClose10 = new ContentValues();
        serverClose10.put(COLUMN_TASKNAME, "Check out with closing manager and clock out");
        serverClose10.put(COLUMN_JOBID, 2);
        serverClose10.put(COLUMN_SHIFTID, 4);

        ContentValues bartenderopen1 = new ContentValues();
        bartenderopen1.put(COLUMN_TASKNAME, "Bring down all matts, fruit, straws and steels. Prepare for a busy shift");
        bartenderopen1.put(COLUMN_JOBID, 1);
        bartenderopen1.put(COLUMN_SHIFTID, 1);

        ContentValues bartenderopen2 = new ContentValues();
        bartenderopen2.put(COLUMN_TASKNAME, "Turn on all lights and neon signs");
        bartenderopen2.put(COLUMN_JOBID, 1);
        bartenderopen2.put(COLUMN_SHIFTID, 1);

        ContentValues bartenderopen3 = new ContentValues();
        bartenderopen3.put(COLUMN_TASKNAME, "Marry glassware and bring down extra glass depending on special for today");
        bartenderopen3.put(COLUMN_JOBID, 1);
        bartenderopen3.put(COLUMN_SHIFTID, 1);

        ContentValues bartenderopen4 = new ContentValues();
        bartenderopen4.put(COLUMN_TASKNAME, "Trash cans are empty and put back in determined spots");
        bartenderopen4.put(COLUMN_JOBID, 1);
        bartenderopen4.put(COLUMN_SHIFTID, 1);

        ContentValues bartenderopen5 = new ContentValues();
        bartenderopen5.put(COLUMN_TASKNAME, "Wipe down the Bar and put all bar stools out");
        bartenderopen5.put(COLUMN_JOBID, 1);
        bartenderopen5.put(COLUMN_SHIFTID, 1);

        ContentValues bartenderopen6 = new ContentValues();
        bartenderopen6.put(COLUMN_TASKNAME, "Fill wells with ice");
        bartenderopen6.put(COLUMN_JOBID, 1);
        bartenderopen6.put(COLUMN_SHIFTID, 1);

        ContentValues bartenderopen7 = new ContentValues();
        bartenderopen7.put(COLUMN_TASKNAME, "Chillers are stocked");
        bartenderopen7.put(COLUMN_JOBID, 1);
        bartenderopen7.put(COLUMN_SHIFTID, 1);

        ContentValues bartenderopen8 = new ContentValues();
        bartenderopen8.put(COLUMN_TASKNAME, "Make sure server is well prepared with everything that they might need for day part");
        bartenderopen8.put(COLUMN_JOBID, 1);
        bartenderopen8.put(COLUMN_SHIFTID, 1);

        ContentValues bartenderopen9 = new ContentValues();
        bartenderopen9.put(COLUMN_TASKNAME, "Ask manager if there is anything else they would like done");
        bartenderopen9.put(COLUMN_JOBID, 1);
        bartenderopen9.put(COLUMN_SHIFTID, 1);

        ContentValues bartenderAll1 = new ContentValues();
        bartenderAll1.put(COLUMN_TASKNAME, "Keep all wells full of ice");
        bartenderAll1.put(COLUMN_JOBID, 1);
        bartenderAll1.put(COLUMN_SHIFTID, 2);

        ContentValues bartenderAll2 = new ContentValues();
        bartenderAll2.put(COLUMN_TASKNAME, "Keep bar top clean");
        bartenderAll2.put(COLUMN_JOBID, 1);
        bartenderAll2.put(COLUMN_SHIFTID, 2);

        ContentValues bartenderAll3 = new ContentValues();
        bartenderAll3.put(COLUMN_TASKNAME, "Organize/stock wells and chillers.");
        bartenderAll3.put(COLUMN_JOBID, 1);
        bartenderAll3.put(COLUMN_SHIFTID, 2);

        ContentValues bartenderAll4 = new ContentValues();
        bartenderAll4.put(COLUMN_TASKNAME, "Continue to stock beer tubs");
        bartenderAll4.put(COLUMN_JOBID, 1);
        bartenderAll4.put(COLUMN_SHIFTID, 2);

        ContentValues bartenderAll5 = new ContentValues();
        bartenderAll5.put(COLUMN_TASKNAME, "Continue to stock red bull");
        bartenderAll5.put(COLUMN_JOBID, 1);
        bartenderAll5.put(COLUMN_SHIFTID, 2);

        ContentValues bartenderAll6 = new ContentValues();
        bartenderAll6.put(COLUMN_TASKNAME, "Organize money and make 20 stacks");
        bartenderAll6.put(COLUMN_JOBID, 1);
        bartenderAll6.put(COLUMN_SHIFTID, 2);

        ContentValues bartenderAll7 = new ContentValues();
        bartenderAll7.put(COLUMN_TASKNAME, "Stock straws, napkins, and glassware");
        bartenderAll7.put(COLUMN_JOBID, 1);
        bartenderAll7.put(COLUMN_SHIFTID, 2);

        ContentValues bartenderAll8 = new ContentValues();
        bartenderAll8.put(COLUMN_TASKNAME, "Keep bar clean and organized");
        bartenderAll8.put(COLUMN_JOBID, 1);
        bartenderAll8.put(COLUMN_SHIFTID, 2);

        ContentValues bartenderHH1 = new ContentValues();
        bartenderHH1.put(COLUMN_TASKNAME, "Bar should ne completely clean, organized, stocked, and ready for next shift and bartender. Next bartender should be completely set-up and ready to serve.");
        bartenderHH1.put(COLUMN_JOBID, 1);
        bartenderHH1.put(COLUMN_SHIFTID, 3);

        ContentValues bartenderHH2 = new ContentValues();
        bartenderHH2.put(COLUMN_TASKNAME, "Check out with incoming bartender and manager");
        bartenderHH2.put(COLUMN_JOBID, 1);
        bartenderHH2.put(COLUMN_SHIFTID, 3);

        ContentValues bartenderHH3 = new ContentValues();
        bartenderHH3.put(COLUMN_TASKNAME, "Banks and checkouts turned in to the manager");
        bartenderHH3.put(COLUMN_JOBID, 1);
        bartenderHH3.put(COLUMN_SHIFTID, 3);

        ContentValues bartenderHH4 = new ContentValues();
        bartenderHH4.put(COLUMN_TASKNAME, "Wait for manager to count your bank if available");
        bartenderHH4.put(COLUMN_JOBID, 1);
        bartenderHH4.put(COLUMN_SHIFTID, 3);

        ContentValues bartenderHH5 = new ContentValues();
        bartenderHH5.put(COLUMN_TASKNAME, "Clock out (your shift is not done until bar is completely ready)");
        bartenderHH5.put(COLUMN_JOBID, 1);
        bartenderHH5.put(COLUMN_SHIFTID, 3);

        ContentValues bartenderClose1 = new ContentValues();
        bartenderClose1.put(COLUMN_TASKNAME, "Marry Glassware");
        bartenderClose1.put(COLUMN_JOBID, 1);
        bartenderClose1.put(COLUMN_SHIFTID, 4);

        ContentValues bartenderClose2 = new ContentValues();
        bartenderClose2.put(COLUMN_TASKNAME, "Clean well bottles, burn and sanitize all wells");
        bartenderClose2.put(COLUMN_JOBID, 1);
        bartenderClose2.put(COLUMN_SHIFTID, 4);

        ContentValues bartenderClose3 = new ContentValues();
        bartenderClose3.put(COLUMN_TASKNAME, "Wipe doen all liquor bottles and put in correct spot, organized, and marry duplicates");
        bartenderClose3.put(COLUMN_JOBID, 1);
        bartenderClose3.put(COLUMN_SHIFTID, 4);

        ContentValues bartenderClose4 = new ContentValues();
        bartenderClose4.put(COLUMN_TASKNAME, "Marry, restock, wipe down chillers and liquor bottles");
        bartenderClose4.put(COLUMN_JOBID, 1);
        bartenderClose4.put(COLUMN_SHIFTID, 4);

        ContentValues bartenderClose5 = new ContentValues();
        bartenderClose5.put(COLUMN_TASKNAME, "Clean beer grate and under pints with a pitcher if hot water and completely dry off");
        bartenderClose5.put(COLUMN_JOBID, 1);
        bartenderClose5.put(COLUMN_SHIFTID, 4);

        ContentValues bartenderClose6 = new ContentValues();
        bartenderClose6.put(COLUMN_TASKNAME, "Clean soda gun and holsters");
        bartenderClose6.put(COLUMN_JOBID, 1);
        bartenderClose6.put(COLUMN_SHIFTID, 4);

        ContentValues bartenderClose7 = new ContentValues();
        bartenderClose7.put(COLUMN_TASKNAME, "Restock well liquor");
        bartenderClose7.put(COLUMN_JOBID, 1);
        bartenderClose7.put(COLUMN_SHIFTID, 4);

        ContentValues bartenderClose8 = new ContentValues();
        bartenderClose8.put(COLUMN_TASKNAME, "Clean mirror behind the bar with Windex and paper towels(if you are at new bar)");
        bartenderClose8.put(COLUMN_JOBID, 1);
        bartenderClose8.put(COLUMN_SHIFTID, 4);

        ContentValues bartenderClose9 = new ContentValues();
        bartenderClose9.put(COLUMN_TASKNAME, "Dump ice, replace bus tubs, and straighten bottle beer tubs");
        bartenderClose9.put(COLUMN_JOBID, 1);
        bartenderClose9.put(COLUMN_SHIFTID, 4);

        ContentValues bartenderClose10 = new ContentValues();
        bartenderClose10.put(COLUMN_TASKNAME, "Clean and wipe down all computers and hardware with water and towel");
        bartenderClose10.put(COLUMN_JOBID, 1);
        bartenderClose10.put(COLUMN_SHIFTID, 4);

        ContentValues bartenderClose11 = new ContentValues();
        bartenderClose11.put(COLUMN_TASKNAME, "Clean and sanitize all bar top and back bar");
        bartenderClose11.put(COLUMN_JOBID, 1);
        bartenderClose11.put(COLUMN_SHIFTID, 4);

        ContentValues bartenderClose12 = new ContentValues();
        bartenderClose12.put(COLUMN_TASKNAME, "Restock 32s");
        bartenderClose12.put(COLUMN_JOBID, 1);
        bartenderClose12.put(COLUMN_SHIFTID, 4);

        ContentValues bartenderClose13 = new ContentValues();
        bartenderClose13.put(COLUMN_TASKNAME, "Bleach mop entire floor");
        bartenderClose13.put(COLUMN_JOBID, 1);
        bartenderClose13.put(COLUMN_SHIFTID, 4);

        ContentValues bartenderClose14 = new ContentValues();
        bartenderClose14.put(COLUMN_TASKNAME, "Remove floor mats, trash cans, beer tubs and pick up floor");
        bartenderClose14.put(COLUMN_JOBID, 1);
        bartenderClose14.put(COLUMN_SHIFTID, 4);

        ContentValues bartenderClose15 = new ContentValues();
        bartenderClose15.put(COLUMN_TASKNAME, "Make sure all glassware, mats and towels are bussed upstairs");
        bartenderClose15.put(COLUMN_JOBID, 1);
        bartenderClose15.put(COLUMN_SHIFTID, 4);

        ContentValues bartenderClose16 = new ContentValues();
        bartenderClose16.put(COLUMN_TASKNAME, "Turn in radios to barback room");
        bartenderClose16.put(COLUMN_JOBID, 1);
        bartenderClose16.put(COLUMN_SHIFTID, 4);

        ContentValues bartenderClose17 = new ContentValues();
        bartenderClose17.put(COLUMN_TASKNAME, "Tell management about anything broken and make sure bar is ready for open");
        bartenderClose17.put(COLUMN_JOBID, 1);
        bartenderClose17.put(COLUMN_SHIFTID, 4);

        ContentValues barbackopen1 = new ContentValues();
        barbackopen1.put(COLUMN_TASKNAME, "Bring down all matts, fruit, straws and steels. Prepare for a busy shift");
        barbackopen1.put(COLUMN_JOBID, 3);
        barbackopen1.put(COLUMN_SHIFTID, 1);

        ContentValues barbackopen2 = new ContentValues();
        barbackopen2.put(COLUMN_TASKNAME, "Turn on all lights and neon signs");
        barbackopen2.put(COLUMN_JOBID, 3);
        barbackopen2.put(COLUMN_SHIFTID, 1);

        ContentValues barbackopen3 = new ContentValues();
        barbackopen3.put(COLUMN_TASKNAME, "Marry glassware and bring down extra glass depending on special for today");
        barbackopen3.put(COLUMN_JOBID, 3);
        barbackopen3.put(COLUMN_SHIFTID, 1);

        ContentValues barbackopen4 = new ContentValues();
        barbackopen4.put(COLUMN_TASKNAME, "Trash cans are empty and put back in determined spots");
        barbackopen4.put(COLUMN_JOBID, 3);
        barbackopen4.put(COLUMN_SHIFTID, 1);

        ContentValues barbackopen5 = new ContentValues();
        barbackopen5.put(COLUMN_TASKNAME, "Wipe down the Bar and put all bar stools out");
        barbackopen5.put(COLUMN_JOBID, 3);
        barbackopen5.put(COLUMN_SHIFTID, 1);

        ContentValues barbackopen6 = new ContentValues();
        barbackopen6.put(COLUMN_TASKNAME, "Fill wells with ice");
        barbackopen6.put(COLUMN_JOBID, 3);
        barbackopen6.put(COLUMN_SHIFTID, 1);

        ContentValues barbackopen7 = new ContentValues();
        barbackopen7.put(COLUMN_TASKNAME, "Chillers are stocked");
        barbackopen7.put(COLUMN_JOBID, 3);
        barbackopen7.put(COLUMN_SHIFTID, 1);

        ContentValues barbackopen8 = new ContentValues();
        barbackopen8.put(COLUMN_TASKNAME, "Make sure server is well prepared with everything that they might need for day part");
        barbackopen8.put(COLUMN_JOBID, 3);
        barbackopen8.put(COLUMN_SHIFTID, 1);

        ContentValues barbackopen9 = new ContentValues();
        barbackopen9.put(COLUMN_TASKNAME, "Ask manager if there is anything else they would like done");
        barbackopen9.put(COLUMN_JOBID, 3);
        barbackopen9.put(COLUMN_SHIFTID, 1);

        ContentValues barbackAll1 = new ContentValues();
        barbackAll1.put(COLUMN_TASKNAME, "Keep all wells full of ice");
        barbackAll1.put(COLUMN_JOBID, 3);
        barbackAll1.put(COLUMN_SHIFTID, 2);

        ContentValues barbackAll2 = new ContentValues();
        barbackAll2.put(COLUMN_TASKNAME, "Keep bar top clean");
        barbackAll2.put(COLUMN_JOBID, 3);
        barbackAll2.put(COLUMN_SHIFTID, 2);

        ContentValues barbackAll3 = new ContentValues();
        barbackAll3.put(COLUMN_TASKNAME, "Organize/stock wells and chillers.");
        barbackAll3.put(COLUMN_JOBID, 3);
        barbackAll3.put(COLUMN_SHIFTID, 2);

        ContentValues barbackAll4 = new ContentValues();
        barbackAll4.put(COLUMN_TASKNAME, "Continue to stock beer tubs");
        barbackAll4.put(COLUMN_JOBID, 3);
        barbackAll4.put(COLUMN_SHIFTID, 2);

        ContentValues barbackAll5 = new ContentValues();
        barbackAll5.put(COLUMN_TASKNAME, "Continue to stock red bull");
        barbackAll5.put(COLUMN_JOBID, 3);
        barbackAll5.put(COLUMN_SHIFTID, 2);

        ContentValues barbackAll6 = new ContentValues();
        barbackAll6.put(COLUMN_TASKNAME, "Organize money and make 20 stacks");
        barbackAll6.put(COLUMN_JOBID, 3);
        barbackAll6.put(COLUMN_SHIFTID, 2);

        ContentValues barbackAll7 = new ContentValues();
        barbackAll7.put(COLUMN_TASKNAME, "Stock straws, napkins, and glassware");
        barbackAll7.put(COLUMN_JOBID, 3);
        barbackAll7.put(COLUMN_SHIFTID, 2);

        ContentValues barbackAll8 = new ContentValues();
        barbackAll8.put(COLUMN_TASKNAME, "Keep bar clean and organized");
        barbackAll8.put(COLUMN_JOBID, 3);
        barbackAll8.put(COLUMN_SHIFTID, 2);

        ContentValues barbackHH1 = new ContentValues();
        barbackHH1.put(COLUMN_TASKNAME, "Bar should ne completely clean, organized, stocked, and ready for next shift and bartender. Next bartender should be completely set-up and ready to serve.");
        barbackHH1.put(COLUMN_JOBID, 3);
        barbackHH1.put(COLUMN_SHIFTID, 3);

        ContentValues barbackHH2 = new ContentValues();
        barbackHH2.put(COLUMN_TASKNAME, "Check out with incoming bartender and manager");
        barbackHH2.put(COLUMN_JOBID, 3);
        barbackHH2.put(COLUMN_SHIFTID, 3);

        ContentValues barbackHH3 = new ContentValues();
        barbackHH3.put(COLUMN_TASKNAME, "Banks and checkouts turned in to the manager");
        barbackHH3.put(COLUMN_JOBID, 3);
        barbackHH3.put(COLUMN_SHIFTID, 3);

        ContentValues barbackHH4 = new ContentValues();
        barbackHH4.put(COLUMN_TASKNAME, "Wait for manager to count your bank if available");
        barbackHH4.put(COLUMN_JOBID, 3);
        barbackHH4.put(COLUMN_SHIFTID, 3);

        ContentValues barbackHH5 = new ContentValues();
        barbackHH5.put(COLUMN_TASKNAME, "Clock out (your shift is not done until bar is completely ready)");
        barbackHH5.put(COLUMN_JOBID, 3);
        barbackHH5.put(COLUMN_SHIFTID, 3);

        ContentValues barbackClose1 = new ContentValues();
        barbackClose1.put(COLUMN_TASKNAME, "Marry Glassware");
        barbackClose1.put(COLUMN_JOBID, 3);
        barbackClose1.put(COLUMN_SHIFTID, 4);

        ContentValues barbackClose2 = new ContentValues();
        barbackClose2.put(COLUMN_TASKNAME, "Clean well bottles, burn and sanitize all wells");
        barbackClose2.put(COLUMN_JOBID, 3);
        barbackClose2.put(COLUMN_SHIFTID, 4);

        ContentValues barbackClose3 = new ContentValues();
        barbackClose3.put(COLUMN_TASKNAME, "Wipe doen all liquor bottles and put in correct spot, organized, and marry duplicates");
        barbackClose3.put(COLUMN_JOBID, 3);
        barbackClose3.put(COLUMN_SHIFTID, 4);

        ContentValues barbackClose4 = new ContentValues();
        barbackClose4.put(COLUMN_TASKNAME, "Marry, restock, wipe down chillers and liquor bottles");
        barbackClose4.put(COLUMN_JOBID, 3);
        barbackClose4.put(COLUMN_SHIFTID, 4);

        ContentValues barbackClose5 = new ContentValues();
        barbackClose5.put(COLUMN_TASKNAME, "Clean beer grate and under pints with a pitcher if hot water and completely dry off");
        barbackClose5.put(COLUMN_JOBID, 3);
        barbackClose5.put(COLUMN_SHIFTID, 4);

        ContentValues barbackClose6 = new ContentValues();
        barbackClose6.put(COLUMN_TASKNAME, "Clean soda gun and holsters");
        barbackClose6.put(COLUMN_JOBID, 3);
        barbackClose6.put(COLUMN_SHIFTID, 4);

        ContentValues barbackClose7 = new ContentValues();
        barbackClose7.put(COLUMN_TASKNAME, "Restock well liquor");
        barbackClose7.put(COLUMN_JOBID, 3);
        barbackClose7.put(COLUMN_SHIFTID, 4);

        ContentValues barbackClose8 = new ContentValues();
        barbackClose8.put(COLUMN_TASKNAME, "Clean mirror behind the bar with Windex and paper towels(if you are at new bar)");
        barbackClose8.put(COLUMN_JOBID, 3);
        barbackClose8.put(COLUMN_SHIFTID, 4);

        ContentValues barbackClose9 = new ContentValues();
        barbackClose9.put(COLUMN_TASKNAME, "Dump ice, replace bus tubs, and straighten bottle beer tubs");
        barbackClose9.put(COLUMN_JOBID, 3);
        barbackClose9.put(COLUMN_SHIFTID, 4);

        ContentValues barbackClose10 = new ContentValues();
        barbackClose10.put(COLUMN_TASKNAME, "Clean and wipe down all computers and hardware with water and towel");
        barbackClose10.put(COLUMN_JOBID, 3);
        barbackClose10.put(COLUMN_SHIFTID, 4);

        ContentValues barbackClose11 = new ContentValues();
        barbackClose11.put(COLUMN_TASKNAME, "Clean and sanitize all bar top and back bar");
        barbackClose11.put(COLUMN_JOBID, 3);
        barbackClose11.put(COLUMN_SHIFTID, 4);

        ContentValues barbackClose12 = new ContentValues();
        barbackClose12.put(COLUMN_TASKNAME, "Restock 32s");
        barbackClose12.put(COLUMN_JOBID, 3);
        barbackClose12.put(COLUMN_SHIFTID, 4);

        ContentValues barbackClose13 = new ContentValues();
        barbackClose13.put(COLUMN_TASKNAME, "Bleach mop entire floor");
        barbackClose13.put(COLUMN_JOBID, 3);
        barbackClose13.put(COLUMN_SHIFTID, 4);

        ContentValues barbackClose14 = new ContentValues();
        barbackClose14.put(COLUMN_TASKNAME, "Remove floor mats, trash cans, beer tubs and pick up floor");
        barbackClose14.put(COLUMN_JOBID, 3);
        barbackClose14.put(COLUMN_SHIFTID, 4);

        ContentValues barbackClose15 = new ContentValues();
        barbackClose15.put(COLUMN_TASKNAME, "Make sure all glassware, mats and towels are bussed upstairs");
        barbackClose15.put(COLUMN_JOBID, 3);
        barbackClose15.put(COLUMN_SHIFTID, 4);

        ContentValues barbackClose16 = new ContentValues();
        barbackClose16.put(COLUMN_TASKNAME, "Turn in radios to barback room");
        barbackClose16.put(COLUMN_JOBID, 3);
        barbackClose16.put(COLUMN_SHIFTID, 4);

        ContentValues barbackClose17 = new ContentValues();
        barbackClose17.put(COLUMN_TASKNAME, "Tell management about anything broken and make sure bar is ready for open");
        barbackClose17.put(COLUMN_JOBID, 3);
        barbackClose17.put(COLUMN_SHIFTID, 4);

        ContentValues securityOpen1 = new ContentValues();
        securityOpen1.put(COLUMN_TASKNAME, "Set out all the stools and chairs at the tables and bars downstairs");
        securityOpen1.put(COLUMN_JOBID, 4);
        securityOpen1.put(COLUMN_SHIFTID, 1);

        ContentValues securityOpen2 = new ContentValues();
        securityOpen2.put(COLUMN_TASKNAME, "Turn on all Tv's");
        securityOpen2.put(COLUMN_JOBID, 4);
        securityOpen2.put(COLUMN_SHIFTID, 1);

        ContentValues securityOpen3 = new ContentValues();
        securityOpen3.put(COLUMN_TASKNAME, "Place carpet floor mats in front of doors, bathrooms and botton of stairs");
        securityOpen3.put(COLUMN_JOBID, 4);
        securityOpen3.put(COLUMN_SHIFTID, 1);

        ContentValues securityOpen4 = new ContentValues();
        securityOpen4.put(COLUMN_TASKNAME, "Bring down bus tubs to server stations");
        securityOpen4.put(COLUMN_JOBID, 4);
        securityOpen4.put(COLUMN_SHIFTID, 1);

        ContentValues securityOpen5 = new ContentValues();
        securityOpen5.put(COLUMN_TASKNAME, "Place trash cans at respective locations");
        securityOpen5.put(COLUMN_JOBID, 4);
        securityOpen5.put(COLUMN_SHIFTID, 1);

        ContentValues securityAll1 = new ContentValues();
        securityAll1.put(COLUMN_TASKNAME, "Take trash out when it gets full (either at server stations, outside the kitchen or the bottom of back stairs)");
        securityAll1.put(COLUMN_JOBID, 4);
        securityAll1.put(COLUMN_SHIFTID, 2);

        ContentValues securityAll2 = new ContentValues();
        securityAll2.put(COLUMN_TASKNAME, "Take bus tubs up to the barback area once full (remember to take an empty one down with you)");
        securityAll2.put(COLUMN_JOBID, 4);
        securityAll2.put(COLUMN_SHIFTID, 2);

        ContentValues securityAll3 = new ContentValues();
        securityAll3.put(COLUMN_TASKNAME, "Count Expo Tickets at the end of each ticket log shift");
        securityAll3.put(COLUMN_JOBID, 4);
        securityAll3.put(COLUMN_SHIFTID, 2);

        ContentValues securityAll4 = new ContentValues();
        securityAll4.put(COLUMN_TASKNAME, "Make sure doors are being watched and no one enters through an exit-only door");
        securityAll4.put(COLUMN_JOBID, 4);
        securityAll4.put(COLUMN_SHIFTID, 2);

        ContentValues securityAll5 = new ContentValues();
        securityAll5.put(COLUMN_TASKNAME, "Bus tables (we do not throw out any dish, only plastic disposable cups)");
        securityAll5.put(COLUMN_JOBID, 4);
        securityAll5.put(COLUMN_SHIFTID, 2);

        ContentValues securityAll6 = new ContentValues();
        securityAll6.put(COLUMN_TASKNAME, "Spot sweep around tables");
        securityAll6.put(COLUMN_JOBID, 4);
        securityAll6.put(COLUMN_SHIFTID, 2);

        ContentValues securityHH1 = new ContentValues();
        securityHH1.put(COLUMN_TASKNAME, "Take out all available full trash cans (only use the compactor)");
        securityHH1.put(COLUMN_JOBID, 4);
        securityHH1.put(COLUMN_SHIFTID, 3);

        ContentValues securityHH2 = new ContentValues();
        securityHH2.put(COLUMN_TASKNAME, "Bus up available full bus tubs to the barback room");
        securityHH2.put(COLUMN_JOBID, 4);
        securityHH2.put(COLUMN_SHIFTID, 3);

        ContentValues securityHH3 = new ContentValues();
        securityHH3.put(COLUMN_TASKNAME, "Sweep the floor");
        securityHH3.put(COLUMN_JOBID, 4);
        securityHH3.put(COLUMN_SHIFTID, 3);

        ContentValues securityHH4 = new ContentValues();
        securityHH4.put(COLUMN_TASKNAME, "Wait for workers from the next shift to relieve you");
        securityHH4.put(COLUMN_JOBID, 4);
        securityHH4.put(COLUMN_SHIFTID, 3);

        ContentValues securityHH5 = new ContentValues();
        securityHH5.put(COLUMN_TASKNAME, "Clock out");
        securityHH5.put(COLUMN_JOBID, 4);
        securityHH5.put(COLUMN_SHIFTID, 3);

        ContentValues securityClose1 = new ContentValues();
        securityClose1.put(COLUMN_TASKNAME, "Bus Tubs (dishes and glassware) bussed upstairs to barbacks");
        securityClose1.put(COLUMN_JOBID, 4);
        securityClose1.put(COLUMN_SHIFTID, 4);

        ContentValues securityClose2 = new ContentValues();
        securityClose2.put(COLUMN_TASKNAME, "All bus tubs are taken up at the end of close (i.e. no empty tubs are left out at server stations overnight)");
        securityClose2.put(COLUMN_JOBID, 4);
        securityClose2.put(COLUMN_SHIFTID, 4);

        ContentValues securityClose3 = new ContentValues();
        securityClose3.put(COLUMN_TASKNAME, "All stools and chairs are stacked on top of tables (tables are NOT pushed to the side)");
        securityClose3.put(COLUMN_JOBID, 4);
        securityClose3.put(COLUMN_SHIFTID, 4);

        ContentValues securityClose4 = new ContentValues();
        securityClose4.put(COLUMN_TASKNAME, "All upstairs Tv's are turned off");
        securityClose4.put(COLUMN_JOBID, 4);
        securityClose4.put(COLUMN_SHIFTID, 4);

        ContentValues securityClose5 = new ContentValues();
        securityClose5.put(COLUMN_TASKNAME, "All downstairs Tv's are turned off");
        securityClose5.put(COLUMN_JOBID, 4);
        securityClose5.put(COLUMN_SHIFTID, 4);

        ContentValues securityClose6 = new ContentValues();
        securityClose6.put(COLUMN_TASKNAME, "Pull new bar floor mats (place at the entryway to downstairs ice machines)");
        securityClose6.put(COLUMN_JOBID, 4);
        securityClose6.put(COLUMN_SHIFTID, 4);

        ContentValues securityClose7 = new ContentValues();
        securityClose7.put(COLUMN_TASKNAME, "Pull patio bar fllor mats (place at the entryway to downstairs ice machines)");
        securityClose7.put(COLUMN_JOBID, 4);
        securityClose7.put(COLUMN_SHIFTID, 4);

        ContentValues securityClose8 = new ContentValues();
        securityClose8.put(COLUMN_TASKNAME, "Pull old bar floor mats (place outside the patio doors)");
        securityClose8.put(COLUMN_JOBID, 4);
        securityClose8.put(COLUMN_SHIFTID, 4);

        ContentValues securityClose9 = new ContentValues();
        securityClose9.put(COLUMN_TASKNAME, "Pull upstairs bar floor mats (place outside the entrance to upstairs bar)");
        securityClose9.put(COLUMN_JOBID, 4);
        securityClose9.put(COLUMN_SHIFTID, 4);

        ContentValues securityClose10 = new ContentValues();
        securityClose10.put(COLUMN_TASKNAME, "Sweep and mop upstairs (if open that day)");
        securityClose10.put(COLUMN_JOBID, 4);
        securityClose10.put(COLUMN_SHIFTID, 4);

        ContentValues securityClose11 = new ContentValues();
        securityClose11.put(COLUMN_TASKNAME, "Sweep and mop downstairs");
        securityClose11.put(COLUMN_JOBID, 4);
        securityClose11.put(COLUMN_SHIFTID, 4);

        ContentValues securityClose12 = new ContentValues();
        securityClose12.put(COLUMN_TASKNAME, "Count expo tickets and log times on ticket log sheet (place stacked tickets on top of drawers, ONLY on sunday closes give ticket log to the managers and throw away the excess tickets)");
        securityClose12.put(COLUMN_JOBID, 4);
        securityClose12.put(COLUMN_SHIFTID, 4);

        ContentValues securityClose13 = new ContentValues();
        securityClose13.put(COLUMN_TASKNAME, "Take out ALL TRASH and recycling to the compactor and recycling bins (NOT the dumpster at Stacks)v");
        securityClose13.put(COLUMN_JOBID, 4);
        securityClose13.put(COLUMN_SHIFTID, 4);

        ContentValues securityClose14 = new ContentValues();
        securityClose14.put(COLUMN_TASKNAME, "Take out big soggy (when the barbacks are ready)");
        securityClose14.put(COLUMN_JOBID, 4);
        securityClose14.put(COLUMN_SHIFTID, 4);

        ContentValues securityClose15 = new ContentValues();
        securityClose15.put(COLUMN_TASKNAME, "Take out little nasty (the office trash cans) and big soggy (when thr barbacks are ready)");
        securityClose15.put(COLUMN_JOBID, 4);
        securityClose15.put(COLUMN_SHIFTID, 4);

        ContentValues securityClose16 = new ContentValues();
        securityClose16.put(COLUMN_TASKNAME, "Clean and organize the expo room (every night)");
        securityClose16.put(COLUMN_JOBID, 4);
        securityClose16.put(COLUMN_SHIFTID, 4);

        ContentValues securityClose17 = new ContentValues();
        securityClose17.put(COLUMN_TASKNAME, "Clean and organize harry potter closet (every night)");
        securityClose17.put(COLUMN_JOBID, 4);
        securityClose17.put(COLUMN_SHIFTID, 4);

        ContentValues securityClose18 = new ContentValues();
        securityClose18.put(COLUMN_TASKNAME, "Pull trash cans from old bar (when the bartenders are ready)");
        securityClose18.put(COLUMN_JOBID, 4);
        securityClose18.put(COLUMN_SHIFTID, 4);

        ContentValues securityClose19 = new ContentValues();
        securityClose19.put(COLUMN_TASKNAME, "Pull trash cans from new bar (when the bartenders are ready)");
        securityClose19.put(COLUMN_JOBID, 4);
        securityClose19.put(COLUMN_SHIFTID, 4);

        ContentValues securityClose20 = new ContentValues();
        securityClose20.put(COLUMN_TASKNAME, "Pull trash cans from patio/dunn bar (when thr bartenders are ready)");
        securityClose20.put(COLUMN_JOBID, 4);
        securityClose20.put(COLUMN_SHIFTID, 4);

        ContentValues securityClose21 = new ContentValues();
        securityClose21.put(COLUMN_TASKNAME, "Pull trash cans from upstairs bar (when the bartenders are ready)");
        securityClose21.put(COLUMN_JOBID, 4);
        securityClose21.put(COLUMN_SHIFTID, 4);

        ContentValues securityClose22 = new ContentValues();
        securityClose22.put(COLUMN_TASKNAME, "Check with the closing manager for any additional tasks");
        securityClose22.put(COLUMN_JOBID, 4);
        securityClose22.put(COLUMN_SHIFTID, 4);

        db.insert(TABLE_TASKS, null, serverOpen1);
        db.insert(TABLE_TASKS, null, serverOpen2);
        db.insert(TABLE_TASKS, null, serverOpen3);
        db.insert(TABLE_TASKS, null, serverOpen4);
        db.insert(TABLE_TASKS, null, serverOpen5);
        db.insert(TABLE_TASKS, null, serverOpen6);
        db.insert(TABLE_TASKS, null, serverOpen7);
        db.insert(TABLE_TASKS, null, serverOpen8);
        db.insert(TABLE_TASKS, null, serverOpen9);
        db.insert(TABLE_TASKS, null, serverOpen10);
        db.insert(TABLE_TASKS, null, serverOpen11);
        db.insert(TABLE_TASKS, null, serverOpen12);
        db.insert(TABLE_TASKS, null, serverOpen13);
        db.insert(TABLE_TASKS, null, serverOpen14);
        db.insert(TABLE_TASKS, null, serverOpen15);
        db.insert(TABLE_TASKS, null, serverAll1);
        db.insert(TABLE_TASKS, null, serverAll2);
        db.insert(TABLE_TASKS, null, serverAll3);
        db.insert(TABLE_TASKS, null, serverAll4);
        db.insert(TABLE_TASKS, null, serverHH1);
        db.insert(TABLE_TASKS, null, serverHH2);
        db.insert(TABLE_TASKS, null, serverHH3);
        db.insert(TABLE_TASKS, null, serverHH4);
        db.insert(TABLE_TASKS, null, serverHH5);
        db.insert(TABLE_TASKS, null, serverHH6);
        db.insert(TABLE_TASKS, null, serverHH7);
        db.insert(TABLE_TASKS, null, serverClose1);
        db.insert(TABLE_TASKS, null, serverClose2);
        db.insert(TABLE_TASKS, null, serverClose3);
        db.insert(TABLE_TASKS, null, serverClose4);
        db.insert(TABLE_TASKS, null, serverClose5);
        db.insert(TABLE_TASKS, null, serverClose6);
        db.insert(TABLE_TASKS, null, serverClose7);
        db.insert(TABLE_TASKS, null, serverClose8);
        db.insert(TABLE_TASKS, null, serverClose9);
        db.insert(TABLE_TASKS, null, serverClose10);
        db.insert(TABLE_TASKS, null, bartenderopen1);
        db.insert(TABLE_TASKS, null, bartenderopen2);
        db.insert(TABLE_TASKS, null, bartenderopen3);
        db.insert(TABLE_TASKS, null, bartenderopen4);
        db.insert(TABLE_TASKS, null, bartenderopen5);
        db.insert(TABLE_TASKS, null, bartenderopen6);
        db.insert(TABLE_TASKS, null, bartenderopen7);
        db.insert(TABLE_TASKS, null, bartenderopen8);
        db.insert(TABLE_TASKS, null, bartenderopen9);
        db.insert(TABLE_TASKS, null, bartenderAll1);
        db.insert(TABLE_TASKS, null, bartenderAll2);
        db.insert(TABLE_TASKS, null, bartenderAll3);
        db.insert(TABLE_TASKS, null, bartenderAll4);
        db.insert(TABLE_TASKS, null, bartenderAll5);
        db.insert(TABLE_TASKS, null, bartenderAll6);
        db.insert(TABLE_TASKS, null, bartenderAll7);
        db.insert(TABLE_TASKS, null, bartenderAll8);
        db.insert(TABLE_TASKS, null, bartenderHH1);
        db.insert(TABLE_TASKS, null, bartenderHH2);
        db.insert(TABLE_TASKS, null, bartenderHH3);
        db.insert(TABLE_TASKS, null, bartenderHH4);
        db.insert(TABLE_TASKS, null, bartenderHH5);
        db.insert(TABLE_TASKS, null, bartenderClose1);
        db.insert(TABLE_TASKS, null, bartenderClose2);
        db.insert(TABLE_TASKS, null, bartenderClose3);
        db.insert(TABLE_TASKS, null, bartenderClose4);
        db.insert(TABLE_TASKS, null, bartenderClose5);
        db.insert(TABLE_TASKS, null, bartenderClose6);
        db.insert(TABLE_TASKS, null, bartenderClose7);
        db.insert(TABLE_TASKS, null, bartenderClose8);
        db.insert(TABLE_TASKS, null, bartenderClose9);
        db.insert(TABLE_TASKS, null, bartenderClose10);
        db.insert(TABLE_TASKS, null, bartenderClose11);
        db.insert(TABLE_TASKS, null, bartenderClose12);
        db.insert(TABLE_TASKS, null, bartenderClose13);
        db.insert(TABLE_TASKS, null, bartenderClose14);
        db.insert(TABLE_TASKS, null, bartenderClose15);
        db.insert(TABLE_TASKS, null, bartenderClose16);
        db.insert(TABLE_TASKS, null, bartenderClose17);
        db.insert(TABLE_TASKS, null, securityOpen1);
        db.insert(TABLE_TASKS, null, securityOpen2);
        db.insert(TABLE_TASKS, null, securityOpen3);
        db.insert(TABLE_TASKS, null, securityOpen4);
        db.insert(TABLE_TASKS, null, securityOpen5);
        db.insert(TABLE_TASKS, null, securityAll1);
        db.insert(TABLE_TASKS, null, securityAll2);
        db.insert(TABLE_TASKS, null, securityAll3);
        db.insert(TABLE_TASKS, null, securityAll4);
        db.insert(TABLE_TASKS, null, securityAll5);
        db.insert(TABLE_TASKS, null, securityAll6);
        db.insert(TABLE_TASKS, null, securityHH1);
        db.insert(TABLE_TASKS, null, securityHH2);
        db.insert(TABLE_TASKS, null, securityHH3);
        db.insert(TABLE_TASKS, null, securityHH4);
        db.insert(TABLE_TASKS, null, securityHH5);
        db.insert(TABLE_TASKS, null, securityClose1);
        db.insert(TABLE_TASKS, null, securityClose2);
        db.insert(TABLE_TASKS, null, securityClose3);
        db.insert(TABLE_TASKS, null, securityClose4);
        db.insert(TABLE_TASKS, null, securityClose5);
        db.insert(TABLE_TASKS, null, securityClose6);
        db.insert(TABLE_TASKS, null, securityClose7);
        db.insert(TABLE_TASKS, null, securityClose8);
        db.insert(TABLE_TASKS, null, securityClose9);
        db.insert(TABLE_TASKS, null, securityClose10);
        db.insert(TABLE_TASKS, null, securityClose11);
        db.insert(TABLE_TASKS, null, securityClose12);
        db.insert(TABLE_TASKS, null, securityClose13);
        db.insert(TABLE_TASKS, null, securityClose14);
        db.insert(TABLE_TASKS, null, securityClose15);
        db.insert(TABLE_TASKS, null, securityClose16);
        db.insert(TABLE_TASKS, null, securityClose17);
        db.insert(TABLE_TASKS, null, securityClose18);
        db.insert(TABLE_TASKS, null, securityClose19);
        db.insert(TABLE_TASKS, null, securityClose20);
        db.insert(TABLE_TASKS, null, securityClose21);
        db.insert(TABLE_TASKS, null, securityClose22);
        db.insert(TABLE_TASKS, null, barbackopen1);
        db.insert(TABLE_TASKS, null, barbackopen2);
        db.insert(TABLE_TASKS, null, barbackopen3);
        db.insert(TABLE_TASKS, null, barbackopen4);
        db.insert(TABLE_TASKS, null, barbackopen5);
        db.insert(TABLE_TASKS, null, barbackopen6);
        db.insert(TABLE_TASKS, null, barbackopen7);
        db.insert(TABLE_TASKS, null, barbackopen8);
        db.insert(TABLE_TASKS, null, barbackopen9);
        db.insert(TABLE_TASKS, null, barbackAll1);
        db.insert(TABLE_TASKS, null, barbackAll2);
        db.insert(TABLE_TASKS, null, barbackAll3);
        db.insert(TABLE_TASKS, null, barbackAll4);
        db.insert(TABLE_TASKS, null, barbackAll5);
        db.insert(TABLE_TASKS, null, barbackAll6);
        db.insert(TABLE_TASKS, null, barbackAll7);
        db.insert(TABLE_TASKS, null, barbackAll8);
        db.insert(TABLE_TASKS, null, barbackHH1);
        db.insert(TABLE_TASKS, null, barbackHH2);
        db.insert(TABLE_TASKS, null, barbackHH3);
        db.insert(TABLE_TASKS, null, barbackHH4);
        db.insert(TABLE_TASKS, null, barbackHH5);
        db.insert(TABLE_TASKS, null, barbackClose1);
        db.insert(TABLE_TASKS, null, barbackClose2);
        db.insert(TABLE_TASKS, null, barbackClose3);
        db.insert(TABLE_TASKS, null, barbackClose4);
        db.insert(TABLE_TASKS, null, barbackClose5);
        db.insert(TABLE_TASKS, null, barbackClose6);
        db.insert(TABLE_TASKS, null, barbackClose7);
        db.insert(TABLE_TASKS, null, barbackClose8);
        db.insert(TABLE_TASKS, null, barbackClose9);
        db.insert(TABLE_TASKS, null, barbackClose10);
        db.insert(TABLE_TASKS, null, barbackClose11);
        db.insert(TABLE_TASKS, null, barbackClose12);
        db.insert(TABLE_TASKS, null, barbackClose13);
        db.insert(TABLE_TASKS, null, barbackClose14);
        db.insert(TABLE_TASKS, null, barbackClose15);
        db.insert(TABLE_TASKS, null, barbackClose16);
        db.insert(TABLE_TASKS, null, barbackClose17);



        //db.close();

    }



    // Add a task to the TASKS_LOG Table in DB
    public void addTaskToLog(SQLiteDatabase db, int jobID, int taskID, String initials, byte[] image) {

        // If I want to retrieve the picture https://stackoverflow.com/questions/11790104/how-to-storebitmap-image-and-retrieve-image-from-sqlite-database-in-android

        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        String today = dateFormat.format(date);

        String sql = "SELECT " + COLUMN_EMPLOYEEID +
                " FROM " + TABLE_EMPLOYEE + " WHERE " + COLUMN_INITIALS + " = \"" +
                initials + "\"";


        Cursor myCursor = db.rawQuery(sql, null);


        int myServer = 0;

        if(myCursor.moveToFirst()) {
            int tmpID = myCursor.getInt(0);
            myServer = tmpID;
            myCursor.close();
        }

        ContentValues values = new ContentValues();
        values.put(COLUMN_EMPLOYEEID, myServer);
        values.put(COLUMN_TASKID, taskID);
        if(image != null) {
            values.put(COLUMN_TASK_IMAGE, image);
        }
        values.put(COLUMN_JOBID, jobID);
        values.put(COLUMN_LOG_DATE, today);

        db.insert(TABLE_TASKS_LOG, null, values);


    }

    // Add note to the NOTES Table
    public void addNoteToTable(SQLiteDatabase db, String note) {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        String today = dateFormat.format(date);

        ContentValues values = new ContentValues();
        values.put(COLUMN_NOTE, note);
        values.put(COLUMN_LOG_DATE, today);

        db.insert(TABLE_NOTES, null, values);
    }


    // Find what has already been completed
    public String findCompletedTasks(SQLiteDatabase db) {

        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        String today = dateFormat.format(date);

        String sql = "SELECT " + TABLE_TASKS + "." + COLUMN_TASKNAME +
                " FROM " + TABLE_TASKS + ", " + TABLE_TASKS_LOG +
                " WHERE " + TABLE_TASKS + "." + COLUMN_TASKID + " = " + TABLE_TASKS_LOG + "." + COLUMN_TASKID +
                " AND " + TABLE_TASKS_LOG + "." + COLUMN_LOG_DATE + " = " + "\"" + today + "\"";

        Cursor myCursor = db.rawQuery(sql, null);

        String tasks = "";

        if(myCursor.moveToFirst()) {
            while (!myCursor.isAfterLast()) {
                String tmpTask = myCursor.getString(0);
                tasks += tmpTask + "\n";
                myCursor.moveToNext();
            }
            myCursor.close();
        }

        return tasks;


    }





    // Find all employees that have worked today
    public String findWorkingEmployees(SQLiteDatabase db) {

        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        String today = dateFormat.format(date);

        String sql = "SELECT " + TABLE_EMPLOYEE + "." + COLUMN_FIRSTNAME + ", " + TABLE_EMPLOYEE + "." + COLUMN_LASTNAME + ", " + TABLE_JOBS + "." + COLUMN_TITLE +
                " FROM " + TABLE_EMPLOYEE + ", " + TABLE_TASKS_LOG + ", " + TABLE_JOBS +
                " WHERE " + TABLE_EMPLOYEE + "." + COLUMN_EMPLOYEEID + " = " + TABLE_TASKS_LOG + "." + COLUMN_EMPLOYEEID +
                " AND " + TABLE_EMPLOYEE + "." + COLUMN_JOBID + " = " + TABLE_JOBS + "." + COLUMN_JOBID +
                " AND " + TABLE_TASKS_LOG + "." + COLUMN_LOG_DATE + " = " + "\"" + today + "\"";


        Cursor myCursor = db.rawQuery(sql, null);

        String name = "";

        if(myCursor.moveToFirst()) {
            while (!myCursor.isAfterLast()) {
                String tmpName = myCursor.getString(0);
                tmpName = tmpName + " " + myCursor.getString(1);
                int count = 40 - tmpName.length();
                String space = "";
                for(int i = 0; i < count; i++) {
                    space = space + " ";
                }
                tmpName = tmpName + ":   "  + myCursor.getString(2) + "\n";
                if(!name.contains(tmpName)) {
                    name += tmpName;
                }
                myCursor.moveToNext();
            }
            myCursor.close();
        }

        //db.close();



        return name;
    }

    // Find all notes that have been submitted today
    public String findTodaysNotes(SQLiteDatabase db) {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        String today = dateFormat.format(date);

        String sql = "SELECT " + COLUMN_NOTE +
                " FROM " + TABLE_NOTES +
                " WHERE " + COLUMN_LOG_DATE + " = " + "\"" + today + "\"";

        Cursor myCursor = db.rawQuery(sql, null);

        String notes = "";

        if(myCursor.moveToFirst()) {
            while (!myCursor.isAfterLast()) {
                String tmpNote = myCursor.getString(0);
                notes = notes + tmpNote + "\n";
                myCursor.moveToNext();
            }
            myCursor.close();
        }

        return notes;

    }

    // Find all Employees
    public String findEmployees(SQLiteDatabase db) {
        String sql = "SELECT * FROM " + TABLE_EMPLOYEE;


        Cursor myCursor = db.rawQuery(sql, null);

        String name = "";

        if(myCursor.moveToFirst()) {
            while (!myCursor.isAfterLast()) {
                String tmpName = myCursor.getString(1);
                tmpName = tmpName + " " + myCursor.getString(2) + "\n";
                name += tmpName;
                myCursor.moveToNext();
            }
            myCursor.close();
        }

        //db.close();



        return name;
    }



    // Query Email

    // Find all employees that have worked today
    public String printEmployeeTasksDoneToday(SQLiteDatabase db, int employeeID) {

        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        String today = dateFormat.format(date);

        String sql = "SELECT " + TABLE_EMPLOYEE + "." + COLUMN_FIRSTNAME + ", " + TABLE_EMPLOYEE + "." + COLUMN_LASTNAME + ", " + TABLE_JOBS + "." + COLUMN_TITLE + ", " + TABLE_TASKS + "." + COLUMN_TASKNAME + ", " + TABLE_TASKS_LOG + "." + COLUMN_TASK_IMAGE +
                " FROM " + TABLE_EMPLOYEE + ", " + TABLE_TASKS_LOG + ", " + TABLE_JOBS + ", " + TABLE_TASKS +
                " WHERE " + TABLE_EMPLOYEE + "." + COLUMN_EMPLOYEEID + " = " + TABLE_TASKS_LOG + "." + COLUMN_EMPLOYEEID +
                " AND " + TABLE_EMPLOYEE + "." + COLUMN_JOBID + " = " + TABLE_JOBS + "." + COLUMN_JOBID +
                " AND " + TABLE_TASKS_LOG + "." + COLUMN_TASKID + " = " + TABLE_TASKS + "." + COLUMN_TASKID +
                " AND " + TABLE_TASKS_LOG + "." + COLUMN_LOG_DATE + " = " + "\"" + today + "\"" +
                " AND " + TABLE_TASKS_LOG + "." + COLUMN_EMPLOYEEID + " = " + "\"" + employeeID + "\"";


        Cursor myCursor = db.rawQuery(sql, null);

        String completed = "";

        if(myCursor.moveToFirst()) {
            while (!myCursor.isAfterLast()) {
                String tmpName = myCursor.getString(0);
                tmpName = tmpName + " " + myCursor.getString(1);
                tmpName = tmpName + ":   "  + myCursor.getString(2) + "\n";
                if(!completed.contains(tmpName)) {
                    completed += "\n" + tmpName;
                }
                String tmpTask = myCursor.getString(3);
                completed += "     -" + tmpTask + "\n";
                myCursor.moveToNext();
            }
            myCursor.close();
        }

        //db.close();



        return completed;
    }

    // Find all employees that have worked today
    public List<Integer> findWorkingEmployeesIDs(SQLiteDatabase db) {

        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        String today = dateFormat.format(date);

        String sql = "SELECT " + COLUMN_EMPLOYEEID +
                " FROM " + TABLE_TASKS_LOG +
                " WHERE " + COLUMN_LOG_DATE + " = " + "\"" + today + "\"";


        Cursor myCursor = db.rawQuery(sql, null);

        List<Integer> employeeIDs = new ArrayList<>();

        if(myCursor.moveToFirst()) {
            while (!myCursor.isAfterLast()) {
                int tmpID = myCursor.getInt(0);
                if(!employeeIDs.contains(tmpID)) {
                    employeeIDs.add(tmpID);
                }
                myCursor.moveToNext();
            }
            myCursor.close();
        }

        //db.close();



        return employeeIDs;
    }


    // Find all tasks that have not been completed today
    public String printEmployeeTasksNotDoneToday(SQLiteDatabase db) {

        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        String today = dateFormat.format(date);

        String sql = "SELECT " + COLUMN_TASKNAME +
                " FROM " + TABLE_TASKS +
                " WHERE " + COLUMN_TASKID + " NOT IN (" +
                "SELECT " + COLUMN_TASKID +
                " FROM " + TABLE_TASKS_LOG +
                " WHERE " + COLUMN_LOG_DATE + " = " + "\"" + today + "\")";


        Cursor myCursor = db.rawQuery(sql, null);

        String notCompleted = "";

        if(myCursor.moveToFirst()) {
            while (!myCursor.isAfterLast()) {
                String tmpTask = myCursor.getString(0);
                notCompleted += "     -" + tmpTask + "\n";
                myCursor.moveToNext();
            }
            myCursor.close();
        }

        //db.close();



        return notCompleted;
    }

    // Find all note today for email
    public String findTodaysNotesEmail(SQLiteDatabase db) {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        String today = dateFormat.format(date);

        String sql = "SELECT " + COLUMN_NOTE +
                " FROM " + TABLE_NOTES +
                " WHERE " + COLUMN_LOG_DATE + " = " + "\"" + today + "\"";

        Cursor myCursor = db.rawQuery(sql, null);

        String notes = "";

        if(myCursor.moveToFirst()) {
            while (!myCursor.isAfterLast()) {
                String tmpNote = myCursor.getString(0);
                notes += "     -" + tmpNote + "\n";
                myCursor.moveToNext();
            }
            myCursor.close();
        }

        return notes;

    }

}
