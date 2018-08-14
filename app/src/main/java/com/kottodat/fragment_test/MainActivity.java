package com.kottodat.fragment_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kottodat.fragment_test.test.TestActivity;
import com.kottodat.fragment_test.test.TestFragment;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


//        TestFragment tf = new TestFragment();
//
//        tf.show( getFragmentManager(), "test_fragment" );


        startActivity( new Intent( this, TestActivity.class ) );


    }
}
