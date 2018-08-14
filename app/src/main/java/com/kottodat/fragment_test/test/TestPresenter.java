package com.kottodat.fragment_test.test;

import android.content.Context;

import java.util.ArrayList;

/**
 * Created by hanago on 2018. 8. 14..
 */

public class TestPresenter implements TestContract.Presenter
{

    Context mContext;
    TestContract.View mView;


    public  TestPresenter( Context context, TestContract.View view )
    {
        mContext = context;
        mView = view;
    }



    @Override
    public void getFriendList()
    {
        ///// 서버에서 데이터 가져오는 코드
        /// ...
        /// ...

        ArrayList<FriendItem> arrFriendList = new ArrayList<>(  );

        FriendItem item = new FriendItem();
        item.name = "홍길동";
        item.phoneNumber = "1234567789";
        item.thumbnail = "https://naver.com/123.png";
        FriendItem item2 = new FriendItem();
        item2.name = "임꺽정";
        item2.phoneNumber = "1234567789";
        item2.thumbnail = "https://naver.com/123.png";
        FriendItem item3 = new FriendItem();
        item3.name = "각시탈";
        item3.phoneNumber = "1234567789";
        item3.thumbnail = "https://naver.com/123.png";

        
        arrFriendList.add( item );
        arrFriendList.add( item2 );
        arrFriendList.add( item3 );
        
        mView.printFriendList( arrFriendList );

    }

    @Override
    public void getFriendList2()
    {
        ArrayList<FriendItem> arrFriendList = new ArrayList<>(  );

        FriendItem item = new FriendItem();
        item.name = "가렌";
        item.phoneNumber = "1234567789";
        item.thumbnail = "https://naver.com/123.png";
        FriendItem item2 = new FriendItem();
        item2.name = "럭스";
        item2.phoneNumber = "1234567789";
        item2.thumbnail = "https://naver.com/123.png";
        FriendItem item3 = new FriendItem();
        item3.name = "이즈리얼";
        item3.phoneNumber = "1234567789";
        item3.thumbnail = "https://naver.com/123.png";


        arrFriendList.add( item );
        arrFriendList.add( item2 );
        arrFriendList.add( item3 );

        mView.printFriendList2( arrFriendList );
    }

    @Override
    public void init()
    {

    }
}
