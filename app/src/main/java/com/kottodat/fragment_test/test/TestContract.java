package com.kottodat.fragment_test.test;

import android.view.View;

import java.util.ArrayList;

/**
 * Created by hanago on 2018. 8. 14..
 */

public class TestContract
{
    interface View
    {

        void printFriendList( ArrayList<FriendItem> arrFriendList );
        void printFriendList2( ArrayList<FriendItem> arrFriendList );
    }

    interface Presenter
    {
        void init();
        void getFriendList();
        void getFriendList2();
    }
}
