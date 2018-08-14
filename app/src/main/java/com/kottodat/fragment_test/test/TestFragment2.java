package com.kottodat.fragment_test.test;

import android.app.DialogFragment;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kottodat.fragment_test.R;
import com.kottodat.fragment_test.databinding.FragmentSample2Binding;
import com.kottodat.fragment_test.databinding.FragmentSampleBinding;
import com.kottodat.fragment_test.databinding.RowFriendItmeBinding;

import java.util.ArrayList;

/**
 * Created by hanago on 2018. 8. 14..
 */

public class TestFragment2 extends DialogFragment
{
    TestContract.Presenter mPresenter;

    FragmentSample2Binding mBinding;

    ArrayList<FriendItem> mArrFriendList = new ArrayList<>(  );
    MyAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView( LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState )
    {
        /// setContentsView대신 inflate
        mBinding = DataBindingUtil.inflate( inflater, R.layout.fragment_sample2, container, true );

        /// Context가 필요한 곳에는 Activity의 this대신 getActivity()를 호출하면 된다.
        getActivity();

        mAdapter = new MyAdapter();

        mBinding.myRv.setAdapter( mAdapter );
        mBinding.myRv.setLayoutManager( new LinearLayoutManager( getActivity() ) );

        mPresenter.getFriendList2();

        return mBinding.getRoot();
    }


    public void setPresenter( TestContract.Presenter presenter )
    {
        mPresenter = presenter;
    }


    @Override
    public void onStart()
    {
        super.onStart();
    }

    @Override
    public void onResume()
    {
        super.onResume();
    }


    @Override
    public void onPause()
    {
        super.onPause();
    }

    @Override
    public void onStop()
    {
        super.onStop();
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
    }

    public void printFriendList( ArrayList<FriendItem> arrFriendList )
    {
        mArrFriendList.clear();
        mArrFriendList.addAll( arrFriendList );
        mAdapter.notifyDataSetChanged();
    }



    class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyHolder>
    {

        @Override
        public MyHolder onCreateViewHolder( ViewGroup parent, int viewType )
        {
            RowFriendItmeBinding binding = DataBindingUtil.inflate( LayoutInflater.from( getActivity() ), R.layout.row_friend_itme, parent, true ) ;
            return new MyHolder( binding );
        }

        @Override
        public void onBindViewHolder( MyHolder holder, int position )
        {
            holder.mBinding.name.setText( mArrFriendList.get( position ).name );
        }

        @Override
        public int getItemCount()
        {
            return mArrFriendList.size();
        }

        class MyHolder extends RecyclerView.ViewHolder
        {

            RowFriendItmeBinding mBinding;
            public MyHolder( RowFriendItmeBinding binding )
            {
                super( binding.getRoot() );
                mBinding = binding;
            }
        }
    }
}
