package com.shenma.tvlauncher.adapter;

import java.util.List;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragAdapter extends FragmentPagerAdapter {

	private List<Fragment> fragments;  
    
	  
    public FragAdapter(FragmentManager fm) {
        super(fm);  
    }  
      
    public FragAdapter(FragmentManager fm, List<Fragment> fragments) {
        super(fm);  
        this.fragments = fragments;  
    }  
  
    @Override  
    public Fragment getItem(int position) {
        return fragments.get(position);  
    }  
  
    @Override  
    public int getCount() {  
        return fragments.size();  
    }  
    
}  