package com.kottodat.fragment_test.test;

import android.app.Fragment;
import android.app.FragmentManager;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;

import com.kottodat.fragment_test.R;
import com.kottodat.fragment_test.databinding.ActivityMainBinding;

import java.util.ArrayList;

/**
 * Created by hanago on 2018. 8. 14..
 */

public class TestActivity extends AppCompatActivity implements TestContract.View
{

    TestPresenter mPresenter;
    TestFragment fragment;
    TestFragment2 fragment2;
    ActivityMainBinding mBinding;

    @Override
    protected void onCreate( @Nullable Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
        mBinding = DataBindingUtil.setContentView( this, R.layout.activity_main );

        mPresenter = new TestPresenter( this, this );


        mBinding.myVp.setAdapter( new MyPagerAdapter( getFragmentManager() ) );

//        fragment = new TestFragment();
//        fragment.setPresenter( mPresenter );
//
//
//        fragment.show( getFragmentManager(), "test_fragment" );





    }


    @Override
    public void printFriendList( ArrayList<FriendItem> arrFriendList )
    {
        fragment.printFriendList( arrFriendList );
    }

    @Override
    public void printFriendList2( ArrayList<FriendItem> arrFriendList )
    {
        fragment2.printFriendList( arrFriendList );
    }


    class MyPagerAdapter extends FragmentPagerAdapter
    {

        public MyPagerAdapter( FragmentManager fm )
        {
            super( fm );
        }

        @Override
        public Fragment getItem( int position )
        {
            switch ( position )
            {
                case 0:
                    fragment = new TestFragment();
                    fragment.setPresenter( mPresenter );
                    return fragment;

                case 1:
                    fragment2 = new TestFragment2();
                    fragment2.setPresenter( mPresenter );
                    return fragment2;
            }
            return null;
        }

        @Override
        public int getCount()
        {
            return 2;
        }
    }
}
